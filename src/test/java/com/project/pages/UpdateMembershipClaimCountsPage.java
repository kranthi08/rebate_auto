package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateMembershipClaimCountsPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class UpdateMembershipClaimCountsPage extends BasePage 
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_Update_Button_At_MCCountsPanel)
	private BaseElement MembershipClaimCounts_Update_Update_Button_At_MCCountsPanel;
	
	@FindBy(xpath=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_AddOrUpdateButton)
	private BaseElement MembershipClaimCounts_Update_AddOrUpdateButton;
	
	@FindBy(xpath=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_Table_Update_Button)
	private BaseElement MembershipClaimCounts_Update_Table_Update_Button;
	
	@FindBy(xpath=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_Table_Remove_Button)
	private BaseElement MembershipClaimCounts_Update_Table_Remove_Button;
	
	@FindBy(xpath=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_Save_Button)
	private BaseElement MembershipClaimCounts_Update_Save_Button;
	
	@FindBy(xpath=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_MembershipClaimCountsPanel_Table)
	private BaseElement MembershipClaimCounts_Update_MembershipClaimCountsPanel_Table;
	
	@ByAngularModel.FindBy(model=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_EstablishContractualMembershipClaimCountsBy_List)
	private BaseElement MembershipClaimCounts_Update_EstablishContractualMembershipClaimCountsBy_List;
	
	@ByAngularModel.FindBy(model=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_CustomerVendorFormularyID_By_Customer_List)
	private BaseElement MembershipClaimCounts_Update_CustomerVendorFormularyID_By_Customer_List;
	
	@ByAngularModel.FindBy(model=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_CustomerVendorFormularyID_By_VendorFormularyID_List)
	private BaseElement MembershipClaimCounts_Update_CustomerVendorFormularyID_By_VendorFormularyID_List;
	
	@ByAngularModel.FindBy(model=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_ContractualMembershipCount_Edit)
	private BaseElement MembershipClaimCounts_Update_ContractualMembershipCount_Edit;
	
	@ByAngularModel.FindBy(model=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_MembershipPercentThreshold_Edit)
	private BaseElement MembershipClaimCounts_Update_MembershipPercentThreshold_Edit;
	
	@ByAngularModel.FindBy(model=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_ContractualClaimCount_Edit)
	private BaseElement MembershipClaimCounts_Update_ContractualClaimCount_Edit;
	
	@ByAngularModel.FindBy(model=UpdateMembershipClaimCountsPanel.MembershipClaimCounts_Update_ClaimPercentThreshold_Edit)
	private BaseElement MembershipClaimCounts_Update_ClaimPercentThreshold_Edit;
	
	
	// -- Methods
	public boolean clickOnUpdateButtonAtMembershipClaimCountsPanel() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Update_Update_Button_At_MCCountsPanel);
	}
	
	public boolean clickOnAddOrUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Update_AddOrUpdateButton);
	}
	
	public boolean clickOnMembershipClaimCountsPanelTableUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Update_Table_Update_Button);
	}
	
	public boolean clickOnMembershipClaimCountsPanelTableRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Update_Table_Remove_Button);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Update_Save_Button);
	}
	
	public boolean selectValueFromEstablishContractualMembershipClaimCountsByList(String strEstablishContractualMembershipClaimCountsByListValue) throws Throwable
	{
		if(!strEstablishContractualMembershipClaimCountsByListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MembershipClaimCounts_Update_EstablishContractualMembershipClaimCountsBy_List, strEstablishContractualMembershipClaimCountsByListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromCustomerVendorFormularyID_By_Customer_List(String strCustomerVendorFormularyIDListValue) throws Throwable
	{
		if(!strCustomerVendorFormularyIDListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MembershipClaimCounts_Update_CustomerVendorFormularyID_By_Customer_List, strCustomerVendorFormularyIDListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromCustomerVendorFormularyID_By_VendorFormulary_List(String strCustomerVendorFormularyIDListValue) throws Throwable
	{
		if(!strCustomerVendorFormularyIDListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MembershipClaimCounts_Update_CustomerVendorFormularyID_By_VendorFormularyID_List, strCustomerVendorFormularyIDListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoContractualMembershipCountEdit(String strContractualMembershipCountEditValue)	throws Throwable
	{
		if(!strContractualMembershipCountEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Update_ContractualMembershipCount_Edit, strContractualMembershipCountEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean setTextIntoMembershipPercentThresholdEdit(String strMembershipPercentThresholdEditValue)	throws Throwable
	{
		if(!strMembershipPercentThresholdEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Update_MembershipPercentThreshold_Edit, strMembershipPercentThresholdEditValue);
		}
		else
		{
			return true;
		}
	}
	public boolean setTextIntoContractualClaimCountEdit(String strContractualClaimCountEditValue)	throws Throwable
	{
		if(!strContractualClaimCountEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Update_ContractualClaimCount_Edit, strContractualClaimCountEditValue);
		}
		else
		{
			return true;
		}
	}
	public boolean setTextIntoClaimPercentThresholdEdit(String strClaimPercentThresholdEditValue)	throws Throwable
	{
		if(!strClaimPercentThresholdEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Update_ClaimPercentThreshold_Edit, strClaimPercentThresholdEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyMembershipClaimCountsPanelIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(MembershipClaimCounts_Update_Update_Button_At_MCCountsPanel.exists(5000))		
		{
			Log.info("Membership Claim Counts Panel is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean clickOnCheckBoxAtMatchingRowInMembershipClaimCountsPanelTable(String strMembershipRecord) throws Throwable
	{
		if(!strMembershipRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(MembershipClaimCounts_Update_MembershipClaimCountsPanel_Table, strMembershipRecord);
		}
		else
		{
			return true;
		}
	}	
}
