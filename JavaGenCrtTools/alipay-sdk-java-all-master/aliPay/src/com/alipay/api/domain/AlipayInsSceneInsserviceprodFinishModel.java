package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务完结
 *
 * @author auto create
 * @since 1.0, 2019-05-28 10:04:53
 */
public class AlipayInsSceneInsserviceprodFinishModel extends AlipayObject {

	private static final long serialVersionUID = 4471955839199287566L;

	/**
	 * 服务订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
