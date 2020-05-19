package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PayForPrivilegeRechargeCardUseLog;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.uselog.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-08 11:35:09
 */
public class AlipayMerchantPayforprivilegeUselogBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5559749857344326924L;

	/** 
	 * 充享惠使用记录
	 */
	@ApiListField("use_log_list")
	@ApiField("pay_for_privilege_recharge_card_use_log")
	private List<PayForPrivilegeRechargeCardUseLog> useLogList;

	public void setUseLogList(List<PayForPrivilegeRechargeCardUseLog> useLogList) {
		this.useLogList = useLogList;
	}
	public List<PayForPrivilegeRechargeCardUseLog> getUseLogList( ) {
		return this.useLogList;
	}

}
