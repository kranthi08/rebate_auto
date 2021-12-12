package com.project.actors;

import java.util.List;
import com.project.pages.AddStepTherapyProgramAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddStepTherapyProgramAssignmentPage {
	
	@Steps
	AddStepTherapyProgramAssignmentPage addStepTherapyProgramAssignmentPage;
	
	@Step
	public void submitStepTherapyProgramAssignmentDetails(DataTable stepTherapyProgramAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = stepTherapyProgramAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignStepTherapyProgramBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedStepTherapyProgram = assignmentDetails.get(1).get(18);		

		addStepTherapyProgramAssignmentPage.verifyStepTherapyProgramAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addStepTherapyProgramAssignmentPage.selectAssignStepTherapyProgramBy(strAssignStepTherapyProgramBy);
				addStepTherapyProgramAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addStepTherapyProgramAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addStepTherapyProgramAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addStepTherapyProgramAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addStepTherapyProgramAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addStepTherapyProgramAssignmentPage.enterDrugListID(strDrugListID);
				addStepTherapyProgramAssignmentPage.enterDrugListName(strDrugListName);
				addStepTherapyProgramAssignmentPage.enterDrugListType(strDrugListType);
				addStepTherapyProgramAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addStepTherapyProgramAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addStepTherapyProgramAssignmentPage.enterClientNumber(strClientNumber);
				addStepTherapyProgramAssignmentPage.enterClientName(strClientName);
				addStepTherapyProgramAssignmentPage.enterClientStartDate(strClientStartDate);
				addStepTherapyProgramAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addStepTherapyProgramAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addStepTherapyProgramAssignmentPage.selectAssignedStepTherapyProgram(strAssignedStepTherapyProgram);
				addStepTherapyProgramAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addStepTherapyProgramAssignmentPage.updateSelectedStepTherapyProgram(strSelectedAssignment);
				addStepTherapyProgramAssignmentPage.clickOnUpdateButton();
				addStepTherapyProgramAssignmentPage.selectAssignedStepTherapyProgram(strAssignedStepTherapyProgram);
				addStepTherapyProgramAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addStepTherapyProgramAssignmentPage.updateSelectedStepTherapyProgram(arrSelectedAssignment[i]);
				}			
				addStepTherapyProgramAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedStepTherapyProgramAssignmentDetails(DataTable selectedStepTherapyProgramAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedStepTherapyProgramAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignStepTherapyProgramBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedStepTherapyProgram = assignmentDetails.get(1).get(6);

		switch(strAssignStepTherapyProgramBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedStepTherapyProgram;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedStepTherapyProgram;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedStepTherapyProgram;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedStepTherapyProgram;
				break;
		}
		
		addStepTherapyProgramAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}