package com.project.teststeps;

import com.project.actors.ActorUpdateHCVHarvoniUMWithSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateHCVHarvoniUMWithSTAssignmentSteps 
{	
	@Steps
	ActorUpdateHCVHarvoniUMWithSTAssignmentPage actorUpdateHCVHarvoniUMWithSTAssignmentPage;
	
	@When("^update the following HCV Harvoni UM with ST Assignment details$")
	public void update_the_following_hcv_harvoni_um_with_st_assignment_details(DataTable hcvHarvoniUMWithSTAssignmentData) throws Throwable
	{
		actorUpdateHCVHarvoniUMWithSTAssignmentPage.updateHCVHarvoniUMWithSTAssignmentDetails(hcvHarvoniUMWithSTAssignmentData);
	}
}
