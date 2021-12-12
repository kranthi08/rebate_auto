package com.project.teststeps;

import com.project.actors.ActorUpdateMembershipClaimCountsPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UpdateMembershipClaimCountsSteps
{
	@Steps
	ActorUpdateMembershipClaimCountsPage actorMembershipClaimCountsPage;
	
	@Then("^update the following details in Membership/Claim Counts panel$")
	public void update_the_following_details_in_membership_claim_counts_panel(DataTable membershipClaimCountData) throws Throwable
	{
		actorMembershipClaimCountsPage.updateMembershipClaimCountsPanelDetails(membershipClaimCountData);
	}
		
}
