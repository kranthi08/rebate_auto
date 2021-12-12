package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewHCVMavyretTiering;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewHCVMavyretTieringAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewHCVMavyretTiering.AssignmentCriteria_View_HCVMavyretTiering_Table)
	private BaseElement AssignmentCriteria_View_HCVMavyretTiering_Table;
	
	public boolean verifyHCVMavyretTieringDetails(String strHCVMavyretTieringData) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_HCVMavyretTiering_Table, strHCVMavyretTieringData);
	}	
}
