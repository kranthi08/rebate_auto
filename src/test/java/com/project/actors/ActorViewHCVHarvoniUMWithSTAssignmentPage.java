package com.project.actors;

import java.util.List;
import com.project.pages.ViewHCVHarvoniUMWithSTAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewHCVHarvoniUMWithSTAssignmentPage {
	
	@Steps
	ViewHCVHarvoniUMWithSTAssignmentPage viewHCVHarvoniUMWithSTAssignmentPage;
	
	@Step
	public void verifyHCVHarvoniUMWithSTDetails(DataTable viewHCVHarvoniUMWithSTData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewHCVHarvoniUMWithSTData.raw();
		
		String strHCVHarvoniUMWithSTDetails = ""; 
		String strHCVHarvoniUMWithSTBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedHCVHarvoniUMWithST = viewAssignmentDetails.get(1).get(6);

		switch(strHCVHarvoniUMWithSTBy.toUpperCase())
		{
			case "CUSTOMER":
				strHCVHarvoniUMWithSTDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strHCVHarvoniUMWithSTDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strHCVHarvoniUMWithSTDetails = strDrugListID;
				break;
			case "CLIENT":
				strHCVHarvoniUMWithSTDetails = strClient+"*"+strClientName;
				break;
		}
		
		strHCVHarvoniUMWithSTDetails = strHCVHarvoniUMWithSTDetails+"*"+strAssignedHCVHarvoniUMWithST;
		
		viewHCVHarvoniUMWithSTAssignmentPage.verifyHCVHarvoniUMWithSTDetails(strHCVHarvoniUMWithSTDetails);
	}
}