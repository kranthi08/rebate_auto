package com.project.teststeps;

import com.project.actors.ActorAddHCVHarvoniUMWithSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddHCVHarvoniUMWithSTAssignmentSteps 
{
	
	@Steps
	ActorAddHCVHarvoniUMWithSTAssignmentPage actorAddHCVHarvoniUMWithSTAssignmentPage;
	
	@When("^submit the following HCV Harvoni UM with ST Assignment details$")
	public void submit_the_following_hcv_harvoni_um_with_st_assignment_details(DataTable hcvHarvoniUMWithSTAssignmentData) throws Throwable
	{
		actorAddHCVHarvoniUMWithSTAssignmentPage.submitHCVHarvoniUMWithSTAssignmentDetails(hcvHarvoniUMWithSTAssignmentData);
	}
	
	@Then("^verify Selected HCV Harvoni UM with ST Assignment details$")
	public void verify_selected_hcv_harvoni_um_with_st_assignment_details(DataTable selectedHCVHarvoniUMWithSTAssignmentData) throws Throwable
	{
		actorAddHCVHarvoniUMWithSTAssignmentPage.verifySelectedHCVHarvoniUMWithSTAssignmentAssignmentDetails(selectedHCVHarvoniUMWithSTAssignmentData);
	}
}
