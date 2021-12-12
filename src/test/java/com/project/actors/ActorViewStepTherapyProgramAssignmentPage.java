package com.project.actors;

import java.util.List;
import com.project.pages.ViewStepTherapyProgramAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewStepTherapyProgramAssignmentPage {
	
	@Steps
	ViewStepTherapyProgramAssignmentPage viewStepTherapyProgramAssignmentPage;
	
	@Step
	public void verifyStepTherapyProgramDetails(DataTable viewStepTherapyProgramData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewStepTherapyProgramData.raw();
		
		String strStepTherapyProgramDetails = ""; 
		String strStepTherapyProgramBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedStepTherapyProgram = viewAssignmentDetails.get(1).get(6);

		switch(strStepTherapyProgramBy.toUpperCase())
		{
			case "CUSTOMER":
				strStepTherapyProgramDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strStepTherapyProgramDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strStepTherapyProgramDetails = strDrugListID;
				break;
			case "CLIENT":
				strStepTherapyProgramDetails = strClient+"*"+strClientName;
				break;
		}
		
		strStepTherapyProgramDetails = strStepTherapyProgramDetails+"*"+strAssignedStepTherapyProgram;
		
		viewStepTherapyProgramAssignmentPage.verifyStepTherapyProgramDetails(strStepTherapyProgramDetails);
	}
}