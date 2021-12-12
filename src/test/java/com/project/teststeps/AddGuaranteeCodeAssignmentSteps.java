package com.project.teststeps;

import com.project.actors.ActorAddGuaranteeCodeAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddGuaranteeCodeAssignmentSteps 
{
	
	@Steps
	ActorAddGuaranteeCodeAssignmentPage actorAddGuaranteeCodeAssignmentPage;
	
	@When("^submit the following Guarantee Code Assignment details$")
	public void submit_the_following_guarantee_code_assignment_details(DataTable guaranteeCodeAssignmentData) throws Throwable
	{
		actorAddGuaranteeCodeAssignmentPage.submitGuaranteeCodeAssignmentDetails(guaranteeCodeAssignmentData);
	}
	
	@Then("^verify Guarantee Code Assignment details$")
	public void verify_guarantee_code_assignment_details(DataTable guaranteeCodeAssignmentDetails) throws Throwable
	{
		actorAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentDetails(guaranteeCodeAssignmentDetails);
	}
}
