package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.thirdparty.reward.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFundTransThirdpartyRewardCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2514718487569555757L;

	/** 
	 * 打赏单据号
	 */
	@ApiField("transfer_no")
	private String transferNo;

	public void setTransferNo(String transferNo) {
		this.transferNo = transferNo;
	}
	public String getTransferNo( ) {
		return this.transferNo;
	}

}
