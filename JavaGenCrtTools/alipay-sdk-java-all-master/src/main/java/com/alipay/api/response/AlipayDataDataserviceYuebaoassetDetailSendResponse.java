package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.yuebaoasset.detail.send response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-26 17:54:09
 */
public class AlipayDataDataserviceYuebaoassetDetailSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6439594212248364858L;

	/** 
	 * yeb_asset_data_num:本次录入数据条数。
可以根据该字段获取本次录入的数据条数，判断是否所有数据都已经落地。
	 */
	@ApiField("yeb_asset_data_num")
	private Long yebAssetDataNum;

	public void setYebAssetDataNum(Long yebAssetDataNum) {
		this.yebAssetDataNum = yebAssetDataNum;
	}
	public Long getYebAssetDataNum( ) {
		return this.yebAssetDataNum;
	}

}
