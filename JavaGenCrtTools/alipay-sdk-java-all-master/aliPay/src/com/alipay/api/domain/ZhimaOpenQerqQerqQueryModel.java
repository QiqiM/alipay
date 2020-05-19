package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * qerqerqer
 *
 * @author auto create
 * @since 1.0, 2019-09-26 16:55:24
 */
public class ZhimaOpenQerqQerqQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1463461694186921977L;

	/**
	 * 123
	 */
	@ApiField("address")
	private AgreementParams address;

	public AgreementParams getAddress() {
		return this.address;
	}
	public void setAddress(AgreementParams address) {
		this.address = address;
	}

}
