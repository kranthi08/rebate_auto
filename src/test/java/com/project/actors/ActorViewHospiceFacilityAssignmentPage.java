package com.project.actors;

import java.util.List;

import com.project.pages.ViewHospiceFacilityAssignmentPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewHospiceFacilityAssignmentPage {
	
	@Steps
	ViewHospiceFacilityAssignmentPage viewHospiceFacilityAssignmentPage;
	
	@Step
	public void verifyHospiceFacilityDetails(DataTable viewHospiceFacilityData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewHospiceFacilityData.raw();
		
		String strHospiceFacilityDetails = ""; 
		String strHospiceFacilityBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedHospiceFacility = viewAssignmentDetails.get(1).get(6);

		switch(strHospiceFacilityBy.toUpperCase())
		{
			case "CUSTOMER":
				strHospiceFacilityDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strHospiceFacilityDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strHospiceFacilityDetails = strDrugListID;
				break;
			case "CLIENT":
				strHospiceFacilityDetails = strClient+"*"+strClientName;
				break;
		}
		
		strHospiceFacilityDetails = strHospiceFacilityDetails+"*"+strAssignedHospiceFacility;
		
		viewHospiceFacilityAssignmentPage.verifyHospiceFacilityDetails(strHospiceFacilityDetails);
	}
}