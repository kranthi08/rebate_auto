package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateNumberOfTiersAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateNumberOfTiersAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateNumberOfTiersAssignmentPage updateNumberOfTiersAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateNumberOfTiersAssignmentDetails(DataTable numberOfTiersAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = numberOfTiersAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateNumberOfTiersAssignmentPage.verifyNumberOfTiersAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strNumberOfTiersAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignNumberOfTiersBy  = assignmentDetails.get(iteration).get(2);
			String strCustomer = assignmentDetails.get(iteration).get(3);
			String strDrugList = assignmentDetails.get(iteration).get(4);
			String strNumberOfTiers = assignmentDetails.get(iteration).get(5);	
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateNumberOfTiersAssignmentPage.selectAssignNumberOfTiersBy(strAssignNumberOfTiersBy);
					updateNumberOfTiersAssignmentPage.enterCustomer(strCustomer);	
					updateNumberOfTiersAssignmentPage.enterDrugList(strDrugList);
					updateNumberOfTiersAssignmentPage.enterNumberOfTiers(strNumberOfTiers);
					updateNumberOfTiersAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateNumberOfTiersAssignmentPage.updateNumberOfTiersAssignment(strNumberOfTiersAssignment);
					updateNumberOfTiersAssignmentPage.clickOnUpdateButton();
					updateNumberOfTiersAssignmentPage.enterCustomer(strCustomer);
					updateNumberOfTiersAssignmentPage.enterDrugList(strDrugList);
					updateNumberOfTiersAssignmentPage.enterNumberOfTiers(strNumberOfTiers);
					updateNumberOfTiersAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrNumberOfTiersAssignment = strNumberOfTiersAssignment.split("\\^",-1);
					
					for(int i=0;i<arrNumberOfTiersAssignment.length;i++)
					{
						updateNumberOfTiersAssignmentPage.updateNumberOfTiersAssignment(arrNumberOfTiersAssignment[i]);
					}			
					updateNumberOfTiersAssignmentPage.clickOnRemoveButton();				
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}