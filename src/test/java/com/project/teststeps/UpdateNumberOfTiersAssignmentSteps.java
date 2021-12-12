package com.project.teststeps;

import com.project.actors.ActorUpdateNumberOfTiersAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateNumberOfTiersAssignmentSteps 
{	
	@Steps
	ActorUpdateNumberOfTiersAssignmentPage actorUpdateNumberOfTiersAssignmentPage;
	
	@When("^update the following Number of Tiers Assignment details$")
	public void update_the_following_number_of_tiers_assignment_details(DataTable numberOfTiersAssignmentData) throws Throwable
	{
		actorUpdateNumberOfTiersAssignmentPage.updateNumberOfTiersAssignmentDetails(numberOfTiersAssignmentData);
	}
}
