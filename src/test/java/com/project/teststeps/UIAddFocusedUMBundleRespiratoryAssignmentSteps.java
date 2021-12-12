package com.project.teststeps;

import com.project.actors.ActorUIAddFocusedUMBundleRespiratoryAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddFocusedUMBundleRespiratoryAssignmentSteps 
{
	
	@Steps
	ActorUIAddFocusedUMBundleRespiratoryAssignmentPage actorUIAddFocusedUMBundleRespiratoryAssignmentPage;
	
	@When("^verify the Assign focused UM bundle-respiratory by List Box presence$")
	public void verify_the_assign_focused_um_bundle_respiratory_by_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxPresence();
	}
	
	@Then("^verify the Assign focused UM bundle-respiratory by List Box enabled$")
	public void verify_the_assign_focused_um_bundle_respiratory_by_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign focused UM bundle-respiratory by List Box$")
	public void verify_the_default_item_displaying_in_assign_focused_um_bundle_respiratory_by_list_box(DataTable assignFocusedUMBundleRespiratoryByListDefaultItem) throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxDefaultItem(assignFocusedUMBundleRespiratoryByListDefaultItem);
	}
	
	@And("^verify the Assign focused UM bundle-respiratory by List Box items$")
	public void verify_the_assign_focused_um_bundle_respiratory_by_list_box_items(DataTable assignFocusedUMBundleRespiratoryByListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxItems(assignFocusedUMBundleRespiratoryByListItems);
	}
	
	@When("^verify the Assign focused UM bundle-respiratory by List Box disabled$")
	public void verify_the_assign_focused_um_bundle_respiratory_by_list_box_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxIsDisabled();
	}
	
	@Then("^Assign focused UM bundle-respiratory by List Box should be disabled$")
	public void assign_focused_um_bundle_respiratory_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignFocusedUMBundleRespiratoryByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned focused UM bundle-respiratory List Box presence$")
	public void verify_the_assigned_focused_um_bundle_respiratory_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignedFocusedUMBundleRespiratoryListBoxPresence();
	}
	
	@Then("^verify the Assigned focused UM bundle-respiratory List Box enabled$")
	public void verify_the_assigned_focused_um_bundle_respiratory_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignedFocusedUMBundleRespiratoryListBoxIsEnabled();
	}
	
	@And("^verify the Assigned focused UM bundle-respiratory List Box items$")
	public void verify_the_assigned_focused_um_bundle_respiratory_list_box_items(DataTable assignedFocusedUMBundleRespiratoryListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAssignedFocusedUMBundleRespiratoryListBoxItems(assignedFocusedUMBundleRespiratoryListItems);
	}
	
	@When("^select value from Assign focused UM bundle-respiratory by List Box$")
	public void select_value_from_assign_focused_um_bundle_respiratory_by_list_box(DataTable assignFocusedUMBundleRespiratoryByListItem) throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.selectAssignFocusedUMBundleRespiratoryByListBoxItem(assignFocusedUMBundleRespiratoryByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_description_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_description_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_available_drug_list_table_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_name_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_name_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_type_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_type_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_available_client_table_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_client_number_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_client_name_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_start_date_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_end_date_edit_box_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_add_button_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_add_button_disabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Focused UM Bundle-Respiratory Assignment details$")
	public void input_the_following_focused_um_bundle_respiratory_assignment_details(DataTable focusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.inputFocusedUMBundleRespiratoryAssignmentDetails(focusedUMBundleRespiratoryAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_add_button_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Focused UM Bundle-Respiratory Assignment$")
	public void click_on_add_button_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Focused UM Bundle-Respiratory Assignment Table Presence$")
	public void verify_the_selected_focused_um_bundle_respiratory_assignment_table_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Focused UM Bundle-Respiratory Assignment Table should be displayed$")
	public void selected_focused_um_bundle_respiratory_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_remove_button_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_remove_button_disabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_update_button_presence_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_update_button_disabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Focused UM Bundle-Respiratory Assignment check box$")
	public void click_on_selected_focused_um_bundle_respiratory_assignment_check_box(DataTable selectedFocusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.clickOnSelectedFocusedUMBundleRespiratoryAssignmentCheckbox(selectedFocusedUMBundleRespiratoryAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_remove_button_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Focused UM Bundle-Respiratory Assignment$")
	public void verify_the_update_button_enabled_in_focused_um_bundle_respiratory_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Focused UM Bundle-Respiratory Assignment Check box$")
	public void click_on_check_box_for_selected_focused_um_bundle_respiratory_assignment(DataTable selectedFocusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleRespiratoryAssignmentPage.clickOnSelectedFocusedUMBundleRespiratoryAssignmentCheckbox(selectedFocusedUMBundleRespiratoryAssignmentData);
	}
}
