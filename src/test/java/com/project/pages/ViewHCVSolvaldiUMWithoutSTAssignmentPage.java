package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewHCVSolvaldiUMWithoutST;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewHCVSolvaldiUMWithoutSTAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewHCVSolvaldiUMWithoutST.AssignmentCriteria_View_HCVSolvaldiUMWithoutST_Table)
	private BaseElement AssignmentCriteria_View_HCVSolvaldiUMWithoutST_Table;
	
	public boolean verifyHCVSolvaldiUMWithoutSTDetails(String strHCVSolvaldiUMWithoutSTData) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_HCVSolvaldiUMWithoutST_Table, strHCVSolvaldiUMWithoutSTData);
	}	
}
