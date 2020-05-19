package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取商户下的设备sn列表
 *
 * @author auto create
 * @since 1.0, 2020-03-26 11:43:53
 */
public class AlipayCommerceIotAdvertiserDeviceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6586188146712817443L;

	/**
	 * 设备类型，比如qt 或 pos
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
