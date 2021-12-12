package com.project.actors;

import java.util.List;
import com.project.pages.AddHospiceFacilityAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddHospiceFacilityAssignmentPage {
	
	@Steps
	AddHospiceFacilityAssignmentPage addHospiceFacilityAssignmentPage;
	
	@Step
	public void submitHospiceFacilityAssignmentDetails(DataTable hospiceFacilityAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hospiceFacilityAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignHospiceFacilityBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedHospiceFacility = assignmentDetails.get(1).get(18);		

		addHospiceFacilityAssignmentPage.verifyHospiceFacilityAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addHospiceFacilityAssignmentPage.selectAssignHospiceFacilityBy(strAssignHospiceFacilityBy);
				addHospiceFacilityAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addHospiceFacilityAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addHospiceFacilityAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addHospiceFacilityAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addHospiceFacilityAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addHospiceFacilityAssignmentPage.enterDrugListID(strDrugListID);
				addHospiceFacilityAssignmentPage.enterDrugListName(strDrugListName);
				addHospiceFacilityAssignmentPage.enterDrugListType(strDrugListType);
				addHospiceFacilityAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addHospiceFacilityAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addHospiceFacilityAssignmentPage.enterClientNumber(strClientNumber);
				addHospiceFacilityAssignmentPage.enterClientName(strClientName);
				addHospiceFacilityAssignmentPage.enterClientStartDate(strClientStartDate);
				addHospiceFacilityAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addHospiceFacilityAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addHospiceFacilityAssignmentPage.selectAssignedHospiceFacility(strAssignedHospiceFacility);
				addHospiceFacilityAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addHospiceFacilityAssignmentPage.updateSelectedHospiceFacility(strSelectedAssignment);
				addHospiceFacilityAssignmentPage.clickOnUpdateButton();
				addHospiceFacilityAssignmentPage.selectAssignedHospiceFacility(strAssignedHospiceFacility);
				addHospiceFacilityAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addHospiceFacilityAssignmentPage.updateSelectedHospiceFacility(arrSelectedAssignment[i]);
				}			
				addHospiceFacilityAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedHospiceFacilityAssignmentDetails(DataTable selectedHospiceFacilityAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedHospiceFacilityAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignHospiceFacilityBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedHospiceFacility = assignmentDetails.get(1).get(6);

		switch(strAssignHospiceFacilityBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedHospiceFacility;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedHospiceFacility;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedHospiceFacility;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedHospiceFacility;
				break;
		}
		
		addHospiceFacilityAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}