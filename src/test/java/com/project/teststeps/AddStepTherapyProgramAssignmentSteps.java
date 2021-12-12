package com.project.teststeps;

import com.project.actors.ActorAddStepTherapyProgramAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddStepTherapyProgramAssignmentSteps 
{
	
	@Steps
	ActorAddStepTherapyProgramAssignmentPage actorAddStepTherapyProgramAssignmentPage;
	
	@When("^submit the following Step Therapy Program Assignment details$")
	public void submit_the_following_step_therapy_program_assignment_details(DataTable stepTherapyProgramAssignmentData) throws Throwable
	{
		actorAddStepTherapyProgramAssignmentPage.submitStepTherapyProgramAssignmentDetails(stepTherapyProgramAssignmentData);
	}
	
	@Then("^verify Selected Step Therapy Program Assignment details$")
	public void verify_selected_step_therapy_program_assignment_details(DataTable selectedStepTherapyProgramAssignmentData) throws Throwable
	{
		actorAddStepTherapyProgramAssignmentPage.verifySelectedStepTherapyProgramAssignmentDetails(selectedStepTherapyProgramAssignmentData);
	}
}
