package com.project.actors;

import java.util.List;
import com.project.pages.AddExcludeClaimsPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddExcludeClaimsPage {
	
	@Steps
	AddExcludeClaimsPage addExcludeClaimsPage;
	
	@Step
	public void submitExcludeClaimsDetails(DataTable excludeClaimsData) throws Throwable {
		
		List<List<String>> excludeClaimsDetails = excludeClaimsData.raw();
		
		String strOperation = excludeClaimsDetails.get(1).get(0);
		String strSelectedClaimsToExclude = excludeClaimsDetails.get(1).get(1);
		String strExcludeClaimsBy  = excludeClaimsDetails.get(1).get(2);
		String strClient = excludeClaimsDetails.get(1).get(3);
		String strCoverageCode1 = excludeClaimsDetails.get(1).get(4);
		String strCoverageCode2 = excludeClaimsDetails.get(1).get(5);
		String strGroup = excludeClaimsDetails.get(1).get(6);		

		addExcludeClaimsPage.verifyExcludeClaimsIsDisplayed();
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addExcludeClaimsPage.selectExcludeClaimsBy(strExcludeClaimsBy);
				addExcludeClaimsPage.enterClient(strClient);	
				addExcludeClaimsPage.enterCoverageCode1(strCoverageCode1);
				addExcludeClaimsPage.enterCoverageCode2(strCoverageCode2);
				addExcludeClaimsPage.enterGroup(strGroup);
				addExcludeClaimsPage.clickOnAddButton();
				break;
			case "UPDATE":
				addExcludeClaimsPage.updateSelectedClaimsToExclude(strSelectedClaimsToExclude);
				addExcludeClaimsPage.clickOnUpdateButton();
				addExcludeClaimsPage.enterClient(strClient);	
				addExcludeClaimsPage.enterCoverageCode1(strCoverageCode1);
				addExcludeClaimsPage.enterCoverageCode2(strCoverageCode2);
				addExcludeClaimsPage.enterGroup(strGroup);
				addExcludeClaimsPage.clickOnAddButton();
				break;
			case "REMOVE":
				String[] arrSelectedAssignment = strSelectedClaimsToExclude.split("\\^",-1);
				for(int i=0;i<arrSelectedAssignment.length;i++)
				{
					addExcludeClaimsPage.updateSelectedClaimsToExclude(arrSelectedAssignment[i]);
				}			
				addExcludeClaimsPage.clickOnRemoveButton();
				break;
		}
	}
	
	@Step
	public void verifyExcludeClaimsDetails(DataTable selectedClaimsToExcludeData) throws Throwable {
		
		List<List<String>> excludeClaimsDetails = selectedClaimsToExcludeData.raw();
		
		String strSelectedClaimsDetails = "";
		
		String strExcludeClaimsBy = excludeClaimsDetails.get(1).get(0);
		String strClient  = excludeClaimsDetails.get(1).get(1);
		String strCoverageCode1 = excludeClaimsDetails.get(1).get(2);
		String strCoverageCode2 = excludeClaimsDetails.get(1).get(3);
		String strGroup = excludeClaimsDetails.get(1).get(4);

		switch(strExcludeClaimsBy.toUpperCase())
		{
			case "CLIENT":
				strSelectedClaimsDetails = strClient;
				break;
			case "COVERAGE CODE":
				strSelectedClaimsDetails = strCoverageCode1+"*"+strCoverageCode2;
				break;
			case "GROUP":
				strSelectedClaimsDetails = strClient+"*"+strGroup;
				break;
		}
		
		addExcludeClaimsPage.verifySelectedClaimsToExcludeDetails(strSelectedClaimsDetails);
	}	
}