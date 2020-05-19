package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询小目标实例信息
 *
 * @author auto create
 * @since 1.0, 2019-08-19 14:50:48
 */
public class AlipaySocialBaseQuestInstancesQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3524833814169679232L;

	/**
	 * 目标ID列表，列表长度不能超过20
	 */
	@ApiListField("quest_ids")
	@ApiField("string")
	private List<String> questIds;

	/**
	 * 调用方标识
	 */
	@ApiField("source_id")
	private String sourceId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<String> getQuestIds() {
		return this.questIds;
	}
	public void setQuestIds(List<String> questIds) {
		this.questIds = questIds;
	}

	public String getSourceId() {
		return this.sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
