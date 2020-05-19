package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.follow.add response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayMobilePublicFollowAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1253282469616532364L;

	/** 
	 * 成功与否的标志
	 */
	@ApiField("code")
	private String code;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

}
