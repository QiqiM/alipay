package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 下单撤销接口
 *
 * @author auto create
 * @since 1.0, 2019-12-05 14:48:09
 */
public class AlipayInsAutoAutoinsprodPolicyCancelModel extends AlipayObject {

	private static final long serialVersionUID = 5327542192992976324L;

	/**
	 * 车险订单号
	 */
	@ApiField("trade_biz_id")
	private String tradeBizId;

	public String getTradeBizId() {
		return this.tradeBizId;
	}
	public void setTradeBizId(String tradeBizId) {
		this.tradeBizId = tradeBizId;
	}

}
