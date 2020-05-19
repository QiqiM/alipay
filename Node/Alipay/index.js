/**
 * Created by ytt on 2020/5/19.
 */
var request = require('request');
var fs = require("fs");
const logger = console;
const utils = require("xbird").utils;

// 项目常量，可替换
const constants = require("../../../../../consts/constants");
const AlipaySdk = require('alipay-sdk').default;
const util_1 = require('alipay-sdk/lib/util');
const camelcaseKeys = require("camelcase-keys");
const urllib = require("urllib");
const is = require("is");


// 防止node_modules的影响，自己继承AlipaySdk，重写一下构造函数和formatUrl()和exec()
class myAliPaySdk extends AlipaySdk {
    constructor(config){
        super(config);

        this.config = Object.assign({
            urllib,
            gateway: 'https://openapi.alipay.com/gateway.do',
            timeout: 5000,
            camelcase: true,
            signType: 'RSA2',
            charset: 'UTF-8',
            version: '1.0',

            // 这个参数要记得传，签名的时候需要
            sdkVersion: 'alipay-sdk-nodejs-3.0.8'
        }, camelcaseKeys(config, { deep: true }));
    }

    // 格式化请求 url（按规范把某些固定的参数放入 url）
    formatUrl(url, params) {
        let requestUrl = url;
        // 需要放在 url 中的参数列表, 将'alipay_root_cert_sn','app_cert_sn'加入到URL上
        const urlArgs = [
            'app_id', 'method', 'format', 'charset',
            'sign_type', 'sign', 'timestamp', 'version',
            'notify_url', 'return_url', 'auth_token', 'app_auth_token',
            'alipay_root_cert_sn','app_cert_sn'
        ];
        for (const key in params) {
            if (urlArgs.indexOf(key) > -1) {
                const val = encodeURIComponent(params[key]);

                requestUrl = `${requestUrl}${requestUrl.includes('?') ? '&' : '?'}${key}=${val}`;
                // 删除 postData 中对应的数据
                if(key !== 'alipay_root_cert_sn' && key !== 'app_cert_sn')
                    delete params[key];
            }
        }
        return { execParams: params, url: requestUrl };
    }

    /**
     * 执行请求
     * @param {string} method 调用接口方法名，比如 alipay.ebpp.bill.add
     * @param {object} params 请求参数
     * @param {object} params.bizContent 业务请求参数
     * @param {Boolean} option 选项
     * @param {Boolean} option.validateSign 是否验签
     * @param {object} args.log 可选日志记录对象
     * @return {Promise} 请求执行结果
     */
    exec(method, params = {}, option = {}) {
        if (option.formData) {
            if (option.formData.getFiles().length > 0) {
                return this.multipartExec(method, option);
            }
            /**
             * fromData 中不包含文件时，认为是 page 类接口（返回 form 表单）
             * 比如 PC 端支付接口 alipay.trade.page.pay
             */
            return this.pageExec(method, option);
        }
        const config = this.config;

        // 在此处将sdkVersion传进签名参数里，有兴趣的可以看下签名函数
        params.sdkVersion = config.sdkVersion;
        // 计算签名
        const signData = util_1.sign(method, params, config);
        let { url, execParams } = this.formatUrl(config.gateway, signData);
        const infoLog = (option.log && is.fn(option.log.info)) ? option.log.info : null;
        const errorLog = (option.log && is.fn(option.log.error)) ? option.log.error : null;
        infoLog && infoLog('[AlipaySdk]start exec, url: %s, method: %s, params: %s', url, method, JSON.stringify(execParams));

        return new Promise((resolve, reject) => {
            config.urllib.request(url, {
                method: 'POST',
                data: execParams,
                // 按 text 返回（为了验签）
                dataType: 'text',
                timeout: config.timeout,
                headers: {
                    'user-agent': this.sdkVersion
                    // "content-type":"application/json"
                },
            })
                .then((ret) => {
                    infoLog && infoLog('[AlipaySdk]exec response: %j', ret);
                    if (ret.status === 200) {
                        /**
                         * 示例响应格式
                         * {"alipay_trade_precreate_response":
                         *  {"code": "10000","msg": "Success","out_trade_no": "111111","qr_code": "https:\/\/"},
                         *  "sign": "abcde="
                         * }
                         * 或者
                         * {"error_response":
                         *  {"code":"40002","msg":"Invalid Arguments","sub_code":"isv.code-invalid","sub_msg":"授权码code无效"},
                         * }
                         */
                        const result = JSON.parse(ret.data);
                        const responseKey = `${method.replace(/\./g, '_')}_response`;
                        const data = result[responseKey];
                        if (data) {
                            // 按字符串验签
                            const validateSuccess = option.validateSign ? this.checkResponseSign(ret.data, responseKey) : true;
                            if (validateSuccess) {
                                resolve(config.camelcase ? camelcaseKeys(data, { deep: true }) : data);
                            }
                            else {
                                reject({ serverResult: ret, errorMessage: '[AlipaySdk]验签失败' });
                            }
                        }
                        reject({ serverResult: ret, errorMessage: '[AlipaySdk]HTTP 请求错误' });
                    }
                    reject({ serverResult: ret, errorMessage: '[AlipaySdk]HTTP 请求错误' });
                })
                .catch((err) => {
                    err.message = '[AlipaySdk]exec error';
                    errorLog && errorLog(err);
                    reject(err);
                });
        });
    }
}

