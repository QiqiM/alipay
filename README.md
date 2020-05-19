# alipay
蚂蚁金服资金类公钥证书加密方式

#### 1.先使用java工具生成支付宝根证书alipay_root_cert_sn和应用证书app_cert_sn,资金类接口这两个参数必传

#### 2 安装node sdk

> npm i alipay-sdk --save

#### 3.参照示例调用单笔转账接口


#### 4. 注意事项

+ 1. app_auth_token不是必传参数，可以不获取
+ 2. 签名加密的密钥不是RSA密钥，而是在CSR文件夹下，你使用支付宝工具生成的域名私钥
+ 3. 使用version3.0.8版本的包，需要加签一个参数 sdkVersion: 'alipay-sdk-nodejs-3.0.8'
+ 4. 我的所有密钥数据都TEST，需要自行去支付宝申请证书验证
