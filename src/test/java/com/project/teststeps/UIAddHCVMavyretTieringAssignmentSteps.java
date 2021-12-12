package com.project.teststeps;

import com.project.actors.ActorUIAddHCVMavyretTieringAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddHCVMavyretTieringAssignmentSteps 
{
	
	@Steps
	ActorUIAddHCVMavyretTieringAssignmentPage actorUIAddHCVMavyretTieringAssignmentPage;
	
	@When("^verify the Assign HCV Mavyret tiering by List Box presence$")
	public void verify_the_assign_hcv_mavyret_tiering_by_list_box_presence() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxPresence();
	}
	
	@Then("^verify the Assign HCV Mavyret tiering by List Box enabled$")
	public void verify_the_assign_hcv_mavyret_tiering_by_list_box_enabled() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign HCV Mavyret tiering by List Box$")
	public void verify_the_default_item_displaying_in_assign_hcv_mavyret_tiering_by_list_box(DataTable assignHCVMavyretTieringByListDefaultItem) throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxDefaultItem(assignHCVMavyretTieringByListDefaultItem);
	}
	
	@And("^verify the Assign HCV Mavyret tiering by List Box items$")
	public void verify_the_assign_hcv_mavyret_tiering_by_list_box_items(DataTable assignHCVMavyretTieringByListItems) throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxItems(assignHCVMavyretTieringByListItems);
	}
	
	@When("^verify the Assign HCV Mavyret tiering by List Box disabled$")
	public void verify_the_assign_hcv_mavyret_tiering_by_list_box_disabled() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxIsDisabled();
	}
	
	@Then("^Assign HCV Mavyret tiering by List Box should be disabled$")
	public void assign_hcv_mavyret_tiering_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignHCVMavyretTieringByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned HCV Mavyret tiering List Box presence$")
	public void verify_the_assigned_hcv_mavyret_tiering_list_box_presence() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignedHCVMavyretTieringListBoxPresence();
	}
	
	@Then("^verify the Assigned HCV Mavyret tiering List Box enabled$")
	public void verify_the_assigned_hcv_mavyret_tiering_list_box_enabled() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignedHCVMavyretTieringListBoxIsEnabled();
	}
	
	@And("^verify the Assigned HCV Mavyret tiering List Box items$")
	public void verify_the_assigned_hcv_mavyret_tiering_list_box_items(DataTable assignedHCVMavyretTieringListItems) throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAssignedHCVMavyretTieringListBoxItems(assignedHCVMavyretTieringListItems);
	}
	
	@When("^select value from Assign HCV Mavyret tiering by List Box$")
	public void select_value_from_assign_hcv_mavyret_tiering_by_list_box(DataTable assignHCVMavyretTieringByListItem) throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.selectAssignHCVMavyretTieringByListBoxItem(assignHCVMavyretTieringByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_description_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_description_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_available_drug_list_table_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_name_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_name_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_type_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_type_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_available_client_table_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_client_number_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_client_name_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_start_date_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_end_date_edit_box_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_add_button_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_add_button_disabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following HCV Mavyret Tiering Assignment details$")
	public void input_the_following_hcv_mavyret_tiering_assignment_details(DataTable hcvMavyretTieringAssignmentData) throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.inputHCVMavyretTieringAssignmentDetails(hcvMavyretTieringAssignmentData);
	}
	
	@Then("^verify the Add button enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_add_button_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in HCV Mavyret Tiering Assignment$")
	public void click_on_add_button_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected HCV Mavyret Tiering Assignment Table Presence$")
	public void verify_the_selected_hcv_mavyret_tiering_assignment_table_presence() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected HCV Mavyret Tiering Assignment Table should be displayed$")
	public void selected_hcv_mavyret_tiering_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_remove_button_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_remove_button_disabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in HCV Mavyret Tiering Assignment$")
	public void verify_the_update_button_presence_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_update_button_disabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected HCV Mavyret Tiering Assignment check box$")
	public void click_on_selected_hcv_mavyret_tiering_assignment_check_box(DataTable selectedHCVMavyretTieringAssignmentData) throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.clickOnSelectedHCVMavyretTieringAssignmentCheckbox(selectedHCVMavyretTieringAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_remove_button_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in HCV Mavyret Tiering Assignment$")
	public void verify_the_update_button_enabled_in_hcv_mavyret_tiering_assignment() throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected HCV Mavyret Tiering Assignment Check box$")
	public void click_on_check_box_for_selected_hcv_mavyret_tiering_assignment(DataTable selectedHCVMavyretTieringAssignmentData) throws Throwable
	{
		actorUIAddHCVMavyretTieringAssignmentPage.clickOnSelectedHCVMavyretTieringAssignmentCheckbox(selectedHCVMavyretTieringAssignmentData);
	}
}
