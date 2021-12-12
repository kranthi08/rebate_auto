package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateHCVHarvoniUMWithSTAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateHCVHarvoniUMWithSTAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateHCVHarvoniUMWithSTAssignmentPage updateHCVHarvoniUMWithSTAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateHCVHarvoniUMWithSTAssignmentDetails(DataTable hcvHarvoniUMWithSTAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvHarvoniUMWithSTAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateHCVHarvoniUMWithSTAssignmentPage.verifyHCVHarvoniUMWithSTAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignHCVHarvoniUMWithSTBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedHCVHarvoniUMWithST = assignmentDetails.get(iteration).get(18);
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateHCVHarvoniUMWithSTAssignmentPage.selectAssignHCVHarvoniUMWithSTBy(strAssignHCVHarvoniUMWithSTBy);
					updateHCVHarvoniUMWithSTAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateHCVHarvoniUMWithSTAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateHCVHarvoniUMWithSTAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateHCVHarvoniUMWithSTAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateHCVHarvoniUMWithSTAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateHCVHarvoniUMWithSTAssignmentPage.enterDrugListID(strDrugListID);
					updateHCVHarvoniUMWithSTAssignmentPage.enterDrugListName(strDrugListName);
					updateHCVHarvoniUMWithSTAssignmentPage.enterDrugListType(strDrugListType);
					updateHCVHarvoniUMWithSTAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateHCVHarvoniUMWithSTAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateHCVHarvoniUMWithSTAssignmentPage.enterClientNumber(strClientNumber);
					updateHCVHarvoniUMWithSTAssignmentPage.enterClientName(strClientName);
					updateHCVHarvoniUMWithSTAssignmentPage.enterClientStartDate(strClientStartDate);
					updateHCVHarvoniUMWithSTAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateHCVHarvoniUMWithSTAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateHCVHarvoniUMWithSTAssignmentPage.selectAssignedHCVHarvoniUMWithST(strAssignedHCVHarvoniUMWithST);
					updateHCVHarvoniUMWithSTAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateHCVHarvoniUMWithSTAssignmentPage.updateSelectedHCVHarvoniUMWithST(strSelectedAssignment);
					updateHCVHarvoniUMWithSTAssignmentPage.clickOnUpdateButton();
					updateHCVHarvoniUMWithSTAssignmentPage.selectAssignedHCVHarvoniUMWithST(strAssignedHCVHarvoniUMWithST);
					updateHCVHarvoniUMWithSTAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateHCVHarvoniUMWithSTAssignmentPage.updateSelectedHCVHarvoniUMWithST(arrSelectedAssignment[i]);
					}			
					updateHCVHarvoniUMWithSTAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}