package com.project.teststeps;

import com.project.actors.ActorViewReportingPage;
import com.psqframework.core.page.BasePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ViewReportingSteps extends BasePage 
{
	@Steps	
	ActorViewReportingPage viewreportingPage;
	
	
	@When("^verify and expand the Reporting panel$")
	public void expand_the_panel(DataTable strPanel) throws Throwable
	{		
		viewreportingPage.expand_the_Panel(strPanel);
	}
	
	@Then("^verify Reporting details$")
	public void verify_reporting_details(DataTable viewreportingDetails)  throws Throwable
	{
		viewreportingPage.verify_Reporting_Details(viewreportingDetails);
	}
	
}
