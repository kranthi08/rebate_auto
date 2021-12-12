package com.project.teststeps;

import com.project.actors.ActorUIAddFocusedUMBundleSpecialtyAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddFocusedUMBundleSpecialtyAssignmentSteps 
{
	
	@Steps
	ActorUIAddFocusedUMBundleSpecialtyAssignmentPage actorUIAddFocusedUMBundleSpecialtyAssignmentPage;
	
	@When("^verify the Assign focused UM bundle-specialty by List Box presence$")
	public void verify_the_assign_focused_um_bundle_specialty_by_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxPresence();
	}
	
	@Then("^verify the Assign focused UM bundle-specialty by List Box enabled$")
	public void verify_the_assign_focused_um_bundle_specialty_by_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign focused UM bundle-specialty by List Box$")
	public void verify_the_default_item_displaying_in_assign_focused_um_bundle_specialty_by_list_box(DataTable assignFocusedUMBundleSpecialtyByListDefaultItem) throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxDefaultItem(assignFocusedUMBundleSpecialtyByListDefaultItem);
	}
	
	@And("^verify the Assign focused UM bundle-specialty by List Box items$")
	public void verify_the_assign_focused_um_bundle_specialty_by_list_box_items(DataTable assignFocusedUMBundleSpecialtyByListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxItems(assignFocusedUMBundleSpecialtyByListItems);
	}
	
	@When("^verify the Assign focused UM bundle-specialty by List Box disabled$")
	public void verify_the_assign_focused_um_bundle_specialty_by_list_box_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxIsDisabled();
	}
	
	@Then("^Assign focused UM bundle-specialty by List Box should be disabled$")
	public void assign_focused_um_bundle_specialty_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignFocusedUMBundleSpecialtyByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned focused UM bundle-specialty List Box presence$")
	public void verify_the_assigned_focused_um_bundle_specialty_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignedFocusedUMBundleSpecialtyListBoxPresence();
	}
	
	@Then("^verify the Assigned focused UM bundle-specialty List Box enabled$")
	public void verify_the_assigned_focused_um_bundle_specialty_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignedFocusedUMBundleSpecialtyListBoxIsEnabled();
	}
	
	@And("^verify the Assigned focused UM bundle-specialty List Box items$")
	public void verify_the_assigned_focused_um_bundle_specialty_list_box_items(DataTable assignedFocusedUMBundleSpecialtyListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAssignedFocusedUMBundleSpecialtyListBoxItems(assignedFocusedUMBundleSpecialtyListItems);
	}
	
	@When("^select value from Assign focused UM bundle-specialty by List Box$")
	public void select_value_from_assign_focused_um_bundle_specialty_by_list_box(DataTable assignFocusedUMBundleSpecialtyByListItem) throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.selectAssignFocusedUMBundleSpecialtyByListBoxItem(assignFocusedUMBundleSpecialtyByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_description_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_description_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_available_drug_list_table_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_name_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_name_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_type_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_type_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_available_client_table_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_client_number_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_client_name_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_start_date_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_end_date_edit_box_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_add_button_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_add_button_disabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Focused UM Bundle-Specialty Assignment details$")
	public void input_the_following_focused_um_bundle_specialty_assignment_details(DataTable focusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.inputFocusedUMBundleSpecialtyAssignmentDetails(focusedUMBundleSpecialtyAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_add_button_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Focused UM Bundle-Specialty Assignment$")
	public void click_on_add_button_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Focused UM Bundle-Specialty Assignment Table Presence$")
	public void verify_the_selected_focused_um_bundle_specialty_assignment_table_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Focused UM Bundle-Specialty Assignment Table should be displayed$")
	public void selected_focused_um_bundle_specialty_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_remove_button_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_remove_button_disabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_update_button_presence_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_update_button_disabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Focused UM Bundle-Specialty Assignment check box$")
	public void click_on_selected_focused_um_bundle_specialty_assignment_check_box(DataTable selectedFocusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.clickOnSelectedFocusedUMBundleSpecialtyAssignmentCheckbox(selectedFocusedUMBundleSpecialtyAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_remove_button_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Focused UM Bundle-Specialty Assignment$")
	public void verify_the_update_button_enabled_in_focused_um_bundle_specialty_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Focused UM Bundle-Specialty Assignment Check box$")
	public void click_on_check_box_for_selected_focused_um_bundle_specialty_assignment(DataTable selectedFocusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleSpecialtyAssignmentPage.clickOnSelectedFocusedUMBundleSpecialtyAssignmentCheckbox(selectedFocusedUMBundleSpecialtyAssignmentData);
	}
}
