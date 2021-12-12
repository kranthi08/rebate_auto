package com.project.teststeps;

import com.project.actors.ActorUpdateHospiceFacilityAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateHospiceFacilityAssignmentSteps 
{	
	@Steps
	ActorUpdateHospiceFacilityAssignmentPage actorUpdateHospiceFacilityAssignmentPage;
	
	@When("^update the following Hospice Facility Assignment details$")
	public void update_the_following_hospice_facility_assignment_details(DataTable hospiceFacilityAssignmentData) throws Throwable
	{
		actorUpdateHospiceFacilityAssignmentPage.updateHospiceFacilityAssignmentDetails(hospiceFacilityAssignmentData);
	}
}
