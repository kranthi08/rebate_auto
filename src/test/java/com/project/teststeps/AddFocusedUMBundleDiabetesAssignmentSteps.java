package com.project.teststeps;

import com.project.actors.ActorAddFocusedUMBundleDiabetesAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddFocusedUMBundleDiabetesAssignmentSteps 
{
	
	@Steps
	ActorAddFocusedUMBundleDiabetesAssignmentPage actorAddFocusedUMBundleDiabetesAssignmentPage;
	
	@When("^submit the following Focused UM Bundle-Diabetes Assignment details$")
	public void submit_the_following_focused_um_bundle_diabetes_assignment_details(DataTable focusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleDiabetesAssignmentPage.submitFocusedUMBundleDiabetesAssignmentDetails(focusedUMBundleDiabetesAssignmentData);
	}
	
	@Then("^verify Selected Focused UM Bundle-Diabetes Assignment details$")
	public void verify_selected_focused_um_bundle_diabetes_assignment_details(DataTable selectedFocusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleDiabetesAssignmentPage.verifySelectedFocusedUMBundleDiabetesAssignmentDetails(selectedFocusedUMBundleDiabetesAssignmentData);
	}
}
