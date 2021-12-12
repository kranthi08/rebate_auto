package com.project.teststeps;

import com.project.actors.ActorViewTNFRAUMAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewTNFRAUMAssignmentSteps 
{
	
	@Steps
	ActorViewTNFRAUMAssignmentPage actorViewTNFRAUMAssignmentPage;
	
	@Then("^verify TNF/RA UM details$")
	public void verify_tnf_ra_um_details(DataTable viewTNFRAUMData) throws Throwable
	{
		actorViewTNFRAUMAssignmentPage.verifyTNFRAUMDetails(viewTNFRAUMData);
	}
}
