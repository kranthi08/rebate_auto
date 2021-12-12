package com.project.teststeps;

import com.project.actors.ActorViewHospiceFacilityAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewHospiceFacilityAssignmentSteps 
{
	
	@Steps
	ActorViewHospiceFacilityAssignmentPage actorViewHospiceFacilityAssignmentPage;
	
	@Then("^verify Hospice facility details$")
	public void verify_hospice_facility_details(DataTable viewHospiceFacilityData) throws Throwable
	{
		actorViewHospiceFacilityAssignmentPage.verifyHospiceFacilityDetails(viewHospiceFacilityData);
	}
}
