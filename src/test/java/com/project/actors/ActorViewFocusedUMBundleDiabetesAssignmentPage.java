package com.project.actors;

import java.util.List;
import com.project.pages.ViewFocusedUMBundleDiabetesAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewFocusedUMBundleDiabetesAssignmentPage {
	
	@Steps
	ViewFocusedUMBundleDiabetesAssignmentPage viewFocusedUMBundleDiabetesAssignmentPage;
	
	@Step
	public void verifyFocusedUMBundleDiabetesDetails(DataTable viewFocusedUMBundleDiabetesData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewFocusedUMBundleDiabetesData.raw();
		
		String strFocusedUMBundleDiabetesDetails = ""; 
		String strFocusedUMBundleDiabetesBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleDiabetes = viewAssignmentDetails.get(1).get(6);

		switch(strFocusedUMBundleDiabetesBy.toUpperCase())
		{
			case "CUSTOMER":
				strFocusedUMBundleDiabetesDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strFocusedUMBundleDiabetesDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strFocusedUMBundleDiabetesDetails = strDrugListID;
				break;
			case "CLIENT":
				strFocusedUMBundleDiabetesDetails = strClient+"*"+strClientName;
				break;
		}
		
		strFocusedUMBundleDiabetesDetails = strFocusedUMBundleDiabetesDetails+"*"+strAssignedFocusedUMBundleDiabetes;
		
		viewFocusedUMBundleDiabetesAssignmentPage.verifyFocusedUMBundleDiabetesDetails(strFocusedUMBundleDiabetesDetails);
	}
}