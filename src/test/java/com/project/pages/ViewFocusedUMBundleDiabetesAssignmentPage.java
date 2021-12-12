package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewFocusedUMBundleDiabetes;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleDiabetesAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewFocusedUMBundleDiabetes.AssignmentCriteria_View_FocusedUMBundleDiabetes_Table)
	private BaseElement AssignmentCriteria_View_FocusedUMBundleDiabetes_Table;
	
	public boolean verifyFocusedUMBundleDiabetesDetails(String strFocusedUMBundleDiabetesData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_FocusedUMBundleDiabetes_Table, strFocusedUMBundleDiabetesData);
	}	
}
