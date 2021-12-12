package com.project.teststeps;

import com.project.actors.ActorAddContractInformationPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class AddContractInformationSteps 
{
	
	@Steps
	ActorAddContractInformationPage actorContractInformation;
	
	@Then("^Customer Contract Creation page should be displayed$")
	public void customer_contract_creation_page_should_be_displayed()	throws Throwable
	{
		actorContractInformation.VerifyCustomerContractCreationPagedisplay();
	}
	
	@And("^input the Vendor details in Contract Information screen$")
	public void input_the_vendor_details_in_contract_information_screen(DataTable contractInformation)	throws Throwable
	{
		actorContractInformation.vendorDetailsInputInContractInformationScreen(contractInformation);
	}
	
	@And("^submit the Rate details in Contract Information screen$")
	public void submit_the_rate_details_in_contract_information_screen(DataTable rateDetails)	throws Throwable
	{
		actorContractInformation.rateDetailsSubmitInContractIinformationScreen(rateDetails);
	}
	
	@And("^click on Next button in Contract Information screen$")
	public void click_on_next_button_in_contract_information_screen()	throws Throwable
	{
		actorContractInformation.nextButtonClickInContractInformationScreen();
	}
	
	@Then("^Click on Next button in Contract Information Screen$")
	public void click_on_next_button_in_contract_information_Screen()	throws Throwable
	{
		actorContractInformation.nextButtonClickInContractInformationScreen();
	}
		
}
