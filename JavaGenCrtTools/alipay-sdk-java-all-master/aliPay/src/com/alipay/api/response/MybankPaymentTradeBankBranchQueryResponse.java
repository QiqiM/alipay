package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.Institution;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.bank.branch.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-10 21:55:30
 */
public class MybankPaymentTradeBankBranchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6198566723775961713L;

	/** 
	 * Institution列表
	 */
	@ApiListField("bank_details")
	@ApiField("institution")
	private List<Institution> bankDetails;

	public void setBankDetails(List<Institution> bankDetails) {
		this.bankDetails = bankDetails;
	}
	public List<Institution> getBankDetails( ) {
		return this.bankDetails;
	}

}
