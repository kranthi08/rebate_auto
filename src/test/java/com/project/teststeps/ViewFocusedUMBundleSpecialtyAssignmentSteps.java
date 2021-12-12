package com.project.teststeps;

import com.project.actors.ActorViewFocusedUMBundleSpecialtyAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleSpecialtyAssignmentSteps 
{
	
	@Steps
	ActorViewFocusedUMBundleSpecialtyAssignmentPage actorViewFocusedUMBundleSpecialtyAssignmentPage;
	
	@Then("^verify Focused UM bundle-specialty details$")
	public void verify_focused_um_bundle_specialty_details(DataTable viewFocusedUMBundleSpecialtyData) throws Throwable
	{
		actorViewFocusedUMBundleSpecialtyAssignmentPage.verifyFocusedUMBundleSpecialtyDetails(viewFocusedUMBundleSpecialtyData);
	}
}
