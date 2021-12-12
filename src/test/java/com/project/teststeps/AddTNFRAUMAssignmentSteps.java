package com.project.teststeps;

import com.project.actors.ActorAddTNFRAUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddTNFRAUMAssignmentSteps 
{
	
	@Steps
	ActorAddTNFRAUMAssignmentPage actorAddTNFRAUMAssignmentPage;
	
	@When("^submit the following TNF/RA UM Assignment details$")
	public void submit_the_following_tnf_ra_um_assignment_details(DataTable tnfraUMAssignmentData) throws Throwable
	{
		actorAddTNFRAUMAssignmentPage.submitTNFRAUMAssignmentDetails(tnfraUMAssignmentData);
	}
	
	@Then("^verify Selected TNF/RA UM Assignment details$")
	public void verify_selected_tnf_ra_um_assignment_details(DataTable selectedTNFRAUMAssignmentData) throws Throwable
	{
		actorAddTNFRAUMAssignmentPage.verifySelectedTNFRAUMAssignmentAssignmentDetails(selectedTNFRAUMAssignmentData);
	}
}
