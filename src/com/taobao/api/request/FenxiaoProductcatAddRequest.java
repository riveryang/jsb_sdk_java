package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.BaseTaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;

import com.taobao.api.response.FenxiaoProductcatAddResponse;

/**
 * TOP API: taobao.fenxiao.productcat.add request
 * 
 * @author top auto create
 * @since 1.0, 2016.04.12
 */
public class FenxiaoProductcatAddRequest extends BaseTaobaoRequest<FenxiaoProductcatAddResponse> {
	
	

	/** 
	* 代销默认采购价比例，注意：100.00%，则输入为10000
	 */
	private Long agentCostPercent;

	/** 
	* 经销默认采购价比例，注意：100.00%，则输入为10000
	 */
	private Long dealerCostPercent;

	/** 
	* 产品线名称
	 */
	private String name;

	/** 
	* 最高零售价比例，注意：100.00%，则输入为10000
	 */
	private Long retailHighPercent;

	/** 
	* 最低零售价比例，注意：100.00%，则输入为10000
	 */
	private Long retailLowPercent;

	public void setAgentCostPercent(Long agentCostPercent) {
		this.agentCostPercent = agentCostPercent;
	}

	public Long getAgentCostPercent() {
		return this.agentCostPercent;
	}

	public void setDealerCostPercent(Long dealerCostPercent) {
		this.dealerCostPercent = dealerCostPercent;
	}

	public Long getDealerCostPercent() {
		return this.dealerCostPercent;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setRetailHighPercent(Long retailHighPercent) {
		this.retailHighPercent = retailHighPercent;
	}

	public Long getRetailHighPercent() {
		return this.retailHighPercent;
	}

	public void setRetailLowPercent(Long retailLowPercent) {
		this.retailLowPercent = retailLowPercent;
	}

	public Long getRetailLowPercent() {
		return this.retailLowPercent;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.productcat.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("agent_cost_percent", this.agentCostPercent);
		txtParams.put("dealer_cost_percent", this.dealerCostPercent);
		txtParams.put("name", this.name);
		txtParams.put("retail_high_percent", this.retailHighPercent);
		txtParams.put("retail_low_percent", this.retailLowPercent);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public Class<FenxiaoProductcatAddResponse> getResponseClass() {
		return FenxiaoProductcatAddResponse.class;
	}

	public void check() throws ApiRuleException {
		RequestCheckUtils.checkNotEmpty(agentCostPercent, "agentCostPercent");
		RequestCheckUtils.checkMaxValue(agentCostPercent, 99999L, "agentCostPercent");
		RequestCheckUtils.checkMinValue(agentCostPercent, 100L, "agentCostPercent");
		RequestCheckUtils.checkNotEmpty(dealerCostPercent, "dealerCostPercent");
		RequestCheckUtils.checkMaxValue(dealerCostPercent, 99999L, "dealerCostPercent");
		RequestCheckUtils.checkMinValue(dealerCostPercent, 100L, "dealerCostPercent");
		RequestCheckUtils.checkNotEmpty(name, "name");
		RequestCheckUtils.checkMaxLength(name, 10, "name");
		RequestCheckUtils.checkNotEmpty(retailHighPercent, "retailHighPercent");
		RequestCheckUtils.checkMaxValue(retailHighPercent, 99999L, "retailHighPercent");
		RequestCheckUtils.checkMinValue(retailHighPercent, 100L, "retailHighPercent");
		RequestCheckUtils.checkNotEmpty(retailLowPercent, "retailLowPercent");
		RequestCheckUtils.checkMaxValue(retailLowPercent, 99999L, "retailLowPercent");
		RequestCheckUtils.checkMinValue(retailLowPercent, 100L, "retailLowPercent");
	}
	

}