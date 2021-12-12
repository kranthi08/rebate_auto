package com.project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddMembershipClaimCountsPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class AddMembershipClaimCountsPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List)
	private BaseElement MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_CustomerVendorFormularyID_By_Customer_List)
	private BaseElement MembershipClaimCounts_Add_CustomerVendorFormularyID_By_Customer_List;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List)
	private BaseElement MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_ContractualMembershipCount_Edit)
	private BaseElement MembershipClaimCounts_Add_ContractualMembershipCount_Edit;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_MembershipPercentThreshold_Edit)
	private BaseElement MembershipClaimCounts_Add_MembershipPercentThreshold_Edit;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_ContractualClaimCount_Edit)
	private BaseElement MembershipClaimCounts_Add_ContractualClaimCount_Edit;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_ClaimPercentThreshold_Edit)
	private BaseElement MembershipClaimCounts_Add_ClaimPercentThreshold_Edit;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Add_Button)
	private BaseElement MembershipClaimCounts_Add_Add_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Next_Button)
	private BaseElement MembershipClaimCounts_Add_Next_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Previous_Button)
	private BaseElement MembershipClaimCounts_Add_Previous_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Remove_Button)
	private BaseElement MembershipClaimCounts_Add_Remove_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Update_Button)
	private BaseElement MembershipClaimCounts_Add_Update_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table)
	private BaseElement MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table;
	
	public boolean verifyMembershipClaimCountsPanelIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(MembershipClaimCounts_Add_ContractualMembershipCount_Edit.exists(1000))		
		{
			Log.info("Membership Claim Counts Panel is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}

	public boolean selectValueFromEstablishContractualMembershipClaimCountsByList(String strEstablishContractualMembershipClaimCountsByListValue) throws Throwable
	{
		if(!strEstablishContractualMembershipClaimCountsByListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List, strEstablishContractualMembershipClaimCountsByListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MembershipClaimCounts_Add_CustomerVendorFormularyID_By_Customer_List, strCustomerVendorFormularyIDListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List, strCustomerVendorFormularyIDListValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Add_ContractualMembershipCount_Edit, strContractualMembershipCountEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Add_MembershipPercentThreshold_Edit, strMembershipPercentThresholdEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Add_ContractualClaimCount_Edit, strContractualClaimCountEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(MembershipClaimCounts_Add_ClaimPercentThreshold_Edit, strClaimPercentThresholdEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Add_Add_Button);
	}
	
	public boolean clickOnNextButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Add_Next_Button);
	}
	
	public boolean clickOnPreviousButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Add_Previous_Button);
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Add_Remove_Button);
	}
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_Add_Update_Button);
	}
	
	public boolean clickOnCheckBoxAtMatchingRowInMembershipClaimCountsPanelTable(String strMembershipRecord) throws Throwable
	{
		if(!strMembershipRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table, strMembershipRecord);
		}
		else
		{
			return true;
		}
	}
	
	public boolean veifyMembershipClaimCountsTableData(String strExpectedValue)
	{
		boolean blnMatched = false;
		if(MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table.exists(3000))
		{
			List<WebElement> rows = null;
			List<WebElement> cols = null;
			
			WebElement objTblBody = MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table.findElement(By.tagName("tbody"));
			rows = objTblBody.findElements(By.tagName("tr"));
			if(rows.size()==1)
			{
				cols = rows.get(0).findElements(By.tagName("td"));
				if(cols.size()>1)
				{
					String strValue1 = cols.get(1).getText();
					String strValue2 = cols.get(2).getText();
					
					String strActualValue = strValue1+"^"+strValue2;
					if(strExpectedValue.equals(strActualValue))
					{
						Log.info("Record Added");
						blnMatched = true;
					}
				}
			}
			else
			{
				for(int i=0;i<rows.size();i++)
				{
					cols = rows.get(i).findElements(By.tagName("td"));
					
					String strValue1 = cols.get(i+1).getText();
					String strValue2 = cols.get(i+2).getText();
					String strActualValue = strValue1+"^"+strValue2;
					if(strExpectedValue.equals(strActualValue))
					{
						Log.info("Record Added");
						blnMatched = true;
						break;
					}
					
				}
			}
		}
		return blnMatched;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
