package com.project.actors;

import java.util.List;
import com.project.pages.UIAddAuthorizedBrandAlternativesPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddAuthorizedBrandAlternativesPage {
	
	@Steps
	UIAddAuthorizedBrandAlternativesPage uiAddAuthorizedBrandAlternativesPage;
	
	@Step
	public void verifyAuthorizedBrandAlternatives() throws Throwable {		
		uiAddAuthorizedBrandAlternativesPage.verifyAuthorizedBrandAlternativesPanelIsDisplayed();
	}
	
	@Step
	public void verifyVendorFormularyIDListBoxPresence() throws Throwable {		
		uiAddAuthorizedBrandAlternativesPage.verifyVendorFormularyIDListBoxPresence();
	}
	
	@Step
	public void verifyVendorFormularyIDListBoxIsEnabled() throws Throwable {		
		uiAddAuthorizedBrandAlternativesPage.verifyVendorFormularyIDListBoxIsEnabled();
	}
	
	@Step
	public void verifyVendorFormularyIDListBoxDefaultItem(DataTable vendorFormularyIDListDefaultItem) throws Throwable
	{
		List<List<String>> strVendorFormularyIDListDefaultItem = vendorFormularyIDListDefaultItem.raw();
		
		String strDefaultItem = strVendorFormularyIDListDefaultItem.get(1).get(0);
		
		uiAddAuthorizedBrandAlternativesPage.verifyVendorFormularyIDListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignVendorFormularyIDByListBoxItems(DataTable vendorFormularyIDByListItems) throws Throwable
	{
		List<List<String>> strVendorFormularyIDListItems = vendorFormularyIDByListItems.raw();
		
		String strAssignVendorFormularyID = strVendorFormularyIDListItems.get(1).get(0);
		
		uiAddAuthorizedBrandAlternativesPage.verifyVendorFormularyIDListBoxItems(strAssignVendorFormularyID);
	}
	
	@Step
	public void verifyAvailableAuthorizedBrandAlternativesTablePresence() throws Throwable {		
		uiAddAuthorizedBrandAlternativesPage.verifyAvailableAuthorizedBrandAlternativesTablePresence();
	}
	
	@Step
	public void verifyAvailableAuthorizedBrandAlternativesTablePaginationPresence() throws Throwable {		
		uiAddAuthorizedBrandAlternativesPage.verifyAvailableAuthorizedBrandAlternativesTablePaginationPresence();
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputAuthorizedBrandAlternativesDetails(DataTable authorizedBranAlternativesData) throws Throwable
	{
		List<List<String>> authorizedBranAlternativesDetails = authorizedBranAlternativesData.raw();
		
		String strOperation = authorizedBranAlternativesDetails.get(1).get(0);
		String strVendorFormularyID  = authorizedBranAlternativesDetails.get(1).get(1);
		String strAuthorizedBrandAlternatives = authorizedBranAlternativesDetails.get(1).get(2);
		
		uiAddAuthorizedBrandAlternativesPage.selectVendorFormularyID(strVendorFormularyID);
		uiAddAuthorizedBrandAlternativesPage.clickOnAvailableAuthorizedBrandAlternativesCheckbox(strOperation, strAuthorizedBrandAlternatives);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAuthorizedBrandAlternativesTablePresence() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifySelectedAuthorizedBrandAlternativesTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedAuthorizedBrandAlternativesCheckbox(DataTable selectedAuthorizedBrandAlternativesData) throws Throwable
	{
		List<List<String>>  selectedAuthorizedBrandAlternativesDetails = selectedAuthorizedBrandAlternativesData.raw();
		
		String strOperation = selectedAuthorizedBrandAlternativesDetails.get(1).get(0);
		String strSelectedAuthorizedBrandAlternatives = selectedAuthorizedBrandAlternativesDetails.get(1).get(1);
		
		uiAddAuthorizedBrandAlternativesPage.clickOnSelectedAuthorizedBrandAlternativesCheckbox(strOperation, strSelectedAuthorizedBrandAlternatives);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyPreviousButtonPresence() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyPreviousButtonPresence();
	}
	
	@Step
	public void verifyPreviousButtonIsEnabled() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifyPreviousButtonIsEnabled();
	}
	
	@Step
	public void verifySaveButtonPresence() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifySaveButtonPresence();
	}
	
	@Step
	public void verifySaveButtonIsEnabled() throws Throwable
	{
		uiAddAuthorizedBrandAlternativesPage.verifySaveButtonIsEnabled();
	}
}	
