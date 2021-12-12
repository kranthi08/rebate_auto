package com.project.teststeps;

import com.project.actors.ActorAddReportingPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddReportingSteps 
{
	@Steps
	ActorAddReportingPage reportingPage;
	
	
	@Then("^Reporting screen should be displayed$")
	public void reporting_screen_should_be_displayed() 	throws Throwable
	{
		reportingPage.verifyReportingScreenDisplay();
	}
	
	@Given("^User is on Reporting screen$")
	public void user_is_on_reporting_screen()	throws Throwable
	{
		reportingPage.verifyUserIsOnReportingScreen();
	}
	
	@When("^submit the following details in Reporting screen$")
	public void submit_the_following_details_in_reporting_screen(DataTable reportingPanelDetails) 	throws Throwable
	{
		reportingPage.detailsSubmitionInReportingScreen(reportingPanelDetails);
	}
	
	@Then("^click on Next button in Reporting Screen$")
	public void click_on_next_button_in_reporting_screen()		throws Throwable
	{
		reportingPage.nextButtonInReportingScreen();
	}
	
	
	
	
}
