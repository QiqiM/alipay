package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerapp.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-16 09:42:24
 */
public class AlipayOpenMiniInnerappCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6697435633278782125L;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

}
