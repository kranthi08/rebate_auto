package com.project.actors;

import java.util.List;
import com.project.pages.ClaimFileSummaryPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorClaimFileSummaryPage 
{
	@Steps
	ClaimFileSummaryPage claimfilesummaryTab;
	
	@Step
	public void claimFileSummaryTabSelection() throws Throwable
	{
			claimfilesummaryTab.clickOnClaimFileSummaryTabLink();						
	}
	
	@Step
	public void claimFileSummaryTabDisplay() throws Throwable
	{
		claimfilesummaryTab.verifyClaimFileSummaryTabDisplayedOrNot();
	}
	@Step
	public void verifyAndExpandThePanel(DataTable panelName) throws Throwable
	{
		List<List<String>> panelDetails = panelName.raw();
		String strPanel_Name = panelDetails.get(1).get(0);
		
		claimfilesummaryTab.verifyAndExpandThePanel(strPanel_Name);
		
	}
	@Step
	public void performRunPreliminaryExtractAndVerifyStatus() throws Throwable
	{
		claimfilesummaryTab.clickOnRunPreliminaryExtractButton();
		claimfilesummaryTab.verifyRunPreliminaryExtractStatus("Complete");
	}
	
	@Step
	public void verifyThePrelimExtractionResults(DataTable prelimExtractionResults)throws Throwable
	{
		List<List<String>> prelimExtractionDetails = prelimExtractionResults.raw();
		
		String strPrimaryResults = prelimExtractionDetails.get(1).get(0);
		String strClaimsIncluded = prelimExtractionDetails.get(1).get(1);
		String strClaimsMissingVendorFormularyID = prelimExtractionDetails.get(1).get(2);
		String strClaimsMissingLineOfBusiness = prelimExtractionDetails.get(1).get(3);
		String strClaimsWithVendorFormularyID = prelimExtractionDetails.get(1).get(4);
		String strClaimsWithLineOfBusiness = prelimExtractionDetails.get(1).get(5);
		
		String strClaimFileDateFormat = claimfilesummaryTab.getClaimFileSummaryTabDateFormat();
		
		claimfilesummaryTab.verifyClaimFileSummaryTabPreliminaryResultDateFormat(strPrimaryResults+strClaimFileDateFormat);
		claimfilesummaryTab.verifyPreliminaryExtractionsResults(strClaimsIncluded);
		claimfilesummaryTab.verifyPreliminaryExtractionsResults(strClaimsMissingVendorFormularyID);
		claimfilesummaryTab.verifyPreliminaryExtractionsResults(strClaimsMissingLineOfBusiness);
		claimfilesummaryTab.verifyPreliminaryExtractionsResults(strClaimsWithVendorFormularyID);
		claimfilesummaryTab.verifyPreliminaryExtractionsResults(strClaimsWithLineOfBusiness);
	}
	
}
