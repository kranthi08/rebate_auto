package com.project.actors;

import java.util.List;
import com.project.pages.AddFocusedUMBundleSpecialtyAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddFocusedUMBundleSpecialtyAssignmentPage {
	
	@Steps
	AddFocusedUMBundleSpecialtyAssignmentPage addFocusedUMBundleSpecialtyAssignmentPage;
	
	@Step
	public void submitFocusedUMBundleSpecialtyAssignmentDetails(DataTable focusedUMBundleSpecialtyAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleSpecialtyAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignFocusedUMBundleSpecialtyBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedFocusedUMBundleSpecialty = assignmentDetails.get(1).get(18);		

		addFocusedUMBundleSpecialtyAssignmentPage.verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addFocusedUMBundleSpecialtyAssignmentPage.selectAssignFocusedUMBundleSpecialtyBy(strAssignFocusedUMBundleSpecialtyBy);
				addFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addFocusedUMBundleSpecialtyAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addFocusedUMBundleSpecialtyAssignmentPage.enterDrugListID(strDrugListID);
				addFocusedUMBundleSpecialtyAssignmentPage.enterDrugListName(strDrugListName);
				addFocusedUMBundleSpecialtyAssignmentPage.enterDrugListType(strDrugListType);
				addFocusedUMBundleSpecialtyAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addFocusedUMBundleSpecialtyAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addFocusedUMBundleSpecialtyAssignmentPage.enterClientNumber(strClientNumber);
				addFocusedUMBundleSpecialtyAssignmentPage.enterClientName(strClientName);
				addFocusedUMBundleSpecialtyAssignmentPage.enterClientStartDate(strClientStartDate);
				addFocusedUMBundleSpecialtyAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addFocusedUMBundleSpecialtyAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addFocusedUMBundleSpecialtyAssignmentPage.selectAssignedFocusedUMBundleSpecialty(strAssignedFocusedUMBundleSpecialty);
				addFocusedUMBundleSpecialtyAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addFocusedUMBundleSpecialtyAssignmentPage.updateSelectedFocusedUMBundleSpecialty(strSelectedAssignment);
				addFocusedUMBundleSpecialtyAssignmentPage.clickOnUpdateButton();
				addFocusedUMBundleSpecialtyAssignmentPage.selectAssignedFocusedUMBundleSpecialty(strAssignedFocusedUMBundleSpecialty);
				addFocusedUMBundleSpecialtyAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addFocusedUMBundleSpecialtyAssignmentPage.updateSelectedFocusedUMBundleSpecialty(arrSelectedAssignment[i]);
				}			
				addFocusedUMBundleSpecialtyAssignmentPage.clickOnRemoveButton();					
				break;
		}
	}
	
	@Step
	public void verifySelectedFocusedUMBundleSpecialtyAssignmentDetails(DataTable selectedFocusedUMBundleSpecialtyAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedFocusedUMBundleSpecialtyAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignFocusedUMBundleSpecialtyBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleSpecialty = assignmentDetails.get(1).get(6);

		switch(strAssignFocusedUMBundleSpecialtyBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedFocusedUMBundleSpecialty;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedFocusedUMBundleSpecialty;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedFocusedUMBundleSpecialty;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedFocusedUMBundleSpecialty;
				break;
		}
		
		addFocusedUMBundleSpecialtyAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}