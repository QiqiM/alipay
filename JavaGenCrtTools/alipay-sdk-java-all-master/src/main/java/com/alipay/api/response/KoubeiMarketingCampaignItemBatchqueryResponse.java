package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PromoItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.item.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMarketingCampaignItemBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2898222522755483181L;

	/** 
	 * 返回商品券集合信息
	 */
	@ApiListField("items")
	@ApiField("promo_item_info")
	private List<PromoItemInfo> items;

	public void setItems(List<PromoItemInfo> items) {
		this.items = items;
	}
	public List<PromoItemInfo> getItems( ) {
		return this.items;
	}

}
