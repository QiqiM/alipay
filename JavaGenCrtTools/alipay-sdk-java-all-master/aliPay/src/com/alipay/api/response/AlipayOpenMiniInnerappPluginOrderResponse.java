package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.plugin.order response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-23 13:25:52
 */
public class AlipayOpenMiniInnerappPluginOrderResponse extends AlipayResponse {

	private static final long serialVersionUID = 6765452948311336718L;

	/** 
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
