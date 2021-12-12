package com.project.teststeps;

import com.project.actors.ActorUpdateFocusedUMBundleDiabetesAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateFocusedUMBundleDiabetesAssignmentSteps 
{	
	@Steps
	ActorUpdateFocusedUMBundleDiabetesAssignmentPage actorUpdateFocusedUMBundleDiabetesAssignmentPage;
	
	@When("^update the following Focused UM Bundle-Diabetes Assignment details$")
	public void update_the_following_focused_um_bundle_diabetes_assignment_details(DataTable focusedUMBundleDiabetesAssignmentData) throws Throwable
	{
		actorUpdateFocusedUMBundleDiabetesAssignmentPage.updateFocusedUMBundleDiabetesAssignmentDetails(focusedUMBundleDiabetesAssignmentData);
	}
}
