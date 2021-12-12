package com.project.actors;

import java.util.List;
import com.project.pages.AddHCVEpclusaUMAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddHCVEpclusaUMAssignmentPage {
	
	@Steps
	AddHCVEpclusaUMAssignmentPage addHCVEpclusaUMAssignmentPage;
	
	@Step
	public void submitHCVEpclusaUMAssignmentDetails(DataTable hcvEpclusaUMAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvEpclusaUMAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignHCVEpclusaUMBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedHCVEpclusaUM = assignmentDetails.get(1).get(18);		

		addHCVEpclusaUMAssignmentPage.verifyHCVEpclusaUMAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addHCVEpclusaUMAssignmentPage.selectAssignHCVEpclusaUMBy(strAssignHCVEpclusaUMBy);
				addHCVEpclusaUMAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addHCVEpclusaUMAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addHCVEpclusaUMAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addHCVEpclusaUMAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addHCVEpclusaUMAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addHCVEpclusaUMAssignmentPage.enterDrugListID(strDrugListID);
				addHCVEpclusaUMAssignmentPage.enterDrugListName(strDrugListName);
				addHCVEpclusaUMAssignmentPage.enterDrugListType(strDrugListType);
				addHCVEpclusaUMAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addHCVEpclusaUMAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addHCVEpclusaUMAssignmentPage.enterClientNumber(strClientNumber);
				addHCVEpclusaUMAssignmentPage.enterClientName(strClientName);
				addHCVEpclusaUMAssignmentPage.enterClientStartDate(strClientStartDate);
				addHCVEpclusaUMAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addHCVEpclusaUMAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addHCVEpclusaUMAssignmentPage.selectAssignedHCVEpclusaUM(strAssignedHCVEpclusaUM);
				addHCVEpclusaUMAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addHCVEpclusaUMAssignmentPage.updateSelectedHCVEpclusaUM(strSelectedAssignment);
				addHCVEpclusaUMAssignmentPage.clickOnUpdateButton();
				addHCVEpclusaUMAssignmentPage.selectAssignedHCVEpclusaUM(strAssignedHCVEpclusaUM);
				addHCVEpclusaUMAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addHCVEpclusaUMAssignmentPage.updateSelectedHCVEpclusaUM(arrSelectedAssignment[i]);
				}			
				addHCVEpclusaUMAssignmentPage.clickOnRemoveButton();
				break;
		}			
	}
	
	@Step
	public void verifySelectedHCVEpclusaUMAssignmentDetails(DataTable selectedHCVEpclusaUMAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedHCVEpclusaUMAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignHCVEpclusaUMBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedHCVEpclusaUM = assignmentDetails.get(1).get(6);

		switch(strAssignHCVEpclusaUMBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedHCVEpclusaUM;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedHCVEpclusaUM;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedHCVEpclusaUM;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedHCVEpclusaUM;
				break;
		}
		
		addHCVEpclusaUMAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}