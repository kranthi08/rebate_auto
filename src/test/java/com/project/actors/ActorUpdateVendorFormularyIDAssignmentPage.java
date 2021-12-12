package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateVendorFormularyIDAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateVendorFormularyIDAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateVendorFormularyIDAssignmentPage updateVendorFormularyIDAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateVendorFormularyIDAssignmentDetails(DataTable vendorFormularyIDAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = vendorFormularyIDAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateVendorFormularyIDAssignmentPage.verifyVendorFormularyIDAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignVendorFormularyIDBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedVendorFormularyID = assignmentDetails.get(iteration).get(18);		

			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateVendorFormularyIDAssignmentPage.selectAssignVendorFormularyIDBy(strAssignVendorFormularyIDBy);
					updateVendorFormularyIDAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateVendorFormularyIDAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateVendorFormularyIDAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateVendorFormularyIDAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateVendorFormularyIDAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateVendorFormularyIDAssignmentPage.enterDrugListID(strDrugListID);
					updateVendorFormularyIDAssignmentPage.enterDrugListName(strDrugListName);
					updateVendorFormularyIDAssignmentPage.enterDrugListType(strDrugListType);
					updateVendorFormularyIDAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateVendorFormularyIDAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateVendorFormularyIDAssignmentPage.enterClientNumber(strClientNumber);
					updateVendorFormularyIDAssignmentPage.enterClientName(strClientName);
					updateVendorFormularyIDAssignmentPage.enterClientStartDate(strClientStartDate);
					updateVendorFormularyIDAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateVendorFormularyIDAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateVendorFormularyIDAssignmentPage.enterAssignedVendorFormularyID(strAssignedVendorFormularyID);
					updateVendorFormularyIDAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateVendorFormularyIDAssignmentPage.updateSelectedVendorFormularyID(strSelectedAssignment);
					updateVendorFormularyIDAssignmentPage.clickOnUpdateButton();
					updateVendorFormularyIDAssignmentPage.enterAssignedVendorFormularyID(strAssignedVendorFormularyID);
					updateVendorFormularyIDAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateVendorFormularyIDAssignmentPage.updateSelectedVendorFormularyID(arrSelectedAssignment[i]);
					}			
					updateVendorFormularyIDAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}