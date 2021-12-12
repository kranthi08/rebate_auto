package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateHCVEpclusaUMAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateHCVEpclusaUMAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateHCVEpclusaUMAssignmentPage updateHCVEpclusaUMAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateHCVEpclusaUMAssignmentDetails(DataTable hcvEpclusaUMAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvEpclusaUMAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateHCVEpclusaUMAssignmentPage.verifyHCVEpclusaUMAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignHCVEpclusaUMBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedHCVEpclusaUM = assignmentDetails.get(iteration).get(18);

			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateHCVEpclusaUMAssignmentPage.selectAssignHCVEpclusaUMBy(strAssignHCVEpclusaUMBy);
					updateHCVEpclusaUMAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateHCVEpclusaUMAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateHCVEpclusaUMAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateHCVEpclusaUMAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateHCVEpclusaUMAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateHCVEpclusaUMAssignmentPage.enterDrugListID(strDrugListID);
					updateHCVEpclusaUMAssignmentPage.enterDrugListName(strDrugListName);
					updateHCVEpclusaUMAssignmentPage.enterDrugListType(strDrugListType);
					updateHCVEpclusaUMAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateHCVEpclusaUMAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateHCVEpclusaUMAssignmentPage.enterClientNumber(strClientNumber);
					updateHCVEpclusaUMAssignmentPage.enterClientName(strClientName);
					updateHCVEpclusaUMAssignmentPage.enterClientStartDate(strClientStartDate);
					updateHCVEpclusaUMAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateHCVEpclusaUMAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateHCVEpclusaUMAssignmentPage.selectAssignedHCVEpclusaUM(strAssignedHCVEpclusaUM);
					updateHCVEpclusaUMAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateHCVEpclusaUMAssignmentPage.updateSelectedHCVEpclusaUM(strSelectedAssignment);
					updateHCVEpclusaUMAssignmentPage.clickOnUpdateButton();
					updateHCVEpclusaUMAssignmentPage.selectAssignedHCVEpclusaUM(strAssignedHCVEpclusaUM);
					updateHCVEpclusaUMAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateHCVEpclusaUMAssignmentPage.updateSelectedHCVEpclusaUM(arrSelectedAssignment[i]);
					}			
					updateHCVEpclusaUMAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}