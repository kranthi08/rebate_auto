package com.project.teststeps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import com.project.actors.ActorViewContractInformationPage;

public class ViewContractInformationSteps 
{
	
	@Steps
	ActorViewContractInformationPage viewContractInformationPage;
	
	@Then("^Contract tab should be displayed$")
	public void contract_tab_should_be_displayed() throws Throwable
	{
		viewContractInformationPage.verifyTheContractTabDisplay();
	}

	@And("^verify Vendor details in Contract Information screen$")
	public void verify_vendor_details_in_contract_information_screen(DataTable vendorDetails) throws Throwable
	{
		viewContractInformationPage.viewAndVerifyTheVendorContractDetails(vendorDetails);
	}
	
	@And("^verify Rate details in Contract Information screen$")
	public void verify_rate_details_in_contract_information_screen(DataTable rateDetailsTableData) throws Throwable
	{
		viewContractInformationPage.verifyRateDetailsInContractInformationScreen(rateDetailsTableData);
	}	
	
	@Given("^User is on Contract Tab$")
	public void user_is_on_contract_tab() throws Throwable
	{
		viewContractInformationPage.verifyTheContractTabDisplay();
	}

}
