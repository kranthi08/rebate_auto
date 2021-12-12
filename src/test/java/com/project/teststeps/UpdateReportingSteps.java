package com.project.teststeps;

import com.project.actors.ActorUpdateReportingPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UpdateReportingSteps 
{
	@Steps
	ActorUpdateReportingPage updateReportingPage;
	
	
	@Then("^update the following details in Reporting panel$")
	public void update_the_following_details_in_reporting_panel(DataTable reportingPanelData)	throws Throwable
	{
		updateReportingPage.updatingDetailsInReportingScreen(reportingPanelData);
	}
	
	
}
