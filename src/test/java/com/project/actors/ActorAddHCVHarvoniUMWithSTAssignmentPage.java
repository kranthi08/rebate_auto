package com.project.actors;

import java.util.List;
import com.project.pages.AddHCVHarvoniUMWithSTAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddHCVHarvoniUMWithSTAssignmentPage {
	
	@Steps
	AddHCVHarvoniUMWithSTAssignmentPage addHCVHarvoniUMWithSTAssignmentPage;
	
	@Step
	public void submitHCVHarvoniUMWithSTAssignmentDetails(DataTable hcvHarvoniUMWithSTAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvHarvoniUMWithSTAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignHCVHarvoniUMWithSTBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedHCVHarvoniUMWithST = assignmentDetails.get(1).get(18);		

		addHCVHarvoniUMWithSTAssignmentPage.verifyHCVHarvoniUMWithSTAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addHCVHarvoniUMWithSTAssignmentPage.selectAssignHCVHarvoniUMWithSTBy(strAssignHCVHarvoniUMWithSTBy);
				addHCVHarvoniUMWithSTAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addHCVHarvoniUMWithSTAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addHCVHarvoniUMWithSTAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addHCVHarvoniUMWithSTAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addHCVHarvoniUMWithSTAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addHCVHarvoniUMWithSTAssignmentPage.enterDrugListID(strDrugListID);
				addHCVHarvoniUMWithSTAssignmentPage.enterDrugListName(strDrugListName);
				addHCVHarvoniUMWithSTAssignmentPage.enterDrugListType(strDrugListType);
				addHCVHarvoniUMWithSTAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addHCVHarvoniUMWithSTAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addHCVHarvoniUMWithSTAssignmentPage.enterClientNumber(strClientNumber);
				addHCVHarvoniUMWithSTAssignmentPage.enterClientName(strClientName);
				addHCVHarvoniUMWithSTAssignmentPage.enterClientStartDate(strClientStartDate);
				addHCVHarvoniUMWithSTAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addHCVHarvoniUMWithSTAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addHCVHarvoniUMWithSTAssignmentPage.selectAssignedHCVHarvoniUMWithST(strAssignedHCVHarvoniUMWithST);
				addHCVHarvoniUMWithSTAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addHCVHarvoniUMWithSTAssignmentPage.updateSelectedHCVHarvoniUMWithST(strSelectedAssignment);
				addHCVHarvoniUMWithSTAssignmentPage.clickOnUpdateButton();
				addHCVHarvoniUMWithSTAssignmentPage.selectAssignedHCVHarvoniUMWithST(strAssignedHCVHarvoniUMWithST);
				addHCVHarvoniUMWithSTAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addHCVHarvoniUMWithSTAssignmentPage.updateSelectedHCVHarvoniUMWithST(arrSelectedAssignment[i]);
				}			
				addHCVHarvoniUMWithSTAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedHCVHarvoniUMWithSTAssignmentAssignmentDetails(DataTable selectedHCVHarvoniUMWithSTAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedHCVHarvoniUMWithSTAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignHCVHarvoniUMWithSTBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedHCVHarvoniUMWithST = assignmentDetails.get(1).get(6);

		switch(strAssignHCVHarvoniUMWithSTBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedHCVHarvoniUMWithST;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedHCVHarvoniUMWithST;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedHCVHarvoniUMWithST;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedHCVHarvoniUMWithST;
				break;
		}
		
		addHCVHarvoniUMWithSTAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}