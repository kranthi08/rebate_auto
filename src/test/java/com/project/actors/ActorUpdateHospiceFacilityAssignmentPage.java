package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateHospiceFacilityAssignmentPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateHospiceFacilityAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateHospiceFacilityAssignmentPage updateHospiceFacilityAssignmentPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateHospiceFacilityAssignmentDetails(DataTable hospiceFacilityAssignmentData) throws Throwable {
		
		List<List<String>> assignmentDetails = hospiceFacilityAssignmentData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateHospiceFacilityAssignmentPage.verifyHospiceFacilityAssignmentIsDisplayed();
		
		for(int iteration=1;iteration<assignmentDetails.size();iteration++)
		{
			String strOperation = assignmentDetails.get(iteration).get(0);
			String strSelectedAssignment = assignmentDetails.get(iteration).get(1);
			String strAssignHospiceFacilityBy  = assignmentDetails.get(iteration).get(2);
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
			String strAssignedHospiceFacility = assignmentDetails.get(iteration).get(18);			
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateHospiceFacilityAssignmentPage.selectAssignHospiceFacilityBy(strAssignHospiceFacilityBy);
					updateHospiceFacilityAssignmentPage.enterCoverageCode1(strCoverageCode1);
					updateHospiceFacilityAssignmentPage.enterCoverageCode2(strCoverageCode2);
					updateHospiceFacilityAssignmentPage.enterCoverageCodeDescription(strCoverageCodeDescription);
					updateHospiceFacilityAssignmentPage.enterCoverageCodeStatus(strCoverageCodeStatus);
					if(!strAvailableCoverageCodes.isEmpty())
					{
						String[] arrAvailableCoverageCodes = strAvailableCoverageCodes.split("\\^",-1);
						
						for(int i=0;i<arrAvailableCoverageCodes.length;i++)
						{
							updateHospiceFacilityAssignmentPage.selectAvailableCoverageCodes(arrAvailableCoverageCodes[i]);
						}						
					}					
					updateHospiceFacilityAssignmentPage.enterDrugListID(strDrugListID);
					updateHospiceFacilityAssignmentPage.enterDrugListName(strDrugListName);
					updateHospiceFacilityAssignmentPage.enterDrugListType(strDrugListType);
					updateHospiceFacilityAssignmentPage.enterDrugListStatus(strDrugListStatus);
					if(!strAvailableDrugLists.isEmpty())
					{
						String[] arrAvailableDrugLists = strAvailableDrugLists.split("\\^",-1);
						
						for(int i=0;i<arrAvailableDrugLists.length;i++)
						{
							updateHospiceFacilityAssignmentPage.selectAvailableDrugLists(arrAvailableDrugLists[i]);
						}						
					}
					updateHospiceFacilityAssignmentPage.enterClientNumber(strClientNumber);
					updateHospiceFacilityAssignmentPage.enterClientName(strClientName);
					updateHospiceFacilityAssignmentPage.enterClientStartDate(strClientStartDate);
					updateHospiceFacilityAssignmentPage.enterClientEndDate(strClientEndDate);
					if(!strAvailableClients.isEmpty())
					{
						String[] arrAvailableClients = strAvailableClients.split("\\^",-1);
						
						for(int i=0;i<arrAvailableClients.length;i++)
						{
							updateHospiceFacilityAssignmentPage.selectAvailableClients(arrAvailableClients[i]);
						}						
					}
					updateHospiceFacilityAssignmentPage.selectAssignedHospiceFacility(strAssignedHospiceFacility);
					updateHospiceFacilityAssignmentPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateHospiceFacilityAssignmentPage.updateSelectedHospiceFacility(strSelectedAssignment);
					updateHospiceFacilityAssignmentPage.clickOnUpdateButton();
					updateHospiceFacilityAssignmentPage.selectAssignedHospiceFacility(strAssignedHospiceFacility);
					updateHospiceFacilityAssignmentPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedAssignment.split("\\^",-1);
					
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateHospiceFacilityAssignmentPage.updateSelectedHospiceFacility(arrSelectedAssignment[i]);
					}			
					updateHospiceFacilityAssignmentPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}
}