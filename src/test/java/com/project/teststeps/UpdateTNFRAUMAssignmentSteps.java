package com.project.teststeps;

import com.project.actors.ActorUpdateTNFRAUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateTNFRAUMAssignmentSteps 
{	
	@Steps
	ActorUpdateTNFRAUMAssignmentPage actorUpdateTNFRAUMAssignmentPage;
	
	@When("^update the following TNF/RA UM Assignment details$")
	public void update_the_following_tnf_ra_um_assignment_details(DataTable tnfraUMAssignmentData) throws Throwable
	{
		actorUpdateTNFRAUMAssignmentPage.updateTNFRAUMAssignmentDetails(tnfraUMAssignmentData);
	}
}
