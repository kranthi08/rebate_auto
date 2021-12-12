package com.project.teststeps;

import com.project.actors.ActorAddFocusedUMBundleSpecialtyAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddFocusedUMBundleSpecialtyAssignmentSteps 
{
	
	@Steps
	ActorAddFocusedUMBundleSpecialtyAssignmentPage actorAddFocusedUMBundleSpecialtyAssignmentPage;
	
	@When("^submit the following Focused UM Bundle-Specialty Assignment details$")
	public void submit_the_following_focused_um_bundle_specialty_assignment_details(DataTable focusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleSpecialtyAssignmentPage.submitFocusedUMBundleSpecialtyAssignmentDetails(focusedUMBundleSpecialtyAssignmentData);
	}
	
	@Then("^verify Selected Focused UM Bundle-Specialty Assignment details$")
	public void verify_selected_focused_um_bundle_specialty_assignment_details(DataTable selectedFocusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleSpecialtyAssignmentPage.verifySelectedFocusedUMBundleSpecialtyAssignmentDetails(selectedFocusedUMBundleSpecialtyAssignmentData);
	}
}
