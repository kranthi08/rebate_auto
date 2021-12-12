package com.project.actors;

import java.util.List;
import com.project.pages.AddNumberOfTiersAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddNumberOfTiersAssignmentPage {
	
	@Steps
	AddNumberOfTiersAssignmentPage addNumberOfTiersAssignmentPage;
	
	@Step
	public void submitNumberOfTiersAssignmentDetails(DataTable numberOfTiersAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = numberOfTiersAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strNumberOfTiersAssignment = assignmentDetails.get(1).get(1);
		String strAssignNumberOfTiersBy  = assignmentDetails.get(1).get(2);
		String strCustomer = assignmentDetails.get(1).get(3);
		String strDrugList = assignmentDetails.get(1).get(4);
		String strNumberOfTiers = assignmentDetails.get(1).get(5);		

		addNumberOfTiersAssignmentPage.verifyNumberOfTiersAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addNumberOfTiersAssignmentPage.selectAssignNumberOfTiersBy(strAssignNumberOfTiersBy);
				addNumberOfTiersAssignmentPage.enterCustomer(strCustomer);	
				addNumberOfTiersAssignmentPage.enterDrugList(strDrugList);
				addNumberOfTiersAssignmentPage.enterNumberOfTiers(strNumberOfTiers);
				addNumberOfTiersAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addNumberOfTiersAssignmentPage.updateNumberOfTiersAssignment(strNumberOfTiersAssignment);
				addNumberOfTiersAssignmentPage.clickOnUpdateButton();
				addNumberOfTiersAssignmentPage.enterCustomer(strCustomer);
				addNumberOfTiersAssignmentPage.enterDrugList(strDrugList);
				addNumberOfTiersAssignmentPage.enterNumberOfTiers(strNumberOfTiers);
				addNumberOfTiersAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrNumberOfTiersAssignment = strNumberOfTiersAssignment.split("\\^",-1);
				
				for(int i=0;i<arrNumberOfTiersAssignment.length;i++)
				{
					addNumberOfTiersAssignmentPage.updateNumberOfTiersAssignment(arrNumberOfTiersAssignment[i]);
				}			
				addNumberOfTiersAssignmentPage.clickOnRemoveButton();				
				break;
		}
	}
	
	@Step
	public void verifyNumberOfTiersAssignmentDetails(DataTable numberOfTiersAssignmentDetails) throws Throwable {
		
		List<List<String>> assignmentDetails = numberOfTiersAssignmentDetails.raw();
		
		String strNumberOfTiersAssignmentDetails = "";
			
		String strAssignNumberOfTiersBy = assignmentDetails.get(1).get(0);
		String strCustomer  = assignmentDetails.get(1).get(1);
		String strDrugList = assignmentDetails.get(1).get(2);
		String strNumberOfTiers = assignmentDetails.get(1).get(3);

		switch(strAssignNumberOfTiersBy.toUpperCase())
		{
			case "CUSTOMER":
				strNumberOfTiersAssignmentDetails = strCustomer+"*"+strNumberOfTiers;
				break;
			case "DRUG LIST":
				strNumberOfTiersAssignmentDetails = strDrugList+"*"+strNumberOfTiers;
				break;
		}
		
		addNumberOfTiersAssignmentPage.verifyNumberOfTiersAssignmentDetails(strNumberOfTiersAssignmentDetails);
	}
}