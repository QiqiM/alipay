package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.creditrisk.custlabel.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditCreditriskCustlabelQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5298617816463417832L;

	/** 
	 * 是否展示借呗
	 */
	@ApiField("show_jb")
	private Boolean showJb;

	/** 
	 * 是否展示网商
	 */
	@ApiField("show_my")
	private Boolean showMy;

	public void setShowJb(Boolean showJb) {
		this.showJb = showJb;
	}
	public Boolean getShowJb( ) {
		return this.showJb;
	}

	public void setShowMy(Boolean showMy) {
		this.showMy = showMy;
	}
	public Boolean getShowMy( ) {
		return this.showMy;
	}

}
