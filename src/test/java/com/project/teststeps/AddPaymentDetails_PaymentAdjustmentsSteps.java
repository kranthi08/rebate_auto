package com.project.teststeps;

import com.project.actors.ActorAddPaymentDetails_PaymentAdjustmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddPaymentDetails_PaymentAdjustmentsSteps 
{
	@Steps
	ActorAddPaymentDetails_PaymentAdjustmentPage actorPaymentAdjustments;
	
	
	@When("^Click on Payment Details Tab$")
	public void click_on_payment_details_Tab()throws Throwable
	{
		actorPaymentAdjustments.paymentDetailsTabSelection();
	}
	
	@Then("^Payment Adjustments panel should be displayed$")
	public void payment_adjustments_panel_should_be_displayed()throws Throwable
	{
		actorPaymentAdjustments.verifyPaymentDetailsTabIsDisplayedOrNot();
	}
	
	@Given("^User is in Payment Details Tab$")
	public void user_is_in_payment_details_tab()throws Throwable
	{
		actorPaymentAdjustments.verifyPaymentDetailsTabIsDisplayedOrNot();
	}
	
	@And("^verify and expand the Payment Adjustment panel$")
	public void verify_and_expand_the_payment_adjustment_panel(DataTable panelName) throws Throwable
	{
		actorPaymentAdjustments.expandPaymentAdjustmentPanel(panelName);
	}
		
	@Then("^input the below details in Payment Adjustments Panel$")
	public void input_the_below_details_in_payment_adjustment_panel(DataTable detailsPaymentAdjustmentPanel) throws Throwable
	{
		actorPaymentAdjustments.inputBelowDetailsInPaymentAdjustmentPanel(detailsPaymentAdjustmentPanel);
	}
	
	@Then("^verify the added record in payment adjustment panel$")
	public void verify_the_added_record_in_payment_adjustment_panel(DataTable RecordForView) throws Throwable
	{
		actorPaymentAdjustments.verifyTheAddedRecordInPaymentAdjustmentPanel(RecordForView);
	}
	
	@Then("^select the matching check box and import Claim Detail File$")
	public void select_the_matching_check_box_and_click_on_import_claim_detail_button(DataTable detailsImportClaimDetail) throws Throwable
	{
		actorPaymentAdjustments.verifyRecordAndClickOnCheckBoxAndImportClaimDetailFile(detailsImportClaimDetail);
	}
	
	@And("^click on Claim Details button$")
	public void click_on_claim_detail_button() throws Throwable
	{
		actorPaymentAdjustments.claimDetailButtonSelection();
	}
	
	@Then("^Adjustment Claims section should be displayed$")
	public void adjustment_claims_section_should_be_displayed() throws Throwable
	{
		actorPaymentAdjustments.verifyPageNavigatedToAdjustmentClaimsSection();
	}
	
	@Given("^user is in Adjustment claims section$")
	public void user_is_in_adjustment_claims_section() throws Throwable
	{
		actorPaymentAdjustments.verifyUserIsInAdjustmentClaimsSection();
	}
	
	@When("^verify the Adjustment Claims section header labels$")
	public void verify_the_adjustment_claims_section_header_labels(DataTable headerLabelDetails)throws Throwable
	{
		actorPaymentAdjustments.verifyTheAdjustmentClaimsHeaderLabel(headerLabelDetails);
	}
	
	@Then("^verify the Adjusted claims and select the claims for Reconcile$")
	public void verify_the_adjusted_claims_and_select_the_claims_for_reconcile(DataTable claimsForReconcile)throws Throwable
	{
		actorPaymentAdjustments.verifyAdjustedClaimsAndSelectForReconcile(claimsForReconcile);
	}
	
	@And("^Reconcile the calims$")
	public void reconcile_the_claims(DataTable allocationDate)throws Throwable
	{
		actorPaymentAdjustments.inputAllocationDateAndClickOnReconcileButton(allocationDate);
	}
	
	@And("verify the Reconcile claims and select for remove$")
	public void verify_the_reconcile_claims_and_select_for_remove(DataTable removeReconcileClaims) throws Throwable
	{
		actorPaymentAdjustments.verifyAndClickOnReconcileClaimsForReconcile(removeReconcileClaims);
	}
	
	@And("^remove the Reconcile claims$")
	public void remove_the_reconcile_claims(DataTable removeAllocationDate) throws Throwable
	{
		actorPaymentAdjustments.inputRemoveAllocationDateAndClickOnRemoveReconcileClaimsButton(removeAllocationDate);
	}
	
}
