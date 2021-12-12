package com.project.teststeps;

import com.project.actors.ActorBenefitFileSummaryPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BenefitFileSummarySteps 
{
	@Steps
	ActorBenefitFileSummaryPage actorBenefitFileSummaryTab;
	
	@When("^click on Benefit File Summary Tab$")
	public void click_on_benefit_file_summary_tab()	throws Throwable
	{
		actorBenefitFileSummaryTab.benefitFileTabSelection();
	}
	@Then("^Benefit File Summary Tab should be displayed$")
	public void verify_user_navigated_to_benefit_file_summary_tab() throws Throwable
	{
		actorBenefitFileSummaryTab.benefitPageShouldBeDisplayed();
	}
	
	@Given("^User is in Benefit File Summary Tab$")
	public void user_is_in_benefit_file_summary_tab( ) throws Throwable
	{
		actorBenefitFileSummaryTab.verifyUserIsInBenefitFileSummaryTabOrNot();
	}
	
	@When("^verify and expand the Benefit File Summary Tab$")
	public void verify_and_expand_the_benefit_file_summary_tab(DataTable panelName) throws Throwable
	{
		actorBenefitFileSummaryTab.expandBenefitFileSummaryTab(panelName);
	}
	
	@Then("^select the required Line Of Business$")
	public void select_the_required_line_of_business(DataTable lineOfBusiness) throws Throwable
	{
		actorBenefitFileSummaryTab.selectTheLineOfBusiness(lineOfBusiness);
	}
	
	@And("^perform the Benefit Run Preliminary Extract process and verify the complete status$")
	public void perform_the_run_preliminary_extraction_process_and_verify_the_complete_status() throws Throwable
	{
		actorBenefitFileSummaryTab.performRunPreliminaryExtractAndVerifyStatus();
	}
	
	@And("^verify the Benefit File Summary Prelim Results$")
	public void verify_the_benefit_file_summary_prelim_results(DataTable prelimResults) throws Throwable
	{
		actorBenefitFileSummaryTab.verifyBenefitFileSummaryPreliminaryExtractionResults(prelimResults);
	}
	
	@And("^verify the Benefit File Summary Tab Final Results$")
	public void verify_the_benefit_file_summary_tab_final_results(DataTable finalResults) throws Throwable	
	{
		actorBenefitFileSummaryTab.verifyBenefitFileSummaryFinalExtractionResults(finalResults);
	}
		
}
