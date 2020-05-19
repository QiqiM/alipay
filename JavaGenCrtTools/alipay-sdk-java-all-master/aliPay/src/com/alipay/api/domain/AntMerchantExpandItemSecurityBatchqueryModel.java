package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品批量查询
 *
 * @author auto create
 * @since 1.0, 2019-09-06 21:55:01
 */
public class AntMerchantExpandItemSecurityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6374174893176235268L;

	/**
	 * 商品ID列表
	 */
	@ApiListField("item_id_list")
	@ApiField("string")
	private List<String> itemIdList;

	public List<String> getItemIdList() {
		return this.itemIdList;
	}
	public void setItemIdList(List<String> itemIdList) {
		this.itemIdList = itemIdList;
	}

}
