package com.project.actors;

import java.util.List;
import com.project.pages.AddTierDescriptionAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddTierDescriptionAssignmentPage {
	
	@Steps
	AddTierDescriptionAssignmentPage addTierDescriptionAssignmentPage;
	
	@Step
	public void submitTierDescriptionAssignmentDetails(DataTable tierDescriptionAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = tierDescriptionAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strTierDescriptionAssignment = assignmentDetails.get(1).get(6);
		String strAssignTierDescriptionBy  = assignmentDetails.get(1).get(2);
		String strCustomer = assignmentDetails.get(1).get(3);
		String strDrugList = assignmentDetails.get(1).get(4);
		String strTier = assignmentDetails.get(1).get(5);
		String strDescription = assignmentDetails.get(1).get(6);		

		addTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addTierDescriptionAssignmentPage.selectAssignTierDescriptionBy(strAssignTierDescriptionBy);
				addTierDescriptionAssignmentPage.enterCustomer(strCustomer);	
				addTierDescriptionAssignmentPage.enterDrugList(strDrugList);
				addTierDescriptionAssignmentPage.selectTier(strTier);
				addTierDescriptionAssignmentPage.selectDescription(strDescription);
				addTierDescriptionAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addTierDescriptionAssignmentPage.updateTierDescriptionAssignment(strTierDescriptionAssignment);
				addTierDescriptionAssignmentPage.clickOnUpdateButton();
				addTierDescriptionAssignmentPage.enterCustomer(strCustomer);
				addTierDescriptionAssignmentPage.enterDrugList(strDrugList);
				addTierDescriptionAssignmentPage.selectTier(strTier);
				addTierDescriptionAssignmentPage.selectDescription(strDescription);
				addTierDescriptionAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strTierDescriptionAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addTierDescriptionAssignmentPage.updateTierDescriptionAssignment(arrSelectedAssignment[i]);
				}			
				addTierDescriptionAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifyTierDescriptionAssignmentDetails(DataTable tierDescriptionAssignmentDetails) throws Throwable {
		
		List<List<String>> assignmentDetails = tierDescriptionAssignmentDetails.raw();
		
		String strTierDescriptionAssignmentDetails = "";
		
		String strAssignTierDescriptionBy = assignmentDetails.get(1).get(0);
		String strCustomer  = assignmentDetails.get(1).get(1);
		String strDrugList = assignmentDetails.get(1).get(2);
		String strTier = assignmentDetails.get(1).get(3);
		String strDescription = assignmentDetails.get(1).get(4);

		switch(strAssignTierDescriptionBy.toUpperCase())
		{
			case "CUSTOMER":
				strTierDescriptionAssignmentDetails = strCustomer+"*"+strTier+"*"+strDescription;
				break;
			case "DRUG LIST":
				strTierDescriptionAssignmentDetails = strDrugList+"*"+strTier+"*"+strDescription;
				break;
		}
		
		addTierDescriptionAssignmentPage.verifyTierDescriptionAssignmentDetails(strTierDescriptionAssignmentDetails);
	}
}