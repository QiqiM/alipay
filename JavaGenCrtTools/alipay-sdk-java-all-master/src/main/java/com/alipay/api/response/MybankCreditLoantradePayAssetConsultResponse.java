package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditPayBillAssetVO;
import com.alipay.api.domain.CreditPayInstallmentAssetVO;
import com.alipay.api.domain.CreditPayRefuseVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.pay.asset.consult response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-25 20:05:13
 */
public class MybankCreditLoantradePayAssetConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8795754327958417554L;

	/** 
	 * 账期资产视图，如果未咨询账期资产，可能为空
	 */
	@ApiListField("bill_assets")
	@ApiField("credit_pay_bill_asset_v_o")
	private List<CreditPayBillAssetVO> billAssets;

	/** 
	 * 分期资产视图，如果未咨询分期资产，可能为空
	 */
	@ApiListField("installment_assets")
	@ApiField("credit_pay_installment_asset_v_o")
	private List<CreditPayInstallmentAssetVO> installmentAssets;

	/** 
	 * 咨询失败拒绝信息，只有在success为false的时候才存在
	 */
	@ApiField("refuse_info")
	private CreditPayRefuseVO refuseInfo;

	/** 
	 * 咨询是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setBillAssets(List<CreditPayBillAssetVO> billAssets) {
		this.billAssets = billAssets;
	}
	public List<CreditPayBillAssetVO> getBillAssets( ) {
		return this.billAssets;
	}

	public void setInstallmentAssets(List<CreditPayInstallmentAssetVO> installmentAssets) {
		this.installmentAssets = installmentAssets;
	}
	public List<CreditPayInstallmentAssetVO> getInstallmentAssets( ) {
		return this.installmentAssets;
	}

	public void setRefuseInfo(CreditPayRefuseVO refuseInfo) {
		this.refuseInfo = refuseInfo;
	}
	public CreditPayRefuseVO getRefuseInfo( ) {
		return this.refuseInfo;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
