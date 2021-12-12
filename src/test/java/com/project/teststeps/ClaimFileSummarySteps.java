package com.project.teststeps;

import com.project.actors.ActorClaimFileSummaryPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ClaimFileSummarySteps 
{
	@Steps
	ActorClaimFileSummaryPage actorclaimfilesummaryPage;
	
	@When("^click on Claim File Summary Tab$")
	public void click_on_claim_file_summary_tab() throws Throwable
	{
		actorclaimfilesummaryPage.claimFileSummaryTabSelection();
	}
	
	@Then("^Claim File Summary Tab should be displayed$")
	public void claim_file_summary_tab_should_be_displayed() throws Throwable
	{
		actorclaimfilesummaryPage.claimFileSummaryTabDisplay();
	}
	
	@Given("^User is in Claim File Summary Tab$")
	public void user_is_in_claim_file_summary_tab() throws Throwable
	{
		actorclaimfilesummaryPage.claimFileSummaryTabDisplay();
	}
	
	@When("^verify and expand the Claim File Summary Pannel$")
	public void verify_and_expand_the_claim_file_summary_pannel(DataTable panelName) throws Throwable
	{
		actorclaimfilesummaryPage.verifyAndExpandThePanel(panelName);
	}
	
	@Then("^perform the Run Preliminary Extract process and verify the complete status$")
	public void perform_the_run_preliminary_extraction_process_and_verify_the_complete_status() throws Throwable
	{
		actorclaimfilesummaryPage.performRunPreliminaryExtractAndVerifyStatus();
	}
	
	@Then("^verify the Claim File Summary Preliminary extraction results$")
	public void verify_the_claim_file_summary_preliminary_extraction_results(DataTable preliminaryResults) throws Throwable
	{
		actorclaimfilesummaryPage.verifyThePrelimExtractionResults(preliminaryResults);
	}
	
}
