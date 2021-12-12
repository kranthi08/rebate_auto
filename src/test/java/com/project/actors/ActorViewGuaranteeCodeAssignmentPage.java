package com.project.actors;

import java.util.List;
import com.project.pages.ViewGuaranteeCodeAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewGuaranteeCodeAssignmentPage {
	
	@Steps
	ViewGuaranteeCodeAssignmentPage viewGuaranteeCodeAssignmentPage;
	
	@Step
	public void verifyGuaranteeCodeAssignmentDetails(DataTable viewGuaranteeCodeAssignmentData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewGuaranteeCodeAssignmentData.raw();
		
		String strGuaranteeCodeAssignmentDetails = ""; 
		String strGuaranteeCodeBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strClient = viewAssignmentDetails.get(1).get(2);
		String strDrugList = viewAssignmentDetails.get(1).get(3);
		String strGuaranteeCode = viewAssignmentDetails.get(1).get(4);
		
		switch(strGuaranteeCodeBy.toUpperCase())
		{
			case "CUSTOMER":
				strGuaranteeCodeAssignmentDetails = strCustomer;				
				break;
			case "CLIENT":
				strGuaranteeCodeAssignmentDetails = strClient;
				break;
			case "DRUG LIST":
				strGuaranteeCodeAssignmentDetails = strDrugList;
				break;
		}
		
		strGuaranteeCodeAssignmentDetails = strGuaranteeCodeAssignmentDetails+"*"+strGuaranteeCode;
		
		viewGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentDetails(strGuaranteeCodeAssignmentDetails);
	}
}