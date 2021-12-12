package com.project.teststeps;

import com.project.actors.ActorAddHCVMavyretTieringAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddHCVMavyretTieringAssignmentSteps 
{
	
	@Steps
	ActorAddHCVMavyretTieringAssignmentPage actorAddHCVMavyretTieringAssignmentPage;
	
	@When("^submit the following HCV Mavyret Tiering Assignment details$")
	public void submit_the_following_hcv_mavyret_tiering_assignment_details(DataTable hcvMavyretTieringAssignmentData) throws Throwable
	{
		actorAddHCVMavyretTieringAssignmentPage.submitHCVMavyretTieringAssignmentDetails(hcvMavyretTieringAssignmentData);
	}
	
	@Then("^verify Selected HCV Mavyret Tiering Assignment details$")
	public void verify_selected_hcv_mavyret_tiering_assignment_details(DataTable selectedHCVMavyretTieringAssignmentData) throws Throwable
	{
		actorAddHCVMavyretTieringAssignmentPage.verifySelectedHCVMavyretTieringAssignmentAssignmentDetails(selectedHCVMavyretTieringAssignmentData);
	}
}
