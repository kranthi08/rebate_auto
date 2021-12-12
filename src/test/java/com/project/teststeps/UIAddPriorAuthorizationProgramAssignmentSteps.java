package com.project.teststeps;

import com.project.actors.ActorUIAddPriorAuthorizationProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddPriorAuthorizationProgramAssignmentSteps 
{
	
	@Steps
	ActorUIAddPriorAuthorizationProgramAssignmentPage actorUIAddPriorAuthorizationProgramAssignmentPage;
	
	@When("^verify the Assign prior authorization program by List Box presence$")
	public void verify_the_assign_prior_authorization_program_by_list_box_presence() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxPresence();
	}
	
	@Then("^verify the Assign prior authorization program by List Box enabled$")
	public void verify_the_assign_prior_authorization_program_by_list_box_enabled() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign prior authorization program by List Box$")
	public void verify_the_default_item_displaying_in_assign_prior_authorization_program_by_list_box(DataTable assignPriorAuthorizationProgramByListDefaultItem) throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxDefaultItem(assignPriorAuthorizationProgramByListDefaultItem);
	}
	
	@And("^verify the Assign prior authorization program by List Box items$")
	public void verify_the_assign_prior_authorization_program_by_list_box_items(DataTable assignPriorAuthorizationProgramByListItems) throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxItems(assignPriorAuthorizationProgramByListItems);
	}
	
	@When("^verify the Assign prior authorization program by List Box disabled$")
	public void verify_the_assign_vendor_formulary_id_by_list_box_disabled() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxIsDisabled();
	}
	
	@Then("^Assign prior authorization program by List Box should be disabled$")
	public void assign_vendor_formulary_id_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignPriorAuthorizationProgramByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned prior authorization program List Box presence$")
	public void verify_the_assigned_prior_authorization_program_list_box_presence() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignedPriorAuthorizationProgramListBoxPresence();
	}
	
	@Then("^verify the Assigned prior authorization program List Box enabled$")
	public void verify_the_assigned_prior_authorization_program_list_box_enabled() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignedPriorAuthorizationProgramListBoxIsEnabled();
	}
	
	@And("^verify the Assigned prior authorization program List Box items$")
	public void verify_the_assigned_prior_authorization_program_list_box_items(DataTable assignedPriorAuthorizationProgramListItems) throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAssignedPriorAuthorizationProgramListBoxItems(assignedPriorAuthorizationProgramListItems);
	}
	
	@When("^select value from Assign prior authorization program by List Box$")
	public void select_value_from_assign_prior_authorization_program_by_list_box(DataTable assignPriorAuthorizationProgramByListItem) throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.selectAssignPriorAuthorizationProgramByListBoxItem(assignPriorAuthorizationProgramByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Prior Authorization Program Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Prior Authorization Program Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_description_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_description_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Prior Authorization Program Assignment$")
	public void verify_the_available_drug_list_table_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Prior Authorization Program Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_name_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_name_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_type_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_type_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Prior Authorization Program Assignment$")
	public void verify_the_available_client_table_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_client_number_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_client_name_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_start_date_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Prior Authorization Program Assignment$")
	public void verify_the_end_date_edit_box_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Prior Authorization Program Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Prior Authorization Program Assignment$")
	public void verify_the_add_button_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Prior Authorization Program Assignment$")
	public void verify_the_add_button_disabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Prior Authorization Program Assignment details$")
	public void input_the_following_prior_authorization_program_assignment_details(DataTable priorAuthorizationProgramAssignmentData) throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.inputPriorAuthorizationProgramAssignmentDetails(priorAuthorizationProgramAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Prior Authorization Program Assignment$")
	public void verify_the_add_button_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Prior Authorization Program Assignment$")
	public void click_on_add_button_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Prior Authorization Program Assignment Table Presence$")
	public void verify_the_selected_prior_authorization_program_assignment_table_presence() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Prior Authorization Program Assignment Table should be displayed$")
	public void selected_prior_authorization_program_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Prior Authorization Program Assignment$")
	public void verify_the_remove_button_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Prior Authorization Program Assignment$")
	public void verify_the_remove_button_disabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Prior Authorization Program Assignment$")
	public void verify_the_update_button_presence_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Prior Authorization Program Assignment$")
	public void verify_the_update_button_disabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Prior Authorization Program Assignment check box$")
	public void click_on_selected_prior_authorization_program_assignment_check_box(DataTable selectedPriorAuthorizationProgramAssignmentData) throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.clickOnSelectedPriorAuthorizationProgramAssignmentCheckbox(selectedPriorAuthorizationProgramAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Prior Authorization Program Assignment$")
	public void verify_the_remove_button_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Prior Authorization Program Assignment$")
	public void verify_the_update_button_enabled_in_prior_authorization_program_assignment() throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Prior Authorization Program Assignment Check box$")
	public void click_on_check_box_for_selected_prior_authorization_program_assignment(DataTable selectedPriorAuthorizationProgramAssignmentData) throws Throwable
	{
		actorUIAddPriorAuthorizationProgramAssignmentPage.clickOnSelectedPriorAuthorizationProgramAssignmentCheckbox(selectedPriorAuthorizationProgramAssignmentData);
	}
}
