package com.project.teststeps;

import com.project.actors.ActorUIAddHCVSolvaldiUMWithoutSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddHCVSolvaldiUMWithoutSTAssignmentSteps 
{
	
	@Steps
	ActorUIAddHCVSolvaldiUMWithoutSTAssignmentPage actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage;
	
	@When("^verify the Assign HCV Solvaldi UM without ST by List Box presence$")
	public void verify_the_assign_hcv_solvaldi_um_without_st_by_list_box_presence() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxPresence();
	}
	
	@Then("^verify the Assign HCV Solvaldi UM without ST by List Box enabled$")
	public void verify_the_assign_hcv_solvaldi_um_without_st_by_list_box_enabled() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign HCV Solvaldi UM without ST by List Box$")
	public void verify_the_default_item_displaying_in_assign_hcv_solvaldi_um_without_st_by_list_box(DataTable assignHCVSolvaldiUMWithoutSTByListDefaultItem) throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxDefaultItem(assignHCVSolvaldiUMWithoutSTByListDefaultItem);
	}
	
	@And("^verify the Assign HCV Solvaldi UM without ST by List Box items$")
	public void verify_the_assign_hcv_solvaldi_um_without_st_by_list_box_items(DataTable assignHCVSolvaldiUMWithoutSTByListItems) throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxItems(assignHCVSolvaldiUMWithoutSTByListItems);
	}
	
	@When("^verify the Assign HCV Solvaldi UM without ST by List Box disabled$")
	public void verify_the_assign_hcv_solvaldi_um_without_st_by_list_box_disabled() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxIsDisabled();
	}
	
	@Then("^Assign HCV Solvaldi UM without ST by List Box should be disabled$")
	public void assign_hcv_solvaldi_um_without_st_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignHCVSolvaldiUMWithoutSTByListBoxIsDisabled();
	}
	
	@When("^verify the Assigned HCV Solvaldi UM without ST List Box presence$")
	public void verify_the_assigned_hcv_solvaldi_um_without_st_list_box_presence() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignedHCVSolvaldiUMWithoutSTListBoxPresence();
	}
	
	@Then("^verify the Assigned HCV Solvaldi UM without ST List Box enabled$")
	public void verify_the_assigned_hcv_solvaldi_um_without_st_list_box_enabled() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignedHCVSolvaldiUMWithoutSTListBoxIsEnabled();
	}
	
	@And("^verify the Assigned HCV Solvaldi UM without ST List Box items$")
	public void verify_the_assigned_hcv_solvaldi_um_without_st_list_box_items(DataTable assignedHCVSolvaldiUMWithoutSTListItems) throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAssignedHCVSolvaldiUMWithoutSTListBoxItems(assignedHCVSolvaldiUMWithoutSTListItems);
	}
	
	@When("^select value from Assign HCV Solvaldi UM without ST by List Box$")
	public void select_value_from_assign_hcv_solvaldi_um_without_st_by_list_box(DataTable assignHCVSolvaldiUMWithoutSTByListItem) throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignHCVSolvaldiUMWithoutSTByListBoxItem(assignHCVSolvaldiUMWithoutSTByListItem);
	}
	
	@Then("^verify the Available Coverage Code Table Presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_available_coverage_code_table_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableCoverageCodeTablePresence();
	}
	
	@And("^verify the Available Coverage Code Table Pagination Presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_available_coverage_code_table_pagination_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableCoverageCodeTablePaginationPresence();
	}
	
	@When("^verify the Coverage Code1 Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code1 Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@When("^verify the Description Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_description_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxPresence();
	}
	
	@Then("^verify the Description Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_description_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeDescriptionEditBoxIsEnabled();
	}
	
	@When("^verify the Coverage Code Status Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_coverage_code_status_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeStatusEditBoxPresence();
	}
	
	@Then("^verify the Coverage Code Status Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_coverage_code_status_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyCoverageCodeStatusEditBoxIsEnabled();
	}
	
	@Then("^verify the Available Drug List Table Presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_available_drug_list_table_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableDrugListTablePresence();
	}
	
	@And("^verify the Available Drug List Table Pagination Presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_available_drug_list_table_pagination_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableDrugListTablePaginationPresence();
	}
	
	@When("^verify the Drug List ID Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_drug_list_id_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListIDEditBoxPresence();
	}
	
	@Then("^verify the Drug List ID Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_drug_list_id_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListIDEditBoxIsEnabled();
	}
	
	@When("^verify the Name Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_name_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListNameEditBoxPresence();
	}
	
	@Then("^verify the Name Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_name_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListNameEditBoxIsEnabled();
	}
	
	@When("^verify the Type Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_type_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListTypeEditBoxPresence();
	}
	
	@Then("^verify the Type Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_type_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListTypeEditBoxIsEnabled();
	}
	
	@When("^verify the Drug List Status Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_drug_list_status_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListStatusEditBoxPresence();
	}
	
	@Then("^verify the Drug List Status Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_drug_list_status_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyDrugListStatusEditBoxIsEnabled();
	}	
	
	@Then("^verify the Available Client Table Presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_available_client_table_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAvailableClientTablePresence();
	}	
	
	@When("^verify the Client Number Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_client_number_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNumberEditBoxPresence();
	}
	
	@Then("^verify the Client Number Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_client_number_id_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNumberEditBoxIsEnabled();
	}
	
	@When("^verify the Client Name Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_client_name_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNameEditBoxPresence();
	}
	
	@Then("^verify the Client Name Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_client_name_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientNameEditBoxIsEnabled();
	}
	
	@When("^verify the Start Date Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_start_date_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientStartDateEditBoxPresence();
	}
	
	@Then("^verify the Start Date Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_start_date_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientStartDateEditBoxIsEnabled();
	}
	
	@When("^verify the End Date Edit Box presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_end_date_edit_box_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientEndDateEditBoxPresence();
	}
	
	@Then("^verify the End Date Edit Box enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_end_date_edit_box_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyClientEndDateEditBoxIsEnabled();
	}
	
	@When("^verify the Add button presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_add_button_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_add_button_disabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following HCV Solvaldi UM without ST Assignment details$")
	public void input_the_following_hcv_solvaldi_um_without_st_assignment_details(DataTable hcvSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.inputHCVSolvaldiUMWithoutSTAssignmentDetails(hcvSolvaldiUMWithoutSTAssignmentData);
	}
	
	@Then("^verify the Add button enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_add_button_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in HCV Solvaldi UM without ST Assignment$")
	public void click_on_add_button_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Selected HCV Solvaldi UM without ST Assignment Table Presence$")
	public void verify_the_selected_hcv_solvaldi_um_without_st_assignment_table_presence() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@Then("^Selected HCV Solvaldi UM without ST Assignment Table should be displayed$")
	public void selected_hcv_solvaldi_um_without_st_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifySelectedAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_remove_button_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_remove_button_disabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_update_button_presence_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_update_button_disabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected HCV Solvaldi UM without ST Assignment check box$")
	public void click_on_selected_hcv_solvaldi_um_without_st_assignment_check_box(DataTable selectedHCVSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.clickOnSelectedHCVSolvaldiUMWithoutSTAssignmentCheckbox(selectedHCVSolvaldiUMWithoutSTAssignmentData);
	}
	
	@Then("^verify the Remove button enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_remove_button_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in HCV Solvaldi UM without ST Assignment$")
	public void verify_the_update_button_enabled_in_hcv_solvaldi_um_without_st_assignment() throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected HCV Solvaldi UM without ST Assignment Check box$")
	public void click_on_check_box_for_selected_hcv_solvaldi_um_without_st_assignment(DataTable selectedHCVSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		actorUIAddHCVSolvaldiUMWithoutSTAssignmentPage.clickOnSelectedHCVSolvaldiUMWithoutSTAssignmentCheckbox(selectedHCVSolvaldiUMWithoutSTAssignmentData);
	}
}
