package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.UpdateCodeResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.scode.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-26 10:40:06
 */
public class AntMerchantExpandScodeModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4345994555461261969L;

	/** 
	 * 更新码值返回结果
	 */
	@ApiField("update_code_response")
	private UpdateCodeResponse updateCodeResponse;

	public void setUpdateCodeResponse(UpdateCodeResponse updateCodeResponse) {
		this.updateCodeResponse = updateCodeResponse;
	}
	public UpdateCodeResponse getUpdateCodeResponse( ) {
		return this.updateCodeResponse;
	}

}
