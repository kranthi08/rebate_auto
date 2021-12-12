package com.project.actors;

import java.util.List;

import com.project.pages.AddPriorAuthorizationProgramAssignmentPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddPriorAuthorizationProgramAssignmentPage {
	
	@Steps
	AddPriorAuthorizationProgramAssignmentPage addPriorAuthorizationProgramAssignmentPage;
	
	@Step
	public void submitPriorAuthorizationProgramAssignmentDetails(DataTable priorAuthorizationProgramAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = priorAuthorizationProgramAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignPriorAuthorizationProgramBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedPriorAuthorizationProgram = assignmentDetails.get(1).get(18);		

		addPriorAuthorizationProgramAssignmentPage.verifyPriorAuthorizationProgramAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addPriorAuthorizationProgramAssignmentPage.selectAssignPriorAuthorizationProgramBy(strAssignPriorAuthorizationProgramBy);
				addPriorAuthorizationProgramAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addPriorAuthorizationProgramAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addPriorAuthorizationProgramAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addPriorAuthorizationProgramAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addPriorAuthorizationProgramAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addPriorAuthorizationProgramAssignmentPage.enterDrugListID(strDrugListID);
				addPriorAuthorizationProgramAssignmentPage.enterDrugListName(strDrugListName);
				addPriorAuthorizationProgramAssignmentPage.enterDrugListType(strDrugListType);
				addPriorAuthorizationProgramAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addPriorAuthorizationProgramAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addPriorAuthorizationProgramAssignmentPage.enterClientNumber(strClientNumber);
				addPriorAuthorizationProgramAssignmentPage.enterClientName(strClientName);
				addPriorAuthorizationProgramAssignmentPage.enterClientStartDate(strClientStartDate);
				addPriorAuthorizationProgramAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addPriorAuthorizationProgramAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addPriorAuthorizationProgramAssignmentPage.selectAssignedPriorAuthorizationProgram(strAssignedPriorAuthorizationProgram);
				addPriorAuthorizationProgramAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addPriorAuthorizationProgramAssignmentPage.updateSelectedPriorAuthorizationProgram(strSelectedAssignment);
				addPriorAuthorizationProgramAssignmentPage.clickOnUpdateButton();
				addPriorAuthorizationProgramAssignmentPage.selectAssignedPriorAuthorizationProgram(strAssignedPriorAuthorizationProgram);
				addPriorAuthorizationProgramAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addPriorAuthorizationProgramAssignmentPage.updateSelectedPriorAuthorizationProgram(arrSelectedAssignment[i]);
				}			
				addPriorAuthorizationProgramAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedPriorAuthorizationProgramAssignmentDetails(DataTable selectedPriorAuthorizationProgramAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedPriorAuthorizationProgramAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignPriorAuthorizationProgramBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedPriorAuthorizationProgram = assignmentDetails.get(1).get(6);

		switch(strAssignPriorAuthorizationProgramBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedPriorAuthorizationProgram;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedPriorAuthorizationProgram;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedPriorAuthorizationProgram;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedPriorAuthorizationProgram;
				break;
		}
		
		addPriorAuthorizationProgramAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}