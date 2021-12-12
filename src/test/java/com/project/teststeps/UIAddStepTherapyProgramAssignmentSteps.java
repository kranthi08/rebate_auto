package com.project.teststeps;

import com.project.actors.ActorUIAddStepTherapyProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddStepTherapyProgramAssignmentSteps 
{
	
	@Steps
	ActorUIAddStepTherapyProgramAssignmentPage actorUIAddStepTherapyProgramAssignmentPage;
	
	@When("^verify the Assign step therapy program by List Box presence$")
	public void verify_the_assign_step_therapy_program_by_list_box_presence() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxPresence();
	}
	
	@Then("^verify the Assign step therapy program by List Box enabled$")
	public void verify_the_assign_step_therapy_program_by_list_box_enabled() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign step therapy program by List Box$")
	public void verify_the_default_item_displaying_in_assign_step_therapy_program_by_list_box(DataTable assignStepTherapyProgramByListDefaultItem) throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxDefaultItem(assignStepTherapyProgramByListDefaultItem);
	}
	
	@And("^verify the Assign step therapy program by List Box items$")
	public void verify_the_assign_step_therapy_program_by_list_box_items(DataTable assignStepTherapyProgramByListItems) throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxItems(assignStepTherapyProgramByListItems);
	}
	
	@When("^verify the Assign step therapy program by List Box disabled$")
	public void verify_the_assign_step_therapy_program_by_list_box_disabled() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxIsDisabled();
	}
	
	@Then("^Assign step therapy program by List Box should be disabled$")
	public void assign_assign_step_therapy_program_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignStepTherapyProgramByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned step therapy program List Box presence$")
	public void verify_the_assigned_step_therapy_program_list_box_presence() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignedStepTherapyProgramListBoxPresence();
	}
	
	@Then("^verify the Assigned step therapy program List Box enabled$")
	public void verify_the_assigned_step_therapy_program_list_box_enabled() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignedStepTherapyProgramListBoxIsEnabled();
	}
	
	@And("^verify the Assigned step therapy program List Box items$")
	public void verify_the_assigned_step_therapy_program_list_box_items(DataTable assignedStepTherapyProgramListItems) throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAssignedStepTherapyProgramListBoxItems(assignedStepTherapyProgramListItems);
	}
	
	@When("^select value from Assign step therapy program by List Box$")
	public void select_value_from_assign_step_therapy_program_by_list_box(DataTable assignStepTherapyProgramByListItem) throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.selectAssignStepTherapyProgramByListBoxItem(assignStepTherapyProgramByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Step Therapy Program Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Step Therapy Program Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_description_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_description_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Step Therapy Program Assignment$")
	public void verify_the_available_drug_list_table_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Step Therapy Program Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_name_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_name_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_type_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_type_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Step Therapy Program Assignment$")
	public void verify_the_available_client_table_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_client_number_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_client_name_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_start_date_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Step Therapy Program Assignment$")
	public void verify_the_end_date_edit_box_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Step Therapy Program Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Step Therapy Program Assignment$")
	public void verify_the_add_button_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Step Therapy Program Assignment$")
	public void verify_the_add_button_disabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Step Therapy Program Assignment details$")
	public void input_the_following_step_therapy_program_assignment_details(DataTable stepTherapyProgramAssignmentData) throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.inputStepTherapyProgramAssignmentDetails(stepTherapyProgramAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Step Therapy Program Assignment$")
	public void verify_the_add_button_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Step Therapy Program Assignment$")
	public void click_on_add_button_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Step Therapy Program Assignment Table Presence$")
	public void verify_the_selected_step_therapy_program_assignment_table_presence() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Step Therapy Program Assignment Table should be displayed$")
	public void selected_step_therapy_program_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Step Therapy Program Assignment$")
	public void verify_the_remove_button_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Step Therapy Program Assignment$")
	public void verify_the_remove_button_disabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Step Therapy Program Assignment$")
	public void verify_the_update_button_presence_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Step Therapy Program Assignment$")
	public void verify_the_update_button_disabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Step Therapy Program Assignment check box$")
	public void click_on_selected_step_therapy_program_assignment_check_box(DataTable selectedStepTherapyProgramAssignmentData) throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.clickOnSelectedStepTherapyProgramAssignmentCheckbox(selectedStepTherapyProgramAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Step Therapy Program Assignment$")
	public void verify_the_remove_button_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Step Therapy Program Assignment$")
	public void verify_the_update_button_enabled_in_step_therapy_program_assignment() throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Step Therapy Program Assignment Check box$")
	public void click_on_check_box_for_selected_step_therapy_program_assignment(DataTable selectedStepTherapyProgramAssignmentData) throws Throwable
	{
		actorUIAddStepTherapyProgramAssignmentPage.clickOnSelectedStepTherapyProgramAssignmentCheckbox(selectedStepTherapyProgramAssignmentData);
	}
}
