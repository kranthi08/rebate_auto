package com.project.teststeps;

import com.project.actors.ActorUIAddVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddVendorFormularyIDAssignmentSteps 
{
	
	@Steps
	ActorUIAddVendorFormularyIDAssignmentPage actorUIAddVendorFormularyIDAssignmentPage;
	
	@When("^verify the Assign vendor formulary ID by List Box presence$")
	public void verify_the_assign_vendor_formulary_id_by_list_box_presence() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxPresence();
	}
	
	@Then("^verify the Assign vendor formulary ID by List Box enabled$")
	public void verify_the_assign_vendor_formulary_id_by_list_box_enabled() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign vendor formulary ID by List Box$")
	public void verify_the_default_item_displaying_in_assign_vendor_formulary_id_by_list_box(DataTable assignVendorFormularyIDByListDefaultItem) throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxDefaultItem(assignVendorFormularyIDByListDefaultItem);
	}
	
	@And("^verify the Assign vendor formulary ID by List Box items$")
	public void verify_the_assign_vendor_formulary_id_by_list_box_items(DataTable assignVendorFormularyIDByListItems) throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxItems(assignVendorFormularyIDByListItems);
	}
	
	@When("^verify the Assign vendor formulary ID by List Box disabled$")
	public void verify_the_assign_vendor_formulary_id_by_list_box_disabled() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxIsDisabled();
	}
	
	@Then("^Assign vendor formulary ID by List Box should be disabled$")
	public void assign_vendor_formulary_id_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignVendorFormularyIDByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned vendor formulary ID Edit Box presence$")
	public void verify_the_assigned_vendor_formulary_id_edit_box_presence() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignedVendorFormularyIDEditBoxPresence();
	}
	
	@Then("^verify the Assigned vendor formulary ID Edit Box enabled$")
	public void verify_the_assigned_vendor_formulary_id_edit_box_enabled() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignedVendorFormularyIDEditBoxIsEnabled();
	}
	
	@And("^verify the Assigned vendor formulary ID Edit Box maximum length$")
	public void verify_the_assigned_vendor_formulary_id_edit_box_maximum_length(DataTable assignedVendorFormularyIDMaxLength) throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAssignedVendorFormularyIDEditBoxMaxLength(assignedVendorFormularyIDMaxLength);
	}
	
	@When("^select value from Assign vendor formulary ID by List Box$")
	public void select_value_from_assign_vendor_formulary_id_by_list_box(DataTable assignVendorFormularyIDByListItem) throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.selectAssignVendorFormularyIDByListBoxItem(assignVendorFormularyIDByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in Vendor Formulary ID Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in Vendor Formulary ID Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_description_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_description_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in Vendor Formulary ID Assignment$")
	public void verify_the_available_drug_list_table_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in Vendor Formulary ID Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_name_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_name_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_type_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_type_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in Vendor Formulary ID Assignment$")
	public void verify_the_available_client_table_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_client_number_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_client_name_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_start_date_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in Vendor Formulary ID Assignment$")
	public void verify_the_end_date_edit_box_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in Vendor Formulary ID Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in Vendor Formulary ID Assignment$")
	public void verify_the_add_button_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Vendor Formulary ID Assignment$")
	public void verify_the_add_button_disabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Vendor Formulary ID Assignment details$")
	public void input_the_following_vendor_formulary_id_assignment_details(DataTable vendorFormularyIDAssignmentData) throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.inputVendorFormularyIDAssignmentDetails(vendorFormularyIDAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Vendor Formulary ID Assignment$")
	public void verify_the_add_button_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Vendor Formulary ID Assignment$")
	public void click_on_add_button_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Vendor Formulary ID Assignment Table Presence$")
	public void verify_the_selected_vendor_formulary_id_assignment_table_presence() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected Vendor Formulary ID Assignment Table should be displayed$")
	public void selected_vendor_formulary_id_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Vendor Formulary ID Assignment$")
	public void verify_the_remove_button_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Vendor Formulary ID Assignment$")
	public void verify_the_remove_button_disabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Vendor Formulary ID Assignment$")
	public void verify_the_update_button_presence_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Vendor Formulary ID Assignment$")
	public void verify_the_update_button_disabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Vendor Formulary ID Assignment check box$")
	public void click_on_selected_vendor_formulary_id_assignment_check_box(DataTable selectedVendorFormularyIDAssignmentData) throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.clickOnSelectedVendorFormularyIDAssignmentCheckbox(selectedVendorFormularyIDAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in Vendor Formulary ID Assignment$")
	public void verify_the_remove_button_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Vendor Formulary ID Assignment$")
	public void verify_the_update_button_enabled_in_vendor_formulary_id_assignment() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Vendor Formulary ID Assignment Check box$")
	public void click_on_check_box_for_selected_vendor_formulary_id_assignment(DataTable selectedVendorFormularyIDAssignmentData) throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.clickOnSelectedVendorFormularyIDAssignmentCheckbox(selectedVendorFormularyIDAssignmentData);
	}
	
	@When("^verify the Previous button presence in Assignment Criteria screen$")
	public void verify_the_previous_button_presence_in_assignment_criteria_screen() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyPreviousButtonPresence();
	}
	
	@Then("^verify the Previous button enabled in Assignment Criteria screen$")
	public void verify_the_previous_button_enabled_in_assignment_criteria_screen() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyPreviousButtonIsEnabled();
	}
	
	@When("^verify the Next button presence in Assignment Criteria screen$")
	public void verify_the_next_button_presence_in_assignment_criteria_screen() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyNextButtonPresence();
	}
	
	@Then("^verify the Next button enabled in Assignment Criteria screen$")
	public void verify_the_next_button_enabled_in_assignment_criteria_screen() throws Throwable
	{
		actorUIAddVendorFormularyIDAssignmentPage.verifyNextButtonIsEnabled();
	}
}
