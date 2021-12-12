package com.project.actors;

import java.util.List;
import com.project.pages.UIAddHCVSolvaldiUMWithoutSTAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddHCVSolvaldiUMWithoutSTAssignmentPage {
	
	@Steps
	UIAddHCVSolvaldiUMWithoutSTAssignmentPage uiAddHCVSolvaldiUMWithoutSTAssignmentPage;
	
	@Step
	public void verifyAssignHCVSolvaldiUMWithoutSTByListBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxPresence();
	}
	
	@Step
	public void verifyAssignHCVSolvaldiUMWithoutSTByListBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignHCVSolvaldiUMWithoutSTByListBoxDefaultItem(DataTable assignHCVSolvaldiUMWithoutSTByListDefaultItem) throws Throwable
	{
		List<List<String>> strHCVSolvaldiUMWithoutSTByListDefaultItem = assignHCVSolvaldiUMWithoutSTByListDefaultItem.raw();
		
		String strDefaultItem = strHCVSolvaldiUMWithoutSTByListDefaultItem.get(1).get(0);
		
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignHCVSolvaldiUMWithoutSTByListBoxItems(DataTable assignHCVSolvaldiUMWithoutSTByListItems) throws Throwable
	{
		List<List<String>> strHCVSolvaldiUMWithoutSTByListItems = assignHCVSolvaldiUMWithoutSTByListItems.raw();
		
		String strAssignHCVSolvaldiUMWithoutSTBy = strHCVSolvaldiUMWithoutSTByListItems.get(1).get(0);
		
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxItems(strAssignHCVSolvaldiUMWithoutSTBy);
	}
	
	@Step
	public void verifyAssignHCVSolvaldiUMWithoutSTByListBoxIsDisabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignHCVSolvaldiUMWithoutSTByListBoxItem(DataTable assignHCVSolvaldiUMWithoutSTByListItem) throws Throwable
	{
		List<List<String>> strAssignHCVSolvaldiUMWithoutSTByListItem = assignHCVSolvaldiUMWithoutSTByListItem.raw();
		
		String strAssignHCVSolvaldiUMWithoutSTBy = strAssignHCVSolvaldiUMWithoutSTByListItem.get(1).get(0);
		
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignHCVSolvaldiUMWithoutSTBy(strAssignHCVSolvaldiUMWithoutSTBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVSolvaldiUMWithoutSTListBoxPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignedHCVSolvaldiUMWithoutSTListBoxPresence();
	}
	
	@Step
	public void verifyAssignedHCVSolvaldiUMWithoutSTListBoxIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignedHCVSolvaldiUMWithoutSTListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVSolvaldiUMWithoutSTListBoxItems(DataTable assignedHCVSolvaldiUMWithoutSTListItems) throws Throwable
	{
		List<List<String>> strHCVSolvaldiUMWithoutSTListItems = assignedHCVSolvaldiUMWithoutSTListItems.raw();
		
		String strAssignedHCVSolvaldiUMWithoutST = strHCVSolvaldiUMWithoutSTListItems.get(1).get(0);
		
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignedHCVSolvaldiUMWithoutSTListBoxItems(strAssignedHCVSolvaldiUMWithoutST);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputHCVSolvaldiUMWithoutSTAssignmentDetails(DataTable hcvSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = hcvSolvaldiUMWithoutSTAssignmentData.raw();
		
		String strAssignHCVSolvaldiUMWithoutSTBy  = assignmentDetails.get(1).get(0);
		String strAssignedHCVSolvaldiUMWithoutST = assignmentDetails.get(1).get(1);
		
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignHCVSolvaldiUMWithoutSTBy(strAssignHCVSolvaldiUMWithoutSTBy);
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignedHCVSolvaldiUMWithoutST(strAssignedHCVSolvaldiUMWithoutST);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedHCVSolvaldiUMWithoutSTAssignmentCheckbox(DataTable selectedHCVSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		List<List<String>>  selectedHCVSolvaldiUMWithoutST = selectedHCVSolvaldiUMWithoutSTAssignmentData.raw();
		
		String strOperation = selectedHCVSolvaldiUMWithoutST.get(1).get(0);
		String strSelectedHCVSolvaldiUMWithoutST = selectedHCVSolvaldiUMWithoutST.get(1).get(1);
		
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.clickOnSelectedHCVSolvaldiUMWithoutSTAssignmentCheckbox(strOperation, strSelectedHCVSolvaldiUMWithoutST);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}