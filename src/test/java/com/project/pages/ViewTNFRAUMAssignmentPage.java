package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewTNFRAUM;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewTNFRAUMAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewTNFRAUM.AssignmentCriteria_View_TNFRAUM_Table)
	private BaseElement AssignmentCriteria_View_TNFRAUM_Table;
	
	public boolean verifyTNFRAUMDetails(String strTNFRAUMData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_TNFRAUM_Table, strTNFRAUMData);
	}	
}
