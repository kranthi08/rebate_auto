package com.project.teststeps;

import com.project.actors.ActorCustomerContractsPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CustomerContractSteps 
{
	@Steps
	ActorCustomerContractsPage actorCustomerContractsPage;
	
	@Given("^User is on Customer Contracts page$")
	public void user_is_in_customer_contracts_page() throws Throwable
	{
		actorCustomerContractsPage.verifyUserIsInCustomerContractPage();
	}
	
	@When("^click on New button$")
	public void click_on_new_button() throws Throwable
	{
		actorCustomerContractsPage.clickOnNewButtonInCustomerContractsPage();
	}
	
	@Given("^User navigates to Customer Contracts page$")
	public void user_navigates_to_customer_contracts_page() throws Throwable
	{
		actorCustomerContractsPage.verifyUserIsInCustomerContractPage();
	}
		
	@When("^search for existing contract with following details$")
	public void search_for_existing_contract_with_following_details(DataTable contractSearchValues) throws Throwable
	{
		actorCustomerContractsPage.performSearchInCustomerContractsPage(contractSearchValues);
		
		
	}
	
	@When("^Click on File Admin link in Customer Contracts page$")
	public void click_on_file_admin_link_in_customer_contracts_page() throws Throwable
	{
		actorCustomerContractsPage.clickOnFileAdminLink();
	}
	@When("^Navigate to Master Customer Set Abbreviation page$")
	public void navigate_to_master_customer_set_abbreviation_page()throws Throwable
	{
		actorCustomerContractsPage.clickOnMasterCustomerSetAbbreviationLink();
	}
	
		
}
