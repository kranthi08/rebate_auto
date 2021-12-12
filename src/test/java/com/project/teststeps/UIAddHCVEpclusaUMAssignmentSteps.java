package com.project.teststeps;

import com.project.actors.ActorUIAddHCVEpclusaUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddHCVEpclusaUMAssignmentSteps 
{
	
	@Steps
	ActorUIAddHCVEpclusaUMAssignmentPage actorUIAddHCVEpclusaUMAssignmentPage;
	
	@When("^verify the Assign HCV Epclusa UM by List Box presence$")
	public void verify_the_assign_hcv_epclusa_um_by_list_box_presence() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxPresence();
	}
	
	@Then("^verify the Assign HCV Epclusa UM by List Box enabled$")
	public void verify_the_assign_hcv_epclusa_um_by_list_box_enabled() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign HCV Epclusa UM by List Box$")
	public void verify_the_default_item_displaying_in_assign_hcv_epclusa_um_by_list_box(DataTable assignHCVEpclusaUMByListDefaultItem) throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxDefaultItem(assignHCVEpclusaUMByListDefaultItem);
	}
	
	@And("^verify the Assign HCV Epclusa UM by List Box items$")
	public void verify_the_assign_hcv_epclusa_um_by_list_box_items(DataTable assignHCVEpclusaUMByListItems) throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxItems(assignHCVEpclusaUMByListItems);
	}
	
	@When("^verify the Assign HCV Epclusa UM by List Box disabled$")
	public void verify_the_assign_hcv_epclusa_um_by_list_box_disabled() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxIsDisabled();
	}
	
	@Then("^Assign HCV Epclusa UM by List Box should be disabled$")
	public void assign_hcv_epclusa_um_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignHCVEpclusaUMByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned HCV Epclusa UM List Box presence$")
	public void verify_the_assigned_hcv_epclusa_um_list_box_presence() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignedHCVEpclusaUMListBoxPresence();
	}
	
	@Then("^verify the Assigned HCV Epclusa UM List Box enabled$")
	public void verify_the_assigned_hcv_epclusa_um_list_box_enabled() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignedHCVEpclusaUMListBoxIsEnabled();
	}
	
	@And("^verify the Assigned HCV Epclusa UM List Box items$")
	public void verify_the_assigned_hcv_epclusa_um_list_box_items(DataTable assignedHCVEpclusaUMListItems) throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAssignedHCVEpclusaUMListBoxItems(assignedHCVEpclusaUMListItems);
	}
	
	@When("^select value from Assign HCV Epclusa UM by List Box$")
	public void select_value_from_assign_hcv_epclusa_um_by_list_box(DataTable assignHCVEpclusaUMByListItem) throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.selectAssignHCVEpclusaUMByListBoxItem(assignHCVEpclusaUMByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in HCV Epclusa UM Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in HCV Epclusa UM Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_description_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_description_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in HCV Epclusa UM Assignment$")
	public void verify_the_available_drug_list_table_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in HCV Epclusa UM Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_name_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_name_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_type_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_type_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in HCV Epclusa UM Assignment$")
	public void verify_the_available_client_table_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_client_number_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_client_name_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_start_date_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in HCV Epclusa UM Assignment$")
	public void verify_the_end_date_edit_box_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in HCV Epclusa UM Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in HCV Epclusa UM Assignment$")
	public void verify_the_add_button_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in HCV Epclusa UM Assignment$")
	public void verify_the_add_button_disabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following HCV Epclusa UM Assignment details$")
	public void input_the_following_hcv_epclusa_um_assignment_details(DataTable hcvEpclusaUMAssignmentData) throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.inputHCVEpclusaUMAssignmentDetails(hcvEpclusaUMAssignmentData);
	}
	
	@Then("^verify the Add button enabled in HCV Epclusa UM Assignment$")
	public void verify_the_add_button_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in HCV Epclusa UM Assignment$")
	public void click_on_add_button_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected HCV Epclusa UM Assignment Table Presence$")
	public void verify_the_selected_hcv_epclusa_um_assignment_table_presence() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected HCV Epclusa UM Assignment Table should be displayed$")
	public void selected_hcv_epclusa_um_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in HCV Epclusa UM Assignment$")
	public void verify_the_remove_button_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in HCV Epclusa UM Assignment$")
	public void verify_the_remove_button_disabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in HCV Epclusa UM Assignment$")
	public void verify_the_update_button_presence_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in HCV Epclusa UM Assignment$")
	public void verify_the_update_button_disabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected HCV Epclusa UM Assignment check box$")
	public void click_on_selected_hcv_epclusa_um_assignment_check_box(DataTable selectedHCVEpclusaUMAssignmentData) throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.clickOnSelectedHCVEpclusaUMAssignmentCheckbox(selectedHCVEpclusaUMAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in HCV Epclusa UM Assignment$")
	public void verify_the_remove_button_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in HCV Epclusa UM Assignment$")
	public void verify_the_update_button_enabled_in_hcv_epclusa_um_assignment() throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected HCV Epclusa UM Assignment Check box$")
	public void click_on_check_box_for_selected_hcv_epclusa_um_assignment(DataTable selectedHCVEpclusaUMAssignmentData) throws Throwable
	{
		actorUIAddHCVEpclusaUMAssignmentPage.clickOnSelectedHCVEpclusaUMAssignmentCheckbox(selectedHCVEpclusaUMAssignmentData);
	}
}
