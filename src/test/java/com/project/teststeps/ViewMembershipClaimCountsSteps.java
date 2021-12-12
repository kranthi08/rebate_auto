package com.project.teststeps;

import com.project.actors.ActorViewMembershipClaimCountsPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ViewMembershipClaimCountsSteps 
{
	
	@Steps
	ActorViewMembershipClaimCountsPage viewMembershipClaimCountsPage;
	
	@When("^verify and expand the Membership/Claim Counts panel$")
	public void expand_membership_claim_counts_panel(DataTable PanelName) throws Throwable
	{
		viewMembershipClaimCountsPage.expand_Membership_Claim_Counts_Panel(PanelName);
	}
	
	@Then("^verify Membership/Claim Counts details$")
	public void verify_membership_claim_counts_details(DataTable membershipClaimCountsDetails) throws Throwable
	{
		viewMembershipClaimCountsPage.verify_Membership_Claim_Counts_details(membershipClaimCountsDetails);
	}
	
}
