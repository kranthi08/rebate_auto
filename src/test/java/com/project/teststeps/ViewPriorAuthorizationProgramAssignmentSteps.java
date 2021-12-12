package com.project.teststeps;

import com.project.actors.ActorViewPriorAuthorizationProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewPriorAuthorizationProgramAssignmentSteps 
{
	
	@Steps
	ActorViewPriorAuthorizationProgramAssignmentPage actorViewPriorAuthorizationProgramAssignmentPage;
	
	@Then("^verify Prior authorization program details$")
	public void verify_prior_authorization_program_details(DataTable viewPriorAuthorizationProgramData) throws Throwable
	{
		actorViewPriorAuthorizationProgramAssignmentPage.verifyPriorAuthorizationProgramDetails(viewPriorAuthorizationProgramData);
	}
}
