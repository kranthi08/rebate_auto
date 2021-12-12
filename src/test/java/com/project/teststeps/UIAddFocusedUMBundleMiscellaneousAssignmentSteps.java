package com.project.teststeps;

import com.project.actors.ActorUIAddFocusedUMBundleMiscellaneousAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddFocusedUMBundleMiscellaneousAssignmentSteps 
{
	
	@Steps
	ActorUIAddFocusedUMBundleMiscellaneousAssignmentPage actorUIAddFocusedUMBundleMiscellaneousAssignmentPage;
	
	@When("^verify the Assign focused UM bundle-miscellaneous by List Box presence$")
	public void verify_the_assign_focused_um_bundle_miscellaneous_by_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxPresence();
	}
	
	@Then("^verify the Assign focused UM bundle-miscellaneous by List Box enabled$")
	public void verify_the_assign_focused_um_bundle_miscellaneous_by_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign focused UM bundle-miscellaneous by List Box$")
	public void verify_the_default_item_displaying_in_assign_focused_um_bundle_miscellaneous_by_list_box(DataTable assignFocusedUMBundleMiscellaneousByListDefaultItem) throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxDefaultItem(assignFocusedUMBundleMiscellaneousByListDefaultItem);
	}
	
	@And("^verify the Assign focused UM bundle-miscellaneous by List Box items$")
	public void verify_the_assign_focused_um_bundle_miscellaneous_by_list_box_items(DataTable assignFocusedUMBundleMiscellaneousByListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxItems(assignFocusedUMBundleMiscellaneousByListItems);
	}
	
	@When("^verify the Assign focused UM bundle-miscellaneous by List Box disabled$")
	public void verify_the_assign_focused_um_bundle_miscellaneous_by_list_box_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxIsDisabled();
	}
	
	@Then("^Assign focused UM bundle-miscellaneous by List Box should be disabled$")
	public void assign_assign_focused_um_bundle_miscellaneous_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignFocusedUMBundleMiscellaneousByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned focused UM bundle-miscellaneous List Box presence$")
	public void verify_the_assigned_focused_um_bundle_miscellaneous_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignedFocusedUMBundleMiscellaneousListBoxPresence();
	}
	
	@Then("^verify the Assigned focused UM bundle-miscellaneous List Box enabled$")
	public void verify_the_assigned_focused_um_bundle_miscellaneous_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignedFocusedUMBundleMiscellaneousListBoxIsEnabled();
	}
	
	@And("^verify the Assigned focused UM bundle-miscellaneous List Box items$")
	public void verify_the_assigned_focused_um_bundle_miscellaneous_list_box_items(DataTable assignedFocusedUMBundleMiscellaneousListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAssignedFocusedUMBundleMiscellaneousListBoxItems(assignedFocusedUMBundleMiscellaneousListItems);
	}
	
	@When("^select value from Assign focused UM bundle-miscellaneous by List Box$")
	public void select_value_from_assign_focused_um_bundle_miscellaneous_by_list_box(DataTable assignFocusedUMBundleMiscellaneousByListItem) throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.selectAssignFocusedUMBundleMiscellaneousByListBoxItem(assignFocusedUMBundleMiscellaneousByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_description_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_description_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_available_drug_list_table_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_name_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_name_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_type_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_type_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_available_client_table_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_client_number_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_client_name_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_start_date_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_end_date_edit_box_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_add_button_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_add_button_disabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Focused UM Bundle-Miscellaneous Assignment details$")
	public void input_the_following_focused_um_bundle_miscellaneous_assignment_details(DataTable focusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.inputFocusedUMBundleMiscellaneousAssignmentDetails(focusedUMBundleMiscellaneousAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_add_button_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Focused UM Bundle-Miscellaneous Assignment$")
	public void click_on_add_button_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Focused UM Bundle-Miscellaneous Assignment Table Presence$")
	public void verify_the_selected_focused_um_bundle_miscellaneous_assignment_table_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Focused UM Bundle-Miscellaneous Assignment Table should be displayed$")
	public void selected_focused_um_bundle_miscellaneous_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_remove_button_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_remove_button_disabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_update_button_presence_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_update_button_disabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Focused UM Bundle-Miscellaneous Assignment check box$")
	public void click_on_selected_focused_um_bundle_miscellaneous_assignment_check_box(DataTable selectedFocusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.clickOnSelectedFocusedUMBundleMiscellaneousAssignmentCheckbox(selectedFocusedUMBundleMiscellaneousAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_remove_button_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Focused UM Bundle-Miscellaneous Assignment$")
	public void verify_the_update_button_enabled_in_focused_um_bundle_miscellaneous_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Focused UM Bundle-Miscellaneous Assignment Check box$")
	public void click_on_check_box_for_selected_focused_um_bundle_miscellaneous_assignment(DataTable selectedFocusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleMiscellaneousAssignmentPage.clickOnSelectedFocusedUMBundleMiscellaneousAssignmentCheckbox(selectedFocusedUMBundleMiscellaneousAssignmentData);
	}
}
