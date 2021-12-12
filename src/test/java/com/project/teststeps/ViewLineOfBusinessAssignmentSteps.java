package com.project.teststeps;

import com.project.actors.ActorViewLineOfBusinessAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewLineOfBusinessAssignmentSteps 
{
	
	@Steps
	ActorViewLineOfBusinessAssignmentPage actorViewLineOfBusinessAssignmentPage;
	
	@Then("^verify Line of business details$")
	public void verify_line_of_business_details(DataTable viewLOBData) throws Throwable
	{
		actorViewLineOfBusinessAssignmentPage.verifyLineOfBusinessDetails(viewLOBData);
	}
}
