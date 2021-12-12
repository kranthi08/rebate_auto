package com.project.teststeps;

import com.project.actors.ActorAddFocusedUMBundleMiscellaneousAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddFocusedUMBundleMiscellaneousAssignmentSteps 
{
	
	@Steps
	ActorAddFocusedUMBundleMiscellaneousAssignmentPage actorAddFocusedUMBundleMiscellaneousAssignmentPage;
	
	@When("^submit the following Focused UM Bundle-Miscellaneous Assignment details$")
	public void submit_the_following_focused_um_bundle_miscellaneous_assignment_details(DataTable focusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleMiscellaneousAssignmentPage.submitFocusedUMBundleMiscellaneousAssignmentDetails(focusedUMBundleMiscellaneousAssignmentData);
	}
	
	@Then("^verify Selected Focused UM Bundle-Miscellaneous Assignment details$")
	public void verify_selected_focused_um_bundle_miscellaneous_assignment_details(DataTable selectedFocusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		actorAddFocusedUMBundleMiscellaneousAssignmentPage.verifySelectedFocusedUMBundleMiscellaneousAssignmentDetails(selectedFocusedUMBundleMiscellaneousAssignmentData);
	}
}
