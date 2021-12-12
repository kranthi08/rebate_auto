package com.project.teststeps;

import com.project.actors.ActorAddNumberOfTiersAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddNumberOfTiersAssignmentSteps 
{	
	@Steps
	ActorAddNumberOfTiersAssignmentPage actorAddNumberOfTiersAssignmentPage;
	
	@When("^submit the following Number of Tiers Assignment details$")
	public void submit_the_following_number_of_tiers_assignment_details(DataTable numberOfTiersAssignmentData) throws Throwable
	{
		actorAddNumberOfTiersAssignmentPage.submitNumberOfTiersAssignmentDetails(numberOfTiersAssignmentData);
	}
	
	@Then("^verify Number of Tiers Assignment details$")
	public void verify_number_of_tiers_assignment_details(DataTable numberOfTiersAssignmentDetails) throws Throwable
	{
		actorAddNumberOfTiersAssignmentPage.verifyNumberOfTiersAssignmentDetails(numberOfTiersAssignmentDetails);
	}
}
