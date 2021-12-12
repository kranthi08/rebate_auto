package com.project.teststeps;

import com.project.actors.ActorUIAddTierDescriptionAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddTierDescriptionAssignmentSteps 
{
	
	@Steps
	ActorUIAddTierDescriptionAssignmentPage actorUIAddTierDescriptionAssignmentPage;
	
	@When("^verify the Assign tier description by List Box presence$")
	public void verify_the_assign_tier_description_by_list_box_presence() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxPresence();
	}
	
	@Then("^verify the Assign tier description by List Box enabled$")
	public void verify_the_assign_tier_description_by_list_box_enabled() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Assign tier description by List Box$")
	public void verify_the_default_item_displaying_in_assign_tier_description_by_list_box(DataTable assignTierDescriptionByListDefaultItem) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxDefaultItem(assignTierDescriptionByListDefaultItem);
	}
	
	@And("^verify the Assign tier description by List Box items$")
	public void verify_the_assign_tier_description_by_list_box_items(DataTable assignTierDescriptionByListItems) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxItems(assignTierDescriptionByListItems);
	}
	
	@When("^verify the Assign tier description by List Box disabled$")
	public void verify_the_assign_tier_description_by_list_box_disabled() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxIsDisabled();
	}
	
	@Then("^Assign tier description by List Box should be disabled$")
	public void assign_tier_description_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAssignTierDescriptionByListBoxIsDisabled();
	}
	
	@When("^select value from Assign tier description by List Box$")
	public void select_value_from_assign_tier_description_by_list_box(DataTable assignTierDescriptionByListItem) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.selectAssignTierDescriptionByListBoxItem(assignTierDescriptionByListItem);
	}
	
	@Then("^verify the Customer Edit Box presence in Tier Description Assignment$")
	public void verify_the_customer_edit_box_presence_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyCustomerEditBoxPresence();
	}
	
	@And("^verify the Customer Edit Box enabled in Tier Description Assignment$")
	public void verify_the_customer_edit_box_enabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyCustomerEditBoxIsEnabled();
	}
	
	@And("^verify the Customer Edit Box maximum length in Tier Description Assignment$")
	public void verify_the_customer_edit_box_maximum_length_in_tier_description_assignment(DataTable customerMaxLength) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyCustomerEditBoxMaxLength(customerMaxLength);
	}
	
	@Then("^verify the Drug List Edit Box presence in Tier Description Assignment$")
	public void verify_the_drug_list_edit_box_presence_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyDrugListEditBoxPresence();
	}
	
	@And("^verify the Drug List Edit Box enabled in Tier Description Assignment$")
	public void verify_the_drug_list_edit_box_enabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyDrugListEditBoxIsEnabled();
	}
	
	@And("^verify the Drug List Edit Box maximum length in Tier Description Assignment$")
	public void verify_the_drug_list_edit_box_maximum_length_in_tier_description_assignment(DataTable drugListMaxLength) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyDrugListEditBoxMaxLength(drugListMaxLength);
	}
	
	@When("^verify the Tier List Box presence$")
	public void verify_the_tier_list_box_presence() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyTierListBoxPresence();
	}
	
	@Then("^verify the Tier List Box enabled$")
	public void verify_the_tier_list_box_enabled() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyTierListBoxIsEnabled();
	}
	
	@And("^verify the Tier List Box items$")
	public void verify_the_tier_list_box_items(DataTable tierListItems) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyTierListBoxItems(tierListItems);
	}
	
	@When("^verify the Description List Box presence$")
	public void verify_the_description_list_box_presence() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyDescriptionListBoxPresence();
	}
	
	@Then("^verify the Description List Box enabled$")
	public void verify_the_description_list_box_enabled() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyDescriptionListBoxIsEnabled();
	}
	
	@And("^verify the Description List Box items$")
	public void verify_the_description_list_box_items(DataTable descriptionListItems) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyDescriptionListBoxItems(descriptionListItems);
	}
	
	@When("^verify the Add button presence in Tier Description Assignment$")
	public void verify_the_add_button_presence_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Tier Description Assignment$")
	public void verify_the_add_button_disabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Tier Description Assignment details$")
	public void input_the_following_tier_description_assignment_details(DataTable tierDescriptionAssignmentData) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.inputTierDescriptionAssignmentDetails(tierDescriptionAssignmentData);
	}
	
	@Then("^verify the Add button enabled in Tier Description Assignment$")
	public void verify_the_add_button_enabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Tier Description Assignment$")
	public void click_on_add_button_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.clickOnAddButton();
	}
	
	@When("^verify the Tier Description Assignment Table Presence$")
	public void verify_the_tier_description_assignment_table_presence() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentTablePresence();
	}
	
	@Then("^Tier Description Assignment Table should be displayed$")
	public void tier_description_assignment_table_should_be_displayed() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentTablePresence();
	}
	
	@When("^verify the Remove button presence in Tier Description Assignment$")
	public void verify_the_remove_button_presence_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Tier Description Assignment$")
	public void verify_the_remove_button_disabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Tier Description Assignment$")
	public void verify_the_update_button_presence_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Tier Description Assignment$")
	public void verify_the_update_button_disabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Tier Description Assignment check box$")
	public void click_on_tier_description_assignment_check_box(DataTable tierDescriptionAssignmentDetails) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.clickOnTierDescriptionAssignmentCheckbox(tierDescriptionAssignmentDetails);
	}
	
	@Then("^verify the Remove button enabled in Tier Description Assignment$")
	public void verify_the_remove_button_enabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Tier Description Assignment$")
	public void verify_the_update_button_enabled_in_tier_description_assignment() throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Tier Description Assignment Check box$")
	public void click_on_check_box_for_tier_description_assignment(DataTable tierDescriptionAssignmentDetails) throws Throwable
	{
		actorUIAddTierDescriptionAssignmentPage.clickOnTierDescriptionAssignmentCheckbox(tierDescriptionAssignmentDetails);
	}
}
