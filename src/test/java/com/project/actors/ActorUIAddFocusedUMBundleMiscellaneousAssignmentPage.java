package com.project.actors;

import java.util.List;
import com.project.pages.UIAddFocusedUMBundleMiscellaneousAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddFocusedUMBundleMiscellaneousAssignmentPage {
	
	@Steps
	UIAddFocusedUMBundleMiscellaneousAssignmentPage uiAddFocusedUMBundleMiscellaneousAssignmentPage;
	
	@Step
	public void verifyAssignFocusedUMBundleMiscellaneousByListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxPresence();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleMiscellaneousByListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleMiscellaneousByListBoxDefaultItem(DataTable assignFocusedUMBundleMiscellaneousByListDefaultItem) throws Throwable
	{
		List<List<String>> strFocusedUMBundleMiscellaneousByListDefaultItem = assignFocusedUMBundleMiscellaneousByListDefaultItem.raw();
		
		String strDefaultItem = strFocusedUMBundleMiscellaneousByListDefaultItem.get(1).get(0);
		
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleMiscellaneousByListBoxItems(DataTable assignFocusedUMBundleMiscellaneousByListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleMiscellaneousByListItems = assignFocusedUMBundleMiscellaneousByListItems.raw();
		
		String strAssignFocusedUMBundleMiscellaneousBy = strFocusedUMBundleMiscellaneousByListItems.get(1).get(0);
		
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxItems(strAssignFocusedUMBundleMiscellaneousBy);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleMiscellaneousByListBoxIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxIsDisabled();
	}	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignFocusedUMBundleMiscellaneousByListBoxItem(DataTable assignFocusedUMBundleMiscellaneousByListItem) throws Throwable
	{
		List<List<String>> strAssignFocusedUMBundleMiscellaneousByListItem = assignFocusedUMBundleMiscellaneousByListItem.raw();
		
		String strAssignFocusedUMBundleMiscellaneousBy = strAssignFocusedUMBundleMiscellaneousByListItem.get(1).get(0);
		
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.selectAssignFocusedUMBundleMiscellaneousBy(strAssignFocusedUMBundleMiscellaneousBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleMiscellaneousListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignedFocusedUMBundleMiscellaneousListBoxPresence();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleMiscellaneousListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignedFocusedUMBundleMiscellaneousListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleMiscellaneousListBoxItems(DataTable assignedFocusedUMBundleMiscellaneousListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleMiscellaneousListItems = assignedFocusedUMBundleMiscellaneousListItems.raw();
		
		String strAssignedFocusedUMBundleMiscellaneous = strFocusedUMBundleMiscellaneousListItems.get(1).get(0);
		
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignedFocusedUMBundleMiscellaneousListBoxItems(strAssignedFocusedUMBundleMiscellaneous);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputFocusedUMBundleMiscellaneousAssignmentDetails(DataTable focusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = focusedUMBundleMiscellaneousAssignmentData.raw();
		
		String strAssignFocusedUMBundleMiscellaneousBy  = assignmentDetails.get(1).get(0);
		String strAssignedFocusedUMBundleMiscellaneous = assignmentDetails.get(1).get(1);
		
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.selectAssignFocusedUMBundleMiscellaneousBy(strAssignFocusedUMBundleMiscellaneousBy);
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.selectAssignedFocusedUMBundleMiscellaneous(strAssignedFocusedUMBundleMiscellaneous);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedFocusedUMBundleMiscellaneousAssignmentCheckbox(DataTable selectedFocusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		List<List<String>>  selectedFocusedUMBundleMiscellaneous = selectedFocusedUMBundleMiscellaneousAssignmentData.raw();
		
		String strOperation = selectedFocusedUMBundleMiscellaneous.get(1).get(0);
		String strSelectedFocusedUMBundleMiscellaneous = selectedFocusedUMBundleMiscellaneous.get(1).get(1);
		
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.clickOnSelectedFocusedUMBundleMiscellaneousAssignmentCheckbox(strOperation, strSelectedFocusedUMBundleMiscellaneous);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleMiscellaneousAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}