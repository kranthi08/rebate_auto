package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewVendorFormularyID;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewVendorFormularyIDAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewVendorFormularyID.AssignmentCriteria_View_Update_Button)
	private BaseElement AssignmentCriteria_View_Update_Button;
	
	@FindBy(xpath=ViewVendorFormularyID.AssignmentCriteria_View_AssignmentCriteriaPanel)
	private BaseElement AssignmentCriteria_View_AssignmentCriteriaPanel;
	
	@FindBy(xpath=ViewVendorFormularyID.AssignmentCriteria_View_VendorFormularyID_Table)
	private BaseElement AssignmentCriteria_View_VendorFormularyID_Table;
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_View_Update_Button);
	}
	
	public boolean expandAssignmentCriteriaPanel(String strPanelName) throws Throwable
	{
		if(!strPanelName.isEmpty())
		{
			return rebateCommonUtil.rebate_expand_View_Panel(AssignmentCriteria_View_AssignmentCriteriaPanel,strPanelName);
		}
		else
		{
			return false;
		}
	}	
	
	public boolean verifyVendorFormularyIDDetails(String strVendorFormularyIDData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_VendorFormularyID_Table, strVendorFormularyIDData);
	}	
}
