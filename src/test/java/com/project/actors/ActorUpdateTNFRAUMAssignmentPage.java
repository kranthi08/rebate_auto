package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateTNFRAUMAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateTNFRAUMAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateTNFRAUMAssignmentPage updateTNFRAUMAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateTNFRAUMAssignmentDetails(DataTable tnfraUMAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = tnfraUMAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateTNFRAUMAssignmentPage.verifyTNFRAUMAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignTNFRAUMBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedTNFRAUM = assignmentDetails.get(iteration).get(18);			
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateTNFRAUMAssignmentPage.selectAssignTNFRAUMBy(strAssignTNFRAUMBy);
					updateTNFRAUMAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateTNFRAUMAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateTNFRAUMAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateTNFRAUMAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateTNFRAUMAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateTNFRAUMAssignmentPage.enterDrugListID(strDrugListID);
					updateTNFRAUMAssignmentPage.enterDrugListName(strDrugListName);
					updateTNFRAUMAssignmentPage.enterDrugListType(strDrugListType);
					updateTNFRAUMAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateTNFRAUMAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateTNFRAUMAssignmentPage.enterClientNumber(strClientNumber);
					updateTNFRAUMAssignmentPage.enterClientName(strClientName);
					updateTNFRAUMAssignmentPage.enterClientStartDate(strClientStartDate);
					updateTNFRAUMAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateTNFRAUMAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateTNFRAUMAssignmentPage.selectAssignedTNFRAUM(strAssignedTNFRAUM);
					updateTNFRAUMAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateTNFRAUMAssignmentPage.updateSelectedTNFRAUM(strSelectedAssignment);
					updateTNFRAUMAssignmentPage.clickOnUpdateButton();
					updateTNFRAUMAssignmentPage.selectAssignedTNFRAUM(strAssignedTNFRAUM);
					updateTNFRAUMAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateTNFRAUMAssignmentPage.updateSelectedTNFRAUM(arrSelectedAssignment[i]);
					}			
					updateTNFRAUMAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}