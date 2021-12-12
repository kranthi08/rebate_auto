package com.project.teststeps;

import com.project.actors.ActorUpdateHCVEpclusaUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateHCVEpclusaUMAssignmentSteps 
{	
	@Steps
	ActorUpdateHCVEpclusaUMAssignmentPage actorUpdateHCVEpclusaUMAssignmentPage;
	
	@When("^update the following HCV Epclusa UM Assignment details$")
	public void update_the_following_hcv_epclusa_um_assignment_details(DataTable hcvEpclusaUMAssignmentData) throws Throwable
	{
		actorUpdateHCVEpclusaUMAssignmentPage.updateHCVEpclusaUMAssignmentDetails(hcvEpclusaUMAssignmentData);
	}
}
