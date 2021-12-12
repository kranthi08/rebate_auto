package com.project.teststeps;

import com.project.actors.ActorAddLineOfBusinessAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddLineOfBusinessAssignmentSteps 
{
	
	@Steps
	ActorAddLineOfBusinessAssignmentPage actorAddLineOfBusinessAssignmentPage;
	
	@When("^submit the following Line of Business Assignment details$")
	public void submit_the_following_line_of_business_assignment_details(DataTable lobAssignmentData)	throws Throwable
	{
		actorAddLineOfBusinessAssignmentPage.submitLOBAssignmentDetails(lobAssignmentData);
	}
	
	@Then("^verify Selected Line of Business Assignment details$")
	public void verify_selected_line_of_business_assignment_details(DataTable selectedLOBAssignmentData)	throws Throwable
	{
		actorAddLineOfBusinessAssignmentPage.verifySelectedLOBAssignmentDetails(selectedLOBAssignmentData);
	}
}
