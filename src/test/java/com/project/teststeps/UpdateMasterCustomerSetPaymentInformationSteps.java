package com.project.teststeps;

import com.project.actors.ActorUpdateMasterCustomerSetPaymentInformationPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateMasterCustomerSetPaymentInformationSteps 
{
	@Steps
	ActorUpdateMasterCustomerSetPaymentInformationPage actorUpdateMasterCustomerSetPaymentInformationPage;
	
	@Given("^User navigate to Payment Details tab$")
	public void user_navigate_to_payment_details_tab()	throws Throwable
	{
		actorUpdateMasterCustomerSetPaymentInformationPage.clickOnPaymentDetailsTab();
		actorUpdateMasterCustomerSetPaymentInformationPage.verifyPaymentDetailsTab();
	}
	
	@When("^verify and expand the Master Customer Set Payment Information panel$")
	public void verify_and_expand_the_master_customer_set_payment_information_panel(DataTable panelName)	throws Throwable
	{
		actorUpdateMasterCustomerSetPaymentInformationPage.expandMasterCustomerSetPaymentInformationPanel(panelName);
	}
	
	@Then("^update the following details in Payment Frequency panel$")
	public void update_the_following_details_in_payment_frequency_panel(DataTable paymentFrequencyData)	throws Throwable
	{
		actorUpdateMasterCustomerSetPaymentInformationPage.updatePaymentFrequencyDetails(paymentFrequencyData);
	}
	
	@Given("^User is on Payments Details tab$")
	public void user_is_on_payment_details_tab()	throws Throwable
	{
		actorUpdateMasterCustomerSetPaymentInformationPage.verifyPaymentDetailsTab();
	}
	
	@Then("^update the following details in Payment History panel$")
	public void update_the_following_details_in_payment_history_panel(DataTable paymentHistoryData)	throws Throwable
	{
		actorUpdateMasterCustomerSetPaymentInformationPage.updatePaymentHistoryDetails(paymentHistoryData);
	}
	
}
