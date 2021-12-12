package com.project.teststeps;

import com.project.actors.ActorUpdateHCVSolvaldiUMWithoutSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateHCVSolvaldiUMWithoutSTAssignmentSteps 
{	
	@Steps
	ActorUpdateHCVSolvaldiUMWithoutSTAssignmentPage actorUpdateHCVSolvaldiUMWithoutSTAssignmentPage;
	
	@When("^update the following HCV Solvaldi UM without ST Assignment details$")
	public void update_the_following_hcv_solvaldi_um_with_out_st_assignment_details(DataTable hcvSolvaldiUMWithoutSTAssignmentData) throws Throwable
	{
		actorUpdateHCVSolvaldiUMWithoutSTAssignmentPage.updateHCVSolvaldiUMWithoutSTAssignmentDetails(hcvSolvaldiUMWithoutSTAssignmentData);
	}
}
