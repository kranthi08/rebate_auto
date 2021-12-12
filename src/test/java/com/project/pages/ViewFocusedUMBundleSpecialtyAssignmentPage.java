package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewFocusedUMBundleSpecialty;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleSpecialtyAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewFocusedUMBundleSpecialty.AssignmentCriteria_View_FocusedUMBundleSpecialty_Table)
	private BaseElement AssignmentCriteria_View_FocusedUMBundleSpecialty_Table;
	
	public boolean verifyFocusedUMBundleSpecialtyDetails(String strFocusedUMBundleSpecialtyData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_FocusedUMBundleSpecialty_Table, strFocusedUMBundleSpecialtyData);
	}	
}
