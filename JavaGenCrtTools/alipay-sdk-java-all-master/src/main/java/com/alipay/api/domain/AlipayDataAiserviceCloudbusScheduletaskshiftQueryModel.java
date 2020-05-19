package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排班调度--轮班任务查询
 *
 * @author auto create
 * @since 1.0, 2020-03-02 16:07:21
 */
public class AlipayDataAiserviceCloudbusScheduletaskshiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8218956939379285324L;

	/**
	 * 接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 任务id
	 */
	@ApiField("plan_id")
	private String planId;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
