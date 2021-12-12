package com.project.actors;

import java.util.List;
import com.project.pages.UIAddFocusedUMBundleDiabetesAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddFocusedUMBundleDiabetesAssignmentPage {
	
	@Steps
	UIAddFocusedUMBundleDiabetesAssignmentPage uiAddFocusedUMBundleDiabetesAssignmentPage;
	
	@Step
	public void verifyAssignFocusedUMBundleDiabetesByListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxPresence();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleDiabetesByListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleDiabetesByListBoxDefaultItem(DataTable assignFocusedUMBundleDiabetesByListDefaultItem) throws Throwable
	{
		List<List<String>> strFocusedUMBundleDiabetesByListDefaultItem = assignFocusedUMBundleDiabetesByListDefaultItem.raw();
		
		String strDefaultItem = strFocusedUMBundleDiabetesByListDefaultItem.get(1).get(0);
		
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleDiabetesByListBoxItems(DataTable assignFocusedUMBundleDiabetesByListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleDiabetesByListItems = assignFocusedUMBundleDiabetesByListItems.raw();
		
		String strAssignFocusedUMBundleDiabetesBy = strFocusedUMBundleDiabetesByListItems.get(1).get(0);
		
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxItems(strAssignFocusedUMBundleDiabetesBy);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleDiabetesByListBoxIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignFocusedUMBundleDiabetesByListBoxItem(DataTable assignFocusedUMBundleDiabetesByListItem) throws Throwable
	{
		List<List<String>> strAssignFocusedUMBundleDiabetesByListItem = assignFocusedUMBundleDiabetesByListItem.raw();
		
		String strAssignFocusedUMBundleDiabetesBy = strAssignFocusedUMBundleDiabetesByListItem.get(1).get(0);
		
		uiAddFocusedUMBundleDiabetesAssignmentPage.selectAssignFocusedUMBundleDiabetesBy(strAssignFocusedUMBundleDiabetesBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleDiabetesListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignedFocusedUMBundleDiabetesListBoxPresence();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleDiabetesListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignedFocusedUMBundleDiabetesListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleDiabetesListBoxItems(DataTable assignedFocusedUMBundleDiabetesListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleDiabetesListItems = assignedFocusedUMBundleDiabetesListItems.raw();
		
		String strAssignedFocusedUMBundleDiabetes = strFocusedUMBundleDiabetesListItems.get(1).get(0);
		
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignedFocusedUMBundleDiabetesListBoxItems(strAssignedFocusedUMBundleDiabetes);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputFocusedUMBundleDiabetesAssignmentDetails(DataTable focusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = focusedUMBundleDiabetesAssignmentData.raw();
		
		String strAssignFocusedUMBundleDiabetesBy  = assignmentDetails.get(1).get(0);
		String strAssignedFocusedUMBundleDiabetes = assignmentDetails.get(1).get(1);
		
		uiAddFocusedUMBundleDiabetesAssignmentPage.selectAssignFocusedUMBundleDiabetesBy(strAssignFocusedUMBundleDiabetesBy);
		uiAddFocusedUMBundleDiabetesAssignmentPage.selectAssignedFocusedUMBundleDiabetes(strAssignedFocusedUMBundleDiabetes);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedFocusedUMBundleDiabetesAssignmentCheckbox(DataTable selectedFocusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		List<List<String>>  selectedFocusedUMBundleDiabetes = selectedFocusedUMBundleDiabetesAssignmentData.raw();
		
		String strOperation = selectedFocusedUMBundleDiabetes.get(1).get(0);
		String strSelectedFocusedUMBundleDiabetes = selectedFocusedUMBundleDiabetes.get(1).get(1);
		
		uiAddFocusedUMBundleDiabetesAssignmentPage.clickOnSelectedFocusedUMBundleDiabetesAssignmentCheckbox(strOperation, strSelectedFocusedUMBundleDiabetes);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleDiabetesAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}