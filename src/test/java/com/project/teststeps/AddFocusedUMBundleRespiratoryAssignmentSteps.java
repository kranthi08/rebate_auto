package com.project.teststeps;

import com.project.actors.ActorAddFocusedUMBundleRespiratoryAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddFocusedUMBundleRespiratoryAssignmentSteps 
{
	
	@Steps
	ActorAddFocusedUMBundleRespiratoryAssignmentPage actorAddFocusedUMBundleRespiratoryAssignmentPage;
	
	@When("^submit the following Focused UM Bundle-Respiratory Assignment details$")
	public void submit_the_following_focused_um_bundle_respiratory_assignment_details(DataTable focusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleRespiratoryAssignmentPage.submitFocusedUMBundleRespiratoryAssignmentDetails(focusedUMBundleRespiratoryAssignmentData);
	}
	
	@Then("^verify Selected Focused UM Bundle-Respiratory Assignment details$")
	public void verify_selected_focused_um_bundle_respiratory_assignment_details(DataTable selectedFocusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleRespiratoryAssignmentPage.verifySelectedFocusedUMBundleRespiratoryAssignmentDetails(selectedFocusedUMBundleRespiratoryAssignmentData);
	}
}
