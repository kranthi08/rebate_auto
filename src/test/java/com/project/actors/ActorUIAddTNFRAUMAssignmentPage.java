package com.project.actors;

import java.util.List;
import com.project.pages.UIAddTNFRAUMAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddTNFRAUMAssignmentPage {
	
	@Steps
	UIAddTNFRAUMAssignmentPage uiAddTNFRAUMAssignmentPage;
	
	@Step
	public void verifyAssignTNFRAUMByListBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxPresence();
	}
	
	@Step
	public void verifyAssignTNFRAUMByListBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignTNFRAUMByListBoxDefaultItem(DataTable assignTNFRAUMByListDefaultItem) throws Throwable
	{
		List<List<String>> strTNFRAUMByListDefaultItem = assignTNFRAUMByListDefaultItem.raw();
		
		String strDefaultItem = strTNFRAUMByListDefaultItem.get(1).get(0);
		
		uiAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignTNFRAUMByListBoxItems(DataTable assignTNFRAUMByListItems) throws Throwable
	{
		List<List<String>> strTNFRAUMByListItems = assignTNFRAUMByListItems.raw();
		
		String strAssignTNFRAUMBy = strTNFRAUMByListItems.get(1).get(0);
		
		uiAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxItems(strAssignTNFRAUMBy);
	}
	
	@Step
	public void verifyAssignTNFRAUMByListBoxIsDisabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignTNFRAUMByListBoxItem(DataTable assignTNFRAUMByListItem) throws Throwable
	{
		List<List<String>> strAssignTNFRAUMByListItem = assignTNFRAUMByListItem.raw();
		
		String strAssignTNFRAUMBy = strAssignTNFRAUMByListItem.get(1).get(0);
		
		uiAddTNFRAUMAssignmentPage.selectAssignTNFRAUMBy(strAssignTNFRAUMBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedTNFRAUMListBoxPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAssignedTNFRAUMListBoxPresence();
	}
	
	@Step
	public void verifyAssignedTNFRAUMListBoxIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAssignedTNFRAUMListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedTNFRAUMListBoxItems(DataTable assignedTNFRAUMListItems) throws Throwable
	{
		List<List<String>> strTNFRAUMListItems = assignedTNFRAUMListItems.raw();
		
		String strAssignedTNFRAUM = strTNFRAUMListItems.get(1).get(0);
		
		uiAddTNFRAUMAssignmentPage.verifyAssignedTNFRAUMListBoxItems(strAssignedTNFRAUM);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputTNFRAUMAssignmentDetails(DataTable tnfraumAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = tnfraumAssignmentData.raw();
		
		String strAssignTNFRAUMBy  = assignmentDetails.get(1).get(0);
		String strAssignedTNFRAUM = assignmentDetails.get(1).get(1);
		
		uiAddTNFRAUMAssignmentPage.selectAssignTNFRAUMBy(strAssignTNFRAUMBy);
		uiAddTNFRAUMAssignmentPage.selectAssignedTNFRAUM(strAssignedTNFRAUM);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedTNFRAUMAssignmentCheckbox(DataTable selectedTNFRAUMAssignmentData) throws Throwable
	{
		List<List<String>>  selectedTNFRAUM = selectedTNFRAUMAssignmentData.raw();
		
		String strOperation = selectedTNFRAUM.get(1).get(0);
		String strSelectedTNFRAUM = selectedTNFRAUM.get(1).get(1);
		
		uiAddTNFRAUMAssignmentPage.clickOnSelectedTNFRAUMAssignmentCheckbox(strOperation, strSelectedTNFRAUM);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddTNFRAUMAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}