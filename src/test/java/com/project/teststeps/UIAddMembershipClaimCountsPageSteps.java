package com.project.teststeps;

import com.project.actors.ActorUIAddMembershipClaimCountsPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddMembershipClaimCountsPageSteps 
{
	
	@Steps
	ActorUIAddMembershipClaimCountsPage actorUIMembershipClaimCountsPage;
	
	@When("^verify the Membership Claim Counts Add button is presence$")
	public void verify_the_Membership_Claim_Counts_Add_button_is_presence() throws Throwable
	{
		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Add_button_is_presence();
	}
	
  	@Then("^verify the Membership Claim Counts Add button is disabled$")
  	public void verify_the_Membership_Claim_Counts_Add_button_is_disabled()throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Add_button_is_disabled();
	}
  	
  	@When("^verify the Membership Claim Counts Update button is presence$")
  	public void verify_the_Membership_Claim_Counts_Update_button_is_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Update_button_is_presence();
	}
  	
  	@Then("^verify the Membership Claim Counts Update button is disabled$")
  	public void verify_the_Membership_Claim_Counts_Update_button_is_disabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Update_button_is_disabled();
	}
  	
  	@When("^verify the Membership Claim Counts Remove button is presence$")
  	public void verify_the_Membership_Claim_Counts_Remove_button_is_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Remove_button_is_presence();
	}
  	
  	@Then("^verify the Membership Claim Counts Remove button is disabled$")
  	public void verify_the_Membership_Claim_Counts_Remove_button_is_disabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Remove_button_is_disabled();
	}
  	
  	@When("^verify the Membership Claim Counts Previous button is presence$")
  	public void verify_the_Membership_Claim_Counts_Previous_button_is_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Previous_button_is_presence();
	}
  	
  	@Then("^verify the Membership Claim Counts Previous button is enabled$")
  	public void verify_the_Membership_Claim_Counts_Previous_button_is_enabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Previous_button_is_enabled();
	}
  	
  	@When("^verify the Membership Claim Counts Next button is presence$")
  	public void verify_the_Membership_Claim_Counts_Next_button_is_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Next_button_is_presence();
	}
  	
  	@Then("^verify the Membership Claim Counts Next button is enabled$")
  	public void verify_the_Membership_Claim_Counts_Next_button_is_enabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Next_button_is_enabled();
	}
  	
  	@When("^verify the Membership Claim Counts Table is presence$")
  	public void verify_the_Membership_Claim_Counts_Table_is_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_Claim_Counts_Table_is_presence();
	}
  	
  	@Then("^Membership Claim Counts Table should be displayed$")
  	public void Membership_Claim_Counts_Table_should_be_displayed() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.Membership_Claim_Counts_Table_should_be_displayed();
	}
  	
  	@When("^verify the Establish contractual membership/claim counts by List Box presence$")
  	public void verify_the_Establish_contractual_membership_claim_counts_by_List_Box_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Establish_contractual_membership_claim_counts_by_List_Box_presence();
	}
  	
  	@Then("^verify the Establish contractual membership/claim counts by List Box enabled$")
  	public void verify_the_Establish_contractual_membership_claim_counts_by_List_Box_enabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Establish_contractual_membership_claim_counts_by_List_Box_enabled();
	}
  	
  	@And("^verify the Establish contractual membership/claim counts by List Box items$")
  	public void verify_the_Establish_contractual_membership_claim_counts_by_List_Box_items(DataTable establishContractual_ListBoxitems) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Establish_contractual_membership_claim_counts_by_List_Box_items(establishContractual_ListBoxitems);
	}
  	
  	@And("^select value from Establish contractual membership/claim counts by List Box$")
  	public void select_value_from_Establish_contractual_membership_claim_counts_by_List_Box(DataTable establishContractual_ListBoxValue) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.select_value_from_Establish_contractual_membership_claim_counts_by_List_Box(establishContractual_ListBoxValue);
	}
  	
  	@When("^verify the Customer vendor formulary ID List Box presence$")
  	public void verify_the_Customer_vendor_formulary_ID_List_Box_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Customer_vendor_formulary_ID_List_Box_presence();
	}
  	
  	@Then("^verify the Customer vendor formulary ID List Box enabled$")
  	public void verify_the_Customer_vendor_formulary_ID_List_Box_enabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Customer_vendor_formulary_ID_List_Box_enabled();
	}
  
  	@And("^verify the Customer vendor formulary ID List Box items$")
  	public void verify_the_Customer_vendor_formulary_ID_List_Box_items(DataTable customerVendorformularyID_ListBoxitems) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Customer_vendor_formulary_ID_List_Box_items(customerVendorformularyID_ListBoxitems);
	}
  	
  	@And("^select value from Customer vendor formulary ID List Box$")
  	public void select_value_from_Customer_vendor_formulary_ID_List_Box(DataTable customerVendorformularyID_ListBoxValue) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.select_value_from_Customer_vendor_formulary_ID_List_Box(customerVendorformularyID_ListBoxValue);
	}
  	
  	@When("^verify the Contractual membership count Edit Box presence$")
  	public void verify_the_Contractual_membership_count_Edit_Box_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Contractual_membership_count_Edit_Box_presence();
	}
  
  	@Then("^verify the Contractual membership count Edit Box enabled$")
  	public void verify_the_Contractual_membership_count_Edit_Box_enabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Contractual_membership_count_Edit_Box_enabled();
	}
  	
  	@And("^verify the Contractual membership count Edit Box Max Length$")
  	public void verify_the_Contractual_membership_count_Edit_Box_Max_Length(DataTable Contractualmembershipcount_EditBoxMaxLength) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Contractual_membership_count_Edit_Box_Max_Length(Contractualmembershipcount_EditBoxMaxLength);
	}
  	
  	@And("^input value into Contractual membership count Edit Box$")
  	public void input_value_into_Contractual_membership_count_Edit_Box(DataTable Contractualmembershipcount_EditBoxValue) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.input_value_into_Contractual_membership_count_Edit_Box(Contractualmembershipcount_EditBoxValue);
	}
  	
  	@When("^verify the Membership percent threshold Edit Box presence$")
  	public void verify_the_Membership_percent_threshold_Edit_Box_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_percent_threshold_Edit_Box_presence();
	}
  	
  	@Then("^verify the Membership percent threshold Edit Box enabled$")
  	public void verify_the_Membership_percent_threshold_Edit_Box_enabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_percent_threshold_Edit_Box_enabled();
	}
  	
  	@And("^verify the Membership percent threshold Edit Box Max Length$")
  	public void verify_the_Membership_percent_threshold_Edit_Box_Max_Length(DataTable membershipPercentThreshold_EditBoxMaxLength) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Membership_percent_threshold_Edit_Box_Max_Length(membershipPercentThreshold_EditBoxMaxLength);
	}
  	
  	@And("^input value into Membership percent threshold Edit Box$")
  	public void input_value_into_Membership_percent_threshold_Edit_Box(DataTable membershipPercentThreshold_EditBoxValue) throws Throwable
	{
  		actorUIMembershipClaimCountsPage.input_value_into_Membership_percent_threshold_Edit_Box(membershipPercentThreshold_EditBoxValue);
	}
  	
  	@When("^verify the Contractual claim count edit box presence$")
  	public void verify_the_Contractual_claim_count_edit_box_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Contractual_claim_count_edit_box_presence();
	}
  	
  	@Then("^verify the Contractual claim count edit box disabled$")
  	public void verify_the_Contractual_claim_count_edit_box_disabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Contractual_claim_count_edit_box_disabled();
	}
  	
  	@When("^verify the Claim percent threshold edit box presence$")
  	public void verify_the_Claim_percent_threshold_edit_box_presence() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Claim_percent_threshold_edit_box_presence();
	}
  	
  	@Then("verify the Claim percent threshold edit box disabled$")
  	public void verify_the_Claim_percent_threshold_edit_box_disabled() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.verify_the_Claim_percent_threshold_edit_box_disabled();
	}
  	
  	@Then("^Click on Add button in Membership Claim Counts screen$")
  	public void Click_on_Add_button_in_Membership_Claim_Counts_screen() throws Throwable
	{
  		actorUIMembershipClaimCountsPage.Click_on_Add_button_in_Membership_Claim_Counts_screen();
	}
  	
  	
   	
}
