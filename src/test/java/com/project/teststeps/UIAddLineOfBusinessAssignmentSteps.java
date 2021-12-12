package com.project.teststeps;

import com.project.actors.ActorUIAddLineOfBusinessAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddLineOfBusinessAssignmentSteps 
{
	
	@Steps
	ActorUIAddLineOfBusinessAssignmentPage actorUIAddLineOfBusinessAssignmentPage;
	
	@When("^verify the Assign line of business by List Box presence$")
	public void verify_the_assign_line_of_business_by_list_box_presence() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxPresence();
	}
	
	@Then("^verify the Assign line of business by List Box enabled$")
	public void verify_the_assign_line_of_business_by_list_box_enabled() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign line of business by List Box$")
	public void verify_the_default_item_displaying_in_assign_line_of_business_by_list_box(DataTable assignLineOfBusinessByListDefaultItem) throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxDefaultItem(assignLineOfBusinessByListDefaultItem);
	}
	
	@And("^verify the Assign line of business by List Box items$")
	public void verify_the_assign_line_of_business_by_list_box_items(DataTable assignLineOfBusinessByListItems) throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxItems(assignLineOfBusinessByListItems);
	}
	
	@When("^verify the Assign line of business by List Box disabled$")
	public void verify_the_assign_line_of_business_by_list_box_disabled() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxIsDisabled();
	}
	
	@Then("^Assign line of business by List Box should be disabled$")
	public void assign_line_of_business_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignLineOfBusinessByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned line of business List Box presence$")
	public void verify_the_assigned_line_of_business_list_box_presence() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignedLineOfBusinessListBoxPresence();
	}
	
	@Then("^verify the Assigned line of business List Box enabled$")
	public void verify_the_assigned_line_of_business_list_box_enabled() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignedLineOfBusinessListBoxIsEnabled();
	}
	
	@And("^verify the Assigned line of business List Box items$")
	public void verify_the_assigned_line_of_business_list_box_items(DataTable assignedLineOfBusinessListItems) throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAssignedLineOfBusinessListBoxItems(assignedLineOfBusinessListItems);
	}
	
	@When("^select value from Assign line of business by List Box$")
	public void select_value_from_assign_line_of_business_by_list_box(DataTable assignLineOfBusinessByListItem) throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.selectAssignLineOfBusinessByListBoxItem(assignLineOfBusinessByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Line Of Business Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Line Of Business Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Line Of Business Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Line Of Business Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Line Of Business Assignment$")
	public void verify_the_description_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_description_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Line Of Business Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Line Of Business Assignment$")
	public void verify_the_available_drug_list_table_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Line Of Business Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Line Of Business Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Line Of Business Assignment$")
	public void verify_the_name_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_name_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Line Of Business Assignment$")
	public void verify_the_type_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_type_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Line Of Business Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Line Of Business Assignment$")
	public void verify_the_available_client_table_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Line Of Business Assignment$")
	public void verify_the_client_number_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Line Of Business Assignment$")
	public void verify_the_client_name_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Line Of Business Assignment$")
	public void verify_the_start_date_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Line Of Business Assignment$")
	public void verify_the_end_date_edit_box_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Line Of Business Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Line Of Business Assignment$")
	public void verify_the_add_button_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Line Of Business Assignment$")
	public void verify_the_add_button_disabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Line Of Business Assignment details$")
	public void input_the_following_line_of_business_assignment_details(DataTable lineOfBusinessAssignmentData) throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.inputLineOfBusinessAssignmentDetails(lineOfBusinessAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Line Of Business Assignment$")
	public void verify_the_add_button_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Line Of Business Assignment$")
	public void click_on_add_button_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Line Of Business Assignment Table Presence$")
	public void verify_the_selected_line_of_business_assignment_table_presence() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Line Of Business Assignment Table should be displayed$")
	public void selected_line_of_business_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Line Of Business Assignment$")
	public void verify_the_remove_button_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Line Of Business Assignment$")
	public void verify_the_remove_button_disabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Line Of Business Assignment$")
	public void verify_the_update_button_presence_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Line Of Business Assignment$")
	public void verify_the_update_button_disabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Line Of Business Assignment check box$")
	public void click_on_selected_line_of_business_assignment_check_box(DataTable selectedLineOfBusinessAssignmentData) throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.clickOnSelectedLineOfBusinessAssignmentCheckbox(selectedLineOfBusinessAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Line Of Business Assignment$")
	public void verify_the_remove_button_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Line Of Business Assignment$")
	public void verify_the_update_button_enabled_in_line_of_business_assignment() throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Line Of Business Assignment Check box$")
	public void click_on_check_box_for_selected_line_of_business_assignment(DataTable selectedLineOfBusinessAssignmentData) throws Throwable
	{
		actorUIAddLineOfBusinessAssignmentPage.clickOnSelectedLineOfBusinessAssignmentCheckbox(selectedLineOfBusinessAssignmentData);
	}
}
