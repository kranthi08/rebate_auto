package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateFocusedUMBundleSpecialtyAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateFocusedUMBundleSpecialtyAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateFocusedUMBundleSpecialtyAssignmentPage updateFocusedUMBundleSpecialtyAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateFocusedUMBundleSpecialtyAssignmentDetails(DataTable focusedUMBundleSpecialtyAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleSpecialtyAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateFocusedUMBundleSpecialtyAssignmentPage.verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed();		
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignFocusedUMBundleSpecialtyBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedFocusedUMBundleSpecialty = assignmentDetails.get(iteration).get(18);
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateFocusedUMBundleSpecialtyAssignmentPage.selectAssignFocusedUMBundleSpecialtyBy(strAssignFocusedUMBundleSpecialtyBy);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateFocusedUMBundleSpecialtyAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateFocusedUMBundleSpecialtyAssignmentPage.enterDrugListID(strDrugListID);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterDrugListName(strDrugListName);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterDrugListType(strDrugListType);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateFocusedUMBundleSpecialtyAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateFocusedUMBundleSpecialtyAssignmentPage.enterClientNumber(strClientNumber);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterClientName(strClientName);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterClientStartDate(strClientStartDate);
					updateFocusedUMBundleSpecialtyAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateFocusedUMBundleSpecialtyAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateFocusedUMBundleSpecialtyAssignmentPage.selectAssignedFocusedUMBundleSpecialty(strAssignedFocusedUMBundleSpecialty);
					updateFocusedUMBundleSpecialtyAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateFocusedUMBundleSpecialtyAssignmentPage.updateSelectedFocusedUMBundleSpecialty(strSelectedAssignment);
					updateFocusedUMBundleSpecialtyAssignmentPage.clickOnUpdateButton();
					updateFocusedUMBundleSpecialtyAssignmentPage.selectAssignedFocusedUMBundleSpecialty(strAssignedFocusedUMBundleSpecialty);
					updateFocusedUMBundleSpecialtyAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateFocusedUMBundleSpecialtyAssignmentPage.updateSelectedFocusedUMBundleSpecialty(arrSelectedAssignment[i]);
					}			
					updateFocusedUMBundleSpecialtyAssignmentPage.clickOnRemoveButton();					
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}