package com.project.teststeps;

import com.project.actors.ActorUpdateFocusedUMBundleMiscellaneousAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateFocusedUMBundleMiscellaneousAssignmentSteps 
{	
	@Steps
	ActorUpdateFocusedUMBundleMiscellaneousAssignmentPage actorUpdateFocusedUMBundleMiscellaneousAssignmentPage;
	
	@When("^update the following Focused UM Bundle-Miscellaneous Assignment details$")
	public void update_the_following_focused_um_bundle_miscellaneous_assignment_details(DataTable focusedUMBundleMiscellaneousAssignmentData) throws Throwable
	{
		actorUpdateFocusedUMBundleMiscellaneousAssignmentPage.updateFocusedUMBundleMiscellaneousAssignmentDetails(focusedUMBundleMiscellaneousAssignmentData);
	}
}
