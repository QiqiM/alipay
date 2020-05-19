package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.edu.campus.job.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-06-27 13:58:16
 */
public class AlipayEcoEduCampusJobCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 6162272228915251113L;

	/** 
	 * 备注问题，或者异常
	 */
	@ApiField("content")
	private String content;

	/** 
	 * 消息描述
	 */
	@ApiField("description")
	private String description;

	/** 
	 * 返回code编码;成功返回SUCCESS
	 */
	@ApiField("isv_code")
	private String isvCode;

	public void setContent(String content) {
		this.content = content;
	}
	public String getContent( ) {
		return this.content;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription( ) {
		return this.description;
	}

	public void setIsvCode(String isvCode) {
		this.isvCode = isvCode;
	}
	public String getIsvCode( ) {
		return this.isvCode;
	}

}
