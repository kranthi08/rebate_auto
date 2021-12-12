package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewContractInformationPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewContractInformationPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_Update_Button)
	private BaseElement ContractInformation_View_Update_Button;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_ContractInformationPanel_Table)
	private BaseElement ContractInformation_View_ContractInformationPanel_Table;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_ReclassifyClaims_Table)
	private BaseElement ContractInformation_View_ReclassifyClaims_Table;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_ReclassifyOnly_Table)
	private BaseElement ContractInformation_View_ReclassifyOnly_Table;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_Penalty_Table)
	private BaseElement ContractInformation_View_Penalty_Table;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_RateDetails_Table)
	private BaseElement ContractInformation_View_RateDetails_Table;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_Save_Button)
	private BaseElement ContractInformation_View_Save_Button;
	
	@FindBy(xpath=ViewContractInformationPanel.ContractInformation_View_Cancel_Button)
	private BaseElement ContractInformation_View_Cancel_Button;
	
	public boolean verifyContactTabIsDisplayedOrNot() throws Throwable
	{
		boolean result;
		sleep(3000);
		result =  rxNovaCommonUtil.objectIsDisplayed(ContractInformation_View_Update_Button);
		if(result==true)
		{
			Log.info("Contract Tab is displayed");
		}
		else
		{
			Log.info("Contract Tab is not displayed");
		}
		return result;
	}
	
	public boolean clickOnContractInformationViewUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_View_Update_Button);
	}
	
	public boolean clickOnContractInformationViewSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_View_Save_Button);
	}
	
	public boolean clickOnContractInformationViewCancelButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_View_Cancel_Button);
	}
	
	public boolean verifyContractInformationRateDetailsTableData(String rateDetailsTableData) throws Throwable	
	{
		//return rebateCommonUtil.rebate_Webtable_VerifyRowData(ContractInformation_View_RateDetails_Table, rateDetailsTableData);
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(ContractInformation_View_RateDetails_Table, rateDetailsTableData);
	}
	
	public boolean verifyContractAndVendorInformation(String strVendorAndContractInfoValues) throws Throwable
	{
		return rebateCommonUtil.rebate_view_and_VerifyContractInformationScreenValues(ContractInformation_View_ContractInformationPanel_Table,strVendorAndContractInfoValues,"vendordetails");
	}
	
	public boolean verifyReclassifyClaimsFromAcceptedToRejectedFor(String strReclassifyClaims) throws Throwable
	{
		return rebateCommonUtil.rebate_view_and_VerifyContractInformationScreenValues(ContractInformation_View_ReclassifyClaims_Table,strReclassifyClaims, "reclassifyclaims");
	}
	
	public boolean VerifyReclassifyClaimsOnlyValues(String strReclassifyClaimsOnly) throws Throwable
	{
		return rebateCommonUtil.rebate_view_and_VerifyContractInformationScreenValues(ContractInformation_View_ReclassifyOnly_Table,strReclassifyClaimsOnly,"reclassifyonly");
	}
	
	public boolean VerifyPenaltyTableValues(String strPenaltyTableValues) throws Throwable
	{
		return rebateCommonUtil.rebate_view_and_VerifyContractInformationScreenValues(ContractInformation_View_Penalty_Table,strPenaltyTableValues,"penalty");
	}
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
