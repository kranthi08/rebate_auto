package com.project.teststeps;

import net.thucydides.core.annotations.Steps;
import com.project.actors.ActorAddMembershipClaimCountsPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddMembershipClaimCountsSteps 
{
	@Steps
	ActorAddMembershipClaimCountsPage	membershipClaimCountsPage;
	
	
	@Then("^Membership/Claim screen should be displayed$") 
	public void membership_claim_screen_should_be_displayed() throws Throwable
	{
		membershipClaimCountsPage.verifyMembershipClaimScreenDisplay();
	}
	
	@Given("^User is on Membership/Claim Counts screen$")
	public void user_is_on_membership_claim_counts_screen() 	throws Throwable
	{
		membershipClaimCountsPage.verifyUserIsOnMembershipClaimCountsScreen();
	}
	
	@When("^submit the following details in Membership/Claim Counts screen$")
	public void submit_the_following_details_in_membership_claim_counts_screen(DataTable membershipClaim) 	throws Throwable
	{
		membershipClaimCountsPage.detailsSubmitionInMembershipClaimCountsScreen(membershipClaim);
	}
	
	@Then("^click on Next button in Membership/Claim Counts screen$")
	public void click_on_next_button_in_membership_claim_counts_screen()	throws Throwable
	{
		membershipClaimCountsPage.nextButtonClickinMembershipClaimCountsScreen();
	}
}
