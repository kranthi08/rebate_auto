package com.project.teststeps;

import com.project.actors.ActorUIAddGuaranteeCodeAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddGuaranteeCodeAssignmentSteps 
{
	
	@Steps
	ActorUIAddGuaranteeCodeAssignmentPage actorUIAddGuaranteeCodeAssignmentPage;
	
	@When("^verify the Assign guarantee code by List Box presence$")
	public void verify_the_assign_guarantee_code_by_list_box_presence() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxPresence();
	}
	
	@Then("^verify the Assign guarantee code by List Box enabled$")
	public void verify_the_assign_guarantee_code_by_list_box_enabled() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign guarantee code by List Box$")
	public void verify_the_default_item_displaying_in_assign_guarantee_code_by_list_box(DataTable assignGuaranteeCodeByListDefaultItem) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxDefaultItem(assignGuaranteeCodeByListDefaultItem);
	}
	
	@And("^verify the Assign guarantee code by List Box items$")
	public void verify_the_assign_guarantee_code_by_list_box_items(DataTable assignGuaranteeCodeByListItems) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxItems(assignGuaranteeCodeByListItems);
	}
	
	@When("^verify the Assign guarantee code by List Box disabled$")
	public void verify_the_assign_guarantee_code_by_list_box_disabled() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxIsDisabled();
	}
	
	@Then("^Assign guarantee code by List Box should be disabled$")
	public void assign_guarantee_code_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxIsDisabled();
	}
	
	@When("^select value from Assign guarantee code by List Box$")
	public void select_value_from_assign_guarantee_code_by_list_box(DataTable assignGuaranteeCodeByListItem) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.selectAssignGuaranteeCodeByListBoxItem(assignGuaranteeCodeByListItem);
	}
	
	@When("^verify the Customer Edit Box presence in Guarantee Code Assignment$")
	public void verify_the_customer_edit_box_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCustomerEditBoxPresence();
	}
	
	@Then("^verify the Customer Edit Box enabled in Guarantee Code Assignment$")
	public void verify_the_customer_edit_box_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCustomerEditBoxIsEnabled();
	}
	
	@And("^verify the Customer Edit Box maximum length in Guarantee Code Assignment$")
	public void verify_the_customer_edit_box_maximum_length_in_guarantee_code_assignment(DataTable customerMaxLength) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCustomerEditBoxMaxLength(customerMaxLength);
	}
	
	@Then("^verify the Client Edit Box presence in Guarantee Code Assignment$")
	public void verify_the_client_edit_box_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyClientEditBoxPresence();
	}
	
	@And("^verify the Client Edit Box enabled in Guarantee Code Assignment$")
	public void verify_the_client_edit_box_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyClientEditBoxIsEnabled();
	}
	
	@And("^verify the Client Edit Box maximum length in Guarantee Code Assignment$")
	public void verify_the_client_edit_box_maximum_length_in_guarantee_code_assignment(DataTable clientMaxLength) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyClientEditBoxMaxLength(clientMaxLength);
	}
	
	@Then("^verify the Coverage Code1 Edit Box presence in Guarantee Code Assignment$")
	public void verify_the_coverage_code1_edit_box_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@And("^verify the Coverage Code1 Edit Box enabled in Guarantee Code Assignment$")
	public void verify_the_coverage_code1_edit_box_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@And("^verify the Coverage Code1 Edit Box maximum length in Guarantee Code Assignment$")
	public void verify_the_coverage_code1_edit_box_maximum_length_in_guarantee_code_assignment(DataTable coverageCode1MaxLength) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCoverageCode1EditBoxMaxLength(coverageCode1MaxLength);
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Guarantee Code Assignment$")
	public void verify_the_coverage_code2_edit_box_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Guarantee Code Assignment$")
	public void verify_the_coverage_code2_edit_box_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@And("^verify the Coverage Code2 Edit Box maximum length in Guarantee Code Assignment$")
	public void verify_the_coverage_code2_edit_box_maximum_length_in_guarantee_code_assignment(DataTable coverageCode2MaxLength) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyCoverageCode2EditBoxMaxLength(coverageCode2MaxLength);
	}
	
	@Then("^verify the Drug List Edit Box presence in Guarantee Code Assignment$")
	public void verify_the_drug_list_edit_box_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyDrugListEditBoxPresence();
	}
	
	@And("^verify the Drug List Edit Box enabled in Guarantee Code Assignment$")
	public void verify_the_drug_list_edit_box_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyDrugListEditBoxIsEnabled();
	}
	
	@And("^verify the Drug List Edit Box maximum length in Guarantee Code Assignment$")
	public void verify_the_drug_list_edit_box_maximum_length_in_guarantee_code_assignment(DataTable drugListMaxLength) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyDrugListEditBoxMaxLength(drugListMaxLength);
	}
	
	@When("^verify the Guarantee code Edit Box presence in Guarantee Code Assignment$")
	public void verify_the_guarantee_code_edit_box_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeEditBoxPresence();
	}
	
	@Then("^verify the Guarantee code Edit Box enabled in Guarantee Code Assignment$")
	public void verify_the_guarantee_code_edit_box_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeEditBoxIsEnabled();
	}
	
	@And("^verify the Guarantee code Edit Box maximum length in Guarantee Code Assignment$")
	public void verify_the_guarantee_code_edit_box_maximum_length_in_guarantee_code_assignment(DataTable guaranteeCodeMaxLength) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeEditBoxMaxLength(guaranteeCodeMaxLength);
	}
	
	@When("^verify the Add button presence in Guarantee Code Assignment$")
	public void verify_the_add_button_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Guarantee Code Assignment$")
	public void verify_the_add_button_disabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Guarantee Code Assignment details$")
	public void input_the_following_guarantee_code_assignment_details(DataTable guaranteeCodeAssignmentData) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.inputGuaranteeCodeAssignmentDetails(guaranteeCodeAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Guarantee Code Assignment$")
	public void verify_the_add_button_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Guarantee Code Assignment$")
	public void click_on_add_button_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Guarantee Code Assignment Table Presence$")
	public void verify_the_guarantee_code_assignment_table_presence() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentTablePresence();
	}
	
	@Then("^Guarantee Code Assignment Table should be displayed$")
	public void guarantee_code_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Guarantee Code Assignment$")
	public void verify_the_remove_button_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Guarantee Code Assignment$")
	public void verify_the_remove_button_disabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Guarantee Code Assignment$")
	public void verify_the_update_button_presence_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Guarantee Code Assignment$")
	public void verify_the_update_button_disabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Guarantee Code Assignment check box$")
	public void click_on_guarantee_code_assignment_check_box(DataTable tierDescriptionAssignmentDetails) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.clickOnGuaranteeCodeAssignmentCheckbox(tierDescriptionAssignmentDetails);
	}
	
	@Then("^verify the Remove button enabled in Guarantee Code Assignment$")
	public void verify_the_remove_button_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Guarantee Code Assignment$")
	public void verify_the_update_button_enabled_in_guarantee_code_assignment() throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Guarantee Code Assignment Check box$")
	public void click_on_check_box_for_guarantee_code_assignment(DataTable guaranteeCodeAssignmentDetails) throws Throwable
	{
		actorUIAddGuaranteeCodeAssignmentPage.clickOnGuaranteeCodeAssignmentCheckbox(guaranteeCodeAssignmentDetails);
	}
}
