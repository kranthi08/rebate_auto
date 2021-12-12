package com.project.teststeps;

import com.project.actors.ActorUpdateLineOfBusinessAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateLineOfBusinessAssignmentSteps 
{	
	@Steps
	ActorUpdateLineOfBusinessAssignmentPage actorUpdateLineOfBusinessAssignmentPage;
	
	@When("^update the following Line of Business Assignment details$")
	public void update_the_following_line_of_business_assignment_details(DataTable lobAssignmentData)	throws Throwable
	{
		actorUpdateLineOfBusinessAssignmentPage.updateLOBAssignmentDetails(lobAssignmentData);
	}
}
