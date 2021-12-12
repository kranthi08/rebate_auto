package com.project.teststeps;

import com.project.actors.ActorAddPriorAuthorizationProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddPriorAuthorizationProgramAssignmentSteps 
{
	
	@Steps
	ActorAddPriorAuthorizationProgramAssignmentPage actorAddPriorAuthorizationProgramAssignmentPage;
	
	@When("^submit the following Prior Authorization Program Assignment details$")
	public void submit_the_following_prior_authorization_program_assignment_details(DataTable priorAuthorizationProgramAssignmentData) throws Throwable
	{
		actorAddPriorAuthorizationProgramAssignmentPage.submitPriorAuthorizationProgramAssignmentDetails(priorAuthorizationProgramAssignmentData);
	}
	
	@Then("^verify Selected Prior Authorization Program Assignment details$")
	public void verify_selected_prior_authorization_program_assignment_details(DataTable selectedPriorAuthorizationProgramAssignmentData) throws Throwable
	{
		actorAddPriorAuthorizationProgramAssignmentPage.verifySelectedPriorAuthorizationProgramAssignmentDetails(selectedPriorAuthorizationProgramAssignmentData);
	}
}
