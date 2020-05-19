package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定查询发约单详情接口
 *
 * @author auto create
 * @since 1.0, 2020-02-21 18:21:20
 */
public class ZhimaMerchantContractOfferQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6457535794115528343L;

	/**
	 * 发约单单号
	 */
	@ApiField("offer_no")
	private String offerNo;

	public String getOfferNo() {
		return this.offerNo;
	}
	public void setOfferNo(String offerNo) {
		this.offerNo = offerNo;
	}

}
