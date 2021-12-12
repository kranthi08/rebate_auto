package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddMembershipClaimCountsPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class UIAddMembershipClaimCountsPage extends BasePage 
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List)
	private BaseElement MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_CustomerVendorFormularyID_By_Customer_List)
	private BaseElement MembershipClaimCounts_Add_CustomerVendorFormularyID_By_Customer_List;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List)
	private BaseElement MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_ContractualMembershipCount_Edit)
	private BaseElement MembershipClaimCounts_Add_ContractualMembershipCount_Edit;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_MembershipPercentThreshold_Edit)
	private BaseElement MembershipClaimCounts_Add_MembershipPercentThreshold_Edit;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_ContractualClaimCount_Edit)
	private BaseElement MembershipClaimCounts_Add_ContractualClaimCount_Edit;
	
	@ByAngularModel.FindBy(model=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_ClaimPercentThreshold_Edit)
	private BaseElement MembershipClaimCounts_Add_ClaimPercentThreshold_Edit;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Add_Button)
	private BaseElement MembershipClaimCounts_Add_Add_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Next_Button)
	private BaseElement MembershipClaimCounts_Add_Next_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Previous_Button)
	private BaseElement MembershipClaimCounts_Add_Previous_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Remove_Button)
	private BaseElement MembershipClaimCounts_Add_Remove_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_Update_Button)
	private BaseElement MembershipClaimCounts_Add_Update_Button;
	
	@FindBy(xpath=AddMembershipClaimCountsPanel.MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table)
	private BaseElement MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table;
	
	
	// Methods
	// Establish contractual membership/claim counts by
	public boolean establish_contractual_membership_claim_counts_by_list_box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List);
	}
	
	public boolean establish_contractual_membership_claim_counts_by_list_box_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List);				
	}
	
	public boolean establish_contractual_membership_claim_counts_by_list_box_items(String Establish_contractual_membership_ListItems ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(MembershipClaimCounts_Add_EstablishContractualMembershipClaimCountsBy_List, Establish_contractual_membership_ListItems);				
	}
	
	// Customer/vendor formulary ID
	public boolean customer_vendor_formulary_id_list_box_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List);
	}
	
	public boolean customer_vendor_formulary_id_list_box_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List);				
	}
	
	public boolean customer_vendor_formulary_id_list_box_items(String Establish_contractual_membership_ListItems ) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(MembershipClaimCounts_Add_CustomerVendorFormularyID_By_VendorFormularyID_List, Establish_contractual_membership_ListItems);				
	}
	
	// Contractual membership count
	public boolean contractual_membership_count_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(MembershipClaimCounts_Add_ContractualMembershipCount_Edit);
	}
	
	public boolean contractual_membership_count_Edit_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(MembershipClaimCounts_Add_ContractualMembershipCount_Edit);				
	}
	
	public boolean contractual_membership_count_Edit_Box_MaxLength(String Establish_contractual_membership_MaxLength ) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(MembershipClaimCounts_Add_ContractualMembershipCount_Edit, Establish_contractual_membership_MaxLength);								
	}

	// Membership percent threshold
	public boolean membership_percent_threshold_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(MembershipClaimCounts_Add_MembershipPercentThreshold_Edit);
	}
	
	public boolean membership_percent_threshold_Edit_Box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(MembershipClaimCounts_Add_MembershipPercentThreshold_Edit);				
	}
	
	public boolean membership_percent_threshold_Edit_Box_MaxLength(String Establish_contractual_membership_MaxLength ) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(MembershipClaimCounts_Add_MembershipPercentThreshold_Edit, Establish_contractual_membership_MaxLength);								
	}
	
	// Contractual claim count
	public boolean contractual_claim_count_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(MembershipClaimCounts_Add_ContractualClaimCount_Edit);
	}
	
	public boolean contractual_claim_count_Edit_Box_Disabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsDisabled(MembershipClaimCounts_Add_ContractualClaimCount_Edit);				
	}
	
	
	//  Claim percent threshold
	public boolean claim_percent_threshold_Edit_Box_Presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(MembershipClaimCounts_Add_ClaimPercentThreshold_Edit);
	}
	public boolean Claim_percent_threshold_Edit_Box_Disabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsDisabled(MembershipClaimCounts_Add_ClaimPercentThreshold_Edit);
	}
	
	// Add Button
	public boolean add_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(MembershipClaimCounts_Add_Add_Button);
	}
	
	public boolean add_button_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(MembershipClaimCounts_Add_Add_Button);				
	}
	
	public boolean add_button_disbled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(MembershipClaimCounts_Add_Add_Button);				
	}
	
	// Next button
	public boolean next_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(MembershipClaimCounts_Add_Next_Button);
	}
	
	public boolean next_button_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(MembershipClaimCounts_Add_Next_Button);				
	}
	
	// Previous button 
	
	public boolean previous_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(MembershipClaimCounts_Add_Previous_Button);
	}
	
	public boolean previous_button_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(MembershipClaimCounts_Add_Previous_Button);				
	}
	
	// update button
	public boolean update_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(MembershipClaimCounts_Add_Update_Button);
	}
	
	public boolean update_button_disbled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(MembershipClaimCounts_Add_Update_Button);				
	}
	
	// remove button
	public boolean remove_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(MembershipClaimCounts_Add_Remove_Button);
	}
	
	public boolean remove_button_disbled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(MembershipClaimCounts_Add_Remove_Button);				
	}
	
	public boolean verify_Membership_Claim_Counts_Table_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyTablePresence(MembershipClaimCounts_Add_MembershipClaimCountsPanel_Table);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
