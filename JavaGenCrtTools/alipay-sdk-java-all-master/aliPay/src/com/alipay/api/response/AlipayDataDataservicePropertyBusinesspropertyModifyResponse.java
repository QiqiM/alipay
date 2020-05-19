package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.property.businessproperty.modify response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-16 21:36:01
 */
public class AlipayDataDataservicePropertyBusinesspropertyModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2181678277467917459L;

	/** 
	 * 是否修改成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
