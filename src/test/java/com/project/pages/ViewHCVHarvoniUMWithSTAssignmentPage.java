package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewHCVHarvoniUMWithST;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewHCVHarvoniUMWithSTAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewHCVHarvoniUMWithST.AssignmentCriteria_View_HCVHarvoniUMWithST_Table)
	private BaseElement AssignmentCriteria_View_HCVHarvoniUMWithST_Table;
	
	public boolean verifyHCVHarvoniUMWithSTDetails(String strHCVHarvoniUMWithSTData) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_HCVHarvoniUMWithST_Table, strHCVHarvoniUMWithSTData);
	}	
}
