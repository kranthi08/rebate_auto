package com.project.teststeps;

import com.project.actors.ActorUpdateExcludeClaimsPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateExcludeClaimsSteps 
{	
	@Steps
	ActorUpdateExcludeClaimsPage actorUpdateExcludeClaimsPage;
	
	@When("^update the following Selected Claims to Exclude details$")
	public void update_the_following_selected_claims_to_exclude_details(DataTable excludeClaimsData) throws Throwable
	{
		actorUpdateExcludeClaimsPage.updateExcludeClaimsDetails(excludeClaimsData);
	}
}
