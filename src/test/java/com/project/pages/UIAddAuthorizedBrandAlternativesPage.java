package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddAuthorizedBrandAlternativesPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UIAddAuthorizedBrandAlternativesPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(id=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_VendorFormularyID_List)
	private BaseElement AuthorizedBrandAlternatives_Add_VendorFormularyID_List;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table)
	private BaseElement AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table;
	
	@FindBy(xpath=AddAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table_Pagination)
	private BaseElement AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table_Pagination;
	
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
	
	public boolean verifyVendorFormularyIDListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AuthorizedBrandAlternatives_Add_VendorFormularyID_List);
	}
	
	public boolean verifyVendorFormularyIDListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AuthorizedBrandAlternatives_Add_VendorFormularyID_List);
	}
	
	public boolean verifyVendorFormularyIDListBoxDefaultItem(String strDefaultItem) throws Throwable
	{
		return rxNovaCommonUtil.verifyDefaultItemInListBox(AuthorizedBrandAlternatives_Add_VendorFormularyID_List,strDefaultItem);
	}
	
	public boolean verifyVendorFormularyIDListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AuthorizedBrandAlternatives_Add_VendorFormularyID_List, strListItems);
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
	
	public boolean verifyAvailableAuthorizedBrandAlternativesTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table);
	}
	
	public boolean verifyAvailableAuthorizedBrandAlternativesTablePaginationPresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyPaginationPresence(AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table_Pagination);
	}
	
	public boolean verifyAddButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AuthorizedBrandAlternatives_Add_Add_Button);
	}
	
	public boolean verifyAddButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AuthorizedBrandAlternatives_Add_Add_Button);
	}
	
	public boolean clickOnAvailableAuthorizedBrandAlternativesCheckbox(String strOperation, String strAuthorizedBrandAlternatives) throws Throwable
	{
		if(!strAuthorizedBrandAlternatives.isEmpty())		
		{
			return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(AuthorizedBrandAlternatives_Add_AvailableAuthorizedBrandAlternatives_Table, strOperation, strAuthorizedBrandAlternatives);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyAddButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AuthorizedBrandAlternatives_Add_Add_Button);
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_Add_Add_Button);
	}
	
	public boolean verifySelectedAuthorizedBrandAlternativesTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AuthorizedBrandAlternatives_Add_SelectedAuthorizedBrandAlternatives_Table);
	}
	
	public boolean verifyRemoveButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AuthorizedBrandAlternatives_Add_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AuthorizedBrandAlternatives_Add_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AuthorizedBrandAlternatives_Add_Remove_Button);
	}
	
	public boolean clickOnSelectedAuthorizedBrandAlternativesCheckbox(String strOperation, String strSelectedAuthorizedBrandAlternatives) throws Throwable
	{
		if(!strSelectedAuthorizedBrandAlternatives.isEmpty())		
		{
			return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(AuthorizedBrandAlternatives_Add_SelectedAuthorizedBrandAlternatives_Table, strOperation, strSelectedAuthorizedBrandAlternatives);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyPreviousButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AuthorizedBrandAlternatives_Add_Previous_Button);
	}
	
	public boolean verifyPreviousButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AuthorizedBrandAlternatives_Add_Previous_Button);
	}
	
	public boolean verifySaveButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AuthorizedBrandAlternatives_Add_Save_Button);
	}
	
	public boolean verifySaveButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AuthorizedBrandAlternatives_Add_Save_Button);
	}
}
