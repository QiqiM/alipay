package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StudyAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.study.account.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 10:25:00
 */
public class AlipayCommerceEducateStudyAccountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6376613986959587848L;

	/** 
	 * 用户的学习账户信息
	 */
	@ApiField("alipay_card_list")
	private StudyAccountInfo alipayCardList;

	public void setAlipayCardList(StudyAccountInfo alipayCardList) {
		this.alipayCardList = alipayCardList;
	}
	public StudyAccountInfo getAlipayCardList( ) {
		return this.alipayCardList;
	}

}
