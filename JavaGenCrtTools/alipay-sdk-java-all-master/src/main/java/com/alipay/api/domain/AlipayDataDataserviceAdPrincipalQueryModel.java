package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商家信息
 *
 * @author auto create
 * @since 1.0, 2019-11-01 10:52:11
 */
public class AlipayDataDataserviceAdPrincipalQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6339587793866352625L;

	/**
	 * 灯火平台提供给外部系统的访问token
	 */
	@ApiField("biz_token")
	private String bizToken;

	/**
	 * 商家id
	 */
	@ApiField("principal_id")
	private Long principalId;

	public String getBizToken() {
		return this.bizToken;
	}
	public void setBizToken(String bizToken) {
		this.bizToken = bizToken;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}
	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

}
