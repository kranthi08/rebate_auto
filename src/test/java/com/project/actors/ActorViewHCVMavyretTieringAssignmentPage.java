package com.project.actors;

import java.util.List;
import com.project.pages.ViewHCVMavyretTieringAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewHCVMavyretTieringAssignmentPage {
	
	@Steps
	ViewHCVMavyretTieringAssignmentPage viewHCVMavyretTieringAssignmentPage;
	
	@Step
	public void verifyHCVMavyretTieringDetails(DataTable viewHCVMavyretTieringData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewHCVMavyretTieringData.raw();
		
		String strHCVMavyretTieringDetails = ""; 
		String strHCVMavyretTieringBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedHCVMavyretTiering = viewAssignmentDetails.get(1).get(6);

		switch(strHCVMavyretTieringBy.toUpperCase())
		{
			case "CUSTOMER":
				strHCVMavyretTieringDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strHCVMavyretTieringDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strHCVMavyretTieringDetails = strDrugListID;
				break;
			case "CLIENT":
				strHCVMavyretTieringDetails = strClient+"*"+strClientName;
				break;
		}
		
		strHCVMavyretTieringDetails = strHCVMavyretTieringDetails+"*"+strAssignedHCVMavyretTiering;
		
		viewHCVMavyretTieringAssignmentPage.verifyHCVMavyretTieringDetails(strHCVMavyretTieringDetails);
	}
}