const __CONFIG = {
    MCH_ID: "test", //商户DI
    APP_ID: "test",//小游戏APPID

    // 此处为CSR文件夹下的域名私钥
    APPLICATION_PRIVATE_CERT: fs.readFileSync(__dirname + "/cert/application_private.pem", 'utf-8'),
    APPLICATION_PUBLIC_CERT: fs.readFileSync(__dirname + "/cert/application_public.pem", 'ascii'),
    ALI_PAY_ROOT_CERT_PATH: "支付宝根证书",
    APP_CERT_PATH: "应用证书",
    DESC: "红包标题",
};

let isCb = false;

function transfer(opts = {}, callback){
    const aliPaySdk = new myAliPaySdk({
        appId: __CONFIG.APP_ID,
        privateKey: __CONFIG.APPLICATION_PRIVATE_CERT
    });

    opts = {
        aliPayUserId : "test aplipay id",
        amount: 20
    }

    let business_params = {"sub_biz_scene":"REDPACKET"};
    let payee_info = {
        identity: opts.aliPayUserId,                         // 参与方唯一标志
        identity_type: "ALIPAY_USER_ID"                      // 参与方的标志类型uc transfer res
    };

    let amount = (opts.money / 100).toFixed(2);           // 精确的两位小数

    let bizContent = {
        out_biz_no: opts.orderId,
        trans_amount: amount,                            // 支付宝单位为元，需要除以100
        product_code: "STD_RED_PACKET",
        biz_scene: "DIRECT_TRANSFER",
        order_title: __CONFIG.DESC,                           // 转账标题
        payee_info: payee_info,                              // 收款方信息
        business_params: JSON.stringify(business_params)
    };

    aliPaySdk.exec('alipay.fund.trans.uni.transfer', {
        bizContent: bizContent,
        alipay_root_cert_sn: __CONFIG.ALI_PAY_ROOT_CERT_PATH,
        app_cert_sn: __CONFIG.APP_CERT_PATH,
    },{ log: logger } ).then(resData => {
        if(resData){
            /**
             * 提现成功
             */
            if(resData.code === '10000') {
                logger.info("transfer withdraw rmb:%j result:%j OK ",bizContent, resData);
                utils.invokeCallback(callback, null, {code: constants.ERROR_CODE.OK, listId : resData.order_id});

                isCb = true;
                return;
            }

            logger.error("uc transfer result: %j",  resData);

            utils.invokeCallback(callback, null, {code: constants.ERROR_CODE.FAIL});
            isCb = true;
        }
    }).catch(err => {
        logger.debug('err', err);
        if(!isCb){
            utils.invokeCallback(callback, err, {code: constants.ERROR_CODE.FAIL});
        }
    });
}

exports.transfer  = transfer;
