package com.project.actors;

import java.util.List;
import com.project.pages.AddTNFRAUMAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddTNFRAUMAssignmentPage {
	
	@Steps
	AddTNFRAUMAssignmentPage addTNFRAUMAssignmentPage;
	
	@Step
	public void submitTNFRAUMAssignmentDetails(DataTable tnfraUMAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = tnfraUMAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignTNFRAUMBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedTNFRAUM = assignmentDetails.get(1).get(18);		

		addTNFRAUMAssignmentPage.verifyTNFRAUMAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addTNFRAUMAssignmentPage.selectAssignTNFRAUMBy(strAssignTNFRAUMBy);
				addTNFRAUMAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addTNFRAUMAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addTNFRAUMAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addTNFRAUMAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addTNFRAUMAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addTNFRAUMAssignmentPage.enterDrugListID(strDrugListID);
				addTNFRAUMAssignmentPage.enterDrugListName(strDrugListName);
				addTNFRAUMAssignmentPage.enterDrugListType(strDrugListType);
				addTNFRAUMAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addTNFRAUMAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addTNFRAUMAssignmentPage.enterClientNumber(strClientNumber);
				addTNFRAUMAssignmentPage.enterClientName(strClientName);
				addTNFRAUMAssignmentPage.enterClientStartDate(strClientStartDate);
				addTNFRAUMAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addTNFRAUMAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addTNFRAUMAssignmentPage.selectAssignedTNFRAUM(strAssignedTNFRAUM);
				addTNFRAUMAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addTNFRAUMAssignmentPage.updateSelectedTNFRAUM(strSelectedAssignment);
				addTNFRAUMAssignmentPage.clickOnUpdateButton();
				addTNFRAUMAssignmentPage.selectAssignedTNFRAUM(strAssignedTNFRAUM);
				addTNFRAUMAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addTNFRAUMAssignmentPage.updateSelectedTNFRAUM(arrSelectedAssignment[i]);
				}			
				addTNFRAUMAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedTNFRAUMAssignmentAssignmentDetails(DataTable selectedTNFRAUMAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedTNFRAUMAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignTNFRAUMBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedTNFRAUM = assignmentDetails.get(1).get(6);

		switch(strAssignTNFRAUMBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedTNFRAUM;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedTNFRAUM;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedTNFRAUM;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedTNFRAUM;
				break;
		}
		
		addTNFRAUMAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}