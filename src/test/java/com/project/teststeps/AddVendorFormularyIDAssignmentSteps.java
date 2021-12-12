package com.project.teststeps;

import com.project.actors.ActorAddVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddVendorFormularyIDAssignmentSteps 
{
	
	@Steps
	ActorAddVendorFormularyIDAssignmentPage actorAddVendorFormularyIDAssignmentPage;
	
	@Then("^Assignment Criteria screen should be displayed$")
	public void assignment_criteria_screen_should_be_displayed() throws Throwable
	{
		actorAddVendorFormularyIDAssignmentPage.verifyAssignmentCriteria();
	}
	
	@Given("^User is on Assignment Criteria screen$")
	public void user_is_on_assignment_criteria_screen()	throws Throwable
	{
		actorAddVendorFormularyIDAssignmentPage.verifyAssignmentCriteria();
	}
	
	@When("^submit the following Vendor Formulary ID Assignment details$")
	public void submit_the_following_vendor_formulary_id_assignment_details(DataTable vendorFormularyIDAssignmentData)	throws Throwable
	{
		actorAddVendorFormularyIDAssignmentPage.submitVendorFormularyIDAssignmentDetails(vendorFormularyIDAssignmentData);
	}
	
	@Then("^verify Selected Vendor Formulary ID Assignment details$")
	public void verify_selected_vendor_formulary_id_assignment_details(DataTable selectedVendorFormularyIDAssignmentData)	throws Throwable
	{
		actorAddVendorFormularyIDAssignmentPage.verifySelectedVendorFormularyIDAssignmentDetails(selectedVendorFormularyIDAssignmentData);
	}
	
	@When("^click on Next button in Assignment Criteria screen$")
	public void click_on_next_button_in_assignment_criteria_screen() throws Throwable
	{
		actorAddVendorFormularyIDAssignmentPage.clickOnNextButton();
	}
}
