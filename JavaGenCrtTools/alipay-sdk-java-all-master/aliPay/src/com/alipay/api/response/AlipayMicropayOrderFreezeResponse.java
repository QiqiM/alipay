package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MicroPayOrderDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.micropay.order.freeze response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMicropayOrderFreezeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6157495369789493845L;

	/** 
	 * 冻结订单详情
	 */
	@ApiField("micro_pay_order_detail")
	private MicroPayOrderDetail microPayOrderDetail;

	public void setMicroPayOrderDetail(MicroPayOrderDetail microPayOrderDetail) {
		this.microPayOrderDetail = microPayOrderDetail;
	}
	public MicroPayOrderDetail getMicroPayOrderDetail( ) {
		return this.microPayOrderDetail;
	}

}
