package com.project.actors;

import java.util.List;
import com.project.pages.ViewExcludeClaimsPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewExcludeClaimsPage {
	
	@Steps
	ViewExcludeClaimsPage viewExcludeClaimsPage;
	
	@Step
	public void verifyExcludedClaimsDetails(DataTable viewExcludeClaimsData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewExcludeClaimsData.raw();
		
		String strExcludedClaimsDetails = ""; 
		String strExcludeClaimsBy = viewAssignmentDetails.get(1).get(0);
		String strClient  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode1 = viewAssignmentDetails.get(1).get(2);
		String strCoverageCode2 = viewAssignmentDetails.get(1).get(3);
		String strGroup = viewAssignmentDetails.get(1).get(4);

		switch(strExcludeClaimsBy.toUpperCase())
		{
			case "CLIENT":
				strExcludedClaimsDetails = strClient;				
				break;
			case "COVERAGE CODE":
				strExcludedClaimsDetails = strCoverageCode1+"*"+strCoverageCode2;
				break;
			case "GROUP":
				strExcludedClaimsDetails = strClient+"*"+strGroup;
				break;
		}
		
		viewExcludeClaimsPage.verifyExcludedClaimsDetails(strExcludedClaimsDetails);
	}
}