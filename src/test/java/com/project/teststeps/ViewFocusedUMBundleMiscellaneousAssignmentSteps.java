package com.project.teststeps;

import com.project.actors.ActorViewFocusedUMBundleMiscellaneousAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleMiscellaneousAssignmentSteps 
{
	
	@Steps
	ActorViewFocusedUMBundleMiscellaneousAssignmentPage actorViewFocusedUMBundleMiscellaneousAssignmentPage;
	
	@Then("^verify Focused UM bundle-miscellaneous details$")
	public void verify_focused_um_bundle_miscellaneous_details(DataTable viewFocusedUMBundleMiscellaneousData) throws Throwable
	{
		actorViewFocusedUMBundleMiscellaneousAssignmentPage.verifyFocusedUMBundleMiscellaneousDetails(viewFocusedUMBundleMiscellaneousData);
	}
}
