package com.project.actors;

import java.util.List;
import com.project.pages.UIAddHospiceFacilityAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddHospiceFacilityAssignmentPage {
	
	@Steps
	UIAddHospiceFacilityAssignmentPage uiAddHospiceFacilityAssignmentPage;
	
	@Step
	public void verifyAssignHospiceFacilityByListBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxPresence();
	}
	
	@Step
	public void verifyAssignHospiceFacilityByListBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignHospiceFacilityByListBoxDefaultItem(DataTable assignHospiceFacilityByListDefaultItem) throws Throwable
	{
		List<List<String>> strHospiceFacilityByListDefaultItem = assignHospiceFacilityByListDefaultItem.raw();
		
		String strDefaultItem = strHospiceFacilityByListDefaultItem.get(1).get(0);
		
		uiAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignHospiceFacilityByListBoxItems(DataTable assignHospiceFacilityByListItems) throws Throwable
	{
		List<List<String>> strHospiceFacilityByListItems = assignHospiceFacilityByListItems.raw();
		
		String strAssignHospiceFacilityBy = strHospiceFacilityByListItems.get(1).get(0);
		
		uiAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxItems(strAssignHospiceFacilityBy);
	}
	
	@Step
	public void verifyAssignHospiceFacilityByListBoxIsDisabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxIsDisabled();
	}	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignHospiceFacilityByListBoxItem(DataTable assignHospiceFacilityByListItem) throws Throwable
	{
		List<List<String>> strAssignHospiceFacilityByListItem = assignHospiceFacilityByListItem.raw();
		
		String strAssignHospiceFacilityBy = strAssignHospiceFacilityByListItem.get(1).get(0);
		
		uiAddHospiceFacilityAssignmentPage.selectAssignHospiceFacilityBy(strAssignHospiceFacilityBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHospiceFacilityListBoxPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAssignedHospiceFacilityListBoxPresence();
	}
	
	@Step
	public void verifyAssignedHospiceFacilityListBoxIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAssignedHospiceFacilityListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHospiceFacilityListBoxItems(DataTable assignedHospiceFacilityListItems) throws Throwable
	{
		List<List<String>> strHospiceFacilityListItems = assignedHospiceFacilityListItems.raw();
		
		String strAssignedHospiceFacility = strHospiceFacilityListItems.get(1).get(0);
		
		uiAddHospiceFacilityAssignmentPage.verifyAssignedHospiceFacilityListBoxItems(strAssignedHospiceFacility);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputHospiceFacilityAssignmentDetails(DataTable hospiceFacilityAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = hospiceFacilityAssignmentData.raw();
		
		String strAssignHospiceFacilityBy  = assignmentDetails.get(1).get(0);
		String strAssignedHospiceFacility = assignmentDetails.get(1).get(1);
		
		uiAddHospiceFacilityAssignmentPage.selectAssignHospiceFacilityBy(strAssignHospiceFacilityBy);
		uiAddHospiceFacilityAssignmentPage.selectAssignedHospiceFacility(strAssignedHospiceFacility);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedHospiceFacilityAssignmentCheckbox(DataTable selectedHospiceFacilityAssignmentData) throws Throwable
	{
		List<List<String>>  selectedHospiceFacility = selectedHospiceFacilityAssignmentData.raw();
		
		String strOperation = selectedHospiceFacility.get(1).get(0);
		String strSelectedHospiceFacility = selectedHospiceFacility.get(1).get(1);
		
		uiAddHospiceFacilityAssignmentPage.clickOnSelectedHospiceFacilityAssignmentCheckbox(strOperation, strSelectedHospiceFacility);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddHospiceFacilityAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}