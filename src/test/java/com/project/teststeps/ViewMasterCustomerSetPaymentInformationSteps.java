package com.project.teststeps;

import com.project.actors.ActorViewMasterCustomerSetPaymentInformationPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ViewMasterCustomerSetPaymentInformationSteps 
{
	
	@Steps
	ActorViewMasterCustomerSetPaymentInformationPage actorViewMasterCustomerSetPaymentInformationPage;
	
	@Then("^verify Payment Frequency details$")
	public void verify_payment_frequency_details(DataTable viewPaymentFrequencyData) throws Throwable
	{
		actorViewMasterCustomerSetPaymentInformationPage.verifyPaymentFrequencyDetails(viewPaymentFrequencyData);
	}
	
	@Then("^verify Payment History details$")
	public void verify_payment_history_details(DataTable viewPaymentHistoryData) throws Throwable
	{
		actorViewMasterCustomerSetPaymentInformationPage.verifyPaymentHistoryDetails(viewPaymentHistoryData);
	}
}
