package com.project.teststeps;

import com.project.actors.ActorUIAddFocusedUMBundleDiabetesAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddFocusedUMBundleDiabetesAssignmentSteps 
{
	
	@Steps
	ActorUIAddFocusedUMBundleDiabetesAssignmentPage actorUIAddFocusedUMBundleDiabetesAssignmentPage;
	
	@When("^verify the Assign focused UM bundle-diabetes by List Box presence$")
	public void verify_the_assign_focused_um_bundle_diabetes_by_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxPresence();
	}
	
	@Then("^verify the Assign focused UM bundle-diabetes by List Box enabled$")
	public void verify_the_assign_focused_um_bundle_diabetes_by_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign focused UM bundle-diabetes by List Box$")
	public void verify_the_default_item_displaying_in_assign_focused_um_bundle_diabetes_by_list_box(DataTable assignFocusedUMBundleDiabetesByListDefaultItem) throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxDefaultItem(assignFocusedUMBundleDiabetesByListDefaultItem);
	}
	
	@And("^verify the Assign focused UM bundle-diabetes by List Box items$")
	public void verify_the_assign_focused_um_bundle_diabetes_by_list_box_items(DataTable assignFocusedUMBundleDiabetesByListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxItems(assignFocusedUMBundleDiabetesByListItems);
	}
	
	@When("^verify the Assign focused UM bundle-diabetes by List Box disabled$")
	public void verify_the_assign_focused_um_bundle_diabetes_by_list_box_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxIsDisabled();
	}
	
	@Then("^Assign focused UM bundle-diabetes by List Box should be disabled$")
	public void assign_focused_um_bundle_diabetes_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignFocusedUMBundleDiabetesByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned focused UM bundle-diabetes List Box presence$")
	public void verify_the_assigned_focused_um_bundle_diabetes_list_box_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignedFocusedUMBundleDiabetesListBoxPresence();
	}
	
	@Then("^verify the Assigned focused UM bundle-diabetes List Box enabled$")
	public void verify_the_assigned_focused_um_bundle_diabetes_list_box_enabled() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignedFocusedUMBundleDiabetesListBoxIsEnabled();
	}
	
	@And("^verify the Assigned focused UM bundle-diabetes List Box items$")
	public void verify_the_assigned_focused_um_bundle_diabetes_list_box_items(DataTable assignedFocusedUMBundleDiabetesListItems) throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAssignedFocusedUMBundleDiabetesListBoxItems(assignedFocusedUMBundleDiabetesListItems);
	}
	
	@When("^select value from Assign focused UM bundle-diabetes by List Box$")
	public void select_value_from_assign_focused_um_bundle_diabetes_by_list_box(DataTable assignFocusedUMBundleDiabetesByListItem) throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.selectAssignFocusedUMBundleDiabetesByListBoxItem(assignFocusedUMBundleDiabetesByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_description_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_description_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_available_drug_list_table_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_name_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_name_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_type_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_type_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_available_client_table_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_client_number_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_client_name_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_start_date_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_end_date_edit_box_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_add_button_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_add_button_disabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Focused UM Bundle-Diabetes Assignment details$")
	public void input_the_following_focused_um_bundle_diabetes_assignment_details(DataTable focusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.inputFocusedUMBundleDiabetesAssignmentDetails(focusedUMBundleDiabetesAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_add_button_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Focused UM Bundle-Diabetes Assignment$")
	public void click_on_add_button_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Focused UM Bundle-Diabetes Assignment Table Presence$")
	public void verify_the_selected_focused_um_bundle_diabetes_assignment_table_presence() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Focused UM Bundle-Diabetes Assignment Table should be displayed$")
	public void selected_focused_um_bundle_diabetes_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_remove_button_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_remove_button_disabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_update_button_presence_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_update_button_disabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Focused UM Bundle-Diabetes Assignment check box$")
	public void click_on_selected_focused_um_bundle_diabetes_assignment_check_box(DataTable selectedFocusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.clickOnSelectedFocusedUMBundleDiabetesAssignmentCheckbox(selectedFocusedUMBundleDiabetesAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_remove_button_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Focused UM Bundle-Diabetes Assignment$")
	public void verify_the_update_button_enabled_in_focused_um_bundle_diabetes_assignment() throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Focused UM Bundle-Diabetes Assignment Check box$")
	public void click_on_check_box_for_selected_focused_um_bundle_diabetes_assignment(DataTable selectedFocusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		actorUIAddFocusedUMBundleDiabetesAssignmentPage.clickOnSelectedFocusedUMBundleDiabetesAssignmentCheckbox(selectedFocusedUMBundleDiabetesAssignmentData);
	}
}
