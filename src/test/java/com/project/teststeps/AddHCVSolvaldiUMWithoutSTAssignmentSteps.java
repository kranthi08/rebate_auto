package com.project.teststeps;

import com.project.actors.ActorAddHCVSolvaldiUMWithoutSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddHCVSolvaldiUMWithoutSTAssignmentSteps 
{
	
	@Steps
	ActorAddHCVSolvaldiUMWithoutSTAssignmentPage actorAddHCVSolvaldiUMWithoutSTAssignmentPage;
	
	@When("^submit the following HCV Solvaldi UM without ST Assignment details$")
	public void submit_the_following_hcv_solvaldi_um_with_out_st_assignment_details(DataTable hcvSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		actorAddHCVSolvaldiUMWithoutSTAssignmentPage.submitHCVSolvaldiUMWithoutSTAssignmentDetails(hcvSolvaldiUMWithoutSTAssignmentData);
	}
	
	@Then("^verify Selected HCV Solvaldi UM without ST Assignment details$")
	public void verify_selected_hcv_solvaldi_um_with_out_st_assignment_details(DataTable selectedHCVSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		actorAddHCVSolvaldiUMWithoutSTAssignmentPage.verifySelectedHCVSolvaldiUMWithoutSTAssignmentDetails(selectedHCVSolvaldiUMWithoutSTAssignmentData);
	}
}
