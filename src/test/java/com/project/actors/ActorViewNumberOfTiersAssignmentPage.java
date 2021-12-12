package com.project.actors;

import java.util.List;
import com.project.pages.ViewNumberOfTiersAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewNumberOfTiersAssignmentPage {
	
	@Steps
	ViewNumberOfTiersAssignmentPage viewNumberOfTiersAssignmentPage;
	
	@Step
	public void verifyNumberOfTiersAssignmentDetails(DataTable viewNumberOfTiersAssignmentData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewNumberOfTiersAssignmentData.raw();
		
		String strNumberOfTiersAssignmentDetails = ""; 
		String strstrNumberOfTiersBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strDrugList = viewAssignmentDetails.get(1).get(2);
		String strNumberOfTiers = viewAssignmentDetails.get(1).get(3);
		
		switch(strstrNumberOfTiersBy.toUpperCase())
		{
			case "CUSTOMER":
				strNumberOfTiersAssignmentDetails = strCustomer;				
				break;
			case "DRUG LIST":
				strNumberOfTiersAssignmentDetails = strDrugList;
				break;
		}
		
		strNumberOfTiersAssignmentDetails = strNumberOfTiersAssignmentDetails+"*"+strNumberOfTiers;
		
		viewNumberOfTiersAssignmentPage.verifyNumberOfTiersAssignmentDetails(strNumberOfTiersAssignmentDetails);
	}
}