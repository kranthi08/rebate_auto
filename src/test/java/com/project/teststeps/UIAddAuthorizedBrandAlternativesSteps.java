package com.project.teststeps;

import com.project.actors.ActorUIAddAuthorizedBrandAlternativesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddAuthorizedBrandAlternativesSteps 
{
	
	@Steps
	ActorUIAddAuthorizedBrandAlternativesPage actorUIAddAuthorizedBrandAlternativesPage;
	
	@When("^verify the Vendor formulary ID List Box presence in Authorized Brand Alternatives screen$")
	public void verify_the_vendor_formulary_id_list_box_presence_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyVendorFormularyIDListBoxPresence();
	}
	
	@Then("^verify the Vendor formulary ID List Box enabled in Authorized Brand Alternatives screen$")
	public void verify_the_vendor_formulary_id_list_box_enabled_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyVendorFormularyIDListBoxIsEnabled();
	}
	
	@And("^verify the default item displaying in Vendor formulary ID List Box in Authorized Brand Alternatives screen$")
	public void verify_the_default_item_displaying_in_vendor_formulary_id_list_box_in_authorized_brand_alternatives_screen(DataTable vendorFormularyIDListDefaultItem) throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyVendorFormularyIDListBoxDefaultItem(vendorFormularyIDListDefaultItem);
	}
	
	@And("^verify the Vendor formulary ID List Box items in Authorized Brand Alternatives screen$")
	public void verify_the_vendor_formulary_id_list_box_items_in_authorized_brand_alternatives_screen(DataTable assignVendorFormularyIDByListItems) throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyAssignVendorFormularyIDByListBoxItems(assignVendorFormularyIDByListItems);
	}
	
	@When("^verify the Available Authorized Brand Alternatives Table Presence$")
	public void verify_the_available_authorized_brand_alternatives_table_presence() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyAvailableAuthorizedBrandAlternativesTablePresence();
	}
	
	@Then("^verify the Available Authorized Brand Alternatives Table Pagination Presence$")
	public void verify_the_available_authorized_brand_alternatives_table_pagination_presence() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyAvailableAuthorizedBrandAlternativesTablePaginationPresence();
	}
	
	@When("^verify the Add button presence in Authorized Brand Alternatives screen$")
	public void verify_the_add_button_presence_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyAddButtonPresence();
	}
	
	@Then("^verify the Add button disabled in Authorized Brand Alternatives screen$")
	public void verify_the_add_button_disabled_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyAddButtonIsDisabled();
	}
	
	@When("^input the following Authorized Brand Alternatives details$")
	public void input_the_following_authorized_brand_alternatives_details(DataTable authorizedBranAlternativesData) throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.inputAuthorizedBrandAlternativesDetails(authorizedBranAlternativesData);
	}
	
	@Then("^verify the Add button enabled in Authorized Brand Alternatives screen$")
	public void verify_the_add_button_enabled_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyAddButtonIsEnabled();
	}
	
	@And("^click on Add button in Authorized Brand Alternatives screen$")
	public void click_on_add_button_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.clickOnAddButton();
	}
	
	@When("^verify the Selected Authorized Brand Alternatives Table Presence$")
	public void verify_the_selected_authorized_brand_alternatives_table_presence() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifySelectedAuthorizedBrandAlternativesTablePresence();
	}
	
	@Then("^Selected Authorized Brand Alternatives Table should be displayed$")
	public void selected_authorized_brand_alternatives_table_should_be_displayed() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifySelectedAuthorizedBrandAlternativesTablePresence();
	}
	
	@When("^verify the Remove button presence in Authorized Brand Alternatives screen$")
	public void verify_the_remove_button_presence_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyRemoveButtonPresence();
	}
	
	@Then("^verify the Remove button disabled in Authorized Brand Alternatives screen$")
	public void verify_the_remove_button_disabled_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyRemoveButtonIsDisabled();
	}
	
	@When("^click on Selected Authorized Brand Alternatives check box$")
	public void click_on_selected_authorized_brand_alternatives_check_box(DataTable selectedAuthorizedBrandAlternativesData) throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.clickOnSelectedAuthorizedBrandAlternativesCheckbox(selectedAuthorizedBrandAlternativesData);
	}
	
	@Then("^verify the Remove button enabled in Authorized Brand Alternatives screen$")
	public void verify_the_remove_button_enabled_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyRemoveButtonIsEnabled();
	}
	
	@When("^verify the Previous button presence in Authorized Brand Alternatives screen$")
	public void verify_the_previous_button_presence_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyPreviousButtonPresence();
	}
	
	@Then("^verify the Previous button enabled in Authorized Brand Alternatives screen$")
	public void verify_the_previous_button_enabled_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifyPreviousButtonIsEnabled();
	}
	
	@When("^verify the Save button presence in Authorized Brand Alternatives screen$")
	public void verify_the_save_button_presence_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifySaveButtonPresence();
	}
	
	@Then("^verify the Save button enabled in Authorized Brand Alternatives screen$")
	public void verify_the_save_button_enabled_in_authorized_brand_alternatives_screen() throws Throwable
	{
		actorUIAddAuthorizedBrandAlternativesPage.verifySaveButtonIsEnabled();
	}
}
