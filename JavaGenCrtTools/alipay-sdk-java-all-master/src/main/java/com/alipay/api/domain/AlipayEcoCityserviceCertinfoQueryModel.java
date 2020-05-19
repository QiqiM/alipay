package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 城服用户证件查询
 *
 * @author auto create
 * @since 1.0, 2019-05-23 15:31:32
 */
public class AlipayEcoCityserviceCertinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8655379185797382623L;

	/**
	 * 用户证件信息列表。
	 */
	@ApiListField("cert_infos")
	@ApiField("cert_info_request")
	private List<CertInfoRequest> certInfos;

	public List<CertInfoRequest> getCertInfos() {
		return this.certInfos;
	}
	public void setCertInfos(List<CertInfoRequest> certInfos) {
		this.certInfos = certInfos;
	}

}
