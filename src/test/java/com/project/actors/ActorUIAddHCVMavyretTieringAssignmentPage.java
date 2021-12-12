package com.project.actors;

import java.util.List;
import com.project.pages.UIAddHCVMavyretTieringAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddHCVMavyretTieringAssignmentPage {
	
	@Steps
	UIAddHCVMavyretTieringAssignmentPage uiAddHCVMavyretTieringAssignmentPage;
	
	@Step
	public void verifyAssignHCVMavyretTieringByListBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxPresence();
	}
	
	@Step
	public void verifyAssignHCVMavyretTieringByListBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignHCVMavyretTieringByListBoxDefaultItem(DataTable assignHCVMavyretTieringByListDefaultItem) throws Throwable
	{
		List<List<String>> strHCVMavyretTieringByListDefaultItem = assignHCVMavyretTieringByListDefaultItem.raw();
		
		String strDefaultItem = strHCVMavyretTieringByListDefaultItem.get(1).get(0);
		
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignHCVMavyretTieringByListBoxItems(DataTable assignHCVMavyretTieringByListItems) throws Throwable
	{
		List<List<String>> strHCVMavyretTieringByListItems = assignHCVMavyretTieringByListItems.raw();
		
		String strAssignHCVMavyretTieringBy = strHCVMavyretTieringByListItems.get(1).get(0);
		
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxItems(strAssignHCVMavyretTieringBy);
	}
	
	@Step
	public void verifyAssignHCVMavyretTieringByListBoxIsDisabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxIsDisabled();
	}	
	
	
	// Available Coverage Code
	
	@Step
	public void selectAssignHCVMavyretTieringByListBoxItem(DataTable assignHCVMavyretTieringByListItem) throws Throwable
	{
		List<List<String>> strAssignHCVMavyretTieringByListItem = assignHCVMavyretTieringByListItem.raw();
		
		String strAssignHCVMavyretTieringBy = strAssignHCVMavyretTieringByListItem.get(1).get(0);
		
		uiAddHCVMavyretTieringAssignmentPage.selectAssignHCVMavyretTieringBy(strAssignHCVMavyretTieringBy);
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@Step
	public void verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	// Available Drug List
	
	@Step
	public void verifyAvailableDrugListTablePresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@Step
	public void verifyAvailableDrugListTablePaginationPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListNameEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}
	
	// Available Client
	
	@Step
	public void verifyAvailableClientTablePresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAvailableClientTablePresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Step
	public void verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientNameEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Step
	public void verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientStartDateEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEndDateEditBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Step
	public void verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVMavyretTieringListBoxPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignedHCVMavyretTieringListBoxPresence();
	}
	
	@Step
	public void verifyAssignedHCVMavyretTieringListBoxIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignedHCVMavyretTieringListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignedHCVMavyretTieringListBoxItems(DataTable assignedHCVMavyretTieringListItems) throws Throwable
	{
		List<List<String>> strHCVMavyretTieringListItems = assignedHCVMavyretTieringListItems.raw();
		
		String strAssignedHCVMavyretTiering = strHCVMavyretTieringListItems.get(1).get(0);
		
		uiAddHCVMavyretTieringAssignmentPage.verifyAssignedHCVMavyretTieringListBoxItems(strAssignedHCVMavyretTiering);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputHCVMavyretTieringAssignmentDetails(DataTable hcvMavyretTieringAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = hcvMavyretTieringAssignmentData.raw();
		
		String strAssignHCVMavyretTieringBy  = assignmentDetails.get(1).get(0);
		String strAssignedHCVMavyretTiering = assignmentDetails.get(1).get(1);
		
		uiAddHCVMavyretTieringAssignmentPage.selectAssignHCVMavyretTieringBy(strAssignHCVMavyretTieringBy);
		uiAddHCVMavyretTieringAssignmentPage.selectAssignedHCVMavyretTiering(strAssignedHCVMavyretTiering);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedAssignmentTablePresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedHCVMavyretTieringAssignmentCheckbox(DataTable selectedHCVMavyretTieringAssignmentData) throws Throwable
	{
		List<List<String>>  selectedHCVMavyretTiering = selectedHCVMavyretTieringAssignmentData.raw();
		
		String strOperation = selectedHCVMavyretTiering.get(1).get(0);
		String strSelectedHCVMavyretTiering = selectedHCVMavyretTiering.get(1).get(1);
		
		uiAddHCVMavyretTieringAssignmentPage.clickOnSelectedHCVMavyretTieringAssignmentCheckbox(strOperation, strSelectedHCVMavyretTiering);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddHCVMavyretTieringAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}