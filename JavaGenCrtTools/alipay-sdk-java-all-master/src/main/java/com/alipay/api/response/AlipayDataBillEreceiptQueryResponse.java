package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.ereceipt.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-27 12:02:44
 */
public class AlipayDataBillEreceiptQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3834886515369336472L;

	/** 
	 * 下载链接。status为SUCCESS时返回。用户可以使用此http链接下载文件内容。有效时间20s。<br/>
生成的文件是zip格式。需要解压后获取电子回单pdf内容
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 如果生成失败，则会返回失败原因
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 处理状态<br/>
<ul>
<li>INIT - 初始化</li>
<li>PROCESS - 处理中</li>
<li>SUCCESS - 成功</li>
<li>FAIL - 失败</li>
</ul>
	 */
	@ApiField("status")
	private String status;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
