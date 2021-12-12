package com.project.teststeps;

import com.project.actors.ActorUIAddHospiceFacilityAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddHospiceFacilityAssignmentSteps 
{
	
	@Steps
	ActorUIAddHospiceFacilityAssignmentPage actorUIAddHospiceFacilityAssignmentPage;
	
	@When("^verify the Assign hospice facility by List Box presence$")
	public void verify_the_assign_hospice_facility_by_list_box_presence() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxPresence();
	}
	
	@Then("^verify the Assign hospice facility by List Box enabled$")
	public void verify_the_assign_hospice_facility_by_list_box_enabled() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign hospice facility by List Box$")
	public void verify_the_default_item_displaying_in_assign_hospice_facility_by_list_box(DataTable assignHospiceFacilityByListDefaultItem) throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxDefaultItem(assignHospiceFacilityByListDefaultItem);
	}
	
	@And("^verify the Assign hospice facility by List Box items$")
	public void verify_the_assign_hospice_facility_by_list_box_items(DataTable assignHospiceFacilityByListItems) throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxItems(assignHospiceFacilityByListItems);
	}
	
	@When("^verify the Assign hospice facility by List Box disabled$")
	public void verify_the_assign_hospice_facility_by_list_box_disabled() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxIsDisabled();
	}
	
	@Then("^Assign hospice facility by List Box should be disabled$")
	public void assign_hospice_facility_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignHospiceFacilityByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned hospice facility List Box presence$")
	public void verify_the_assigned_hospice_facility_list_box_presence() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignedHospiceFacilityListBoxPresence();
	}
	
	@Then("^verify the Assigned hospice facility List Box enabled$")
	public void verify_the_assigned_hospice_facility_list_box_enabled() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignedHospiceFacilityListBoxIsEnabled();
	}
	
	@And("^verify the Assigned hospice facility List Box items$")
	public void verify_the_assigned_hospice_facility_list_box_items(DataTable assignedHospiceFacilityListItems) throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAssignedHospiceFacilityListBoxItems(assignedHospiceFacilityListItems);
	}
	
	@When("^select value from Assign hospice facility by List Box$")
	public void select_value_from_assign_hospice_facility_by_list_box(DataTable assignHospiceFacilityByListItem) throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.selectAssignHospiceFacilityByListBoxItem(assignHospiceFacilityByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Hospice Facility Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Hospice Facility Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_description_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_description_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Hospice Facility Assignment$")
	public void verify_the_available_drug_list_table_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Hospice Facility Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_name_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_name_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_type_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_type_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Hospice Facility Assignment$")
	public void verify_the_available_client_table_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_client_number_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_client_name_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_start_date_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Hospice Facility Assignment$")
	public void verify_the_end_date_edit_box_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Hospice Facility Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Hospice Facility Assignment$")
	public void verify_the_add_button_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Hospice Facility Assignment$")
	public void verify_the_add_button_disabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Hospice Facility Assignment details$")
	public void input_the_following_hospice_facility_assignment_details(DataTable hospiceFacilityAssignmentData) throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.inputHospiceFacilityAssignmentDetails(hospiceFacilityAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Hospice Facility Assignment$")
	public void verify_the_add_button_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Hospice Facility Assignment$")
	public void click_on_add_button_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Hospice Facility Assignment Table Presence$")
	public void verify_the_selected_hospice_facility_assignment_table_presence() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Hospice Facility Assignment Table should be displayed$")
	public void selected_hospice_facility_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Hospice Facility Assignment$")
	public void verify_the_remove_button_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Hospice Facility Assignment$")
	public void verify_the_remove_button_disabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Hospice Facility Assignment$")
	public void verify_the_update_button_presence_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Hospice Facility Assignment$")
	public void verify_the_update_button_disabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Hospice Facility Assignment check box$")
	public void click_on_selected_hospice_facility_assignment_check_box(DataTable selectedHospiceFacilityAssignmentData) throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.clickOnSelectedHospiceFacilityAssignmentCheckbox(selectedHospiceFacilityAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Hospice Facility Assignment$")
	public void verify_the_remove_button_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Hospice Facility Assignment$")
	public void verify_the_update_button_enabled_in_hospice_facility_assignment() throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Hospice Facility Assignment Check box$")
	public void click_on_check_box_for_selected_hospice_facility_assignment(DataTable selectedHospiceFacilityAssignmentData) throws Throwable
	{
		actorUIAddHospiceFacilityAssignmentPage.clickOnSelectedHospiceFacilityAssignmentCheckbox(selectedHospiceFacilityAssignmentData);
	}
}
