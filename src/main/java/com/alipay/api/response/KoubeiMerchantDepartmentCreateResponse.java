package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.merchant.department.create response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiMerchantDepartmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7262935417381946474L;

	/** 
	 * 员工管理场景商户创建部门成功时返回的部门id
	 */
	@ApiField("dept_id")
	private String deptId;

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptId( ) {
		return this.deptId;
	}

}
