package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 生活号广告删除询接口
 *
 * @author auto create
 * @since 1.0, 2020-04-07 10:49:28
 */
public class AlipayOpenPublicAdvertDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5635979663792332789L;

	/**
	 * 待删除的广告位id
	 */
	@ApiField("advert_id")
	private String advertId;

	public String getAdvertId() {
		return this.advertId;
	}
	public void setAdvertId(String advertId) {
		this.advertId = advertId;
	}

}
