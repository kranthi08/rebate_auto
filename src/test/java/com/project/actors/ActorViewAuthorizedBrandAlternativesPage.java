package com.project.actors;

import java.util.List;

import com.project.pages.ViewAuthorizedBrandAlternativesPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewAuthorizedBrandAlternativesPage {
	
	@Steps
	ViewAuthorizedBrandAlternativesPage viewAuthorizedBrandAlternativesPage;
	
	@Step
	public void expandAuthorizedBrandAlternativesPanel(DataTable panelName) throws Throwable
	{
		List<List<String>>panelDetails = panelName.raw();
		
		String strPanelName = panelDetails.get(1).get(0);		
		
		viewAuthorizedBrandAlternativesPage.expandAuthorizedBrandAlternativesPanel(strPanelName);
	}
	
	@Step
	public void verifyAuthorizedBrandAlternativesDetails(DataTable viewAuthorizedBrandAlternativesData) throws Throwable {
		
		List<List<String>> viewReportingDetails = viewAuthorizedBrandAlternativesData.raw();
		
		String strVendorFormularyID = viewReportingDetails.get(1).get(0);
		String strABANDC  = viewReportingDetails.get(1).get(1);
		String strABADescription = viewReportingDetails.get(1).get(2);
		String strStartDate = viewReportingDetails.get(1).get(3);
		String strEndDate = viewReportingDetails.get(1).get(4);

		String strReportingDetails = strVendorFormularyID+"*"+strABANDC+"*"+strABADescription+"*"+strStartDate+"*"+strEndDate;
		
		viewAuthorizedBrandAlternativesPage.verifyReportingDetails(strReportingDetails);
	}
}