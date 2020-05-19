package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ProfileSnDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.profile.sn.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-08 15:05:19
 */
public class AlipayCommerceIotProfileSnBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6456816614358324531L;

	/** 
	 * sn列表
	 */
	@ApiListField("sn_list")
	@ApiField("profile_sn_detail")
	private List<ProfileSnDetail> snList;

	public void setSnList(List<ProfileSnDetail> snList) {
		this.snList = snList;
	}
	public List<ProfileSnDetail> getSnList( ) {
		return this.snList;
	}

}
