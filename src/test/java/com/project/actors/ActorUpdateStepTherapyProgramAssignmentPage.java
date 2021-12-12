package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateStepTherapyProgramAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateStepTherapyProgramAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateStepTherapyProgramAssignmentPage updateStepTherapyProgramAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateStepTherapyProgramAssignmentDetails(DataTable stepTherapyProgramAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = stepTherapyProgramAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateStepTherapyProgramAssignmentPage.verifyStepTherapyProgramAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignStepTherapyProgramBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedStepTherapyProgram = assignmentDetails.get(iteration).get(18);			
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateStepTherapyProgramAssignmentPage.selectAssignStepTherapyProgramBy(strAssignStepTherapyProgramBy);
					updateStepTherapyProgramAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateStepTherapyProgramAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateStepTherapyProgramAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateStepTherapyProgramAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateStepTherapyProgramAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateStepTherapyProgramAssignmentPage.enterDrugListID(strDrugListID);
					updateStepTherapyProgramAssignmentPage.enterDrugListName(strDrugListName);
					updateStepTherapyProgramAssignmentPage.enterDrugListType(strDrugListType);
					updateStepTherapyProgramAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateStepTherapyProgramAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateStepTherapyProgramAssignmentPage.enterClientNumber(strClientNumber);
					updateStepTherapyProgramAssignmentPage.enterClientName(strClientName);
					updateStepTherapyProgramAssignmentPage.enterClientStartDate(strClientStartDate);
					updateStepTherapyProgramAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateStepTherapyProgramAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateStepTherapyProgramAssignmentPage.selectAssignedStepTherapyProgram(strAssignedStepTherapyProgram);
					updateStepTherapyProgramAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateStepTherapyProgramAssignmentPage.updateSelectedStepTherapyProgram(strSelectedAssignment);
					updateStepTherapyProgramAssignmentPage.clickOnUpdateButton();
					updateStepTherapyProgramAssignmentPage.selectAssignedStepTherapyProgram(strAssignedStepTherapyProgram);
					updateStepTherapyProgramAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateStepTherapyProgramAssignmentPage.updateSelectedStepTherapyProgram(arrSelectedAssignment[i]);
					}			
					updateStepTherapyProgramAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}