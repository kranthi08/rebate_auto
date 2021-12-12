package com.project.teststeps;

import com.project.actors.ActorViewHCVMavyretTieringAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewHCVMavyretTieringAssignmentSteps 
{
	
	@Steps
	ActorViewHCVMavyretTieringAssignmentPage actorViewHCVMavyretTieringAssignmentPage;
	
	@Then("^verify HCV Mavyret tiering details$")
	public void verify_hcv_mavyret_tiering_details(DataTable viewHCVMavyretTieringData) throws Throwable
	{
		actorViewHCVMavyretTieringAssignmentPage.verifyHCVMavyretTieringDetails(viewHCVMavyretTieringData);
	}
}
