package com.project.actors;

import java.util.List;
import com.project.pages.UIAddHCVEpclusaUMAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddHCVEpclusaUMAssignmentPage {
	
	@Steps
	UIAddHCVEpclusaUMAssignmentPage uiAddHCVEpclusaUMAssignmentPage;
	
	@Step
	public void verifyAssignHCVEpclusaUMByListBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxPresence();
	}
	
	@Step
	public void verifyAssignHCVEpclusaUMByListBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignHCVEpclusaUMByListBoxDefaultItem(DataTable assignHCVEpclusaUMByListDefaultItem) throws Throwable
	{
		List<List<String>> strHCVEpclusaUMByListDefaultItem = assignHCVEpclusaUMByListDefaultItem.raw();
		
		String strDefaultItem = strHCVEpclusaUMByListDefaultItem.get(1).get(0);
		
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignHCVEpclusaUMByListBoxItems(DataTable assignHCVEpclusaUMByListItems) throws Throwable
	{
		List<List<String>> strHCVEpclusaUMByListItems = assignHCVEpclusaUMByListItems.raw();
		
		String strAssignHCVEpclusaUMBy = strHCVEpclusaUMByListItems.get(1).get(0);
		
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxItems(strAssignHCVEpclusaUMBy);
	}
	
	@Step
	public void verifyAssignHCVEpclusaUMByListBoxIsDisabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignHCVEpclusaUMByListBoxItem(DataTable assignHCVEpclusaUMByListItem) throws Throwable
	{
		List<List<String>> strAssignHCVEpclusaUMByListItem = assignHCVEpclusaUMByListItem.raw();
		
		String strAssignHCVEpclusaUMBy = strAssignHCVEpclusaUMByListItem.get(1).get(0);
		
		uiAddHCVEpclusaUMAssignmentPage.selectAssignHCVEpclusaUMBy(strAssignHCVEpclusaUMBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVEpclusaUMListBoxPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignedHCVEpclusaUMListBoxPresence();
	}
	
	@Step
	public void verifyAssignedHCVEpclusaUMListBoxIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignedHCVEpclusaUMListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVEpclusaUMListBoxItems(DataTable assignedHCVEpclusaUMListItems) throws Throwable
	{
		List<List<String>> strHCVEpclusaUMListItems = assignedHCVEpclusaUMListItems.raw();
		
		String strAssignedHCVEpclusaUM = strHCVEpclusaUMListItems.get(1).get(0);
		
		uiAddHCVEpclusaUMAssignmentPage.verifyAssignedHCVEpclusaUMListBoxItems(strAssignedHCVEpclusaUM);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputHCVEpclusaUMAssignmentDetails(DataTable hcvEpclusaUMAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = hcvEpclusaUMAssignmentData.raw();
		
		String strAssignHCVEpclusaUMBy  = assignmentDetails.get(1).get(0);
		String strAssignedHCVEpclusaUM = assignmentDetails.get(1).get(1);
		
		uiAddHCVEpclusaUMAssignmentPage.selectAssignHCVEpclusaUMBy(strAssignHCVEpclusaUMBy);
		uiAddHCVEpclusaUMAssignmentPage.selectAssignedHCVEpclusaUM(strAssignedHCVEpclusaUM);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedHCVEpclusaUMAssignmentCheckbox(DataTable selectedHCVEpclusaUMAssignmentData) throws Throwable
	{
		List<List<String>>  selectedHCVEpclusaUM = selectedHCVEpclusaUMAssignmentData.raw();
		
		String strOperation = selectedHCVEpclusaUM.get(1).get(0);
		String strSelectedHCVEpclusaUM = selectedHCVEpclusaUM.get(1).get(1);
		
		uiAddHCVEpclusaUMAssignmentPage.clickOnSelectedHCVEpclusaUMAssignmentCheckbox(strOperation, strSelectedHCVEpclusaUM);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddHCVEpclusaUMAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}