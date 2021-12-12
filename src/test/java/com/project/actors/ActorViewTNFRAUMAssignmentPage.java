package com.project.actors;

import java.util.List;

import com.project.pages.ViewTNFRAUMAssignmentPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewTNFRAUMAssignmentPage {
	
	@Steps
	ViewTNFRAUMAssignmentPage viewTNFRAUMAssignmentPage;
	
	@Step
	public void verifyTNFRAUMDetails(DataTable viewTNFRAUMData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewTNFRAUMData.raw();
		
		String strTNFRAUMDetails = ""; 
		String strTNFRAUMBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedTNFRAUM = viewAssignmentDetails.get(1).get(6);

		switch(strTNFRAUMBy.toUpperCase())
		{
			case "CUSTOMER":
				strTNFRAUMDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strTNFRAUMDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strTNFRAUMDetails = strDrugListID;
				break;
			case "CLIENT":
				strTNFRAUMDetails = strClient+"*"+strClientName;
				break;
		}
		
		strTNFRAUMDetails = strTNFRAUMDetails+"*"+strAssignedTNFRAUM;
		
		viewTNFRAUMAssignmentPage.verifyTNFRAUMDetails(strTNFRAUMDetails);
	}
}