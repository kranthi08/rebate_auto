package com.project.teststeps;

import com.project.actors.ActorViewTierDescriptionAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewTierDescriptionAssignmentSteps 
{
	
	@Steps
	ActorViewTierDescriptionAssignmentPage actorViewTierDescriptionAssignmentPage;
	
	@Then("^verify Tier description assignment details$")
	public void verify_tier_description_assignment_details(DataTable viewTierDescriptionAssignmentData) throws Throwable
	{
		actorViewTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentDetails(viewTierDescriptionAssignmentData);
	}
}
