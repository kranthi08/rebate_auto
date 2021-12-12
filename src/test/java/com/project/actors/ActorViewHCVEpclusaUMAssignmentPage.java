package com.project.actors;

import java.util.List;
import com.project.pages.ViewHCVEpclusaUMAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewHCVEpclusaUMAssignmentPage {
	
	@Steps
	ViewHCVEpclusaUMAssignmentPage viewHCVEpclusaUMAssignmentPage;
	
	@Step
	public void verifyHCVEpclusaUMDetails(DataTable viewHCVEpclusaUMData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewHCVEpclusaUMData.raw();
		
		String strHCVEpclusaUMDetails = ""; 
		String strHCVEpclusaUMBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedHCVEpclusaUM = viewAssignmentDetails.get(1).get(6);

		switch(strHCVEpclusaUMBy.toUpperCase())
		{
			case "CUSTOMER":
				strHCVEpclusaUMDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strHCVEpclusaUMDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strHCVEpclusaUMDetails = strDrugListID;
				break;
			case "CLIENT":
				strHCVEpclusaUMDetails = strClient+"*"+strClientName;
				break;
		}
		
		strHCVEpclusaUMDetails = strHCVEpclusaUMDetails+"*"+strAssignedHCVEpclusaUM;
		
		viewHCVEpclusaUMAssignmentPage.verifyHCVEpclusaUMDetails(strHCVEpclusaUMDetails);
	}
}