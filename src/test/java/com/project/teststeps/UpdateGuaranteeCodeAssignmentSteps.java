package com.project.teststeps;

import com.project.actors.ActorUpdateGuaranteeCodeAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateGuaranteeCodeAssignmentSteps 
{	
	@Steps
	ActorUpdateGuaranteeCodeAssignmentPage actorUpdateGuaranteeCodeAssignmentPage;
	
	@When("^update the following Guarantee Code Assignment details$")
	public void update_the_following_guarantee_code_assignment_details(DataTable guaranteeCodeAssignmentData) throws Throwable
	{
		actorUpdateGuaranteeCodeAssignmentPage.updateGuaranteeCodeAssignmentDetails(guaranteeCodeAssignmentData);
	}
}
