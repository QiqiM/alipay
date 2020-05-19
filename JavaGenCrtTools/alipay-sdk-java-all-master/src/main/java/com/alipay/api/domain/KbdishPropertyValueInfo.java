package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 菜品销售属性属性值模型
 *
 * @author auto create
 * @since 1.0, 2020-03-30 16:28:34
 */
public class KbdishPropertyValueInfo extends AlipayObject {

	private static final long serialVersionUID = 1465332378828621434L;

	/**
	 * 属性值排序字段，从1一直递增到5
	 */
	@ApiField("sort")
	private String sort;

	/**
	 * 销售属性值
	 */
	@ApiField("value")
	private String value;

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
