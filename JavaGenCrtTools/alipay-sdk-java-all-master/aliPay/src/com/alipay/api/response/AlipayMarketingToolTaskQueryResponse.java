package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AppletTaskVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-05-06 17:55:10
 */
public class AlipayMarketingToolTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7536549871539828516L;

	/** 
	 * 方案下的任务列表。
	 */
	@ApiListField("task_list")
	@ApiField("applet_task_v_o")
	private List<AppletTaskVO> taskList;

	public void setTaskList(List<AppletTaskVO> taskList) {
		this.taskList = taskList;
	}
	public List<AppletTaskVO> getTaskList( ) {
		return this.taskList;
	}

}
