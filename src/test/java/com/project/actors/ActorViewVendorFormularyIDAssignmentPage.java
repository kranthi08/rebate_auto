package com.project.actors;

import java.util.List;

import com.project.pages.ViewVendorFormularyIDAssignmentPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewVendorFormularyIDAssignmentPage {
	
	@Steps
	ViewVendorFormularyIDAssignmentPage viewVendorFormularyIDAssignmentPage;
	
	@Step
	public void expandAssignmentCriteriaPanel(DataTable panelName) throws Throwable
	{
		List<List<String>>panelDetails = panelName.raw();
		
		String strPanelName = panelDetails.get(1).get(0);		
		
		viewVendorFormularyIDAssignmentPage.expandAssignmentCriteriaPanel(strPanelName);
	}
	
	@Step
	public void verifyVendorFormularyIDDetails(DataTable viewVendorFormularyIDData) throws Throwable {
		
		List<List<String>> viewAssignmentDetails = viewVendorFormularyIDData.raw();
		
		String strVendorFormularyIDDetails = ""; 
		String strVendorFormularyIDBy = viewAssignmentDetails.get(1).get(0);
		String strCustomer  = viewAssignmentDetails.get(1).get(1);
		String strCoverageCode = viewAssignmentDetails.get(1).get(2);
		String strDrugListID = viewAssignmentDetails.get(1).get(3);
		String strClient = viewAssignmentDetails.get(1).get(4);
		String strClientName = viewAssignmentDetails.get(1).get(5);
		String strAssignedVendorFormularyID = viewAssignmentDetails.get(1).get(6);

		switch(strVendorFormularyIDBy.toUpperCase())
		{
			case "CUSTOMER":
				strVendorFormularyIDDetails = strCustomer;				
				break;
			case "COVERAGE CODE":
				strVendorFormularyIDDetails = strCoverageCode;
				break;
			case "DRUG LIST":
				strVendorFormularyIDDetails = strDrugListID;
				break;
			case "CLIENT":
				strVendorFormularyIDDetails = strClient+"*"+strClientName;
				break;
		}
		
		strVendorFormularyIDDetails = strVendorFormularyIDDetails+"*"+strAssignedVendorFormularyID;
		
		viewVendorFormularyIDAssignmentPage.verifyVendorFormularyIDDetails(strVendorFormularyIDDetails);
	}
}