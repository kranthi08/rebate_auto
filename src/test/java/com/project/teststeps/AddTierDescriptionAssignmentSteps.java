package com.project.teststeps;

import com.project.actors.ActorAddTierDescriptionAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddTierDescriptionAssignmentSteps 
{
	
	@Steps
	ActorAddTierDescriptionAssignmentPage actorAddTierDescriptionAssignmentPage;
	
	@When("^submit the following Tier Description Assignment details$")
	public void submit_the_following_tier_description_assignment_details(DataTable tierDescriptionAssignmentData) throws Throwable
	{
		actorAddTierDescriptionAssignmentPage.submitTierDescriptionAssignmentDetails(tierDescriptionAssignmentData);
	}
	
	@Then("^verify Tier Description Assignment details$")
	public void verify_tier_description_assignment_details(DataTable tierDescriptionAssignmentDetails) throws Throwable
	{
		actorAddTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentDetails(tierDescriptionAssignmentDetails);
	}
}
