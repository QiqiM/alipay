package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.detect.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-22 12:35:05
 */
public class AlipayEbppDetectReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6227844494229777682L;

	/** 
	 * 注意：该字段废弃。
	 */
	@ApiField("audit_done")
	private Boolean auditDone;

	/** 
	 * 注意：该字段废弃。
	 */
	@ApiField("audit_pass")
	private Boolean auditPass;

	/** 
	 * 检测结果详情。JSON数组字符串。列出每个检测项的检测详情。
	 */
	@ApiField("detect_detail")
	private String detectDetail;

	/** 
	 * 检测状态.
 * 0-未查到报告(检测未开始或检测异常)
 * 1-检测中
 * 2-检测结束并生成检测报告
	 */
	@ApiField("detect_status")
	private Long detectStatus;

	/** 
	 * 注意：该字段废弃
	 */
	@ApiField("err_msg")
	private String errMsg;

	/** 
	 * 注意：该字段废弃。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 整体检测是否通过.
只有当detectStatus=2时才会有值.
 * true-检测通过
 * false-检测不通过
	 */
	@ApiField("pass")
	private Boolean pass;

	/** 
	 * 检测结果一句话描述
	 */
	@ApiField("summary")
	private String summary;

	public void setAuditDone(Boolean auditDone) {
		this.auditDone = auditDone;
	}
	public Boolean getAuditDone( ) {
		return this.auditDone;
	}

	public void setAuditPass(Boolean auditPass) {
		this.auditPass = auditPass;
	}
	public Boolean getAuditPass( ) {
		return this.auditPass;
	}

	public void setDetectDetail(String detectDetail) {
		this.detectDetail = detectDetail;
	}
	public String getDetectDetail( ) {
		return this.detectDetail;
	}

	public void setDetectStatus(Long detectStatus) {
		this.detectStatus = detectStatus;
	}
	public Long getDetectStatus( ) {
		return this.detectStatus;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public String getErrMsg( ) {
		return this.errMsg;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Boolean getPass( ) {
		return this.pass;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getSummary( ) {
		return this.summary;
	}

}
