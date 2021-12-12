package com.project.actors;

import java.util.List;
import com.project.pages.ViewTierDescriptionAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewTierDescriptionAssignmentPage {
	
	@Steps
	ViewTierDescriptionAssignmentPage viewTierDescriptionAssignmentPage;
	
	@Step
	public void verifyTierDescriptionAssignmentDetails(DataTable viewTierDescriptionAssignmentData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewTierDescriptionAssignmentData.raw();
		
		String strTierDescriptionAssignmentDetails = ""; 
		String strTierDescriptionBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strDrugList = viewAssignmentDetails.get(1).get(2);
		String strTier = viewAssignmentDetails.get(1).get(3);
		String strDescription = viewAssignmentDetails.get(1).get(4);
		
		switch(strTierDescriptionBy.toUpperCase())
		{
			case "CUSTOMER":
				strTierDescriptionAssignmentDetails = strCustomer;				
				break;
			case "DRUG LIST":
				strTierDescriptionAssignmentDetails = strDrugList;
				break;
		}
		
		strTierDescriptionAssignmentDetails = strTierDescriptionAssignmentDetails+"*"+strTier+"*"+strDescription;
		
		viewTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentDetails(strTierDescriptionAssignmentDetails);
	}
}