package com.project.teststeps;

import com.project.actors.ActorFileAdminSearchAndViewPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FileAdminPageSteps 
{
	
	@Steps
	ActorFileAdminSearchAndViewPage fileadminPage;
	
	@Then("^File Admin Page should be displayed$")
	public void file_admin_page_should_be_displayed()	throws Throwable
	{
		fileadminPage.verifyPageNavigatedToFileAdmin();
	}
	
	@Given("^User is on File Admin Page$")
	public void user_is_on_file_admin_page()		throws Throwable
	{
		fileadminPage.verifyPageNavigatedToFileAdmin();
	}
	
	@When("^perform serach with File Type and Status$")
	public void perform_search_with_file_type_and_status(DataTable searchcriteria_ALLandALL)	throws Throwable
	{
		fileadminPage.performSearchWithFileTypeAndStatus(searchcriteria_ALLandALL);
	}
	
	@Then("^verify the File Admin search results for Status All$")
	public void verify_the_file_admin_search_reaults_for_status_all(DataTable resultsALLandALL)	throws Throwable
	{
		fileadminPage.verifyFileAdminSearchResultsAndBrowseErrorDetails(resultsALLandALL);
	}
	
	@Then("^verify the File Admin search results for Status Processed$")
	public void verify_the_file_admin_search_results_for_status_processed(DataTable resultsALLandProcessed) throws Throwable
	{
		fileadminPage.verifyFileAdminSearchResultsTableData(resultsALLandProcessed);
	}
	
	@Then("^verify the File Admin search results and Browse Error Details$")
	public void verify_the_file_admin_search_results_and_browse_error_details(DataTable resultsFailedErrorDetails)	throws Throwable
	{
		fileadminPage.verifyFileAdminSearchResultsAndBrowseErrorDetails(resultsFailedErrorDetails);
	}
		
	@Then("^verify the File Admin search results for Status In Progress$")
	public void verify_the_file_admin_search_results_for_inprogress(DataTable resultsInProgress)throws Throwable
	{
		fileadminPage.verifyFileAdminSearchResultsTableData(resultsInProgress);
	}
	
	@And("^Verify the claimdetails file execution status$")
	public void verify_the_claimdetails_file_execution_status(DataTable claimDetailFileData)throws Throwable
	{
		fileadminPage.verifyClaimDetailsFileStatus(claimDetailFileData);
	}
}
