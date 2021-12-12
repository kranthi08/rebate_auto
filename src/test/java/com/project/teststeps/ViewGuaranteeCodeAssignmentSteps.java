package com.project.teststeps;

import com.project.actors.ActorViewGuaranteeCodeAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewGuaranteeCodeAssignmentSteps 
{
	
	@Steps
	ActorViewGuaranteeCodeAssignmentPage actorViewGuaranteeCodeAssignmentPage;
	
	@Then("^verify Guarantee code assignment details$")
	public void verify_guarantee_code_assignment_details(DataTable viewGuaranteeCodeAssignmentData) throws Throwable
	{
		actorViewGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentDetails(viewGuaranteeCodeAssignmentData);
	}
}
