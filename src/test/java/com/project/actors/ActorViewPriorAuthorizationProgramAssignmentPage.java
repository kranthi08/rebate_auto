package com.project.actors;

import java.util.List;
import com.project.pages.ViewPriorAuthorizationProgramAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewPriorAuthorizationProgramAssignmentPage {
	
	@Steps
	ViewPriorAuthorizationProgramAssignmentPage viewPriorAuthorizationProgramAssignmentPage;
	
	@Step
	public void verifyPriorAuthorizationProgramDetails(DataTable viewPriorAuthorizationProgramData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewPriorAuthorizationProgramData.raw();
		
		String strPriorAuthorizationProgramDetails = ""; 
		String strPriorAuthorizationProgramBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedPriorAuthorizationProgram = viewAssignmentDetails.get(1).get(6);

		switch(strPriorAuthorizationProgramBy.toUpperCase())
		{
			case "CUSTOMER":
				strPriorAuthorizationProgramDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strPriorAuthorizationProgramDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strPriorAuthorizationProgramDetails = strDrugListID;
				break;
			case "CLIENT":
				strPriorAuthorizationProgramDetails = strClient+"*"+strClientName;
				break;
		}
		
		strPriorAuthorizationProgramDetails = strPriorAuthorizationProgramDetails+"*"+strAssignedPriorAuthorizationProgram;
		
		viewPriorAuthorizationProgramAssignmentPage.verifyPriorAuthorizationProgramDetails(strPriorAuthorizationProgramDetails);
	}
}