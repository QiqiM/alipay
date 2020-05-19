package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预订单查询
 *
 * @author auto create
 * @since 1.0, 2019-01-31 16:18:48
 */
public class KoubeiMallScanpurchasePreorderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7646491549664785921L;

	/**
	 * 预订单编号
	 */
	@ApiField("advance_order_id")
	private String advanceOrderId;

	public String getAdvanceOrderId() {
		return this.advanceOrderId;
	}
	public void setAdvanceOrderId(String advanceOrderId) {
		this.advanceOrderId = advanceOrderId;
	}

}
