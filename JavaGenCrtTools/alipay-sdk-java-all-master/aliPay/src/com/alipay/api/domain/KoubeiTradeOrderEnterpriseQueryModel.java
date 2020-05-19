package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑对接饿了么企业订单查询接口
 *
 * @author auto create
 * @since 1.0, 2019-03-26 19:45:17
 */
public class KoubeiTradeOrderEnterpriseQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8597211198861354192L;

	/**
	 * 口碑订单号，和外部订单号不能同时为空
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 创建订单时传入的商户订单号,和口碑订单号不能同时为空
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 商户签约支付宝的账号,和口碑订单号不能同时为空
	 */
	@ApiField("partner_id")
	private String partnerId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

}
