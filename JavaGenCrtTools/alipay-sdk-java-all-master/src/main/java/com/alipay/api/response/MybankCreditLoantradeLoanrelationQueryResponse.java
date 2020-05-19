package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.loanrelation.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class MybankCreditLoantradeLoanrelationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7674158352137445782L;

	/** 
	 * 是否有融资关系的标志
	 */
	@ApiField("loan_relation_flag")
	private Boolean loanRelationFlag;

	public void setLoanRelationFlag(Boolean loanRelationFlag) {
		this.loanRelationFlag = loanRelationFlag;
	}
	public Boolean getLoanRelationFlag( ) {
		return this.loanRelationFlag;
	}

}
