package com.project.teststeps;

import com.project.actors.ActorAddExcludeClaimsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddExcludeClaimsSteps 
{
	
	@Steps
	ActorAddExcludeClaimsPage actorAddExcludeClaimsPage;
	
	@When("^submit the following Exclude Claim details$")
	public void submit_the_following_exclude_claim_details(DataTable excludeClaimsData) throws Throwable
	{
		actorAddExcludeClaimsPage.submitExcludeClaimsDetails(excludeClaimsData);
	}
	
	@Then("^verify Selected Claims to Exclude details$")
	public void verify_selected_claims_to_exclude_details(DataTable selectedClaimsToExcludeData) throws Throwable
	{
		actorAddExcludeClaimsPage.verifyExcludeClaimsDetails(selectedClaimsToExcludeData);
	}
}
