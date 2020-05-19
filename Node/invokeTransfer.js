const request =  require("request");
const constants = require("../../../../consts/constants");
const constType = require("../../../../consts/constType");
const utils = require("xbird").utils;
const logger = console;
const AliPay = require('./Alipay');
const order = require("../../../../domain/business/order");

class UC {
    constructor(){
        this.platform = constType.PLAT_FORM.UC;
    };

    // 在此处调用支付宝转账
    transfer(params, callback) {
        AliPay.transfer(params, function(err, result) {
            if(err){
                logger.error("uc transfer withdraw rmb:%j err:%j, result:%j",params, err.message, result);
                utils.invokeCallback(callback, err, {code: constants.ERROR_CODE.FAIL});
                return;
            }
            if(result && result.code === constants.ERROR_CODE.OK) {
                utils.invokeCallback(callback, err, {code: constants.ERROR_CODE.OK, listId: result.listId});
                return;
            }

            logger.error("uc transfer withdraw params:%j result:%j", params, result);
            utils.invokeCallback(callback, err, {code: constants.ERROR_CODE.FAIL});
        });
    };
}

module.exports = UC;
