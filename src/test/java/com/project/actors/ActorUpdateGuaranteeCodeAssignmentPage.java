package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateGuaranteeCodeAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateGuaranteeCodeAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateGuaranteeCodeAssignmentPage updateGuaranteeCodeAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateGuaranteeCodeAssignmentDetails(DataTable guaranteeCodeAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = guaranteeCodeAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strGuaranteeCodeAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignGuaranteeCodeBy  = assignmentDetails.get(iteration).get(2);
			String strCustomer = assignmentDetails.get(iteration).get(3);
			String strClient = assignmentDetails.get(iteration).get(4);
			String strDrugList = assignmentDetails.get(iteration).get(5);
			String strGuaranteeCode = assignmentDetails.get(iteration).get(6);
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateGuaranteeCodeAssignmentPage.selectAssignGuaranteeCodeBy(strAssignGuaranteeCodeBy);
					updateGuaranteeCodeAssignmentPage.enterCustomer(strCustomer);	
					updateGuaranteeCodeAssignmentPage.enterClient(strClient);
					updateGuaranteeCodeAssignmentPage.enterDrugList(strDrugList);
					updateGuaranteeCodeAssignmentPage.enterGuaranteeCode(strGuaranteeCode);
					updateGuaranteeCodeAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateGuaranteeCodeAssignmentPage.updateGuaranteeCodeAssignment(strGuaranteeCodeAssignment);
					updateGuaranteeCodeAssignmentPage.clickOnUpdateButton();
					updateGuaranteeCodeAssignmentPage.enterCustomer(strCustomer);
					updateGuaranteeCodeAssignmentPage.enterClient(strClient);
					updateGuaranteeCodeAssignmentPage.enterDrugList(strDrugList);
					updateGuaranteeCodeAssignmentPage.enterGuaranteeCode(strGuaranteeCode);
					updateGuaranteeCodeAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strGuaranteeCodeAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateGuaranteeCodeAssignmentPage.updateGuaranteeCodeAssignment(arrSelectedAssignment[i]);
					}			
					updateGuaranteeCodeAssignmentPage.clickOnRemoveButton();				
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}