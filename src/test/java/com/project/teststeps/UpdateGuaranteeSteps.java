package com.project.teststeps;

import com.project.actors.ActorUpdateGuaranteePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UpdateGuaranteeSteps 
{
	@Steps
	ActorUpdateGuaranteePage actorUpdateGuaranteePage;
	
	@Then("^update the following details in Guarantee panel$")
	public void update_the_following_details_in_guarantee_panel(DataTable updateGuaranteeScreenDetails) throws Throwable
	{
		actorUpdateGuaranteePage.updateDetailsInGuaranteeScreen(updateGuaranteeScreenDetails);
	}
	
}
