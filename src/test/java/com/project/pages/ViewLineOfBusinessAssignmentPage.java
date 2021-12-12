package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewLineOfBusiness;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewLineOfBusinessAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewLineOfBusiness.AssignmentCriteria_View_LineOfBusiness_Table)
	private BaseElement AssignmentCriteria_View_LineOfBusiness_Table;
	
	public boolean verifyLOBDetails(String strLOBData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_LineOfBusiness_Table, strLOBData);
	}	
}
