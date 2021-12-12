package com.project.actors;

import java.util.List;
import com.project.pages.AddGuaranteeCodeAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddGuaranteeCodeAssignmentPage {
	
	@Steps
	AddGuaranteeCodeAssignmentPage addGuaranteeCodeAssignmentPage;
	
	@Step
	public void submitGuaranteeCodeAssignmentDetails(DataTable guaranteeCodeAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = guaranteeCodeAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strGuaranteeCodeAssignment = assignmentDetails.get(1).get(1);
		String strAssignGuaranteeCodeBy  = assignmentDetails.get(1).get(2);
		String strCustomer = assignmentDetails.get(1).get(3);
		String strClient = assignmentDetails.get(1).get(4);
		String strDrugList = assignmentDetails.get(1).get(5);
		String strGuaranteeCode = assignmentDetails.get(1).get(6);		

		addGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addGuaranteeCodeAssignmentPage.selectAssignGuaranteeCodeBy(strAssignGuaranteeCodeBy);
				addGuaranteeCodeAssignmentPage.enterCustomer(strCustomer);	
				addGuaranteeCodeAssignmentPage.enterClient(strClient);
				addGuaranteeCodeAssignmentPage.enterDrugList(strDrugList);
				addGuaranteeCodeAssignmentPage.enterGuaranteeCode(strGuaranteeCode);
				addGuaranteeCodeAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addGuaranteeCodeAssignmentPage.updateGuaranteeCodeAssignment(strGuaranteeCodeAssignment);
				addGuaranteeCodeAssignmentPage.clickOnUpdateButton();
				addGuaranteeCodeAssignmentPage.enterCustomer(strCustomer);
				addGuaranteeCodeAssignmentPage.enterClient(strClient);
				addGuaranteeCodeAssignmentPage.enterDrugList(strDrugList);
				addGuaranteeCodeAssignmentPage.enterGuaranteeCode(strGuaranteeCode);
				addGuaranteeCodeAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strGuaranteeCodeAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addGuaranteeCodeAssignmentPage.updateGuaranteeCodeAssignment(arrSelectedAssignment[i]);
				}			
				addGuaranteeCodeAssignmentPage.clickOnRemoveButton();				
				break;
		}
	}
	
	@Step
	public void verifyGuaranteeCodeAssignmentDetails(DataTable guaranteeCodeAssignmentDetails) throws Throwable {
		
		List<List<String>> assignmentDetails = guaranteeCodeAssignmentDetails.raw();
		
		String strGuaranteeCodeAssignmentDetails = "";
		
		String strAssignGuaranteeCodeBy = assignmentDetails.get(1).get(0);
		String strCustomer  = assignmentDetails.get(1).get(1);
		String strClient = assignmentDetails.get(1).get(2);
		String strDrugList = assignmentDetails.get(1).get(3);
		String strGuaranteeCode = assignmentDetails.get(1).get(4);

		switch(strAssignGuaranteeCodeBy.toUpperCase())
		{
			case "CUSTOMER":
				strGuaranteeCodeAssignmentDetails = strCustomer+"*"+strGuaranteeCode;
				break;
			case "CLIENT":
				strGuaranteeCodeAssignmentDetails = strClient+"*"+strGuaranteeCode;
				break;
			case "DRUG LIST":
				strGuaranteeCodeAssignmentDetails = strDrugList+"*"+strGuaranteeCode;
				break;
		}
		
		addGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentDetails(strGuaranteeCodeAssignmentDetails);
	}
}