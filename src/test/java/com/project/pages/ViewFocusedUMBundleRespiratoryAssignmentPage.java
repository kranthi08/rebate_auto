package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewFocusedUMBundleRespiratory;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleRespiratoryAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewFocusedUMBundleRespiratory.AssignmentCriteria_View_FocusedUMBundleRespiratory_Table)
	private BaseElement AssignmentCriteria_View_FocusedUMBundleRespiratory_Table;
	
	public boolean verifyFocusedUMBundleRespiratoryDetails(String strFocusedUMBundleRespiratoryData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_FocusedUMBundleRespiratory_Table, strFocusedUMBundleRespiratoryData);
	}	
}
