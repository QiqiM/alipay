package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.repaybill.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-13 21:21:53
 */
public class AlipayTradeRepaybillOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6645266786196212572L;

	/** 
	 * 支付宝账单编号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 还款的资金单号，后续用该单号去调用支付宝收银台sdk进行支付
	 */
	@ApiField("repay_fund_order_no")
	private String repayFundOrderNo;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setRepayFundOrderNo(String repayFundOrderNo) {
		this.repayFundOrderNo = repayFundOrderNo;
	}
	public String getRepayFundOrderNo( ) {
		return this.repayFundOrderNo;
	}

}
