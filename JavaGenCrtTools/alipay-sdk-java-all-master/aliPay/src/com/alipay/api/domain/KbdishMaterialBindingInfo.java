package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑菜品加料绑定菜品信息
 *
 * @author auto create
 * @since 1.0, 2020-03-30 16:28:34
 */
public class KbdishMaterialBindingInfo extends AlipayObject {

	private static final long serialVersionUID = 5348992236556954614L;

	/**
	 * 加料id
	 */
	@ApiField("material_id")
	private String materialId;

	/**
	 * 菜品加料排序字段，从1开始递增
	 */
	@ApiField("sort")
	private String sort;

	public String getMaterialId() {
		return this.materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}

	public String getSort() {
		return this.sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}

}
