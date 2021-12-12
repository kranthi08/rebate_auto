package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewTierDescriptionAssignment;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewTierDescriptionAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewTierDescriptionAssignment.AssignmentCriteria_View_TierDescriptionAssignment_Table)
	private BaseElement AssignmentCriteria_View_TierDescriptionAssignment_Table;
	
	public boolean verifyTierDescriptionAssignmentDetails(String strTierDescriptionAssignmentData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_TierDescriptionAssignment_Table, strTierDescriptionAssignmentData);
	}	
}
