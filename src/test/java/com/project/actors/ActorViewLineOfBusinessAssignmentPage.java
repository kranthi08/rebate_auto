package com.project.actors;

import java.util.List;

import com.project.pages.ViewLineOfBusinessAssignmentPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewLineOfBusinessAssignmentPage {
	
	@Steps
	ViewLineOfBusinessAssignmentPage viewLineOfBusinessAssignmentPage;
	
	@Step
	public void verifyLineOfBusinessDetails(DataTable viewLOBData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewLOBData.raw();
		
		String strLineOfBusinessDetails = ""; 
		String strLineOfBusinessBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedLineOfBusiness = viewAssignmentDetails.get(1).get(6);

		switch(strLineOfBusinessBy.toUpperCase())
		{
			case "CUSTOMER":
				strLineOfBusinessDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strLineOfBusinessDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strLineOfBusinessDetails = strDrugListID;
				break;
			case "CLIENT":
				strLineOfBusinessDetails = strClient+"*"+strClientName;
				break;
		}
		
		strLineOfBusinessDetails = strLineOfBusinessDetails+"*"+strAssignedLineOfBusiness;
		
		viewLineOfBusinessAssignmentPage.verifyLOBDetails(strLineOfBusinessDetails);
	}
}