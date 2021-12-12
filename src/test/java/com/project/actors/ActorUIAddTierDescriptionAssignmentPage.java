package com.project.actors;

import java.util.List;
import com.project.pages.UIAddTierDescriptionAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddTierDescriptionAssignmentPage {
	
	@Steps
	UIAddTierDescriptionAssignmentPage uiAddTierDescriptionAssignmentPage;
	
	@Step
	public void verifyAssignTierDescriptionByListBoxPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxPresence();
	}
	
	@Step
	public void verifyAssignTierDescriptionByListBoxIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignTierDescriptionByListBoxDefaultItem(DataTable assignTierDescriptionByListDefaultItem) throws Throwable
	{
		List<List<String>> strTierDescriptionByListDefaultItem = assignTierDescriptionByListDefaultItem.raw();
		
		String strDefaultItem = strTierDescriptionByListDefaultItem.get(1).get(0);
		
		uiAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignTierDescriptionByListBoxItems(DataTable assignTierDescriptionByListItems) throws Throwable
	{
		List<List<String>> strTierDescriptionByListItems = assignTierDescriptionByListItems.raw();
		
		String strAssignTierDescriptionBy = strTierDescriptionByListItems.get(1).get(0);
		
		uiAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxItems(strAssignTierDescriptionBy);
	}
	
	@Step
	public void verifyAssignTierDescriptionByListBoxIsDisabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxIsDisabled();
	}	
	
	@Step
	public void selectAssignTierDescriptionByListBoxItem(DataTable assignTierDescriptionByListItem) throws Throwable
	{
		List<List<String>> strAssignTierDescriptionByListItem = assignTierDescriptionByListItem.raw();
		
		String strAssignTierDescriptionBy = strAssignTierDescriptionByListItem.get(1).get(0);
		
		uiAddTierDescriptionAssignmentPage.selectAssignTierDescriptionBy(strAssignTierDescriptionBy);
	}
	
	@Step
	public void verifyCustomerEditBoxPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyCustomerEditBoxPresence();
	}
	
	@Step
	public void verifyCustomerEditBoxIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyCustomerEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCustomerEditBoxMaxLength(DataTable customerMaxLength) throws Throwable
	{
		List<List<String>> strCustomerMaxLength = customerMaxLength.raw();
		
		String strCustomerLength = strCustomerMaxLength.get(1).get(0);
		
		uiAddTierDescriptionAssignmentPage.verifyCustomerEditBoxMaxLength(strCustomerLength);
	}
	
	@Step
	public void verifyDrugListEditBoxPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyDrugListEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListEditBoxIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyDrugListEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListEditBoxMaxLength(DataTable drugListMaxLength) throws Throwable
	{
		List<List<String>> strDrugListMaxLength = drugListMaxLength.raw();
		
		String strDrugListLength = strDrugListMaxLength.get(1).get(0);
		
		uiAddTierDescriptionAssignmentPage.verifyDrugListEditBoxMaxLength(strDrugListLength);
	}
	
	@Step
	public void verifyTierListBoxPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyTierListBoxPresence();
	}
	
	@Step
	public void verifyTierListBoxIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyTierListBoxIsEnabled();
	}
	
	@Step
	public void verifyTierListBoxItems(DataTable tierListItems) throws Throwable
	{
		List<List<String>> strTierListItems = tierListItems.raw();
		
		String strTierList = strTierListItems.get(1).get(0);
		
		uiAddTierDescriptionAssignmentPage.verifyTierListBoxItems(strTierList);
	}
	
	@Step
	public void verifyDescriptionListBoxPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyDescriptionListBoxPresence();
	}
	
	@Step
	public void verifyDescriptionListBoxIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyDescriptionListBoxIsEnabled();
	}
	
	@Step
	public void verifyDescriptionListBoxItems(DataTable descriptionListItems) throws Throwable
	{
		List<List<String>> strDescriptionListItems = descriptionListItems.raw();
		
		String strDescriptionList = strDescriptionListItems.get(1).get(0);
		
		uiAddTierDescriptionAssignmentPage.verifyDescriptionListBoxItems(strDescriptionList);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputTierDescriptionAssignmentDetails(DataTable tierDescriptionAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = tierDescriptionAssignmentData.raw();
		
		String strAssignTierDescriptionBy  = assignmentDetails.get(1).get(0);
		String strCustomer = assignmentDetails.get(1).get(1);
		String strTier = assignmentDetails.get(1).get(2);
		String strDescription = assignmentDetails.get(1).get(3);
		
		uiAddTierDescriptionAssignmentPage.selectAssignTierDescriptionBy(strAssignTierDescriptionBy);
		uiAddTierDescriptionAssignmentPage.enterCustomer(strCustomer);
		uiAddTierDescriptionAssignmentPage.selectTier(strTier);
		uiAddTierDescriptionAssignmentPage.selectDescription(strDescription);		
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifyTierDescriptionAssignmentTablePresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnTierDescriptionAssignmentCheckbox(DataTable tierDescriptionAssignmentDetails) throws Throwable
	{
		List<List<String>>  strTierDescriptionAssignmentDetails = tierDescriptionAssignmentDetails.raw();
		
		String strOperation = strTierDescriptionAssignmentDetails.get(1).get(0);
		String strTierDescriptionAssignment = strTierDescriptionAssignmentDetails.get(1).get(1);
		
		uiAddTierDescriptionAssignmentPage.clickOnTierDescriptionAssignmentCheckbox(strOperation, strTierDescriptionAssignment);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddTierDescriptionAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}