package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateTierDescriptionAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateTierDescriptionAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateTierDescriptionAssignmentPage updateTierDescriptionAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateTierDescriptionAssignmentDetails(DataTable tierDescriptionAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = tierDescriptionAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strTierDescriptionAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignTierDescriptionBy  = assignmentDetails.get(iteration).get(2);
			String strCustomer = assignmentDetails.get(iteration).get(3);
			String strDrugList = assignmentDetails.get(iteration).get(4);
			String strTier = assignmentDetails.get(iteration).get(5);
			String strDescription = assignmentDetails.get(iteration).get(6);			
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateTierDescriptionAssignmentPage.selectAssignTierDescriptionBy(strAssignTierDescriptionBy);
					updateTierDescriptionAssignmentPage.enterCustomer(strCustomer);	
					updateTierDescriptionAssignmentPage.enterDrugList(strDrugList);
					updateTierDescriptionAssignmentPage.selectTier(strTier);
					updateTierDescriptionAssignmentPage.selectDescription(strDescription);
					updateTierDescriptionAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateTierDescriptionAssignmentPage.updateTierDescriptionAssignment(strTierDescriptionAssignment);
					updateTierDescriptionAssignmentPage.clickOnUpdateButton();
					updateTierDescriptionAssignmentPage.enterCustomer(strCustomer);
					updateTierDescriptionAssignmentPage.enterDrugList(strDrugList);
					updateTierDescriptionAssignmentPage.selectTier(strTier);
					updateTierDescriptionAssignmentPage.selectDescription(strDescription);
					updateTierDescriptionAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strTierDescriptionAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateTierDescriptionAssignmentPage.updateTierDescriptionAssignment(arrSelectedAssignment[i]);
					}			
					updateTierDescriptionAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}