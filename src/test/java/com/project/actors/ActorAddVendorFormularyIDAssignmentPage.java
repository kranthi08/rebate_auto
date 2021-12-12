package com.project.actors;

import java.util.List;

import com.project.pages.AddVendorFormularyIDAssignmentPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddVendorFormularyIDAssignmentPage {
	
	@Steps
	AddVendorFormularyIDAssignmentPage addVendorFormularyIDAssignmentPage;
	
	@Step
	public void verifyAssignmentCriteria() throws Throwable {		
		addVendorFormularyIDAssignmentPage.verifyVendorFormularyIDAssignmentIsDisplayed();
	}
	
	@Step
	public void submitVendorFormularyIDAssignmentDetails(DataTable vendorFormularyIDAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = vendorFormularyIDAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignVendorFormularyIDBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedVendorFormularyID = assignmentDetails.get(1).get(18);		

		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addVendorFormularyIDAssignmentPage.selectAssignVendorFormularyIDBy(strAssignVendorFormularyIDBy);
				addVendorFormularyIDAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addVendorFormularyIDAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addVendorFormularyIDAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addVendorFormularyIDAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addVendorFormularyIDAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addVendorFormularyIDAssignmentPage.enterDrugListID(strDrugListID);
				addVendorFormularyIDAssignmentPage.enterDrugListName(strDrugListName);
				addVendorFormularyIDAssignmentPage.enterDrugListType(strDrugListType);
				addVendorFormularyIDAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addVendorFormularyIDAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addVendorFormularyIDAssignmentPage.enterClientNumber(strClientNumber);
				addVendorFormularyIDAssignmentPage.enterClientName(strClientName);
				addVendorFormularyIDAssignmentPage.enterClientStartDate(strClientStartDate);
				addVendorFormularyIDAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addVendorFormularyIDAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addVendorFormularyIDAssignmentPage.enterAssignedVendorFormularyID(strAssignedVendorFormularyID);
				addVendorFormularyIDAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addVendorFormularyIDAssignmentPage.updateSelectedVendorFormularyID(strSelectedAssignment);
				addVendorFormularyIDAssignmentPage.clickOnUpdateButton();
				addVendorFormularyIDAssignmentPage.enterAssignedVendorFormularyID(strAssignedVendorFormularyID);
				addVendorFormularyIDAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addVendorFormularyIDAssignmentPage.updateSelectedVendorFormularyID(arrSelectedAssignment[i]);
				}			
				addVendorFormularyIDAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedVendorFormularyIDAssignmentDetails(DataTable selectedVendorFormularyIDAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedVendorFormularyIDAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignVendorFormularyIDBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedVendorFormularyID = assignmentDetails.get(1).get(6);

		switch(strAssignVendorFormularyIDBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedVendorFormularyID;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedVendorFormularyID;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedVendorFormularyID;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedVendorFormularyID;
				break;
		}
		
		addVendorFormularyIDAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
	
	@Step
	public void clickOnNextButton() throws Throwable{
		addVendorFormularyIDAssignmentPage.clickOnNextButton();
	}
}