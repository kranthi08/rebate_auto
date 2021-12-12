package com.project.actors;

import java.util.List;
import com.project.pages.AddFocusedUMBundleMiscellaneousAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddFocusedUMBundleMiscellaneousAssignmentPage {
	
	@Steps
	AddFocusedUMBundleMiscellaneousAssignmentPage addFocusedUMBundleMiscellaneousAssignmentPage;
	
	@Step
	public void submitFocusedUMBundleMiscellaneousAssignmentDetails(DataTable focusedUMBundleMiscellaneousAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleMiscellaneousAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignFocusedUMBundleMiscellaneousBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedFocusedUMBundleMiscellaneous = assignmentDetails.get(1).get(18);
		

		addFocusedUMBundleMiscellaneousAssignmentPage.verifyFocusedUMBundleMiscellaneousAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addFocusedUMBundleMiscellaneousAssignmentPage.selectAssignFocusedUMBundleMiscellaneousBy(strAssignFocusedUMBundleMiscellaneousBy);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addFocusedUMBundleMiscellaneousAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListID(strDrugListID);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListName(strDrugListName);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListType(strDrugListType);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addFocusedUMBundleMiscellaneousAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addFocusedUMBundleMiscellaneousAssignmentPage.enterClientNumber(strClientNumber);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterClientName(strClientName);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterClientStartDate(strClientStartDate);
				addFocusedUMBundleMiscellaneousAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addFocusedUMBundleMiscellaneousAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}					
				addFocusedUMBundleMiscellaneousAssignmentPage.selectAssignedFocusedUMBundleMiscellaneous(strAssignedFocusedUMBundleMiscellaneous);
				addFocusedUMBundleMiscellaneousAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addFocusedUMBundleMiscellaneousAssignmentPage.updateSelectedFocusedUMBundleMiscellaneous(strSelectedAssignment);
				addFocusedUMBundleMiscellaneousAssignmentPage.clickOnUpdateButton();
				addFocusedUMBundleMiscellaneousAssignmentPage.selectAssignedFocusedUMBundleMiscellaneous(strAssignedFocusedUMBundleMiscellaneous);
				addFocusedUMBundleMiscellaneousAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addFocusedUMBundleMiscellaneousAssignmentPage.updateSelectedFocusedUMBundleMiscellaneous(arrSelectedAssignment[i]);
				}			
				addFocusedUMBundleMiscellaneousAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedFocusedUMBundleMiscellaneousAssignmentDetails(DataTable selectedFocusedUMBundleMiscellaneousAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedFocusedUMBundleMiscellaneousAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignFocusedUMBundleMiscellaneousBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleMiscellaneous = assignmentDetails.get(1).get(6);

		switch(strAssignFocusedUMBundleMiscellaneousBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedFocusedUMBundleMiscellaneous;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedFocusedUMBundleMiscellaneous;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedFocusedUMBundleMiscellaneous;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedFocusedUMBundleMiscellaneous;
				break;
		}
		
		addFocusedUMBundleMiscellaneousAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}