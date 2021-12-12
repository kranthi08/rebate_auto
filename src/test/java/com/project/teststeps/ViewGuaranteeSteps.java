package com.project.teststeps;

import com.project.actors.ActorViewGuaranteePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ViewGuaranteeSteps 
{
	@Steps
	ActorViewGuaranteePage actorViewGuaranteePage;
	
	
	@When("^verify and expand the Guarantee panel$")
	public void expand_guarantee_panel(DataTable strPanelName) throws Throwable
	{
		actorViewGuaranteePage.expand_guarantee_panel(strPanelName);
	}
	
	@Then("^verify Guarantee details$")
	public void verify_guarantee_details(DataTable guaranteeTableData) throws Throwable
	{
		actorViewGuaranteePage.verify_guarantee_details(guaranteeTableData);
	}
	
}
