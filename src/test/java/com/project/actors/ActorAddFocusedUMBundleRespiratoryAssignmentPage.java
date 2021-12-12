package com.project.actors;

import java.util.List;
import com.project.pages.AddFocusedUMBundleRespiratoryAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddFocusedUMBundleRespiratoryAssignmentPage {
	
	@Steps
	AddFocusedUMBundleRespiratoryAssignmentPage addFocusedUMBundleRespiratoryAssignmentPage;
	
	@Step
	public void submitFocusedUMBundleRespiratoryAssignmentDetails(DataTable focusedUMBundleRespiratoryAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleRespiratoryAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignFocusedUMBundleRespiratoryBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedFocusedUMBundleRespiratory = assignmentDetails.get(1).get(18);		

		addFocusedUMBundleRespiratoryAssignmentPage.verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addFocusedUMBundleRespiratoryAssignmentPage.selectAssignFocusedUMBundleRespiratoryBy(strAssignFocusedUMBundleRespiratoryBy);
				addFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addFocusedUMBundleRespiratoryAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addFocusedUMBundleRespiratoryAssignmentPage.enterDrugListID(strDrugListID);
				addFocusedUMBundleRespiratoryAssignmentPage.enterDrugListName(strDrugListName);
				addFocusedUMBundleRespiratoryAssignmentPage.enterDrugListType(strDrugListType);
				addFocusedUMBundleRespiratoryAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addFocusedUMBundleRespiratoryAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addFocusedUMBundleRespiratoryAssignmentPage.enterClientNumber(strClientNumber);
				addFocusedUMBundleRespiratoryAssignmentPage.enterClientName(strClientName);
				addFocusedUMBundleRespiratoryAssignmentPage.enterClientStartDate(strClientStartDate);
				addFocusedUMBundleRespiratoryAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addFocusedUMBundleRespiratoryAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addFocusedUMBundleRespiratoryAssignmentPage.selectAssignedFocusedUMBundleRespiratory(strAssignedFocusedUMBundleRespiratory);
				addFocusedUMBundleRespiratoryAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addFocusedUMBundleRespiratoryAssignmentPage.updateSelectedFocusedUMBundleRespiratory(strSelectedAssignment);
				addFocusedUMBundleRespiratoryAssignmentPage.clickOnUpdateButton();
				addFocusedUMBundleRespiratoryAssignmentPage.selectAssignedFocusedUMBundleRespiratory(strAssignedFocusedUMBundleRespiratory);
				addFocusedUMBundleRespiratoryAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addFocusedUMBundleRespiratoryAssignmentPage.updateSelectedFocusedUMBundleRespiratory(arrSelectedAssignment[i]);
				}			
				addFocusedUMBundleRespiratoryAssignmentPage.clickOnRemoveButton();
				break;
		}			
	}
	
	@Step
	public void verifySelectedFocusedUMBundleRespiratoryAssignmentDetails(DataTable selectedFocusedUMBundleRespiratoryAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedFocusedUMBundleRespiratoryAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignFocusedUMBundleRespiratoryBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedFocusedUMBundleRespiratory = assignmentDetails.get(1).get(6);

		switch(strAssignFocusedUMBundleRespiratoryBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedFocusedUMBundleRespiratory;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedFocusedUMBundleRespiratory;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedFocusedUMBundleRespiratory;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedFocusedUMBundleRespiratory;
				break;
		}
		
		addFocusedUMBundleRespiratoryAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}