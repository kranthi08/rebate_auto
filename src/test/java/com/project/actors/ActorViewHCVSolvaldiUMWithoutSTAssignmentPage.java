package com.project.actors;

import java.util.List;
import com.project.pages.ViewHCVSolvaldiUMWithoutSTAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewHCVSolvaldiUMWithoutSTAssignmentPage {
	
	@Steps
	ViewHCVSolvaldiUMWithoutSTAssignmentPage viewHCVSolvaldiUMWithoutSTAssignmentPage;
	
	@Step
	public void verifyHCVSolvaldiUMWithoutSTDetails(DataTable viewHCVSolvaldiUMWithoutSTData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewHCVSolvaldiUMWithoutSTData.raw();
		
		String strHCVSolvaldiUMWithoutSTDetails = ""; 
		String strHCVSolvaldiUMWithoutSTBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedHCVSolvaldiUMWithoutST = viewAssignmentDetails.get(1).get(6);

		switch(strHCVSolvaldiUMWithoutSTBy.toUpperCase())
		{
			case "CUSTOMER":
				strHCVSolvaldiUMWithoutSTDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strHCVSolvaldiUMWithoutSTDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strHCVSolvaldiUMWithoutSTDetails = strDrugListID;
				break;
			case "CLIENT":
				strHCVSolvaldiUMWithoutSTDetails = strClient+"*"+strClientName;
				break;
		}
		
		strHCVSolvaldiUMWithoutSTDetails = strHCVSolvaldiUMWithoutSTDetails+"*"+strAssignedHCVSolvaldiUMWithoutST;
		
		viewHCVSolvaldiUMWithoutSTAssignmentPage.verifyHCVSolvaldiUMWithoutSTDetails(strHCVSolvaldiUMWithoutSTDetails);
	}
}