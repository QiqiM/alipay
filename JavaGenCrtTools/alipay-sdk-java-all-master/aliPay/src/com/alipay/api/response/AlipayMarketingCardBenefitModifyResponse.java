package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.benefit.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-08 20:01:40
 */
public class AlipayMarketingCardBenefitModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1523236817853167875L;

	/** 
	 * 权益修改结果；true成功：false失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
