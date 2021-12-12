package com.project.teststeps;

import com.project.actors.ActorAddHospiceFacilityAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddHospiceFacilityAssignmentSteps 
{
	
	@Steps
	ActorAddHospiceFacilityAssignmentPage actorAddHospiceFacilityAssignmentPage;
	
	@When("^submit the following Hospice Facility Assignment details$")
	public void submit_the_following_hospice_facility_assignment_details(DataTable hospiceFacilityAssignmentData) throws Throwable
	{
		actorAddHospiceFacilityAssignmentPage.submitHospiceFacilityAssignmentDetails(hospiceFacilityAssignmentData);
	}
	
	@Then("^verify Selected Hospice Facility Assignment details$")
	public void verify_selected_hospice_facility_assignment_details(DataTable selectedHospiceFacilityAssignmentData) throws Throwable
	{
		actorAddHospiceFacilityAssignmentPage.verifySelectedHospiceFacilityAssignmentDetails(selectedHospiceFacilityAssignmentData);
	}
}
