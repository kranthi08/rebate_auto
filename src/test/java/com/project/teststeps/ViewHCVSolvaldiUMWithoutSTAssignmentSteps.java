package com.project.teststeps;

import com.project.actors.ActorViewHCVSolvaldiUMWithoutSTAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewHCVSolvaldiUMWithoutSTAssignmentSteps 
{
	
	@Steps
	ActorViewHCVSolvaldiUMWithoutSTAssignmentPage actorViewHCVSolvaldiUMWithoutSTAssignmentPage;
	
	@Then("^verify HCV Solvaldi UM without ST details$")
	public void verify_hcv_solvadi_um_with_out_st_details(DataTable viewHCVSolvaldiUMWithoutSTData) throws Throwable
	{
		actorViewHCVSolvaldiUMWithoutSTAssignmentPage.verifyHCVSolvaldiUMWithoutSTDetails(viewHCVSolvaldiUMWithoutSTData);
	}
}
