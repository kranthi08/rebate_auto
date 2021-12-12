package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewHCVEpclusaUM;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewHCVEpclusaUMAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewHCVEpclusaUM.AssignmentCriteria_View_HCVEpclusaUM_Table)
	private BaseElement AssignmentCriteria_View_HCVEpclusaUM_Table;
	
	public boolean verifyHCVEpclusaUMDetails(String strHCVEpclusaUMData) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_HCVEpclusaUM_Table, strHCVEpclusaUMData);
	}	
}
