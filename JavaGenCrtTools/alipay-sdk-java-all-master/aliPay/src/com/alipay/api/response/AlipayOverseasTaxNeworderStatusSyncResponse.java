package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.neworder.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-18 10:35:11
 */
public class AlipayOverseasTaxNeworderStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2395765369642764973L;

	/** 
	 * 纸质退税单号
	 */
	@ApiField("doc_id")
	private String docId;

	/** 
	 * 支付宝退税单号
	 */
	@ApiField("tax_order_no")
	private String taxOrderNo;

	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getDocId( ) {
		return this.docId;
	}

	public void setTaxOrderNo(String taxOrderNo) {
		this.taxOrderNo = taxOrderNo;
	}
	public String getTaxOrderNo( ) {
		return this.taxOrderNo;
	}

}
