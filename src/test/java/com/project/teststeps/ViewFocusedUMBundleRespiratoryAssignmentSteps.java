package com.project.teststeps;

import com.project.actors.ActorViewFocusedUMBundleRespiratoryAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleRespiratoryAssignmentSteps 
{
	
	@Steps
	ActorViewFocusedUMBundleRespiratoryAssignmentPage actorViewFocusedUMBundleRespiratoryAssignmentPage;
	
	@Then("^verify Focused UM bundle-respiratory details$")
	public void verify_focused_um_bundle_respiratory_details(DataTable viewFocusedUMBundleRespiratoryData) throws Throwable
	{
		actorViewFocusedUMBundleRespiratoryAssignmentPage.verifyFocusedUMBundleRespiratoryDetails(viewFocusedUMBundleRespiratoryData);
	}
}
