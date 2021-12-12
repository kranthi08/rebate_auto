package com.project.teststeps;

import com.project.actors.ActorViewFocusedUMBundleDiabetesAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewFocusedUMBundleDiabetesAssignmentSteps 
{
	
	@Steps
	ActorViewFocusedUMBundleDiabetesAssignmentPage actorViewFocusedUMBundleDiabetesAssignmentPage;
	
	@Then("^verify Focused UM bundle-diabetes details$")
	public void verify_focused_um_bundle_diabetes_details(DataTable viewFocusedUMBundleDiabetesData) throws Throwable
	{
		actorViewFocusedUMBundleDiabetesAssignmentPage.verifyFocusedUMBundleDiabetesDetails(viewFocusedUMBundleDiabetesData);
	}
}
