package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.order.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:50:56
 */
public class AlipayCommerceIotDapplyOrderCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 2557223798739697787L;

	/** 
	 * 物料申请单号
	 */
	@ApiField("asset_apply_order_id")
	private String assetApplyOrderId;

	public void setAssetApplyOrderId(String assetApplyOrderId) {
		this.assetApplyOrderId = assetApplyOrderId;
	}
	public String getAssetApplyOrderId( ) {
		return this.assetApplyOrderId;
	}

}
