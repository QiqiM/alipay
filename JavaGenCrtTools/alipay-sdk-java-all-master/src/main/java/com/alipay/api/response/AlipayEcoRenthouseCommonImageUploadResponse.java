package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.common.image.upload response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-02 19:41:33
 */
public class AlipayEcoRenthouseCommonImageUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4141934483633235529L;

	/** 
	 * 图片url地址
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
