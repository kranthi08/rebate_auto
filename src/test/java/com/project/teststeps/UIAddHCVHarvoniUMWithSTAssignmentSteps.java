package com.project.teststeps;

import com.project.actors.ActorUIAddHCVHarvoniUMWithSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddHCVHarvoniUMWithSTAssignmentSteps 
{
	
	@Steps
	ActorUIAddHCVHarvoniUMWithSTAssignmentPage actorUIAddHCVHarvoniUMWithSTAssignmentPage;
	
	@When("^verify the Assign HCV Harvoni UM with ST by List Box presence$")
	public void verify_the_assign_hcv_harvoni_um_with_st_by_list_box_presence() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxPresence();
	}
	
	@Then("^verify the Assign HCV Harvoni UM with ST by List Box enabled$")
	public void verify_the_assign_hcv_harvoni_um_with_st_by_list_box_enabled() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign HCV Harvoni UM with ST by List Box$")
	public void verify_the_default_item_displaying_in_assign_hcv_harvoni_um_with_st_by_list_box(DataTable assignHCVHarvoniUMWithSTByListDefaultItem) throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxDefaultItem(assignHCVHarvoniUMWithSTByListDefaultItem);
	}
	
	@And("^verify the Assign HCV Harvoni UM with ST by List Box items$")
	public void verify_the_assign_hcv_harvoni_um_with_st_by_list_box_items(DataTable assignHCVHarvoniUMWithSTByListItems) throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxItems(assignHCVHarvoniUMWithSTByListItems);
	}
	
	@When("^verify the Assign HCV Harvoni UM with ST by List Box disabled$")
	public void verify_the_assign_hcv_harvoni_um_with_st_by_list_box_disabled() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxIsDisabled();
	}
	
	@Then("^Assign HCV Harvoni UM with ST by List Box should be disabled$")
	public void assign_hcv_harvoni_um_with_st_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignHCVHarvoniUMWithSTByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned HCV Harvoni UM with ST List Box presence$")
	public void verify_the_assigned_hcv_harvoni_um_with_st_list_box_presence() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignedHCVHarvoniUMWithSTListBoxPresence();
	}
	
	@Then("^verify the Assigned HCV Harvoni UM with ST List Box enabled$")
	public void verify_the_assigned_hcv_harvoni_um_with_st_list_box_enabled() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignedHCVHarvoniUMWithSTListBoxIsEnabled();
	}
	
	@And("^verify the Assigned HCV Harvoni UM with ST List Box items$")
	public void verify_the_assigned_hcv_harvoni_um_with_st_list_box_items(DataTable assignedHCVHarvoniUMWithSTListItems) throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAssignedHCVHarvoniUMWithSTListBoxItems(assignedHCVHarvoniUMWithSTListItems);
	}
	
	@When("^select value from Assign HCV Harvoni UM with ST by List Box$")
	public void select_value_from_assign_hcv_harvoni_um_with_st_by_list_box(DataTable assignHCVHarvoniUMWithSTByListItem) throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.selectAssignHCVHarvoniUMWithSTByListBoxItem(assignHCVHarvoniUMWithSTByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_description_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_description_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_available_drug_list_table_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_name_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_name_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_type_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_type_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_available_client_table_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_client_number_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_client_name_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_start_date_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_end_date_edit_box_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_add_button_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_add_button_disabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following HCV Harvoni UM with ST Assignment details$")
	public void input_the_following_hcv_harvoni_um_with_st_assignment_details(DataTable hcvHarvoniUMWithSTAssignmentData) throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.inputHCVHarvoniUMWithSTAssignmentDetails(hcvHarvoniUMWithSTAssignmentData);
	}
	
	@Then("^verify the Add button enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_add_button_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in HCV Harvoni UM with ST Assignment$")
	public void click_on_add_button_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected HCV Harvoni UM with ST Assignment Table Presence$")
	public void verify_the_selected_hcv_harvoni_um_with_st_assignment_table_presence() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected HCV Harvoni UM with ST Assignment Table should be displayed$")
	public void selected_hcv_harvoni_um_with_st_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_remove_button_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_remove_button_disabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in HCV Harvoni UM with ST Assignment$")
	public void verify_the_update_button_presence_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_update_button_disabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected HCV Harvoni UM with ST Assignment check box$")
	public void click_on_selected_hcv_harvoni_um_with_st_assignment_check_box(DataTable selectedHCVHarvoniUMWithSTAssignmentData) throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.clickOnSelectedHCVHarvoniUMWithSTAssignmentCheckbox(selectedHCVHarvoniUMWithSTAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_remove_button_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in HCV Harvoni UM with ST Assignment$")
	public void verify_the_update_button_enabled_in_hcv_harvoni_um_with_st_assignment() throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected HCV Harvoni UM with ST Assignment Check box$")
	public void click_on_check_box_for_selected_hcv_harvoni_um_with_st_assignment(DataTable selectedHCVHarvoniUMWithSTAssignmentData) throws Throwable
	{
		actorUIAddHCVHarvoniUMWithSTAssignmentPage.clickOnSelectedHCVHarvoniUMWithSTAssignmentCheckbox(selectedHCVHarvoniUMWithSTAssignmentData);
	}
}
