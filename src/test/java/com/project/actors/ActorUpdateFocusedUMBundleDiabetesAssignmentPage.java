package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateFocusedUMBundleDiabetesAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateFocusedUMBundleDiabetesAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateFocusedUMBundleDiabetesAssignmentPage updateFocusedUMBundleDiabetesAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateFocusedUMBundleDiabetesAssignmentDetails(DataTable focusedUMBundleDiabetesAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleDiabetesAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateFocusedUMBundleDiabetesAssignmentPage.verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignFocusedUMBundleDiabetesBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedFocusedUMBundleDiabetes = assignmentDetails.get(iteration).get(18);
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateFocusedUMBundleDiabetesAssignmentPage.selectAssignFocusedUMBundleDiabetesBy(strAssignFocusedUMBundleDiabetesBy);
					updateFocusedUMBundleDiabetesAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateFocusedUMBundleDiabetesAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateFocusedUMBundleDiabetesAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateFocusedUMBundleDiabetesAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateFocusedUMBundleDiabetesAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateFocusedUMBundleDiabetesAssignmentPage.enterDrugListID(strDrugListID);
					updateFocusedUMBundleDiabetesAssignmentPage.enterDrugListName(strDrugListName);
					updateFocusedUMBundleDiabetesAssignmentPage.enterDrugListType(strDrugListType);
					updateFocusedUMBundleDiabetesAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
							
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateFocusedUMBundleDiabetesAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateFocusedUMBundleDiabetesAssignmentPage.enterClientNumber(strClientNumber);
					updateFocusedUMBundleDiabetesAssignmentPage.enterClientName(strClientName);
					updateFocusedUMBundleDiabetesAssignmentPage.enterClientStartDate(strClientStartDate);
					updateFocusedUMBundleDiabetesAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
							
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateFocusedUMBundleDiabetesAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateFocusedUMBundleDiabetesAssignmentPage.selectAssignedFocusedUMBundleDiabetes(strAssignedFocusedUMBundleDiabetes);
					updateFocusedUMBundleDiabetesAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateFocusedUMBundleDiabetesAssignmentPage.updateSelectedFocusedUMBundleDiabetes(strSelectedAssignment);
					updateFocusedUMBundleDiabetesAssignmentPage.clickOnUpdateButton();
					updateFocusedUMBundleDiabetesAssignmentPage.selectAssignedFocusedUMBundleDiabetes(strAssignedFocusedUMBundleDiabetes);
					updateFocusedUMBundleDiabetesAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateFocusedUMBundleDiabetesAssignmentPage.updateSelectedFocusedUMBundleDiabetes(arrSelectedAssignment[i]);
					}			
					updateFocusedUMBundleDiabetesAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}	
}