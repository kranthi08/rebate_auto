package com.project.teststeps;

import com.project.actors.ActorViewAuthorizedBrandAlternativesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ViewAuthorizedBrandAlternativesSteps 
{
	
	@Steps
	ActorViewAuthorizedBrandAlternativesPage actorViewAuthorizedBrandAlternativesPage;
	
	@When("^verify and expand the Authorized Brand Alternatives panel$")
	public void verify_and_expand_the_authorized_brand_alternatives_panel(DataTable panelName)	throws Throwable
	{
		actorViewAuthorizedBrandAlternativesPage.expandAuthorizedBrandAlternativesPanel(panelName);
	}
	
	@Then("^verify Authorized Brand Alternatives details$")
	public void verify_authorized_brand_alternatives_details(DataTable viewAuthorizedBrandAlternativesData) throws Throwable
	{
		actorViewAuthorizedBrandAlternativesPage.verifyAuthorizedBrandAlternativesDetails(viewAuthorizedBrandAlternativesData);
	}
}
