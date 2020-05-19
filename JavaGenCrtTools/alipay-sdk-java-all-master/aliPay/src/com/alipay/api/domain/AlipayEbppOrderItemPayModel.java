package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业订单付款接口
 *
 * @author auto create
 * @since 1.0, 2019-03-18 17:17:30
 */
public class AlipayEbppOrderItemPayModel extends AlipayObject {

	private static final long serialVersionUID = 5567392954746242134L;

	/**
	 * 支付宝侧对预下单订单项的唯一标识
	 */
	@ApiField("alipay_item_id")
	private String alipayItemId;

	public String getAlipayItemId() {
		return this.alipayItemId;
	}
	public void setAlipayItemId(String alipayItemId) {
		this.alipayItemId = alipayItemId;
	}

}
