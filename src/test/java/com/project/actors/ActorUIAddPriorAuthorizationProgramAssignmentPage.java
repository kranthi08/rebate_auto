package com.project.actors;

import java.util.List;
import com.project.pages.UIAddPriorAuthorizationProgramAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddPriorAuthorizationProgramAssignmentPage {
	
	@Steps
	UIAddPriorAuthorizationProgramAssignmentPage uiAddPriorAuthorizationProgramAssignmentPage;
	
	@Step
	public void verifyAssignPriorAuthorizationProgramByListBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxPresence();
	}
	
	@Step
	public void verifyAssignPriorAuthorizationProgramByListBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignPriorAuthorizationProgramByListBoxDefaultItem(DataTable assignPriorAuthorizationProgramByListDefaultItem) throws Throwable
	{
		List<List<String>> strPriorAuthorizationProgramByListDefaultItem = assignPriorAuthorizationProgramByListDefaultItem.raw();
		
		String strDefaultItem = strPriorAuthorizationProgramByListDefaultItem.get(1).get(0);
		
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignPriorAuthorizationProgramByListBoxItems(DataTable assignPriorAuthorizationProgramByListItems) throws Throwable
	{
		List<List<String>> strPriorAuthorizationProgramByListItems = assignPriorAuthorizationProgramByListItems.raw();
		
		String strAssignPriorAuthorizationProgramBy = strPriorAuthorizationProgramByListItems.get(1).get(0);
		
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxItems(strAssignPriorAuthorizationProgramBy);
	}
	
	@Step
	public void verifyAssignPriorAuthorizationProgramByListBoxIsDisabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignPriorAuthorizationProgramByListBoxItem(DataTable assignPriorAuthorizationProgramByListItem) throws Throwable
	{
		List<List<String>> strAssignPriorAuthorizationProgramByListItem = assignPriorAuthorizationProgramByListItem.raw();
		
		String strAssignPriorAuthorizationProgramBy = strAssignPriorAuthorizationProgramByListItem.get(1).get(0);
		
		uiAddPriorAuthorizationProgramAssignmentPage.selectAssignPriorAuthorizationProgramBy(strAssignPriorAuthorizationProgramBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedPriorAuthorizationProgramListBoxPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignedPriorAuthorizationProgramListBoxPresence();
	}
	
	@Step
	public void verifyAssignedPriorAuthorizationProgramListBoxIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignedPriorAuthorizationProgramListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedPriorAuthorizationProgramListBoxItems(DataTable assignedPriorAuthorizationProgramListItems) throws Throwable
	{
		List<List<String>> strPriorAuthorizationProgramListItems = assignedPriorAuthorizationProgramListItems.raw();
		
		String strAssignedPriorAuthorizationProgram = strPriorAuthorizationProgramListItems.get(1).get(0);
		
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAssignedPriorAuthorizationProgramListBoxItems(strAssignedPriorAuthorizationProgram);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputPriorAuthorizationProgramAssignmentDetails(DataTable priorAuthorizationProgramAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = priorAuthorizationProgramAssignmentData.raw();
		
		String strAssignPriorAuthorizationProgramBy  = assignmentDetails.get(1).get(0);
		String strAssignedPriorAuthorizationProgram = assignmentDetails.get(1).get(1);
		
		uiAddPriorAuthorizationProgramAssignmentPage.selectAssignPriorAuthorizationProgramBy(strAssignPriorAuthorizationProgramBy);
		uiAddPriorAuthorizationProgramAssignmentPage.selectAssignedPriorAuthorizationProgram(strAssignedPriorAuthorizationProgram);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedPriorAuthorizationProgramAssignmentCheckbox(DataTable selectedPriorAuthorizationProgramAssignmentData) throws Throwable
	{
		List<List<String>>  selectedPriorAuthorizationProgram = selectedPriorAuthorizationProgramAssignmentData.raw();
		
		String strOperation = selectedPriorAuthorizationProgram.get(1).get(0);
		String strSelectedPriorAuthorizationProgram = selectedPriorAuthorizationProgram.get(1).get(1);
		
		uiAddPriorAuthorizationProgramAssignmentPage.clickOnSelectedPriorAuthorizationProgramAssignmentCheckbox(strOperation, strSelectedPriorAuthorizationProgram);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddPriorAuthorizationProgramAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}