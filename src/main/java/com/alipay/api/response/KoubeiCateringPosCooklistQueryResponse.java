package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PosDishCookModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.cooklist.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-11-16 16:51:44
 */
public class KoubeiCateringPosCooklistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2576723994616822551L;

	/** 
	 * 菜谱列表
	 */
	@ApiListField("cook_models")
	@ApiField("pos_dish_cook_model")
	private List<PosDishCookModel> cookModels;

	public void setCookModels(List<PosDishCookModel> cookModels) {
		this.cookModels = cookModels;
	}
	public List<PosDishCookModel> getCookModels( ) {
		return this.cookModels;
	}

}