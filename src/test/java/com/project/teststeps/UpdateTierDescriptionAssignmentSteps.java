package com.project.teststeps;

import com.project.actors.ActorUpdateTierDescriptionAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateTierDescriptionAssignmentSteps 
{	
	@Steps
	ActorUpdateTierDescriptionAssignmentPage actorUpdateTierDescriptionAssignmentPage;
	
	@When("^update the following Tier Description Assignment details$")
	public void update_the_following_tier_description_assignment_details(DataTable tierDescriptionAssignmentData) throws Throwable
	{
		actorUpdateTierDescriptionAssignmentPage.updateTierDescriptionAssignmentDetails(tierDescriptionAssignmentData);
	}
}
