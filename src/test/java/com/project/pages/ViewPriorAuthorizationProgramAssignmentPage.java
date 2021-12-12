package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewPriorAuthorizationProgram;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewPriorAuthorizationProgramAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewPriorAuthorizationProgram.AssignmentCriteria_View_PriorAuthorizationProgram_Table)
	private BaseElement AssignmentCriteria_View_PriorAuthorizationProgram_Table;
	
	public boolean verifyPriorAuthorizationProgramDetails(String strPriorAuthorizationProgramData) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_PriorAuthorizationProgram_Table, strPriorAuthorizationProgramData);
	}	
}
