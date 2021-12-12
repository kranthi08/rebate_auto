package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateFocusedUMBundleMiscellaneousAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateFocusedUMBundleMiscellaneousAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateFocusedUMBundleMiscellaneousAssignmentPage updateFocusedUMBundleMiscellaneousAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateFocusedUMBundleMiscellaneousAssignmentDetails(DataTable focusedUMBundleMiscellaneousAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleMiscellaneousAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateFocusedUMBundleMiscellaneousAssignmentPage.verifyFocusedUMBundleMiscellaneousAssignmentIsDisplayed();
		
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignFocusedUMBundleMiscellaneousBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedFocusedUMBundleMiscellaneous = assignmentDetails.get(iteration).get(18);			
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateFocusedUMBundleMiscellaneousAssignmentPage.selectAssignFocusedUMBundleMiscellaneousBy(strAssignFocusedUMBundleMiscellaneousBy);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateFocusedUMBundleMiscellaneousAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListID(strDrugListID);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListName(strDrugListName);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListType(strDrugListType);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateFocusedUMBundleMiscellaneousAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterClientNumber(strClientNumber);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterClientName(strClientName);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterClientStartDate(strClientStartDate);
					updateFocusedUMBundleMiscellaneousAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateFocusedUMBundleMiscellaneousAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}					
					updateFocusedUMBundleMiscellaneousAssignmentPage.selectAssignedFocusedUMBundleMiscellaneous(strAssignedFocusedUMBundleMiscellaneous);
					updateFocusedUMBundleMiscellaneousAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateFocusedUMBundleMiscellaneousAssignmentPage.updateSelectedFocusedUMBundleMiscellaneous(strSelectedAssignment);
					updateFocusedUMBundleMiscellaneousAssignmentPage.clickOnUpdateButton();
					updateFocusedUMBundleMiscellaneousAssignmentPage.selectAssignedFocusedUMBundleMiscellaneous(strAssignedFocusedUMBundleMiscellaneous);
					updateFocusedUMBundleMiscellaneousAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateFocusedUMBundleMiscellaneousAssignmentPage.updateSelectedFocusedUMBundleMiscellaneous(arrSelectedAssignment[i]);
					}			
					updateFocusedUMBundleMiscellaneousAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}