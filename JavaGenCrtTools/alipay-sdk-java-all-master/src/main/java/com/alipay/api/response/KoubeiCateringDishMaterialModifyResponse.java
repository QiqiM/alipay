package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.KbdishMaterialInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.material.modify response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-13 15:41:17
 */
public class KoubeiCateringDishMaterialModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6118162121389386987L;

	/** 
	 * 菜品加料通用模型返回
	 */
	@ApiField("kb_dish_material_info")
	private KbdishMaterialInfo kbDishMaterialInfo;

	public void setKbDishMaterialInfo(KbdishMaterialInfo kbDishMaterialInfo) {
		this.kbDishMaterialInfo = kbDishMaterialInfo;
	}
	public KbdishMaterialInfo getKbDishMaterialInfo( ) {
		return this.kbDishMaterialInfo;
	}

}
