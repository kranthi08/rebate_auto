package com.project.actors;

import java.util.List;
import com.project.pages.UIAddHCVHarvoniUMWithSTAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddHCVHarvoniUMWithSTAssignmentPage {
	
	@Steps
	UIAddHCVHarvoniUMWithSTAssignmentPage uiAddHCVHarvoniUMWithSTAssignmentPage;
	
	@Step
	public void verifyAssignHCVHarvoniUMWithSTByListBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxPresence();
	}
	
	@Step
	public void verifyAssignHCVHarvoniUMWithSTByListBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignHCVHarvoniUMWithSTByListBoxDefaultItem(DataTable assignHCVHarvoniUMWithSTByListDefaultItem) throws Throwable
	{
		List<List<String>> strHCVHarvoniUMWithSTByListDefaultItem = assignHCVHarvoniUMWithSTByListDefaultItem.raw();
		
		String strDefaultItem = strHCVHarvoniUMWithSTByListDefaultItem.get(1).get(0);
		
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignHCVHarvoniUMWithSTByListBoxItems(DataTable assignHCVHarvoniUMWithSTByListItems) throws Throwable
	{
		List<List<String>> strHCVHarvoniUMWithSTByListItems = assignHCVHarvoniUMWithSTByListItems.raw();
		
		String strAssignHCVHarvoniUMWithSTBy = strHCVHarvoniUMWithSTByListItems.get(1).get(0);
		
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxItems(strAssignHCVHarvoniUMWithSTBy);
	}
	
	@Step
	public void verifyAssignHCVHarvoniUMWithSTByListBoxIsDisabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignHCVHarvoniUMWithSTByListBoxItem(DataTable assignHCVHarvoniUMWithSTByListItem) throws Throwable
	{
		List<List<String>> strAssignHCVHarvoniUMWithSTByListItem = assignHCVHarvoniUMWithSTByListItem.raw();
		
		String strAssignHCVHarvoniUMWithSTBy = strAssignHCVHarvoniUMWithSTByListItem.get(1).get(0);
		
		uiAddHCVHarvoniUMWithSTAssignmentPage.selectAssignHCVHarvoniUMWithSTBy(strAssignHCVHarvoniUMWithSTBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVHarvoniUMWithSTListBoxPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignedHCVHarvoniUMWithSTListBoxPresence();
	}
	
	@Step
	public void verifyAssignedHCVHarvoniUMWithSTListBoxIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignedHCVHarvoniUMWithSTListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVHarvoniUMWithSTListBoxItems(DataTable assignedHCVHarvoniUMWithSTListItems) throws Throwable
	{
		List<List<String>> strHCVHarvoniUMWithSTListItems = assignedHCVHarvoniUMWithSTListItems.raw();
		
		String strAssignedHCVHarvoniUMWithST = strHCVHarvoniUMWithSTListItems.get(1).get(0);
		
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignedHCVHarvoniUMWithSTListBoxItems(strAssignedHCVHarvoniUMWithST);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputHCVHarvoniUMWithSTAssignmentDetails(DataTable hcvHarvoniUMWithSTAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = hcvHarvoniUMWithSTAssignmentData.raw();
		
		String strAssignHCVHarvoniUMWithSTBy  = assignmentDetails.get(1).get(0);
		String strAssignedHCVHarvoniUMWithST = assignmentDetails.get(1).get(1);
		
		uiAddHCVHarvoniUMWithSTAssignmentPage.selectAssignHCVHarvoniUMWithSTBy(strAssignHCVHarvoniUMWithSTBy);
		uiAddHCVHarvoniUMWithSTAssignmentPage.selectAssignedHCVHarvoniUMWithST(strAssignedHCVHarvoniUMWithST);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedHCVHarvoniUMWithSTAssignmentCheckbox(DataTable selectedHCVHarvoniUMWithSTAssignmentData) throws Throwable
	{
		List<List<String>>  selectedHCVHarvoniUMWithST = selectedHCVHarvoniUMWithSTAssignmentData.raw();
		
		String strOperation = selectedHCVHarvoniUMWithST.get(1).get(0);
		String strSelectedHCVHarvoniUMWithST = selectedHCVHarvoniUMWithST.get(1).get(1);
		
		uiAddHCVHarvoniUMWithSTAssignmentPage.clickOnSelectedHCVHarvoniUMWithSTAssignmentCheckbox(strOperation, strSelectedHCVHarvoniUMWithST);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddHCVHarvoniUMWithSTAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}