package com.project.teststeps;

import com.project.actors.ActorUpdatePriorAuthorizationProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdatePriorAuthorizationProgramAssignmentSteps 
{	
	@Steps
	ActorUpdatePriorAuthorizationProgramAssignmentPage actorUpdatePriorAuthorizationProgramAssignmentPage;
	
	@When("^update the following Prior Authorization Program Assignment details$")
	public void update_the_following_prior_authorization_program_assignment_details(DataTable priorAuthorizationProgramAssignmentData) throws Throwable
	{
		actorUpdatePriorAuthorizationProgramAssignmentPage.updatePriorAuthorizationProgramAssignmentDetails(priorAuthorizationProgramAssignmentData);
	}
}
