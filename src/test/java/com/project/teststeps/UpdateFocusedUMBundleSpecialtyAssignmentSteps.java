package com.project.teststeps;

import com.project.actors.ActorUpdateFocusedUMBundleSpecialtyAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateFocusedUMBundleSpecialtyAssignmentSteps 
{	
	@Steps
	ActorUpdateFocusedUMBundleSpecialtyAssignmentPage actorUpdateFocusedUMBundleSpecialtyAssignmentPage;
	
	@When("^update the following Focused UM Bundle-Specialty Assignment details$")
	public void update_the_following_focused_um_bundle_specialty_assignment_details(DataTable focusedUMBundleSpecialtyAssignmentData) throws Throwable
	{
		actorUpdateFocusedUMBundleSpecialtyAssignmentPage.updateFocusedUMBundleSpecialtyAssignmentDetails(focusedUMBundleSpecialtyAssignmentData);
	}
}
