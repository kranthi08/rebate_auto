package com.project.teststeps;

import com.project.actors.ActorAddHCVEpclusaUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddHCVEpclusaUMAssignmentSteps 
{
	
	@Steps
	ActorAddHCVEpclusaUMAssignmentPage actorAddHCVEpclusaUMAssignmentPage;
	
	@When("^submit the following HCV Epclusa UM Assignment details$")
	public void submit_the_following_hcv_epclusa_um_assignment_details(DataTable hcvEpclusaUMAssignmentData) throws Throwable
	{
		actorAddHCVEpclusaUMAssignmentPage.submitHCVEpclusaUMAssignmentDetails(hcvEpclusaUMAssignmentData);
	}
	
	@Then("^verify Selected HCV Epclusa UM Assignment details$")
	public void verify_selected_hcv_epclusa_um_assignment_details(DataTable selectedHCVEpclusaUMAssignmentData) throws Throwable
	{
		actorAddHCVEpclusaUMAssignmentPage.verifySelectedHCVEpclusaUMAssignmentDetails(selectedHCVEpclusaUMAssignmentData);
	}
}
