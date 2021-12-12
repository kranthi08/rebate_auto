package com.project.actors;

import java.util.List;
import com.project.pages.UIAddVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddVendorFormularyIDAssignmentPage {
	
	@Steps
	UIAddVendorFormularyIDAssignmentPage uiAddVendorFormularyIDAssignmentPage;
	
	@Step
	public void verifyAssignmentCriteria() throws Throwable {		
		uiAddVendorFormularyIDAssignmentPage.verifyVendorFormularyIDAssignmentIsDisplayed();
	}
	
	@Step
	public void verifyAssignVendorFormularyIDByListBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxPresence();
	}
	
	@Step
	public void verifyAssignVendorFormularyIDByListBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignVendorFormularyIDByListBoxDefaultItem(DataTable assignVendorFormularyIDByListDefaultItem) throws Throwable
	{
		List<List<String>> strVendorFormularyIDByListDefaultItem = assignVendorFormularyIDByListDefaultItem.raw();
		
		String strDefaultItem = strVendorFormularyIDByListDefaultItem.get(1).get(0);
		
		uiAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignVendorFormularyIDByListBoxItems(DataTable assignVendorFormularyIDByListItems) throws Throwable
	{
		List<List<String>> strVendorFormularyIDByListItems = assignVendorFormularyIDByListItems.raw();
		
		String strAssignVendorFormularyIDBy = strVendorFormularyIDByListItems.get(1).get(0);
		
		uiAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxItems(strAssignVendorFormularyIDBy);
	}
	
	@Step
	public void verifyAssignVendorFormularyIDByListBoxIsDisabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxIsDisabled();
	}	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignVendorFormularyIDByListBoxItem(DataTable assignVendorFormularyIDByListItem) throws Throwable
	{
		List<List<String>> strAssignVendorFormularyIDByListItem = assignVendorFormularyIDByListItem.raw();
		
		String strAssignVendorFormularyIDBy = strAssignVendorFormularyIDByListItem.get(1).get(0);
		
		uiAddVendorFormularyIDAssignmentPage.selectAssignVendorFormularyIDBy(strAssignVendorFormularyIDBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}	
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}	
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}	
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedVendorFormularyIDEditBoxPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAssignedVendorFormularyIDEditBoxPresence();
	}
	
	@Step
	public void verifyAssignedVendorFormularyIDEditBoxIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAssignedVendorFormularyIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedVendorFormularyIDEditBoxMaxLength(DataTable assignedVendorFormularyIDMaxLength) throws Throwable
	{
		List<List<String>> strAssignedVendorFormularyIDMaxLength = assignedVendorFormularyIDMaxLength.raw();
		
		String strAssignedVendorFormularyIDLength = strAssignedVendorFormularyIDMaxLength.get(1).get(0);
		
		uiAddVendorFormularyIDAssignmentPage.verifyAssignedVendorFormularyIDEditBoxMaxLength(strAssignedVendorFormularyIDLength);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputVendorFormularyIDAssignmentDetails(DataTable vendorFormularyIDAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = vendorFormularyIDAssignmentData.raw();
		
		String strAssignVendorFormularyIDBy  = assignmentDetails.get(1).get(0);
		String strAssignedVendorFormularyID = assignmentDetails.get(1).get(1);
		
		uiAddVendorFormularyIDAssignmentPage.selectAssignVendorFormularyIDBy(strAssignVendorFormularyIDBy);
		uiAddVendorFormularyIDAssignmentPage.enterAssignedVendorFormularyID(strAssignedVendorFormularyID);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedVendorFormularyIDAssignmentCheckbox(DataTable selectedVendorFormularyIDAssignmentData) throws Throwable
	{
		List<List<String>>  selectedVendorFormularyID = selectedVendorFormularyIDAssignmentData.raw();
		
		String strOperation = selectedVendorFormularyID.get(1).get(0);
		String strSelectedVendorFormularyID = selectedVendorFormularyID.get(1).get(1);
		
		uiAddVendorFormularyIDAssignmentPage.clickOnSelectedVendorFormularyIDAssignmentCheckbox(strOperation, strSelectedVendorFormularyID);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Step
	public void verifyPreviousButtonPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyPreviousButtonPresence();
	}
	
	@Step
	public void verifyPreviousButtonIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyPreviousButtonIsEnabled();
	}
	
	@Step
	public void verifyNextButtonPresence() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyNextButtonPresence();
	}
	
	@Step
	public void verifyNextButtonIsEnabled() throws Throwable
	{
		uiAddVendorFormularyIDAssignmentPage.verifyNextButtonIsEnabled();
	}
	
	@Step
	public void clickOnNextButton() throws Throwable{
		uiAddVendorFormularyIDAssignmentPage.clickOnNextButton();
	}
}