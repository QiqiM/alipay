package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取 H5 活动洞察数据
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:30:47
 */
public class AlipayMarketingDataDeerConnectorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2791738969839613997L;

	/**
	 * 活动洞察数据查询标识
	 */
	@ApiField("connector_id")
	private String connectorId;

	/**
	 * 数据请求的参数，比如活动投放日期、投放渠道等信息
	 */
	@ApiField("params")
	private String params;

	public String getConnectorId() {
		return this.connectorId;
	}
	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
	}

	public String getParams() {
		return this.params;
	}
	public void setParams(String params) {
		this.params = params;
	}

}
