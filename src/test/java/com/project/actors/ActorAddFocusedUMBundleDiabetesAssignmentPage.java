package com.project.actors;

import java.util.List;
import com.project.pages.AddFocusedUMBundleDiabetesAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddFocusedUMBundleDiabetesAssignmentPage {
	
	@Steps
	AddFocusedUMBundleDiabetesAssignmentPage addFocusedUMBundleDiabetesAssignmentPage;
	
	@Step
	public void submitFocusedUMBundleDiabetesAssignmentDetails(DataTable focusedUMBundleDiabetesAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleDiabetesAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignFocusedUMBundleDiabetesBy  = assignmentDetails.get(1).get(2);
		String strCoverageCode1 = assignmentDetails.get(1).get(3);
		String strCoverageCode2 = assignmentDetails.get(1).get(4);
		String strCoverageCodeDescription = assignmentDetails.get(1).get(5);
		String strCoverageCodeStatus = assignmentDetails.get(1).get(6);
		String strAvailableCoverageCodes = assignmentDetails.get(1).get(7);
		String strDrugListID = assignmentDetails.get(1).get(8);
		String strDrugListName = assignmentDetails.get(1).get(9);
		String strDrugListType = assignmentDetails.get(1).get(10);
		String strDrugListStatus = assignmentDetails.get(1).get(11);
		String strAvailableDrugLists = assignmentDetails.get(1).get(12);
		String strClientNumber = assignmentDetails.get(1).get(13);
		String strClientName = assignmentDetails.get(1).get(14);
		String strClientStartDate = assignmentDetails.get(1).get(15);
		String strClientEndDate = assignmentDetails.get(1).get(16);
		String strAvailableClients = assignmentDetails.get(1).get(17);
		String strAssignedFocusedUMBundleDiabetes = assignmentDetails.get(1).get(18);		

		addFocusedUMBundleDiabetesAssignmentPage.verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addFocusedUMBundleDiabetesAssignmentPage.selectAssignFocusedUMBundleDiabetesBy(strAssignFocusedUMBundleDiabetesBy);
				addFocusedUMBundleDiabetesAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addFocusedUMBundleDiabetesAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addFocusedUMBundleDiabetesAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addFocusedUMBundleDiabetesAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addFocusedUMBundleDiabetesAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addFocusedUMBundleDiabetesAssignmentPage.enterDrugListID(strDrugListID);
				addFocusedUMBundleDiabetesAssignmentPage.enterDrugListName(strDrugListName);
				addFocusedUMBundleDiabetesAssignmentPage.enterDrugListType(strDrugListType);
				addFocusedUMBundleDiabetesAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addFocusedUMBundleDiabetesAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addFocusedUMBundleDiabetesAssignmentPage.enterClientNumber(strClientNumber);
				addFocusedUMBundleDiabetesAssignmentPage.enterClientName(strClientName);
				addFocusedUMBundleDiabetesAssignmentPage.enterClientStartDate(strClientStartDate);
				addFocusedUMBundleDiabetesAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addFocusedUMBundleDiabetesAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addFocusedUMBundleDiabetesAssignmentPage.selectAssignedFocusedUMBundleDiabetes(strAssignedFocusedUMBundleDiabetes);
				addFocusedUMBundleDiabetesAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addFocusedUMBundleDiabetesAssignmentPage.updateSelectedFocusedUMBundleDiabetes(strSelectedAssignment);
				addFocusedUMBundleDiabetesAssignmentPage.clickOnUpdateButton();
				addFocusedUMBundleDiabetesAssignmentPage.selectAssignedFocusedUMBundleDiabetes(strAssignedFocusedUMBundleDiabetes);
				addFocusedUMBundleDiabetesAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addFocusedUMBundleDiabetesAssignmentPage.updateSelectedFocusedUMBundleDiabetes(arrSelectedAssignment[i]);
				}			
				addFocusedUMBundleDiabetesAssignmentPage.clickOnRemoveButton();
				break;
		}		
	}
	
	@Step
	public void verifySelectedFocusedUMBundleDiabetesAssignmentDetails(DataTable selectedFocusedUMBundleDiabetesAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedFocusedUMBundleDiabetesAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignFocusedUMBundleDiabetesBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleDiabetes = assignmentDetails.get(1).get(6);

		switch(strAssignFocusedUMBundleDiabetesBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedFocusedUMBundleDiabetes;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedFocusedUMBundleDiabetes;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedFocusedUMBundleDiabetes;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedFocusedUMBundleDiabetes;
				break;
		}
		
		addFocusedUMBundleDiabetesAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}