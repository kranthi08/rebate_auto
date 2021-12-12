package com.project.actors;

import java.util.List;
import com.project.pages.ViewFocusedUMBundleSpecialtyAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewFocusedUMBundleSpecialtyAssignmentPage {
	
	@Steps
	ViewFocusedUMBundleSpecialtyAssignmentPage viewFocusedUMBundleSpecialtyAssignmentPage;
	
	@Step
	public void verifyFocusedUMBundleSpecialtyDetails(DataTable viewFocusedUMBundleSpecialtyData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewFocusedUMBundleSpecialtyData.raw();
		
		String strFocusedUMBundleSpecialtyDetails = ""; 
		String strFocusedUMBundleSpecialtyBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleSpecialty = viewAssignmentDetails.get(1).get(6);

		switch(strFocusedUMBundleSpecialtyBy.toUpperCase())
		{
			case "CUSTOMER":
				strFocusedUMBundleSpecialtyDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strFocusedUMBundleSpecialtyDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strFocusedUMBundleSpecialtyDetails = strDrugListID;
				break;
			case "CLIENT":
				strFocusedUMBundleSpecialtyDetails = strClient+"*"+strClientName;
				break;
		}
		
		strFocusedUMBundleSpecialtyDetails = strFocusedUMBundleSpecialtyDetails+"*"+strAssignedFocusedUMBundleSpecialty;
		
		viewFocusedUMBundleSpecialtyAssignmentPage.verifyFocusedUMBundleSpecialtyDetails(strFocusedUMBundleSpecialtyDetails);
	}
}