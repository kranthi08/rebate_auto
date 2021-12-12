package com.project.teststeps;

import com.project.actors.ActorUpdateAuthorizedBrandAlternativesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateAuthorizedBrandAlternativesSteps 
{	
	@Steps
	ActorUpdateAuthorizedBrandAlternativesPage actorUpdateAuthorizedBrandAlternativesPage;
	
	@When("^update the following details in Authorized Brand Alternatives screen$")
	public void update_the_following_details_in_authorized_brand_alternatives_screen(DataTable authorizedBrandAlternativesData)	throws Throwable
	{
		actorUpdateAuthorizedBrandAlternativesPage.updateAuthorizedBrandAlternativesDetails(authorizedBrandAlternativesData);
	}
}
