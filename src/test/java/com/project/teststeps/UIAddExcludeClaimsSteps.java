package com.project.teststeps;

import com.project.actors.ActorUIAddExcludeClaimsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddExcludeClaimsSteps 
{
	
	@Steps
	ActorUIAddExcludeClaimsPage actorUIAddExcludeClaimsPage;
	
	@When("^verify the Exclude claims by List Box presence$")
	public void verify_the_exclude_claims_by_list_box_presence() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyExcludeClaimsByListBoxPresence();
	}
	
	@Then("^verify the Exclude claims by List Box enabled$")
	public void verify_the_exclude_claims_by_list_box_enabled() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyExcludeClaimsByListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Exclude claims by List Box$")
	public void verify_the_default_item_displaying_in_exclude_claims_by_list_box(DataTable excludeClaimsByListDefaultItem) throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyExcludeClaimsByListBoxDefaultItem(excludeClaimsByListDefaultItem);
	}
	
	@And("^verify the Exclude claims by List Box items$")
	public void verify_the_exclude_claims_by_list_box_items(DataTable excludeClaimsByListItems) throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyExcludeClaimsByListBoxItems(excludeClaimsByListItems);
	}
	
	@When("^verify the Exclude claims by List Box disabled$")
	public void verify_the_exclude_claims_by_list_box_disabled() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyExcludeClaimsByListBoxIsDisabled();
	}
	
	@Then("^Exclude claims by List Box should be disabled$")
	public void exclude_claims_by_list_box_should_be_disabled() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyExcludeClaimsByListBoxIsDisabled();
	}
	
	@When("^select value from Exclude claims by List Box$")
	public void select_value_from_exclude_claims_by_list_box(DataTable excludeClaimsByListItem) throws Throwable
	{
		actorUIAddExcludeClaimsPage.selectExcludeClaimsByListBoxItem(excludeClaimsByListItem);
	}
	
	@Then("^verify the Client Edit Box presence in Exclude Claims$")
	public void verify_the_client_edit_box_presence_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyClientEditBoxPresence();
	}
	
	@And("^verify the Client Edit Box enabled in Exclude Claims$")
	public void verify_the_client_edit_box_enabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyClientEditBoxIsEnabled();
	}
	
	@And("^verify the Client Edit Box maximum length in Exclude Claims$")
	public void verify_the_client_edit_box_maximum_length_in_exclude_claims(DataTable clientMaxLength) throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyClientEditBoxMaxLength(clientMaxLength);
	}
	
	@Then("^verify the Coverage Code1 Edit Box presence in Exclude Claims$")
	public void verify_the_coverage_code1_edit_box_presence_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@And("^verify the Coverage Code1 Edit Box enabled in Exclude Claims$")
	public void verify_the_coverage_code1_edit_box_enabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@And("^verify the Coverage Code1 Edit Box maximum length in Exclude Claims$")
	public void verify_the_coverage_code1_edit_box_maximum_length_in_exclude_claims(DataTable coverageCode1MaxLength) throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyCoverageCode1EditBoxMaxLength(coverageCode1MaxLength);
	}
	
	@When("^verify the Coverage Code2 Edit Box presence in Exclude Claims$")
	public void verify_the_coverage_code2_edit_box_presence_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Then("^verify the Coverage Code2 Edit Box enabled in Exclude Claims$")
	public void verify_the_coverage_code2_edit_box_enabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@And("^verify the Coverage Code2 Edit Box maximum length in Exclude Claims$")
	public void verify_the_coverage_code2_edit_box_maximum_length_in_exclude_claims(DataTable coverageCode2MaxLength) throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyCoverageCode2EditBoxMaxLength(coverageCode2MaxLength);
	}
	
	@Then("^verify the Group Edit Box presence in Exclude Claims$")
	public void verify_the_group_edit_box_presence_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyGroupEditBoxPresence();
	}
	
	@And("^verify the Group Edit Box enabled in Exclude Claims$")
	public void verify_the_group_edit_box_enabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyGroupEditBoxIsEnabled();
	}
	
	@And("^verify the Group Edit Box maximum length in Exclude Claims$")
	public void verify_the_group_edit_box_maximum_length_in_exclude_claims(DataTable groupMaxLength) throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyGroupEditBoxMaxLength(groupMaxLength);
	}
	
	@When("^verify the Add button presence in Exclude Claims$")
	public void verify_the_add_button_presence_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Exclude Claims$")
	public void verify_the_add_button_disabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Exclude Claims details$")
	public void input_the_following_exclude_claims_details(DataTable excludeClaimsData) throws Throwable
	{
		actorUIAddExcludeClaimsPage.inputExcludeClaimsDetails(excludeClaimsData);
	}
	
	@Then("^verify the Add button enabled in Exclude Claims$")
	public void verify_the_add_button_enabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Exclude Claims$")
	public void click_on_add_button_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Claims to Exclude Table Presence$")
	public void verify_the_selected_claims_to_exclude_table_presence() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifySelectedClaimsToExcludeTablePresence();
	}
	
	@Then("^Selected Claims to Exclude Table should be displayed$")
	public void selected_claims_to_exclude_table_should_be_displayed() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifySelectedClaimsToExcludeTablePresence();
	}
	
	@When("^verify the Remove button presence in Exclude Claims$")
	public void verify_the_remove_button_presence_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Exclude Claims$")
	public void verify_the_remove_button_disabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^verify the Update button presence in Exclude Claims$")
	public void verify_the_update_button_presence_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyUpdateButtonPresence();
	}
	
	@Then("^verify the Update button disabled in Exclude Claims$")
	public void verify_the_update_button_disabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyUpdateButtonIsDisabled();
	}
	
	@When("^click on Selected Claims to Exclude check box$")
	public void click_on_selected_claims_to_exclude_check_box(DataTable excludeClaimsDetails) throws Throwable
	{
		actorUIAddExcludeClaimsPage.clickOnSelectedClaimsToExcludeCheckbox(excludeClaimsDetails);
	}
	
	@Then("^verify the Remove button enabled in Exclude Claims$")
	public void verify_the_remove_button_enabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyRemoveButtonIsEnabled();
	}
	
	@Then("^verify the Update button enabled in Exclude Claims$")
	public void verify_the_update_button_enabled_in_exclude_claims() throws Throwable
	{
		actorUIAddExcludeClaimsPage.verifyUpdateButtonIsEnabled();
	}
	
	@Then("^click on Selected Claims To Exclude Check box$")
	public void click_on_check_box_for_selected_claims_to_exclude(DataTable excludeClaimsDetails) throws Throwable
	{
		actorUIAddExcludeClaimsPage.clickOnSelectedClaimsToExcludeCheckbox(excludeClaimsDetails);
	}
}
