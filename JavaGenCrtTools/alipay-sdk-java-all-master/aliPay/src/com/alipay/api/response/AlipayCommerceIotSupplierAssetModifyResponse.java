package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.supplier.asset.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-21 19:51:51
 */
public class AlipayCommerceIotSupplierAssetModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7728891268761465734L;

	/** 
	 * 记录id
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
