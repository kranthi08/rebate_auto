package com.project.teststeps;

import com.project.actors.ActorViewHCVHarvoniUMWithSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewHCVHarvoniUMWithSTAssignmentSteps 
{
	
	@Steps
	ActorViewHCVHarvoniUMWithSTAssignmentPage actorViewHCVHarvoniUMWithSTAssignmentPage;
	
	@Then("^verify HCV Harvoni UM with ST details$")
	public void verify_hcv_harvoni_um_with_st_details(DataTable viewHCVHarvoniUMWithSTData) throws Throwable
	{
		actorViewHCVHarvoniUMWithSTAssignmentPage.verifyHCVHarvoniUMWithSTDetails(viewHCVHarvoniUMWithSTData);
	}
}
