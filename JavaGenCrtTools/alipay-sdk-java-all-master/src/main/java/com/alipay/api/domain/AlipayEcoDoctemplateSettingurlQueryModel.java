package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取合同模板设置地址（E签宝）
 *
 * @author auto create
 * @since 1.0, 2020-03-28 00:09:58
 */
public class AlipayEcoDoctemplateSettingurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8321729378128223453L;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
