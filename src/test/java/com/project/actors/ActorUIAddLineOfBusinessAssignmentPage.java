package com.project.actors;

import java.util.List;
import com.project.pages.UIAddLineOfBusinessAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddLineOfBusinessAssignmentPage {
	
	@Steps
	UIAddLineOfBusinessAssignmentPage uiAddLineOfBusinessAssignmentPage;
	
	@Step
	public void verifyAssignLineOfBusinessByListBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxPresence();
	}
	
	@Step
	public void verifyAssignLineOfBusinessByListBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignLineOfBusinessByListBoxDefaultItem(DataTable assignLineOfBusinessByListDefaultItem) throws Throwable
	{
		List<List<String>> strLineOfBusinessByListDefaultItem = assignLineOfBusinessByListDefaultItem.raw();
		
		String strDefaultItem = strLineOfBusinessByListDefaultItem.get(1).get(0);
		
		uiAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignLineOfBusinessByListBoxItems(DataTable assignLineOfBusinessByListItems) throws Throwable
	{
		List<List<String>> strLineOfBusinessByListItems = assignLineOfBusinessByListItems.raw();
		
		String strAssignLineOfBusinessBy = strLineOfBusinessByListItems.get(1).get(0);
		
		uiAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxItems(strAssignLineOfBusinessBy);
	}
	
	@Step
	public void verifyAssignLineOfBusinessByListBoxIsDisabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignLineOfBusinessByListBoxItem(DataTable assignLineOfBusinessByListItem) throws Throwable
	{
		List<List<String>> strAssignLineOfBusinessByListItem = assignLineOfBusinessByListItem.raw();
		
		String strAssignLineOfBusinessBy = strAssignLineOfBusinessByListItem.get(1).get(0);
		
		uiAddLineOfBusinessAssignmentPage.selectAssignLineOfBusinessBy(strAssignLineOfBusinessBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedLineOfBusinessListBoxPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAssignedLineOfBusinessListBoxPresence();
	}
	
	@Step
	public void verifyAssignedLineOfBusinessListBoxIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAssignedLineOfBusinessListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedLineOfBusinessListBoxItems(DataTable assignedLineOfBusinessListItems) throws Throwable
	{
		List<List<String>> strLineOfBusinessListItems = assignedLineOfBusinessListItems.raw();
		
		String strAssignedLineOfBusiness = strLineOfBusinessListItems.get(1).get(0);
		
		uiAddLineOfBusinessAssignmentPage.verifyAssignedLineOfBusinessListBoxItems(strAssignedLineOfBusiness);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputLineOfBusinessAssignmentDetails(DataTable lineOfBusinessAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = lineOfBusinessAssignmentData.raw();
		
		String strAssignLineOfBusinessBy  = assignmentDetails.get(1).get(0);
		String strAssignedLineOfBusiness = assignmentDetails.get(1).get(1);
		
		uiAddLineOfBusinessAssignmentPage.selectAssignLineOfBusinessBy(strAssignLineOfBusinessBy);
		uiAddLineOfBusinessAssignmentPage.selectAssignedLineOfBusiness(strAssignedLineOfBusiness);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedLineOfBusinessAssignmentCheckbox(DataTable selectedLineOfBusinessAssignmentData) throws Throwable
	{
		List<List<String>>  selectedLineOfBusiness = selectedLineOfBusinessAssignmentData.raw();
		
		String strOperation = selectedLineOfBusiness.get(1).get(0);
		String strSelectedLineOfBusiness = selectedLineOfBusiness.get(1).get(1);
		
		uiAddLineOfBusinessAssignmentPage.clickOnSelectedLineOfBusinessAssignmentCheckbox(strOperation, strSelectedLineOfBusiness);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddLineOfBusinessAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}