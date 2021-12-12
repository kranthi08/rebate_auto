package com.project.teststeps;

import com.project.actors.ActorAddAuthorizedBrandAlternativesPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddAuthorizedBrandAlternativesSteps 
{
	
	@Steps
	ActorAddAuthorizedBrandAlternativesPage actorAddAuthorizedBrandAlternativesPage;
	
	@Then("^Authorized Brand Alternatives screen should be displayed$")
	public void authorized_brand_alternatives_screen_should_be_displayed()	throws Throwable
	{
		actorAddAuthorizedBrandAlternativesPage.verifyAuthorizedBrandAlternatives();
	}
	
	@Given("^User is on Authorized Brand Alternatives screen$")
	public void user_is_on_authorized_brand_alternatives_screen()	throws Throwable
	{
		actorAddAuthorizedBrandAlternativesPage.verifyAuthorizedBrandAlternatives();
	}
	
	@When("^submit the following Authorized Brand Alternatives details$")
	public void submit_the_following_authorized_brand_alternatives_details(DataTable authorizedBrandAlternativesData)	throws Throwable
	{
		actorAddAuthorizedBrandAlternativesPage.enterAuthorizedBrandAlternativesDetails(authorizedBrandAlternativesData);
	}
	
	@Then("^click on Save button$")
	public void click_on_save_button()	throws Throwable
	{
		actorAddAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}
