package com.project.teststeps;

import com.project.actors.ActorViewNumberOfTiersAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewNumberOfTiersAssignmentSteps 
{	
	@Steps
	ActorViewNumberOfTiersAssignmentPage actorViewNumberOfTiersAssignmentPage;
	
	@Then("^verify Number of Tiers assignment details$")
	public void verify_number_of_tiers_assignment_details(DataTable viewNumberOfTiersAssignmentData) throws Throwable
	{
		actorViewNumberOfTiersAssignmentPage.verifyNumberOfTiersAssignmentDetails(viewNumberOfTiersAssignmentData);
	}
}
