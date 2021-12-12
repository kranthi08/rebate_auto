package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewGuaranteeCodeAssignment;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewGuaranteeCodeAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewGuaranteeCodeAssignment.AssignmentCriteria_View_GuaranteeCodeAssignment_Table)
	private BaseElement AssignmentCriteria_View_GuaranteeCodeAssignment_Table;
	
	public boolean verifyGuaranteeCodeAssignmentDetails(String strGuaranteeCodeAssignmentData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_GuaranteeCodeAssignment_Table, strGuaranteeCodeAssignmentData);
	}	
}
