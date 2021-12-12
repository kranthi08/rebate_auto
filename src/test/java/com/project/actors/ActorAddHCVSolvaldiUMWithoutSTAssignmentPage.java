package com.project.actors;

import java.util.List;
import com.project.pages.AddHCVSolvaldiUMWithoutSTAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddHCVSolvaldiUMWithoutSTAssignmentPage {
	
	@Steps
	AddHCVSolvaldiUMWithoutSTAssignmentPage addHCVSolvaldiUMWithoutSTAssignmentPage;
	
	@Step
	public void submitHCVSolvaldiUMWithoutSTAssignmentDetails(DataTable hcvSolvaldiUMWithoutSTAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvSolvaldiUMWithoutSTAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignHCVSolvaldiUMWithoutSTBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedHCVSolvaldiUMWithoutST = assignmentDetails.get(1).get(18);		

		addHCVSolvaldiUMWithoutSTAssignmentPage.verifyHCVSolvaldiUMWithoutSTAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignHCVSolvaldiUMWithoutSTBy(strAssignHCVSolvaldiUMWithoutSTBy);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addHCVSolvaldiUMWithoutSTAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListID(strDrugListID);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListName(strDrugListName);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListType(strDrugListType);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addHCVSolvaldiUMWithoutSTAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterClientNumber(strClientNumber);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterClientName(strClientName);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterClientStartDate(strClientStartDate);
				addHCVSolvaldiUMWithoutSTAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addHCVSolvaldiUMWithoutSTAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignedHCVSolvaldiUMWithoutST(strAssignedHCVSolvaldiUMWithoutST);
				addHCVSolvaldiUMWithoutSTAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addHCVSolvaldiUMWithoutSTAssignmentPage.updateSelectedHCVSolvaldiUMWithoutST(strSelectedAssignment);
				addHCVSolvaldiUMWithoutSTAssignmentPage.clickOnUpdateButton();
				addHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignedHCVSolvaldiUMWithoutST(strAssignedHCVSolvaldiUMWithoutST);
				addHCVSolvaldiUMWithoutSTAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addHCVSolvaldiUMWithoutSTAssignmentPage.updateSelectedHCVSolvaldiUMWithoutST(arrSelectedAssignment[i]);
				}			
				addHCVSolvaldiUMWithoutSTAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedHCVSolvaldiUMWithoutSTAssignmentDetails(DataTable selectedHCVSolvaldiUMWithoutSTAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedHCVSolvaldiUMWithoutSTAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignHCVSolvaldiUMWithoutSTBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedHCVSolvaldiUMWithoutST = assignmentDetails.get(1).get(6);

		switch(strAssignHCVSolvaldiUMWithoutSTBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedHCVSolvaldiUMWithoutST;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedHCVSolvaldiUMWithoutST;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedHCVSolvaldiUMWithoutST;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedHCVSolvaldiUMWithoutST;
				break;
		}
		
		addHCVSolvaldiUMWithoutSTAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}