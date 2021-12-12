package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateHCVSolvaldiUMWithoutSTAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateHCVSolvaldiUMWithoutSTAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateHCVSolvaldiUMWithoutSTAssignmentPage updateHCVSolvaldiUMWithoutSTAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateHCVSolvaldiUMWithoutSTAssignmentDetails(DataTable hcvSolvaldiUMWithoutSTAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvSolvaldiUMWithoutSTAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateHCVSolvaldiUMWithoutSTAssignmentPage.verifyHCVSolvaldiUMWithoutSTAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignHCVSolvaldiUMWithoutSTBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedHCVSolvaldiUMWithoutST = assignmentDetails.get(iteration).get(18);
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignHCVSolvaldiUMWithoutSTBy(strAssignHCVSolvaldiUMWithoutSTBy);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateHCVSolvaldiUMWithoutSTAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListID(strDrugListID);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListName(strDrugListName);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListType(strDrugListType);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateHCVSolvaldiUMWithoutSTAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterClientNumber(strClientNumber);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterClientName(strClientName);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterClientStartDate(strClientStartDate);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateHCVSolvaldiUMWithoutSTAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignedHCVSolvaldiUMWithoutST(strAssignedHCVSolvaldiUMWithoutST);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateHCVSolvaldiUMWithoutSTAssignmentPage.updateSelectedHCVSolvaldiUMWithoutST(strSelectedAssignment);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.clickOnUpdateButton();
					updateHCVSolvaldiUMWithoutSTAssignmentPage.selectAssignedHCVSolvaldiUMWithoutST(strAssignedHCVSolvaldiUMWithoutST);
					updateHCVSolvaldiUMWithoutSTAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateHCVSolvaldiUMWithoutSTAssignmentPage.updateSelectedHCVSolvaldiUMWithoutST(arrSelectedAssignment[i]);
					}			
					updateHCVSolvaldiUMWithoutSTAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}