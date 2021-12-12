package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateLineOfBusinessAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateLineOfBusinessAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateLineOfBusinessAssignmentPage updateLineOfBusinessAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateLOBAssignmentDetails(DataTable lobAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = lobAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateLineOfBusinessAssignmentPage.verifyLineOfBusinessAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignLineOfBusinessBy  = assignmentDetails.get(iteration).get(2);
			String strCoverageCode1 = assignmentDetails.get(iteration).get(3);
			String strCoverageCode2 = assignmentDetails.get(iteration).get(4);
			String strCoverageCodeDescription = assignmentDetails.get(iteration).get(5);
			String strCoverageCodeStatus = assignmentDetails.get(iteration).get(6);
			String strAvailableCoverageCodes = assignmentDetails.get(iteration).get(7);
			String strDrugListID = assignmentDetails.get(iteration).get(8);
			String strDrugListName = assignmentDetails.get(iteration).get(9);
			String strDrugListType = assignmentDetails.get(iteration).get(10);
			String strDrugListStatus = assignmentDetails.get(iteration).get(11);
			String strAvailableDrugLists = assignmentDetails.get(iteration).get(12);
			String strClientNumber = assignmentDetails.get(iteration).get(13);
			String strClientName = assignmentDetails.get(iteration).get(14);
			String strClientStartDate = assignmentDetails.get(iteration).get(15);
			String strClientEndDate = assignmentDetails.get(iteration).get(16);
			String strAvailableClients = assignmentDetails.get(iteration).get(17);
			String strAssignedLineOfBusiness = assignmentDetails.get(iteration).get(18);			
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateLineOfBusinessAssignmentPage.selectAssignLineOfBusinessBy(strAssignLineOfBusinessBy);
					updateLineOfBusinessAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateLineOfBusinessAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateLineOfBusinessAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateLineOfBusinessAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateLineOfBusinessAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateLineOfBusinessAssignmentPage.enterDrugListID(strDrugListID);
					updateLineOfBusinessAssignmentPage.enterDrugListName(strDrugListName);
					updateLineOfBusinessAssignmentPage.enterDrugListType(strDrugListType);
					updateLineOfBusinessAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateLineOfBusinessAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateLineOfBusinessAssignmentPage.enterClientNumber(strClientNumber);
					updateLineOfBusinessAssignmentPage.enterClientName(strClientName);
					updateLineOfBusinessAssignmentPage.enterClientStartDate(strClientStartDate);
					updateLineOfBusinessAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateLineOfBusinessAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateLineOfBusinessAssignmentPage.selectAssignedLineOfBusiness(strAssignedLineOfBusiness);
					updateLineOfBusinessAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateLineOfBusinessAssignmentPage.updateSelectedLineOfBusiness(strSelectedAssignment);
					updateLineOfBusinessAssignmentPage.clickOnUpdateButton();
					updateLineOfBusinessAssignmentPage.selectAssignedLineOfBusiness(strAssignedLineOfBusiness);
					updateLineOfBusinessAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateLineOfBusinessAssignmentPage.updateSelectedLineOfBusiness(arrSelectedAssignment[i]);
					}			
					updateLineOfBusinessAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}