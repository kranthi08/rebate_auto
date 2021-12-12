package com.project.actors;

import java.util.List;
import com.project.pages.UIAddFocusedUMBundleSpecialtyAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddFocusedUMBundleSpecialtyAssignmentPage {
	
	@Steps
	UIAddFocusedUMBundleSpecialtyAssignmentPage uiAddFocusedUMBundleSpecialtyAssignmentPage;
	
	@Step
	public void verifyAssignFocusedUMBundleSpecialtyByListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxPresence();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleSpecialtyByListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleSpecialtyByListBoxDefaultItem(DataTable assignFocusedUMBundleSpecialtyByListDefaultItem) throws Throwable
	{
		List<List<String>> strFocusedUMBundleSpecialtyByListDefaultItem = assignFocusedUMBundleSpecialtyByListDefaultItem.raw();
		
		String strDefaultItem = strFocusedUMBundleSpecialtyByListDefaultItem.get(1).get(0);
		
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleSpecialtyByListBoxItems(DataTable assignFocusedUMBundleSpecialtyByListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleSpecialtyByListItems = assignFocusedUMBundleSpecialtyByListItems.raw();
		
		String strAssignFocusedUMBundleSpecialtyBy = strFocusedUMBundleSpecialtyByListItems.get(1).get(0);
		
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxItems(strAssignFocusedUMBundleSpecialtyBy);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleSpecialtyByListBoxIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxIsDisabled();
	}	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignFocusedUMBundleSpecialtyByListBoxItem(DataTable assignFocusedUMBundleSpecialtyByListItem) throws Throwable
	{
		List<List<String>> strAssignFocusedUMBundleSpecialtyByListItem = assignFocusedUMBundleSpecialtyByListItem.raw();
		
		String strAssignFocusedUMBundleSpecialtyBy = strAssignFocusedUMBundleSpecialtyByListItem.get(1).get(0);
		
		uiAddFocusedUMBundleSpecialtyAssignmentPage.selectAssignFocusedUMBundleSpecialtyBy(strAssignFocusedUMBundleSpecialtyBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleSpecialtyListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignedFocusedUMBundleSpecialtyListBoxPresence();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleSpecialtyListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignedFocusedUMBundleSpecialtyListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleSpecialtyListBoxItems(DataTable assignedFocusedUMBundleSpecialtyListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleSpecialtyListItems = assignedFocusedUMBundleSpecialtyListItems.raw();
		
		String strAssignedFocusedUMBundleSpecialty = strFocusedUMBundleSpecialtyListItems.get(1).get(0);
		
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignedFocusedUMBundleSpecialtyListBoxItems(strAssignedFocusedUMBundleSpecialty);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputFocusedUMBundleSpecialtyAssignmentDetails(DataTable focusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = focusedUMBundleSpecialtyAssignmentData.raw();
		
		String strAssignFocusedUMBundleSpecialtyBy  = assignmentDetails.get(1).get(0);
		String strAssignedFocusedUMBundleSpecialty = assignmentDetails.get(1).get(1);
		
		uiAddFocusedUMBundleSpecialtyAssignmentPage.selectAssignFocusedUMBundleSpecialtyBy(strAssignFocusedUMBundleSpecialtyBy);
		uiAddFocusedUMBundleSpecialtyAssignmentPage.selectAssignedFocusedUMBundleSpecialty(strAssignedFocusedUMBundleSpecialty);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedFocusedUMBundleSpecialtyAssignmentCheckbox(DataTable selectedFocusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		List<List<String>>  selectedFocusedUMBundleSpecialty = selectedFocusedUMBundleSpecialtyAssignmentData.raw();
		
		String strOperation = selectedFocusedUMBundleSpecialty.get(1).get(0);
		String strSelectedFocusedUMBundleSpecialty = selectedFocusedUMBundleSpecialty.get(1).get(1);
		
		uiAddFocusedUMBundleSpecialtyAssignmentPage.clickOnSelectedFocusedUMBundleSpecialtyAssignmentCheckbox(strOperation, strSelectedFocusedUMBundleSpecialty);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleSpecialtyAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}