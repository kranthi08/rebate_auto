package com.project.teststeps;

import com.project.actors.ActorUpdateStepTherapyProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateStepTherapyProgramAssignmentSteps 
{	
	@Steps
	ActorUpdateStepTherapyProgramAssignmentPage actorUpdateStepTherapyProgramAssignmentPage;
	
	@When("^update the following Step Therapy Program Assignment details$")
	public void update_the_following_step_therapy_program_assignment_details(DataTable stepTherapyProgramAssignmentData) throws Throwable
	{
		actorUpdateStepTherapyProgramAssignmentPage.updateStepTherapyProgramAssignmentDetails(stepTherapyProgramAssignmentData);
	}
}
