package com.project.actors;

import java.util.List;
import com.project.pages.UIAddStepTherapyProgramAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddStepTherapyProgramAssignmentPage {
	
	@Steps
	UIAddStepTherapyProgramAssignmentPage uiAddStepTherapyProgramAssignmentPage;
	
	@Step
	public void verifyAssignStepTherapyProgramByListBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxPresence();
	}
	
	@Step
	public void verifyAssignStepTherapyProgramByListBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignStepTherapyProgramByListBoxDefaultItem(DataTable assignStepTherapyProgramByListDefaultItem) throws Throwable
	{
		List<List<String>> strStepTherapyProgramByListDefaultItem = assignStepTherapyProgramByListDefaultItem.raw();
		
		String strDefaultItem = strStepTherapyProgramByListDefaultItem.get(1).get(0);
		
		uiAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignStepTherapyProgramByListBoxItems(DataTable assignStepTherapyProgramByListItems) throws Throwable
	{
		List<List<String>> strStepTherapyProgramByListItems = assignStepTherapyProgramByListItems.raw();
		
		String strAssignStepTherapyProgramBy = strStepTherapyProgramByListItems.get(1).get(0);
		
		uiAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxItems(strAssignStepTherapyProgramBy);
	}
	
	@Step
	public void verifyAssignStepTherapyProgramByListBoxIsDisabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignStepTherapyProgramByListBoxItem(DataTable assignStepTherapyProgramByListItem) throws Throwable
	{
		List<List<String>> strAssignStepTherapyProgramByListItem = assignStepTherapyProgramByListItem.raw();
		
		String strAssignStepTherapyProgramBy = strAssignStepTherapyProgramByListItem.get(1).get(0);
		
		uiAddStepTherapyProgramAssignmentPage.selectAssignStepTherapyProgramBy(strAssignStepTherapyProgramBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedStepTherapyProgramListBoxPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAssignedStepTherapyProgramListBoxPresence();
	}
	
	@Step
	public void verifyAssignedStepTherapyProgramListBoxIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAssignedStepTherapyProgramListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedStepTherapyProgramListBoxItems(DataTable assignedStepTherapyProgramListItems) throws Throwable
	{
		List<List<String>> strStepTherapyProgramListItems = assignedStepTherapyProgramListItems.raw();
		
		String strAssignedStepTherapyProgram = strStepTherapyProgramListItems.get(1).get(0);
		
		uiAddStepTherapyProgramAssignmentPage.verifyAssignedStepTherapyProgramListBoxItems(strAssignedStepTherapyProgram);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputStepTherapyProgramAssignmentDetails(DataTable stepTherapyProgramAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = stepTherapyProgramAssignmentData.raw();
		
		String strAssignStepTherapyProgramBy  = assignmentDetails.get(1).get(0);
		String strAssignedStepTherapyProgram = assignmentDetails.get(1).get(1);
		
		uiAddStepTherapyProgramAssignmentPage.selectAssignStepTherapyProgramBy(strAssignStepTherapyProgramBy);
		uiAddStepTherapyProgramAssignmentPage.selectAssignedStepTherapyProgram(strAssignedStepTherapyProgram);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedStepTherapyProgramAssignmentCheckbox(DataTable selectedStepTherapyProgramAssignmentData) throws Throwable
	{
		List<List<String>>  selectedStepTherapyProgram = selectedStepTherapyProgramAssignmentData.raw();
		
		String strOperation = selectedStepTherapyProgram.get(1).get(0);
		String strSelectedStepTherapyProgram = selectedStepTherapyProgram.get(1).get(1);
		
		uiAddStepTherapyProgramAssignmentPage.clickOnSelectedStepTherapyProgramAssignmentCheckbox(strOperation, strSelectedStepTherapyProgram);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddStepTherapyProgramAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}