package com.project.teststeps;

import com.project.actors.ActorUpdateHCVMavyretTieringAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateHCVMavyretTieringAssignmentSteps 
{	
	@Steps
	ActorUpdateHCVMavyretTieringAssignmentPage actorUpdateHCVMavyretTieringAssignmentPage;
	
	@When("^update the following HCV Mavyret Tiering Assignment details$")
	public void update_the_following_hcv_mavyret_tiering_assignment_details(DataTable hcvMavyretTieringAssignmentData) throws Throwable
	{
		actorUpdateHCVMavyretTieringAssignmentPage.updateHCVMavyretTieringAssignmentDetails(hcvMavyretTieringAssignmentData);
	}
}
