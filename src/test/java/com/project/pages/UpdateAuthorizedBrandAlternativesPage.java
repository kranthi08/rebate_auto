package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateAuthorizedBrandAlternativesPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UpdateAuthorizedBrandAlternativesPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(id=UpdateAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Update_VendorFormularyID_List)
	private BaseElement AuthorizedBrandAlternatives_Update_VendorFormularyID_List;
	
	@FindBy(xpath=UpdateAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Update_AvailableAuthorizedBrandAlternatives_Table)
	private BaseElement AuthorizedBrandAlternatives_Update_AvailableAuthorizedBrandAlternatives_Table;
	
	@FindBy(xpath=UpdateAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Update_Add_Button)
	private BaseElement AuthorizedBrandAlternatives_Update_Add_Button;
	
	@FindBy(xpath=UpdateAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Update_SelectedAuthBrandAlternatives_Table)
	private BaseElement AuthorizedBrandAlternatives_Update_SelectedAuthBrandAlternatives_Table;
	
	@FindBy(xpath=UpdateAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Update_Remove_Button)
	private BaseElement AuthorizedBrandAlternatives_Update_Remove_Button;
	
	@FindBy(xpath=UpdateAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Update_Save_Button)
	private BaseElement AuthorizedBrandAlternatives_Update_Save_Button;
	
	@FindBy(xpath=UpdateAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Update_Cancel_Button)
	private BaseElement AuthorizedBrandAlternatives_Update_Cancel_Button;
	
	public boolean verifyAuthorizedBrandAlternativesPanelIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AuthorizedBrandAlternatives_Update_VendorFormularyID_List.exists(5000))		
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AuthorizedBrandAlternatives_Update_VendorFormularyID_List, strVerndorFormularyID);
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
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AuthorizedBrandAlternatives_Update_AvailableAuthorizedBrandAlternatives_Table, strAvailableAuthorizedBrandAlternatives);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Update_Add_Button);
	}
	
	public boolean removeSelectedAuthorizedBrandAlternatives(String strSelectedAuthorizedBrandAlternatives) throws Throwable
	{
		if(!strSelectedAuthorizedBrandAlternatives.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AuthorizedBrandAlternatives_Update_SelectedAuthBrandAlternatives_Table, strSelectedAuthorizedBrandAlternatives);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Update_Remove_Button);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Update_Save_Button);
	}
	
	public boolean clickOnCancelButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Update_Cancel_Button);
	}
}
