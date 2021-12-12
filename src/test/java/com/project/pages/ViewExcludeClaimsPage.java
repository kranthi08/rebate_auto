package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewExcludedClaims;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewExcludeClaimsPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewExcludedClaims.AssignmentCriteria_View_ExcludedClaims_Table)
	private BaseElement AssignmentCriteria_View_ExcludedClaims_Table;
	
	public boolean verifyExcludedClaimsDetails(String strExcludedClaimsData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_ExcludedClaims_Table, strExcludedClaimsData);
	}	
}
