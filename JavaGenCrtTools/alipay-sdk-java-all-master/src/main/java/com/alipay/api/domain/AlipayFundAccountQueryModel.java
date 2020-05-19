package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝资金账户资产查询接口
 *
 * @author auto create
 * @since 1.0, 2019-12-18 11:46:23
 */
public class AlipayFundAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2424849846177877538L;

	/**
	 * 开户产品码。如果查询托管子户余额，必传且必须传入与开户时传入的值一致。
	 */
	@ApiField("account_product_code")
	private String accountProductCode;

	/**
	 * 开户场景码，与开户产品码不可同时传递。
	 */
	@ApiField("account_scene_code")
	private String accountSceneCode;

	/**
	 * 查询的账号类型，如查询托管账户值为TRUSTEESHIP_ACCOUNT，查询余额账户值为ACCTRANS_ACCOUNT。查询余额账户时必填。
	 */
	@ApiField("account_type")
	private String accountType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * JSON格式，传递业务扩展参数。
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 商户会员的唯一标识。如果传入的user_id为虚拟账户userId，此字段必传并比对一致性。
	 */
	@ApiField("merchant_user_id")
	private String merchantUserId;

	public String getAccountProductCode() {
		return this.accountProductCode;
	}
	public void setAccountProductCode(String accountProductCode) {
		this.accountProductCode = accountProductCode;
	}

	public String getAccountSceneCode() {
		return this.accountSceneCode;
	}
	public void setAccountSceneCode(String accountSceneCode) {
		this.accountSceneCode = accountSceneCode;
	}

	public String getAccountType() {
		return this.accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMerchantUserId() {
		return this.merchantUserId;
	}
	public void setMerchantUserId(String merchantUserId) {
		this.merchantUserId = merchantUserId;
	}

}
