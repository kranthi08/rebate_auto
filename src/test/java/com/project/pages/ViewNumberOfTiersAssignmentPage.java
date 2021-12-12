package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewNumberOfTiersAssignment;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewNumberOfTiersAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewNumberOfTiersAssignment.AssignmentCriteria_View_NumberOfTiersAssignment_Table)
	private BaseElement AssignmentCriteria_View_NumberOfTiersAssignment_Table;
	
	public boolean verifyNumberOfTiersAssignmentDetails(String strNumberOfTiersAssignmentData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_NumberOfTiersAssignment_Table, strNumberOfTiersAssignmentData);
	}	
}
