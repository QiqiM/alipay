package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询当前用户可用的模板列表
 *
 * @author auto create
 * @since 1.0, 2019-05-22 14:29:19
 */
public class AlipayMarketingToolFengdieTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7113866819264935955L;

	/**
	 * 当前页数，默认为1
	 */
	@ApiField("page_number")
	private Long pageNumber;

	/**
	 * 每页记录数，不能超过50，默认为10
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageNumber() {
		return this.pageNumber;
	}
	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
