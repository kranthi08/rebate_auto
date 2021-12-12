package com.project.actors;

import java.util.List;
import com.project.pages.UpdateAuthorizedBrandAlternativesPage;
import com.project.pages.UpdateExcludeClaimsPage;
import com.project.pages.ViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateExcludeClaimsPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	UpdateExcludeClaimsPage updateExcludeClaimsPage;
	UpdateAuthorizedBrandAlternativesPage updateAuthorizedBrandAlternativesPage;
	
	@Step
	public void updateExcludeClaimsDetails(DataTable excludeClaimsData) throws Throwable {
		
		List<List<String>> excludeClaimsDetails = excludeClaimsData.raw();
		
		viewVendorFormularyIDAssignmentPage.clickOnUpdateButton();
		updateExcludeClaimsPage.verifyExcludeClaimsIsDisplayed();
		
		for(int iteration=1;iteration<excludeClaimsDetails.size();iteration++)
		{
			String strOperation = excludeClaimsDetails.get(iteration).get(0);
			String strSelectedClaimsToExclude = excludeClaimsDetails.get(iteration).get(1);
			String strExcludeClaimsBy  = excludeClaimsDetails.get(iteration).get(2);
			String strClient = excludeClaimsDetails.get(iteration).get(3);
			String strCoverageCode1 = excludeClaimsDetails.get(iteration).get(4);
			String strCoverageCode2 = excludeClaimsDetails.get(iteration).get(5);
			String strGroup = excludeClaimsDetails.get(iteration).get(6);

			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateExcludeClaimsPage.selectExcludeClaimsBy(strExcludeClaimsBy);
					updateExcludeClaimsPage.enterClient(strClient);	
					updateExcludeClaimsPage.enterCoverageCode1(strCoverageCode1);
					updateExcludeClaimsPage.enterCoverageCode2(strCoverageCode2);
					updateExcludeClaimsPage.enterGroup(strGroup);
					updateExcludeClaimsPage.clickOnAddButton();
					break;
				case "UPDATE":
					updateExcludeClaimsPage.updateSelectedClaimsToExclude(strSelectedClaimsToExclude);
					updateExcludeClaimsPage.clickOnUpdateButton();
					updateExcludeClaimsPage.enterClient(strClient);	
					updateExcludeClaimsPage.enterCoverageCode1(strCoverageCode1);
					updateExcludeClaimsPage.enterCoverageCode2(strCoverageCode2);
					updateExcludeClaimsPage.enterGroup(strGroup);
					updateExcludeClaimsPage.clickOnAddButton();
					break;
				case "REMOVE":
					String[] arrSelectedAssignment = strSelectedClaimsToExclude.split("\\^",-1);
					for(int i=0;i<arrSelectedAssignment.length;i++)
					{
						updateExcludeClaimsPage.updateSelectedClaimsToExclude(arrSelectedAssignment[i]);
					}			
					updateExcludeClaimsPage.clickOnRemoveButton();
					break;
			}
		}
		
		updateAuthorizedBrandAlternativesPage.clickOnSaveButton();
	}	
}