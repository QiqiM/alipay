package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集分宝预算库查询
 *
 * @author auto create
 * @since 1.0, 2019-08-29 17:45:39
 */
public class AlipayAssetPointPointprodBudgetlibQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6179353539951795844L;

	/**
	 * 预算库编码
	 */
	@ApiField("budget_code")
	private String budgetCode;

	public String getBudgetCode() {
		return this.budgetCode;
	}
	public void setBudgetCode(String budgetCode) {
		this.budgetCode = budgetCode;
	}

}
