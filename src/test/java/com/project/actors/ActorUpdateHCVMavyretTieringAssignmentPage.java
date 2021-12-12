package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateHCVMavyretTieringAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateHCVMavyretTieringAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateHCVMavyretTieringAssignmentPage updateHCVMavyretTieringAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateHCVMavyretTieringAssignmentDetails(DataTable hcvMavyretTieringAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hcvMavyretTieringAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateHCVMavyretTieringAssignmentPage.verifyHCVMavyretTieringAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignHCVMavyretTieringBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedHCVMavyretTiering = assignmentDetails.get(iteration).get(18);
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateHCVMavyretTieringAssignmentPage.selectAssignHCVMavyretTieringBy(strAssignHCVMavyretTieringBy);
					updateHCVMavyretTieringAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateHCVMavyretTieringAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateHCVMavyretTieringAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateHCVMavyretTieringAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateHCVMavyretTieringAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateHCVMavyretTieringAssignmentPage.enterDrugListID(strDrugListID);
					updateHCVMavyretTieringAssignmentPage.enterDrugListName(strDrugListName);
					updateHCVMavyretTieringAssignmentPage.enterDrugListType(strDrugListType);
					updateHCVMavyretTieringAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateHCVMavyretTieringAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateHCVMavyretTieringAssignmentPage.enterClientNumber(strClientNumber);
					updateHCVMavyretTieringAssignmentPage.enterClientName(strClientName);
					updateHCVMavyretTieringAssignmentPage.enterClientStartDate(strClientStartDate);
					updateHCVMavyretTieringAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateHCVMavyretTieringAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateHCVMavyretTieringAssignmentPage.selectAssignedHCVMavyretTiering(strAssignedHCVMavyretTiering);
					updateHCVMavyretTieringAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateHCVMavyretTieringAssignmentPage.updateSelectedHCVMavyretTiering(strSelectedAssignment);
					updateHCVMavyretTieringAssignmentPage.clickOnUpdateButton();
					updateHCVMavyretTieringAssignmentPage.selectAssignedHCVMavyretTiering(strAssignedHCVMavyretTiering);
					updateHCVMavyretTieringAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateHCVMavyretTieringAssignmentPage.updateSelectedHCVMavyretTiering(arrSelectedAssignment[i]);
					}			
					updateHCVMavyretTieringAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}