package com.project.actors;

import java.util.List;
import com.project.pages.UIAddFocusedUMBundleRespiratoryAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddFocusedUMBundleRespiratoryAssignmentPage {
	
	@Steps
	UIAddFocusedUMBundleRespiratoryAssignmentPage uiAddFocusedUMBundleRespiratoryAssignmentPage;
	
	@Step
	public void verifyAssignFocusedUMBundleRespiratoryByListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxPresence();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleRespiratoryByListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignFocusedUMBundleRespiratoryByListBoxDefaultItem(DataTable assignFocusedUMBundleRespiratoryByListDefaultItem) throws Throwable
	{
		List<List<String>> strFocusedUMBundleRespiratoryByListDefaultItem = assignFocusedUMBundleRespiratoryByListDefaultItem.raw();
		
		String strDefaultItem = strFocusedUMBundleRespiratoryByListDefaultItem.get(1).get(0);
		
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleRespiratoryByListBoxItems(DataTable assignFocusedUMBundleRespiratoryByListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleRespiratoryByListItems = assignFocusedUMBundleRespiratoryByListItems.raw();
		
		String strAssignFocusedUMBundleRespiratoryBy = strFocusedUMBundleRespiratoryByListItems.get(1).get(0);
		
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxItems(strAssignFocusedUMBundleRespiratoryBy);
	}
	
	@Step
	public void verifyAssignFocusedUMBundleRespiratoryByListBoxIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignFocusedUMBundleRespiratoryByListBoxItem(DataTable assignFocusedUMBundleRespiratoryByListItem) throws Throwable
	{
		List<List<String>> strAssignFocusedUMBundleRespiratoryByListItem = assignFocusedUMBundleRespiratoryByListItem.raw();
		
		String strAssignFocusedUMBundleRespiratoryBy = strAssignFocusedUMBundleRespiratoryByListItem.get(1).get(0);
		
		uiAddFocusedUMBundleRespiratoryAssignmentPage.selectAssignFocusedUMBundleRespiratoryBy(strAssignFocusedUMBundleRespiratoryBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleRespiratoryListBoxPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignedFocusedUMBundleRespiratoryListBoxPresence();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleRespiratoryListBoxIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignedFocusedUMBundleRespiratoryListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedFocusedUMBundleRespiratoryListBoxItems(DataTable assignedFocusedUMBundleRespiratoryListItems) throws Throwable
	{
		List<List<String>> strFocusedUMBundleRespiratoryListItems = assignedFocusedUMBundleRespiratoryListItems.raw();
		
		String strAssignedFocusedUMBundleRespiratory = strFocusedUMBundleRespiratoryListItems.get(1).get(0);
		
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignedFocusedUMBundleRespiratoryListBoxItems(strAssignedFocusedUMBundleRespiratory);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputFocusedUMBundleRespiratoryAssignmentDetails(DataTable focusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = focusedUMBundleRespiratoryAssignmentData.raw();
		
		String strAssignFocusedUMBundleRespiratoryBy  = assignmentDetails.get(1).get(0);
		String strAssignedFocusedUMBundleRespiratory = assignmentDetails.get(1).get(1);
		
		uiAddFocusedUMBundleRespiratoryAssignmentPage.selectAssignFocusedUMBundleRespiratoryBy(strAssignFocusedUMBundleRespiratoryBy);
		uiAddFocusedUMBundleRespiratoryAssignmentPage.selectAssignedFocusedUMBundleRespiratory(strAssignedFocusedUMBundleRespiratory);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedFocusedUMBundleRespiratoryAssignmentCheckbox(DataTable selectedFocusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		List<List<String>>  selectedFocusedUMBundleRespiratory = selectedFocusedUMBundleRespiratoryAssignmentData.raw();
		
		String strOperation = selectedFocusedUMBundleRespiratory.get(1).get(0);
		String strSelectedFocusedUMBundleRespiratory = selectedFocusedUMBundleRespiratory.get(1).get(1);
		
		uiAddFocusedUMBundleRespiratoryAssignmentPage.clickOnSelectedFocusedUMBundleRespiratoryAssignmentCheckbox(strOperation, strSelectedFocusedUMBundleRespiratory);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddFocusedUMBundleRespiratoryAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}