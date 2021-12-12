package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddAuthorizedBrandAlternativesPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class AddAuthorizedBrandAlternativesPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(id=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_VendorFormularyID_List)
	private BaseElement AuthorizedBrandAlternatives_Add_VendorFormularyID_List;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table)
	private BaseElement AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_Add_Button)
	private BaseElement AuthorizedBrandAlternatives_Add_Add_Button;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_SelectedAuthorizedBrandAlternatives_Table)
	private BaseElement AuthorizedBrandAlternatives_Add_SelectedAuthorizedBrandAlternatives_Table;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_Remove_Button)
	private BaseElement AuthorizedBrandAlternatives_Add_Remove_Button;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_Previous_Button)
	private BaseElement AuthorizedBrandAlternatives_Add_Previous_Button;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_Save_Button)
	private BaseElement AuthorizedBrandAlternatives_Add_Save_Button;
	
	public boolean verifyAuthorizedBrandAlternativesPanelIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AuthorizedBrandAlternatives_Add_VendorFormularyID_List.exists(5000))		
		{
			Log.info("Authorized Brand Alternatives panel is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectVendorFormularyID(String strVerndorFormularyID) throws Throwable
	{
		if(!strVerndorFormularyID.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AuthorizedBrandAlternatives_Add_VendorFormularyID_List, strVerndorFormularyID);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectAvailableAuthorizedBrandAlternatives(String strAvailableAuthorizedBrandAlternatives) throws Throwable
	{
		if(!strAvailableAuthorizedBrandAlternatives.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table, strAvailableAuthorizedBrandAlternatives);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Add_Add_Button);
	}
	
	public boolean removeSelectedAuthorizedBrandAlternatives(String strSelectedAuthorizedBrandAlternatives) throws Throwable
	{
		if(!strSelectedAuthorizedBrandAlternatives.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AuthorizedBrandAlternatives_Add_SelectedAuthorizedBrandAlternatives_Table, strSelectedAuthorizedBrandAlternatives);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Add_Remove_Button);
	}
	
	public boolean clickOnPreviousButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Add_Previous_Button);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Add_Save_Button);		
	}
	
	public void getTheContractID()
	{
		rebateCommonUtil.getContractID();
	}
	
	public void getContractName()
	{
		rebateCommonUtil.getContractName();
	}
	
	
}
