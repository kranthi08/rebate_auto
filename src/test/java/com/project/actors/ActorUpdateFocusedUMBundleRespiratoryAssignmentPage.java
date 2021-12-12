package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateFocusedUMBundleRespiratoryAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateFocusedUMBundleRespiratoryAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateFocusedUMBundleRespiratoryAssignmentPage updateFocusedUMBundleRespiratoryAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateFocusedUMBundleRespiratoryAssignmentDetails(DataTable focusedUMBundleRespiratoryAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = focusedUMBundleRespiratoryAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateFocusedUMBundleRespiratoryAssignmentPage.verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignFocusedUMBundleRespiratoryBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedFocusedUMBundleRespiratory = assignmentDetails.get(iteration).get(18);
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateFocusedUMBundleRespiratoryAssignmentPage.selectAssignFocusedUMBundleRespiratoryBy(strAssignFocusedUMBundleRespiratoryBy);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateFocusedUMBundleRespiratoryAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateFocusedUMBundleRespiratoryAssignmentPage.enterDrugListID(strDrugListID);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterDrugListName(strDrugListName);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterDrugListType(strDrugListType);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateFocusedUMBundleRespiratoryAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateFocusedUMBundleRespiratoryAssignmentPage.enterClientNumber(strClientNumber);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterClientName(strClientName);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterClientStartDate(strClientStartDate);
					updateFocusedUMBundleRespiratoryAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateFocusedUMBundleRespiratoryAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateFocusedUMBundleRespiratoryAssignmentPage.selectAssignedFocusedUMBundleRespiratory(strAssignedFocusedUMBundleRespiratory);
					updateFocusedUMBundleRespiratoryAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateFocusedUMBundleRespiratoryAssignmentPage.updateSelectedFocusedUMBundleRespiratory(strSelectedAssignment);
					updateFocusedUMBundleRespiratoryAssignmentPage.clickOnUpdateButton();
					updateFocusedUMBundleRespiratoryAssignmentPage.selectAssignedFocusedUMBundleRespiratory(strAssignedFocusedUMBundleRespiratory);
					updateFocusedUMBundleRespiratoryAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateFocusedUMBundleRespiratoryAssignmentPage.updateSelectedFocusedUMBundleRespiratory(arrSelectedAssignment[i]);
					}			
					updateFocusedUMBundleRespiratoryAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}