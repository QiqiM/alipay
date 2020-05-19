package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.boyi.boyi.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-05 13:39:43
 */
public class AlipayOpenAppBoyiBoyiCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3899463163529331714L;

	/** 
	 * 1
	 */
	@ApiField("esd")
	private String esd;

	/** 
	 * 1
	 */
	@ApiField("output")
	private Date output;

	public void setEsd(String esd) {
		this.esd = esd;
	}
	public String getEsd( ) {
		return this.esd;
	}

	public void setOutput(Date output) {
		this.output = output;
	}
	public Date getOutput( ) {
		return this.output;
	}

}
