package com.project.teststeps;

import com.project.actors.ActorViewStepTherapyProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewStepTherapyProgramAssignmentSteps 
{
	
	@Steps
	ActorViewStepTherapyProgramAssignmentPage actorViewStepTherapyProgramAssignmentPage;
	
	@Then("^verify Step therapy program details$")
	public void verify_step_therapy_program_details(DataTable viewStepTherapyProgramData) throws Throwable
	{
		actorViewStepTherapyProgramAssignmentPage.verifyStepTherapyProgramDetails(viewStepTherapyProgramData);
	}
}
