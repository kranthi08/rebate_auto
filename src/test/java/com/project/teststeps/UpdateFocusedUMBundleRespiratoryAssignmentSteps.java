package com.project.teststeps;

import com.project.actors.ActorUpdateFocusedUMBundleRespiratoryAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateFocusedUMBundleRespiratoryAssignmentSteps 
{	
	@Steps
	ActorUpdateFocusedUMBundleRespiratoryAssignmentPage actorUpdateFocusedUMBundleRespiratoryAssignmentPage;
	
	@When("^update the following Focused UM Bundle-Respiratory Assignment details$")
	public void update_the_following_focused_um_bundle_respiratory_assignment_details(DataTable focusedUMBundleRespiratoryAssignmentData) throws Throwable
	{
		actorUpdateFocusedUMBundleRespiratoryAssignmentPage.updateFocusedUMBundleRespiratoryAssignmentDetails(focusedUMBundleRespiratoryAssignmentData);
	}
}
