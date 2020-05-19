package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑门店对象
 *
 * @author auto create
 * @since 1.0, 2020-03-31 21:59:15
 */
public class KbVirtualShopInfo extends AlipayObject {

	private static final long serialVersionUID = 1417395854271722364L;

	/**
	 * 门店信息
	 */
	@ApiListField("catetory_list")
	@ApiField("kbdish_virtual_category_info")
	private List<KbdishVirtualCategoryInfo> catetoryList;

	/**
	 * 口碑门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	public List<KbdishVirtualCategoryInfo> getCatetoryList() {
		return this.catetoryList;
	}
	public void setCatetoryList(List<KbdishVirtualCategoryInfo> catetoryList) {
		this.catetoryList = catetoryList;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
