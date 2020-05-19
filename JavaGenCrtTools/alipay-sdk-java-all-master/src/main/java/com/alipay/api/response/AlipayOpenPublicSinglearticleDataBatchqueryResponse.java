package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SingleArticleAnalysisData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.singlearticle.data.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-07 10:53:38
 */
public class AlipayOpenPublicSinglearticleDataBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1713119677993568648L;

	/** 
	 * 单篇文章分析数据列表
	 */
	@ApiListField("data_list")
	@ApiField("single_article_analysis_data")
	private List<SingleArticleAnalysisData> dataList;

	public void setDataList(List<SingleArticleAnalysisData> dataList) {
		this.dataList = dataList;
	}
	public List<SingleArticleAnalysisData> getDataList( ) {
		return this.dataList;
	}

}
