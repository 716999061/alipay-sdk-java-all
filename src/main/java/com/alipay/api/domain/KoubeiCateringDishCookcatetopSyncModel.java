package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑菜谱分类置顶同步
 *
 * @author auto create
 * @since 1.0, 2020-04-11 11:06:58
 */
public class KoubeiCateringDishCookcatetopSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4412152438894463364L;

	/**
	 * 菜谱类目置顶操作列表，一次批量操作最多100个
	 */
	@ApiListField("kbdish_cook_cate_top_info_list")
	@ApiField("kbdish_cook_cate_top_info")
	private List<KbdishCookCateTopInfo> kbdishCookCateTopInfoList;

	public List<KbdishCookCateTopInfo> getKbdishCookCateTopInfoList() {
		return this.kbdishCookCateTopInfoList;
	}
	public void setKbdishCookCateTopInfoList(List<KbdishCookCateTopInfo> kbdishCookCateTopInfoList) {
		this.kbdishCookCateTopInfoList = kbdishCookCateTopInfoList;
	}

}
