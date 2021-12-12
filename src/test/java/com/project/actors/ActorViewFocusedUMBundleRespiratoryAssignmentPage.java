package com.project.actors;

import java.util.List;
import com.project.pages.ViewFocusedUMBundleRespiratoryAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewFocusedUMBundleRespiratoryAssignmentPage {
	
	@Steps
	ViewFocusedUMBundleRespiratoryAssignmentPage viewFocusedUMBundleRespiratoryAssignmentPage;
	
	@Step
	public void verifyFocusedUMBundleRespiratoryDetails(DataTable viewFocusedUMBundleRespiratoryData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewFocusedUMBundleRespiratoryData.raw();
		
		String strFocusedUMBundleRespiratoryDetails = ""; 
		String strFocusedUMBundleRespiratoryBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleRespiratory = viewAssignmentDetails.get(1).get(6);

		switch(strFocusedUMBundleRespiratoryBy.toUpperCase())
		{
			case "CUSTOMER":
				strFocusedUMBundleRespiratoryDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strFocusedUMBundleRespiratoryDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strFocusedUMBundleRespiratoryDetails = strDrugListID;
				break;
			case "CLIENT":
				strFocusedUMBundleRespiratoryDetails = strClient+"*"+strClientName;
				break;
		}
		
		strFocusedUMBundleRespiratoryDetails = strFocusedUMBundleRespiratoryDetails+"*"+strAssignedFocusedUMBundleRespiratory;
		
		viewFocusedUMBundleRespiratoryAssignmentPage.verifyFocusedUMBundleRespiratoryDetails(strFocusedUMBundleRespiratoryDetails);
	}
}