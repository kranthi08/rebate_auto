package com.project.actors;

import java.util.List;

import com.project.pages.AddMembershipClaimCountsPage;
import com.project.pages.UIAddMembershipClaimCountsPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddMembershipClaimCountsPage 
{
	@Steps
	UIAddMembershipClaimCountsPage uimembershipClaimCountsPage;
	AddMembershipClaimCountsPage addMembershipClaimCountsPage;
	
	@Step
	public void verify_the_Membership_Claim_Counts_Add_button_is_presence() throws Throwable
	{
		uimembershipClaimCountsPage.add_button_presence();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Add_button_is_disabled()throws Throwable
	{
		uimembershipClaimCountsPage.add_button_disbled();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Update_button_is_presence() throws Throwable
	{
		uimembershipClaimCountsPage.update_button_presence();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Update_button_is_disabled() throws Throwable
	{
		uimembershipClaimCountsPage.update_button_disbled();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Remove_button_is_presence() throws Throwable
	{
		uimembershipClaimCountsPage.remove_button_presence();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Remove_button_is_disabled() throws Throwable
	{
		uimembershipClaimCountsPage.remove_button_disbled();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Previous_button_is_presence() throws Throwable
	{
		uimembershipClaimCountsPage.previous_button_presence();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Previous_button_is_enabled() throws Throwable
	{
		uimembershipClaimCountsPage.previous_button_enabled();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Next_button_is_presence() throws Throwable
	{
		uimembershipClaimCountsPage.next_button_presence();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Next_button_is_enabled() throws Throwable
	{
		uimembershipClaimCountsPage.next_button_enabled();
	}
	
	@Step
	public void verify_the_Membership_Claim_Counts_Table_is_presence() throws Throwable
	{
		uimembershipClaimCountsPage.verify_Membership_Claim_Counts_Table_presence();
	}
	
	@Step
	public void Membership_Claim_Counts_Table_should_be_displayed() throws Throwable
	{
		uimembershipClaimCountsPage.verify_Membership_Claim_Counts_Table_presence();
	}
	
	@Step
	public void verify_the_Establish_contractual_membership_claim_counts_by_List_Box_presence() throws Throwable
	{
		uimembershipClaimCountsPage.establish_contractual_membership_claim_counts_by_list_box_Presence();
	}
	
	@Step
	public void verify_the_Establish_contractual_membership_claim_counts_by_List_Box_enabled() throws Throwable
	{
		uimembershipClaimCountsPage.establish_contractual_membership_claim_counts_by_list_box_enabled();
	}
	
	@Step
	public void verify_the_Establish_contractual_membership_claim_counts_by_List_Box_items(DataTable establishContractual_ListBoxitems) throws Throwable
	{
		List<List<String>> establishContractual_listboxitems = establishContractual_ListBoxitems.raw();
		String strestablishContractual_listboxitems = establishContractual_listboxitems.get(1).get(0);
		uimembershipClaimCountsPage.establish_contractual_membership_claim_counts_by_list_box_items(strestablishContractual_listboxitems);
	}
	
	@Step
	public void select_value_from_Establish_contractual_membership_claim_counts_by_List_Box(DataTable establishContractual_ListBoxValue) throws Throwable
	{
		List<List<String>> establishContractual_listboxvalue = establishContractual_ListBoxValue.raw();
		String strestablishContractual_listboxValue = establishContractual_listboxvalue.get(1).get(0);		
		addMembershipClaimCountsPage.selectValueFromEstablishContractualMembershipClaimCountsByList(strestablishContractual_listboxValue);
	}
	
	@Step
	public void verify_the_Customer_vendor_formulary_ID_List_Box_presence() throws Throwable
	{
		uimembershipClaimCountsPage.customer_vendor_formulary_id_list_box_presence();
	}
	
	@Step
	public void verify_the_Customer_vendor_formulary_ID_List_Box_enabled() throws Throwable
	{
		uimembershipClaimCountsPage.customer_vendor_formulary_id_list_box_enabled();
	}
	
	@Step
	public void verify_the_Customer_vendor_formulary_ID_List_Box_items(DataTable customerVendorformularyID_ListBoxitems) throws Throwable
	{
		List<List<String>> customerVendorformularyID_listboxitems = customerVendorformularyID_ListBoxitems.raw();
		String strcustomerVendorformularyID_listboxitems = customerVendorformularyID_listboxitems.get(1).get(0);		
		uimembershipClaimCountsPage.customer_vendor_formulary_id_list_box_items(strcustomerVendorformularyID_listboxitems);
	}
	
	@Step
	public void select_value_from_Customer_vendor_formulary_ID_List_Box(DataTable customerVendorformularyID_ListBoxValue) throws Throwable
	{
		List<List<String>> customerVendorformularyID_listboxvalue = customerVendorformularyID_ListBoxValue.raw();
		String strcustomerVendorformularyID_listboxValue = customerVendorformularyID_listboxvalue.get(1).get(0);		
		addMembershipClaimCountsPage.selectValueFromCustomerVendorFormularyID_By_VendorFormulary_List(strcustomerVendorformularyID_listboxValue);
	}
	
	@Step
	public void verify_the_Contractual_membership_count_Edit_Box_presence() throws Throwable
	{
		uimembershipClaimCountsPage.contractual_membership_count_Edit_Box_Presence();
	}
	
	@Step
	public void verify_the_Contractual_membership_count_Edit_Box_enabled() throws Throwable
	{
		uimembershipClaimCountsPage.contractual_membership_count_Edit_Box_Enabled();
	}
	
	@Step
	public void verify_the_Contractual_membership_count_Edit_Box_Max_Length(DataTable Contractualmembershipcount_EditBoxMaxLength) throws Throwable
	{
		List<List<String>> Contractualmembershipcount_length = Contractualmembershipcount_EditBoxMaxLength.raw();
		String strContractualmembershipcount_EditBoxMaxLength =  Contractualmembershipcount_length.get(1).get(0);
		uimembershipClaimCountsPage.contractual_membership_count_Edit_Box_MaxLength(strContractualmembershipcount_EditBoxMaxLength);
	}
	
	@Step
	public void input_value_into_Contractual_membership_count_Edit_Box(DataTable Contractualmembershipcount_EditBoxValue) throws Throwable
	{
		List<List<String>> Contractualmembershipcount_value = Contractualmembershipcount_EditBoxValue.raw();
		String strContractualmembershipcount_EditBoxValue =  Contractualmembershipcount_value.get(1).get(0);
		addMembershipClaimCountsPage.setTextIntoContractualMembershipCountEdit(strContractualmembershipcount_EditBoxValue);
	}
	
	@Step
	public void verify_the_Membership_percent_threshold_Edit_Box_presence() throws Throwable
	{
		uimembershipClaimCountsPage.membership_percent_threshold_Edit_Box_Presence();
	}
	
	@Step
	public void verify_the_Membership_percent_threshold_Edit_Box_enabled() throws Throwable
	{
		uimembershipClaimCountsPage.membership_percent_threshold_Edit_Box_Enabled();
	}
	
	@Step
	public void verify_the_Membership_percent_threshold_Edit_Box_Max_Length(DataTable membershipPercentThreshold_EditBoxMaxLength) throws Throwable
	{
		List<List<String>> membershipPercentThreshold_length = membershipPercentThreshold_EditBoxMaxLength.raw();
		String strmembershipPercentThreshold_EditBoxMaxLength =  membershipPercentThreshold_length.get(1).get(0);
		uimembershipClaimCountsPage.membership_percent_threshold_Edit_Box_MaxLength(strmembershipPercentThreshold_EditBoxMaxLength);
	}
	
	@Step
	public void input_value_into_Membership_percent_threshold_Edit_Box(DataTable membershipPercentThreshold_EditBoxValue) throws Throwable
	{
		List<List<String>> membershipPercentThreshold_value = membershipPercentThreshold_EditBoxValue.raw();
		String strmembershipPercentThreshold_EditBoxValue =  membershipPercentThreshold_value.get(1).get(0);
		
		addMembershipClaimCountsPage.setTextIntoMembershipPercentThresholdEdit(strmembershipPercentThreshold_EditBoxValue);
	}
	
	@Step
	public void verify_the_Contractual_claim_count_edit_box_presence() throws Throwable
	{
		uimembershipClaimCountsPage.contractual_claim_count_Edit_Box_Presence();
	}
	
	@Step
	public void verify_the_Contractual_claim_count_edit_box_disabled() throws Throwable
	{
		uimembershipClaimCountsPage.contractual_claim_count_Edit_Box_Disabled();
	}
	
	@Step
	public void verify_the_Claim_percent_threshold_edit_box_presence() throws Throwable
	{
		uimembershipClaimCountsPage.claim_percent_threshold_Edit_Box_Presence();
	}
	
	@Step
	public void verify_the_Claim_percent_threshold_edit_box_disabled() throws Throwable
	{
		uimembershipClaimCountsPage.Claim_percent_threshold_Edit_Box_Disabled();
	}
	
	@Step
	public void Click_on_Add_button_in_Membership_Claim_Counts_screen() throws Throwable
	{
		addMembershipClaimCountsPage.clickOnAddButton();
	}
	
	@Step
	public void Click_on_Next_button_in_Membership_Claim_Counts_screen() throws Throwable
	{
		addMembershipClaimCountsPage.clickOnNextButton();
	}
	
	
}
