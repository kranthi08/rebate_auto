package com.project.actors;

import java.util.List;
import com.project.pages.AddHCVMavyretTieringAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddHCVMavyretTieringAssignmentPage {
	
	@Steps
	AddHCVMavyretTieringAssignmentPage addHCVMavyretTieringAssignmentPage;
	
	@Step
	public void submitHCVMavyretTieringAssignmentDetails(DataTable hcvMavyretTieringAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvMavyretTieringAssignmentData.raw();
		
		String strOperation = assignmentDetails.get(1).get(0);
		String strSelectedAssignment = assignmentDetails.get(1).get(1);
		String strAssignHCVMavyretTieringBy  = assignmentDetails.get(1).get(2);
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
		String strAssignedHCVMavyretTiering = assignmentDetails.get(1).get(18);		

		addHCVMavyretTieringAssignmentPage.verifyHCVMavyretTieringAssignmentIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addHCVMavyretTieringAssignmentPage.selectAssignHCVMavyretTieringBy(strAssignHCVMavyretTieringBy);
				addHCVMavyretTieringAssignmentPage.enterCoverageCode1(strCoverageCode1);
				addHCVMavyretTieringAssignmentPage.enterCoverageCode2(strCoverageCode2);
				addHCVMavyretTieringAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
				addHCVMavyretTieringAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
				if(!strAvailableCoverageCodes.isEmpty())
				{
					String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
					
					for(int i=0;i<arrAvailableCoverageCodes.length;i++)
					{
						addHCVMavyretTieringAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
					}						
				}					
				addHCVMavyretTieringAssignmentPage.enterDrugListID(strDrugListID);
				addHCVMavyretTieringAssignmentPage.enterDrugListName(strDrugListName);
				addHCVMavyretTieringAssignmentPage.enterDrugListType(strDrugListType);
				addHCVMavyretTieringAssignmentPage.enterDrugListStatus(strDrugListStatus);
				if(!strAvailableDrugLists.isEmpty())
				{
					String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
					
					for(int i=0;i<arrAvailableDrugLists.length;i++)
					{
						addHCVMavyretTieringAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
					}						
				}
				addHCVMavyretTieringAssignmentPage.enterClientNumber(strClientNumber);
				addHCVMavyretTieringAssignmentPage.enterClientName(strClientName);
				addHCVMavyretTieringAssignmentPage.enterClientStartDate(strClientStartDate);
				addHCVMavyretTieringAssignmentPage.enterClientEndDate(strClientEndDate);
				if(!strAvailableClients.isEmpty())
				{
					String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
					
					for(int i=0;i<arrAvailableClients.length;i++)
					{
						addHCVMavyretTieringAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
					}						
				}
				addHCVMavyretTieringAssignmentPage.selectAssignedHCVMavyretTiering(strAssignedHCVMavyretTiering);
				addHCVMavyretTieringAssignmentPage.clickOnAddButton();
				break;
			case "UPDATE":
				addHCVMavyretTieringAssignmentPage.updateSelectedHCVMavyretTiering(strSelectedAssignment);
				addHCVMavyretTieringAssignmentPage.clickOnUpdateButton();
				addHCVMavyretTieringAssignmentPage.selectAssignedHCVMavyretTiering(strAssignedHCVMavyretTiering);
				addHCVMavyretTieringAssignmentPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
				
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addHCVMavyretTieringAssignmentPage.updateSelectedHCVMavyretTiering(arrSelectedAssignment[i]);
				}			
				addHCVMavyretTieringAssignmentPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifySelectedHCVMavyretTieringAssignmentAssignmentDetails(DataTable selectedHCVMavyretTieringAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = selectedHCVMavyretTieringAssignmentData.raw();
		
		String strSelectedAssignmentDetails = "";
		
		String strAssignHCVMavyretTieringBy = assignmentDetails.get(1).get(0);
		String strSelectedCustomer  = assignmentDetails.get(1).get(1);
		String strSelectedCoverageCode = assignmentDetails.get(1).get(2);
		String strSelectedDrugList = assignmentDetails.get(1).get(3);
		String strSelectedClient = assignmentDetails.get(1).get(4);
		String strSelectedClientName = assignmentDetails.get(1).get(5);
		String strAssignedHCVMavyretTiering = assignmentDetails.get(1).get(6);

		switch(strAssignHCVMavyretTieringBy.toUpperCase())
		{
			case "CUSTOMER":
				strSelectedAssignmentDetails = strSelectedCustomer+"*"+strAssignedHCVMavyretTiering;
				break;
			case "COVERAGE CODE":
				strSelectedAssignmentDetails = strSelectedCoverageCode+"*"+strAssignedHCVMavyretTiering;
				break;
			case "DRUG LIST":
				strSelectedAssignmentDetails = strSelectedDrugList+"*"+strAssignedHCVMavyretTiering;
				break;
			case "CLIENT":
				strSelectedAssignmentDetails = strSelectedClient+"*"+strSelectedClientName+"*"+strAssignedHCVMavyretTiering;
				break;
		}
		
		addHCVMavyretTieringAssignmentPage.verifySelectedAssignmentDetails(strSelectedAssignmentDetails);
	}
}