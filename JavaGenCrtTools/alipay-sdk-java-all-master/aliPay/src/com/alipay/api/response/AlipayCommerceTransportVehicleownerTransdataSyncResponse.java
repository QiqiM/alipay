package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.vehicleowner.transdata.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-26 10:25:05
 */
public class AlipayCommerceTransportVehicleownerTransdataSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 6263526567644814943L;

	/** 
	 * 数据执行行数
	 */
	@ApiField("excute_lines")
	private String excuteLines;

	/** 
	 * 执行结果
	 */
	@ApiField("result")
	private String result;

	public void setExcuteLines(String excuteLines) {
		this.excuteLines = excuteLines;
	}
	public String getExcuteLines( ) {
		return this.excuteLines;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
