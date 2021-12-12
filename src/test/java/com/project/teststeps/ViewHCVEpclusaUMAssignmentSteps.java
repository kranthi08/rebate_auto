package com.project.teststeps;

import com.project.actors.ActorViewHCVEpclusaUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewHCVEpclusaUMAssignmentSteps 
{
	
	@Steps
	ActorViewHCVEpclusaUMAssignmentPage actorViewHCVEpclusaUMAssignmentPage;
	
	@Then("^verify HCV Epclusa UM details$")
	public void verify_hcv_epclusa_details(DataTable viewHCVEpclusaUMData) throws Throwable
	{
		actorViewHCVEpclusaUMAssignmentPage.verifyHCVEpclusaUMDetails(viewHCVEpclusaUMData);
	}
}
