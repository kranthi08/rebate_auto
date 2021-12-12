package com.project.teststeps;

import net.thucydides.core.annotations.Steps;
import com.project.actors.ActorAddGuaranteePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddGuaranteeSteps 
{
	@Steps
	ActorAddGuaranteePage	guaranteepage;
	
	@Then("^Guarantee screen should be displayed$")
	public void guarantee_screen_should_be_displayed() throws Throwable
	{
		guaranteepage.verifyGuaranteeScreenDisplay();
	}
	
	@And("^Guarantee Screen should be displayed$")
	public void guarantee_screen_is_displayed() throws Throwable
	{
		guaranteepage.verifyGuaranteeScreenDisplay();
	}
	
	@Given("^User is on Gurantee screen$")
	public void user_is_on_Gurantee_screen()	throws Throwable
	{
		guaranteepage.verifyUserIsOnGuranteeScreen();
	}
	
	@When("^submit the following details in Guarantee screen$")
	public void submit_the_following_details_in_guarantee_screen(DataTable GuaranteescreenData )	throws Throwable
	{
		guaranteepage.submitTheDetailsInGuaranteeScreen(GuaranteescreenData);
	}
	
	@Then("^click on Next button in Guarantee screen$")
	public void click_on_next_button_in_guarantee_screen()	throws Throwable
	{
		guaranteepage.nextButtonClickInGuaranteeScreen();
	}
	
}
