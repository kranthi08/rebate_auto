package com.project.teststeps;

import com.project.actors.ActorViewExcludeClaimsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewExcludeClaimsSteps 
{
	
	@Steps
	ActorViewExcludeClaimsPage actorViewExcludeClaimsPage;
	
	@Then("^verify Excluded claims details$")
	public void verify_excluded_claims_details(DataTable viewExcludeClaimsData) throws Throwable
	{
		actorViewExcludeClaimsPage.verifyExcludedClaimsDetails(viewExcludeClaimsData);
	}
}
