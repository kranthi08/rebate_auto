package com.project.teststeps;

import com.project.actors.ActorUIAddTNFRAUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddTNFRAUMAssignmentSteps 
{
	
	@Steps
	ActorUIAddTNFRAUMAssignmentPage actorUIAddTNFRAUMAssignmentPage;
	
	@When("^verify the Assign TNF/RA UM by List Box presence$")
	public void verify_the_assign_tnfraum_by_list_box_presence() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxPresence();
	}
	
	@Then("^verify the Assign TNF/RA UM by List Box enabled$")
	public void verify_the_assign_tnfraum_by_list_box_enabled() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign TNF/RA UM by List Box$")
	public void verify_the_default_item_displaying_in_assign_tnfraum_by_list_box(DataTable assignTNFRAUMByListDefaultItem) throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxDefaultItem(assignTNFRAUMByListDefaultItem);
	}
	
	@And("^verify the Assign TNF/RA UM by List Box items$")
	public void verify_the_assign_tnfraum_by_list_box_items(DataTable assignTNFRAUMByListItems) throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxItems(assignTNFRAUMByListItems);
	}
	
	@When("^verify the Assign TNF/RA UM by List Box disabled$")
	public void verify_the_assign_tnfraum_by_list_box_disabled() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxIsDisabled();
	}
	
	@Then("^Assign TNF/RA UM by List Box should be disabled$")
	public void assign_tnfraum_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignTNFRAUMByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned TNF/RA UM List Box presence$")
	public void verify_the_assigned_tnfraum_list_box_presence() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignedTNFRAUMListBoxPresence();
	}
	
	@Then("^verify the Assigned TNF/RA UM List Box enabled$")
	public void verify_the_assigned_tnfraum_list_box_enabled() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignedTNFRAUMListBoxIsEnabled();
	}
	
	@And("^verify the Assigned TNF/RA UM List Box items$")
	public void verify_the_assigned_tnfraum_list_box_items(DataTable assignedTNFRAUMListItems) throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAssignedTNFRAUMListBoxItems(assignedTNFRAUMListItems);
	}
	
	@When("^select value from Assign TNF/RA UM by List Box$")
	public void select_value_from_assign_tnfraum_by_list_box(DataTable assignTNFRAUMByListItem) throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.selectAssignTNFRAUMByListBoxItem(assignTNFRAUMByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in TNF/RA UM Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in TNF/RA UM Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_description_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_description_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in TNF/RA UM Assignment$")
	public void verify_the_available_drug_list_table_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in TNF/RA UM Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_name_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_name_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_type_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_type_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in TNF/RA UM Assignment$")
	public void verify_the_available_client_table_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_client_number_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_client_name_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_start_date_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in TNF/RA UM Assignment$")
	public void verify_the_end_date_edit_box_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in TNF/RA UM Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in TNF/RA UM Assignment$")
	public void verify_the_add_button_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in TNF/RA UM Assignment$")
	public void verify_the_add_button_disabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following TNF/RA UM Assignment details$")
	public void input_the_following_tnfraum_assignment_details(DataTable tnfraumAssignmentData) throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.inputTNFRAUMAssignmentDetails(tnfraumAssignmentData);
	}
	
	@Then("^verify the Add button enabled in TNF/RA UM Assignment$")
	public void verify_the_add_button_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in TNF/RA UM Assignment$")
	public void click_on_add_button_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected TNF/RA UM Assignment Table Presence$")
	public void verify_the_selected_tnfraum_assignment_table_presence() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected TNF/RA UM Assignment Table should be displayed$")
	public void selected_tnfraum_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in TNF/RA UM Assignment$")
	public void verify_the_remove_button_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in TNF/RA UM Assignment$")
	public void verify_the_remove_button_disabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in TNF/RA UM Assignment$")
	public void verify_the_update_button_presence_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in TNF/RA UM Assignment$")
	public void verify_the_update_button_disabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected TNF/RA UM Assignment check box$")
	public void click_on_selected_tnfraum_assignment_check_box(DataTable selectedTNFRAUMAssignmentData) throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.clickOnSelectedTNFRAUMAssignmentCheckbox(selectedTNFRAUMAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in TNF/RA UM Assignment$")
	public void verify_the_remove_button_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in TNF/RA UM Assignment$")
	public void verify_the_update_button_enabled_in_tnfraum_assignment() throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected TNF/RA UM Assignment Check box$")
	public void click_on_check_box_for_selected_tnfraum_assignment(DataTable selectedTNFRAUMAssignmentData) throws Throwable
	{
		actorUIAddTNFRAUMAssignmentPage.clickOnSelectedTNFRAUMAssignmentCheckbox(selectedTNFRAUMAssignmentData);
	}
}
