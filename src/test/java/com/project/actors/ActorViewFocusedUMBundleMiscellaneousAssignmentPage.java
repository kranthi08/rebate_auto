package com.project.actors;

import java.util.List;
import com.project.pages.ViewFocusedUMBundleMiscellaneousAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewFocusedUMBundleMiscellaneousAssignmentPage {
	
	@Steps
	ViewFocusedUMBundleMiscellaneousAssignmentPage viewFocusedUMBundleMiscellaneousAssignmentPage;
	
	@Step
	public void verifyFocusedUMBundleMiscellaneousDetails(DataTable viewFocusedUMBundleMiscellaneousData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewFocusedUMBundleMiscellaneousData.raw();
		
		String strFocusedUMBundleMiscellaneousDetails = ""; 
		String strFocusedUMBundleMiscellaneousBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleMiscellaneous = viewAssignmentDetails.get(1).get(6);

		switch(strFocusedUMBundleMiscellaneousBy.toUpperCase())
		{
			case "CUSTOMER":
				strFocusedUMBundleMiscellaneousDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strFocusedUMBundleMiscellaneousDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strFocusedUMBundleMiscellaneousDetails = strDrugListID;
				break;
			case "CLIENT":
				strFocusedUMBundleMiscellaneousDetails = strClient+"*"+strClientName;
				break;
		}
		
		strFocusedUMBundleMiscellaneousDetails = strFocusedUMBundleMiscellaneousDetails+"*"+strAssignedFocusedUMBundleMiscellaneous;
		
		viewFocusedUMBundleMiscellaneousAssignmentPage.verifyFocusedUMBundleMiscellaneousDetails(strFocusedUMBundleMiscellaneousDetails);
	}
}