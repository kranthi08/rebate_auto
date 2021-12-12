package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdatePriorAuthorizationProgramAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdatePriorAuthorizationProgramAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdatePriorAuthorizationProgramAssignmentPage updatePriorAuthorizationProgramAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updatePriorAuthorizationProgramAssignmentDetails(DataTable priorAuthorizationProgramAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = priorAuthorizationProgramAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updatePriorAuthorizationProgramAssignmentPage.verifyPriorAuthorizationProgramAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignPriorAuthorizationProgramBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedPriorAuthorizationProgram = assignmentDetails.get(iteration).get(18);			
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updatePriorAuthorizationProgramAssignmentPage.selectAssignPriorAuthorizationProgramBy(strAssignPriorAuthorizationProgramBy);
					updatePriorAuthorizationProgramAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updatePriorAuthorizationProgramAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updatePriorAuthorizationProgramAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updatePriorAuthorizationProgramAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updatePriorAuthorizationProgramAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updatePriorAuthorizationProgramAssignmentPage.enterDrugListID(strDrugListID);
					updatePriorAuthorizationProgramAssignmentPage.enterDrugListName(strDrugListName);
					updatePriorAuthorizationProgramAssignmentPage.enterDrugListType(strDrugListType);
					updatePriorAuthorizationProgramAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updatePriorAuthorizationProgramAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updatePriorAuthorizationProgramAssignmentPage.enterClientNumber(strClientNumber);
					updatePriorAuthorizationProgramAssignmentPage.enterClientName(strClientName);
					updatePriorAuthorizationProgramAssignmentPage.enterClientStartDate(strClientStartDate);
					updatePriorAuthorizationProgramAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updatePriorAuthorizationProgramAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updatePriorAuthorizationProgramAssignmentPage.selectAssignedPriorAuthorizationProgram(strAssignedPriorAuthorizationProgram);
					updatePriorAuthorizationProgramAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updatePriorAuthorizationProgramAssignmentPage.updateSelectedPriorAuthorizationProgram(strSelectedAssignment);
					updatePriorAuthorizationProgramAssignmentPage.clickOnUpdateButton();
					updatePriorAuthorizationProgramAssignmentPage.selectAssignedPriorAuthorizationProgram(strAssignedPriorAuthorizationProgram);
					updatePriorAuthorizationProgramAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updatePriorAuthorizationProgramAssignmentPage.updateSelectedPriorAuthorizationProgram(arrSelectedAssignment[i]);
					}			
					updatePriorAuthorizationProgramAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}