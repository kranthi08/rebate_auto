package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewFocusedUMBundleMiscellaneous;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleMiscellaneousAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewFocusedUMBundleMiscellaneous.AssignmentCriteria_View_FocusedUMBundleMiscellaneous_Table)
	private BaseElement AssignmentCriteria_View_FocusedUMBundleMiscellaneous_Table;
	
	public boolean verifyFocusedUMBundleMiscellaneousDetails(String strFocusedUMBundleMiscellaneousData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_FocusedUMBundleMiscellaneous_Table, strFocusedUMBundleMiscellaneousData);
	}	
}
