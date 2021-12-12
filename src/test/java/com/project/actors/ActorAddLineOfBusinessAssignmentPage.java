package com.project.actors;

import java.util.List;
import com.project.pages.AddLineOfBusinessAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddLineOfBusinessAssignmentPage {
	
	@Steps
	AddLineOfBusinessAssignmentPage addLineOfBusinessAssignmentPage;
	
	@Step
	public void submitLOBAssignmentDetails(DataTable lobAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = lobAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignLineOfBusinessBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedLineOfBusiness = assignmentDetails.get(1).get(18);		

		addLineOfBusinessAssignmentPage.verifyLineOfBusinessAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addLineOfBusinessAssignmentPage.selectAssignLineOfBusinessBy(strAssignLineOfBusinessBy);
				addLineOfBusinessAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addLineOfBusinessAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addLineOfBusinessAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addLineOfBusinessAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addLineOfBusinessAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addLineOfBusinessAssignmentPage.enterDrugListID(strDrugListID);
				addLineOfBusinessAssignmentPage.enterDrugListName(strDrugListName);
				addLineOfBusinessAssignmentPage.enterDrugListType(strDrugListType);
				addLineOfBusinessAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addLineOfBusinessAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addLineOfBusinessAssignmentPage.enterClientNumber(strClientNumber);
				addLineOfBusinessAssignmentPage.enterClientName(strClientName);
				addLineOfBusinessAssignmentPage.enterClientStartDate(strClientStartDate);
				addLineOfBusinessAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addLineOfBusinessAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addLineOfBusinessAssignmentPage.selectAssignedLineOfBusiness(strAssignedLineOfBusiness);
				addLineOfBusinessAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addLineOfBusinessAssignmentPage.updateSelectedLineOfBusiness(strSelectedAssignment);
				addLineOfBusinessAssignmentPage.clickOnUpdateButton();
				addLineOfBusinessAssignmentPage.selectAssignedLineOfBusiness(strAssignedLineOfBusiness);
				addLineOfBusinessAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addLineOfBusinessAssignmentPage.updateSelectedLineOfBusiness(arrSelectedAssignment[i]);
				}			
				addLineOfBusinessAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedLOBAssignmentDetails(DataTable selectedLOBAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedLOBAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignLineOfBusinessBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedLineOfBusiness = assignmentDetails.get(1).get(6);

		switch(strAssignLineOfBusinessBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedLineOfBusiness;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedLineOfBusiness;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedLineOfBusiness;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedLineOfBusiness;
				break;
		}
		
		addLineOfBusinessAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}