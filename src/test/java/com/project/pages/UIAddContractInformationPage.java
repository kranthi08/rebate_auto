package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddContractInformationPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class UIAddContractInformationPage extends BasePage 
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Vendor_List)
	private BaseElement ContractInformation_Add_Vendor_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorContractType_List)
	private BaseElement ContractInformation_Add_VendorContractType_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorClaimBasis_List)
	private BaseElement ContractInformation_Add_VendorClaimBasis_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorDaySupply_List)
	private BaseElement ContractInformation_Add_VendorDaySupply_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ClientType)
	private BaseElement ContractInformation_Add_ClientType;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_MasterCustomerSet_List)
	private BaseElement ContractInformation_Add_MasterCustomerSet_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_CustomerID_List)
	private BaseElement ContractInformation_Add_CustomerID_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractName_Edit)
	private BaseElement ContractInformation_Add_ContractName_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ReclassificationDrugVendor_List)
	private BaseElement ContractInformation_Add_ReclassificationDrugVendor_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Internal_External_List)
	private BaseElement ContractInformation_Add_Internal_External_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractLineOfBusiness_List)
	private BaseElement ContractInformation_Add_ContractLineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractType_List)
	private BaseElement ContractInformation_Add_ContractType_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ClaimBasis_List)
	private BaseElement ContractInformation_Add_ClaimBasis_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractStartDate_Edit)
	private BaseElement ContractInformation_Add_ContractStartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractEndDate_Edit)
	private BaseElement ContractInformation_Add_ContractEndDate_Edit;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_CosmeticDrugs_CheckBox)
	private BaseElement ContractInformation_Add_CosmeticDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_CompoundDrugs_CheckBox)
	private BaseElement ContractInformation_Add_CompoundDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_MultisourceBrandDrugs_CheckBox)
	private BaseElement ContractInformation_Add_MultisourceBrandDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Vaccines_CheckBox)
	private BaseElement ContractInformation_Add_Vaccines_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_OverTheCounterDrugs_CheckBox)
	private BaseElement ContractInformation_Add_OverTheCounterDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ExceptInsulins_CheckBox)
	private BaseElement ContractInformation_Add_ExceptInsulins_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox)
	private BaseElement ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox)
	private BaseElement ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox)
	private BaseElement ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox)
	private BaseElement ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_MonthlyPenalty_Edit)
	private BaseElement ContractInformation_Add_MonthlyPenalty_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit)
	private BaseElement ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_PenaltyStartDate_Edit)
	private BaseElement ContractInformation_Add_PenaltyStartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_PenaltyEndDate_Edit)
	private BaseElement ContractInformation_Add_PenaltyEndDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_RateDetails_StartDate_Edit)
	private BaseElement ContractInformation_Add_RateDetails_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_RateDetails_EndDate_Edit)
	private BaseElement ContractInformation_Add_RateDetails_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_RateDetails_LineOfBusiness_List)
	private BaseElement ContractInformation_Add_RateDetails_LineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Transparency_List)
	private BaseElement ContractInformation_Add_Transparency_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_FeeMethod_List)
	private BaseElement ContractInformation_Add_FeeMethod_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorRebateShare_Edit)
	private BaseElement ContractInformation_Add_VendorRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_AdminFee_Edit)
	private BaseElement ContractInformation_Add_AdminFee_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_DSTRebateShare_Edit)
	private BaseElement ContractInformation_Add_DSTRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_CustomerRebateShare_Edit)
	private BaseElement ContractInformation_Add_CustomerRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_DSTRevenue_Edit)
	private BaseElement ContractInformation_Add_DSTRevenue_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorAdjDaySupplyOption_Edit)
	private BaseElement ContractInformation_Add_VendorAdjDaySupplyOption_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_CustomerAdjDaySupplyOption_Edit)
	private BaseElement ContractInformation_Add_CustomerAdjDaySupplyOption_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Notes_Edit)
	private BaseElement ContractInformation_Add_Notes_Edit;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Button)
	private BaseElement ContractInformation_Add_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Next_Button)
	private BaseElement ContractInformation_Add_Next_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Remove_Button)
	private BaseElement ContractInformation_Add_Remove_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Update_Button)
	private BaseElement ContractInformation_Add_Update_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_RateDetails_Table)
	private BaseElement ContractInformation_Add_RateDetails_Table;
	
	
	// methods
	
	public boolean verifyContractInformationPanelIsDisplayed() throws Throwable 
	{
		try
		{
			getNgDriver().waitForAngularRequestsToFinish();
		}
		catch(Exception e)
		{
			sleep(2000);
		}
		if(ContractInformation_Add_Vendor_List.exists(1000))		
		{
			Log.info("Contract Information Panel is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	// Vendor List
	public boolean verifyVendorListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_Vendor_List);
	}
	
	public boolean verifyVendorListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_Vendor_List);
	}
	
	public boolean verifyVendorListBoxItems(String strItems) throws Throwable
	{
	    if(!strItems.isEmpty()) 
	    {
	    	return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_Vendor_List,strItems);
	    }
	    else
	    {
	    	return true;
	    }
	}
	
	// Vendor Contract Type
	public boolean verifyVendorContractTypeListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_VendorContractType_List);
	}
	
	public boolean verifyVendorContractTypeListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_VendorContractType_List);
	}
	
	public boolean verifyVendorContractTypeListBoxItems(String strItems) throws Throwable
	{
		if(!strItems.isEmpty()) 
	    {
	    	return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_VendorContractType_List,strItems);
	    }
	    else
	    {
	    	return true;
	    }
	}
	
	// Vendor Claim Basis
	public boolean verifyVendorClaimBasisListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_VendorClaimBasis_List);
	}
	
	public boolean verifyVendorClaimBasisListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_VendorClaimBasis_List);
	}
	
	public boolean verifyVendorClaimBasisListBoxItems(String strItems) throws Throwable
	{
		if(!strItems.isEmpty()) 
	    {
	    	return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_VendorClaimBasis_List,strItems);
	    }
	    else
	    {
	    	return true;
	    }
	}
	
	// Vendor day supply
	public boolean verifyVendorDaySupplyListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_VendorDaySupply_List);
	}
	
	public boolean verifyVendorDaySupplyListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_VendorDaySupply_List);
	}
	
	public boolean verifyVendorDaySupplyListBoxItems(String strItems) throws Throwable
	{
		if(!strItems.isEmpty()) 
	    {
	    	return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_VendorDaySupply_List,strItems);
	    }
	    else
	    {
	    	return true;
	    }
	}
	
	// Client type
	public boolean verifyClientTypeListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_ClientType);
	}
	
	public boolean verifyClientTypeListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_ClientType);
	}
	
	public boolean verifyClientTypeListBoxItems(String strItems) throws Throwable
	{
		if(!strItems.isEmpty()) 
	    {
	    	return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_ClientType,strItems);
	    }
	    else
	    {
	    	return true;
	    }
	}
	
	// Master customer set
	public boolean verifyMasterCustomerSetTypeListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_MasterCustomerSet_List);
	}
	
	public boolean verifyMasterCustomerSetTypeListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_MasterCustomerSet_List);
	}
	
	public boolean verifyMasterCustomerSetListBoxItems(String strItems) throws Throwable
	{
		if(!strItems.isEmpty()) 
	    {
	    	return rxNovaCommonUtil.rebate_VerifyItemsInListBox(ContractInformation_Add_MasterCustomerSet_List,strItems);
	    }
	    else
	    {
	    	return true;
	    }
	}
	
	// Customer ID
	public boolean verifyCustomerIDListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_CustomerID_List);
	}
	
	public boolean verifyCustomerIDListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_CustomerID_List);
	}
	
	public boolean verifyCustomerIDListBoxItems(String strItems) throws Throwable
	{
		if(!strItems.isEmpty()) 
	    {
	    	return rxNovaCommonUtil.rebate_VerifyItemsInListBox(ContractInformation_Add_CustomerID_List,strItems);
	    }
	    else
	    {
	    	return true;
	    }
	}
	
	//Contract name
	public boolean verifyContractNameEditBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_ContractName_Edit);
	}
	
	public boolean verifyContractNameEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_ContractName_Edit);
	}
	
	public boolean verifyContractNameEditBoxMaxLength(String Edit_Box_Max_Length) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_ContractName_Edit, Edit_Box_Max_Length);
	}
	
	// Reclassification drug vendor
	public boolean verifyReclassificationDrugVendorListBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_ReclassificationDrugVendor_List);
	}
	
	public boolean verifyReclassificationDrugVendorListBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_ReclassificationDrugVendor_List);
	}
	
	public boolean verifyReclassificationDrugVendorListBoxItems(String List_Box_Items)throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_ReclassificationDrugVendor_List, List_Box_Items);
	}
	
	// Internal/External
	public boolean verifyInternalExternalListBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_Internal_External_List);
	}
	
	public boolean verifyInternalExternalListBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_Internal_External_List);
	}
	
	public boolean verifyInternalExternalListBoxItems(String List_Box_Items)throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_Internal_External_List, List_Box_Items);
	}
	
	// Contract Line Of Business
	public boolean verifyContractLineOfBusinessListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_ContractLineOfBusiness_List);
	}
	
	public boolean verifyContractLineOfBusinessListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_ContractLineOfBusiness_List);
	}
	
	public boolean verifyContractLineOfBusinessListBoxItems(String List_Box_Items) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_ContractLineOfBusiness_List, List_Box_Items);
	}
	
	// Contract type
	public boolean verifyContractTypeListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_ContractType_List);
	}
	
	public boolean verifyContractTypeListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_ContractType_List);
	}
	
	public boolean verifyContractTypeListBoxItems(String List_Box_Items) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_ContractType_List, List_Box_Items);
	}
	
	// Contract Claim basis
	public boolean verifyClaimBasisListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_ClaimBasis_List);
	}
	
	public boolean verifyClaimBasisListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_ClaimBasis_List);
	}
	
	public boolean verifyClaimBasisListBoxItems(String List_Box_Items) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_ClaimBasis_List, List_Box_Items);
	}
	
	//Contract Start Date
	public boolean verifyContractStartDateEditBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_ContractStartDate_Edit);
	}
	
	public boolean verifyContractStartDateEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_ContractStartDate_Edit);
	}
	
	public boolean verifyContractStartDateEditBoxMaxLength(String Edit_Box_Max_Length ) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_ContractStartDate_Edit, Edit_Box_Max_Length);
	}
	
	public boolean verifyContractStartDateEditBoxDefaultText(String Edit_Box_Default_Text) throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(ContractInformation_Add_ContractStartDate_Edit, Edit_Box_Default_Text);
	}
	
	//End Date
	public boolean verifyContractEndDateEditBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_ContractEndDate_Edit);
	}
	
	public boolean verifyContractEndDateEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_ContractEndDate_Edit);
	}
	
	public boolean verifyContractEndDateEditBoxMaxLength(String Edit_Box_Max_Length) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_ContractEndDate_Edit, Edit_Box_Max_Length);
	}
	
	public boolean verifyContractEndDateEditBoxDefaultText(String Edit_Box_Default_Text) throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(ContractInformation_Add_ContractEndDate_Edit, Edit_Box_Default_Text);
	}
	
	//  Reclassify claims from accepted to rejected for:
	//  Cosmetic drugs
	public boolean verifyCosmeticDrugsCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_CosmeticDrugs_CheckBox);
	}
	
	public boolean verifyCosmeticDrugsCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_CosmeticDrugs_CheckBox);
	}
	
	//  Compound drugs
	public boolean verifyCompoundDrugsCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_CompoundDrugs_CheckBox);
	}
	
	public boolean verifyCompoundDrugsCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_CompoundDrugs_CheckBox);
	}
	
	// Multisource brand drugs
	public boolean verifyMultisourceBrandDrugsCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_MultisourceBrandDrugs_CheckBox);
	}
	
	public boolean verifyMultisourceBrandDrugsCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_MultisourceBrandDrugs_CheckBox);
	}
	
	// Vaccines
	public boolean verifyVaccinesCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_Vaccines_CheckBox);
	}
	
	public boolean verifyVaccinesCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_Vaccines_CheckBox);
	}
	
	// Over the counter drugs
	public boolean verifyOverTheCounterDrugsCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_OverTheCounterDrugs_CheckBox);
	}
	
	public boolean verifyOverTheCounterDrugsCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_OverTheCounterDrugs_CheckBox);
	}
	
	// Except insulins
	public boolean verifyExceptInsulinsCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_ExceptInsulins_CheckBox);
	}
	
	public boolean verifyExceptInsulinsCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_ExceptInsulins_CheckBox);
	}
	
	public boolean verifyExceptInsulinsCheckBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsDisabled(ContractInformation_Add_ExceptInsulins_CheckBox);
	}
	
	//  Except diabetic supplies and test strips
	public boolean verifyExceptDiabeticSuppliesAndTestStripsCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox);
	}
	
	public boolean verifyExceptDiabeticSuppliesAndTestStripsCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox);
	}
	
	public boolean verifyExceptDiabeticSuppliesAndTestStripsCheckBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsDisabled(ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox);
	}
	
	//  Reclassify only:
	//  Reclassify specialty claims to retail
	public boolean verifyReclassifySpecialtyClaimsToRetailCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox);
	}
	
	public boolean verifyReclassifySpecialtyClaimsToRetailCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox);
	}
	
	//  Reclassify day supply break at 34
	public boolean verifyReclassifyDaySupplyBreakAt34CheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox);
	}
	
	public boolean verifyReclassifyDaySupplyBreakAt34CheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox);
	}
	
	//  Reclassify brand claims to generic
	public boolean verifyReclassifyBrandClaimsToGenericCheckBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxPresence(ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox);
	}
	
	public boolean verifyReclassifyBrandClaimsToGenericCheckBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyCheckBoxIsEnabled(ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox);
	}
	
	//  Monthly Penalty
	public boolean verifyMonthlyPenaltyEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_MonthlyPenalty_Edit);
	}
	
	public boolean verifyMonthlyPenaltyEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_MonthlyPenalty_Edit);
	}
	
	public boolean verifyMonthlyPenaltyEditBoxMaxLength(String strEditMaxLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_MonthlyPenalty_Edit, strEditMaxLength);
	}

	//  Minimum Claims To Avoid Penalty
	public boolean verifyMinimumClaimsToAvoidPenaltyEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit);
	}
	
	public boolean verifyMinimumClaimsToAvoidPenaltyEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit);
	}
	
	public boolean verifyMinimumClaimsToAvoidPenaltyEditBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsDisabled(ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit);
	}
	
	public boolean verifyMinimumClaimsToAvoidPenaltyEditBoxMaxLength(String strEditMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit, strEditMaxLength);
	}

	//  Penalty Start Date
	public boolean verifyPenaltyStartDateEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_PenaltyStartDate_Edit);
	}
	
	public boolean verifyPenaltyStartDateEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_PenaltyStartDate_Edit);
	}
	
	public boolean verifyPenaltyStartDateEditBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsDisabled(ContractInformation_Add_PenaltyStartDate_Edit);
	}
	
	public boolean verifyPenaltyStartDateEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_PenaltyStartDate_Edit, EditBoxMaxLength);
	}
	
	public boolean verifyPenaltyStartDateEditBoxDefaultText(String EditBoxDefaultText)throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(ContractInformation_Add_PenaltyStartDate_Edit, EditBoxDefaultText);
	}

	//  End Date
	public boolean verifyPenaltyEndDateEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_PenaltyEndDate_Edit);
	}
	
	public boolean verifyPenaltyEndDateEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_PenaltyEndDate_Edit);
	}
	
	public boolean verifyPenaltyEndDateEditBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsDisabled(ContractInformation_Add_PenaltyEndDate_Edit);
	}
	
	public boolean verifyPenaltyEndDateEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_PenaltyEndDate_Edit, EditBoxMaxLength);
	}
	
	public boolean verifyPenaltyEndDateEditBoxDefaultText(String EditBoxDefaultText)throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(ContractInformation_Add_PenaltyEndDate_Edit, EditBoxDefaultText);
	}
	
	
	// --------------------------------------------------------------------------------------------------------------------------
	//  Rate Details - Start Date
	// --------------------------------------------------------------------------------------------------------------------------
	
	public boolean verifyRateDetailsStartDateEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_RateDetails_StartDate_Edit);
	}
	
	public boolean verifyRateDetailsStartDateEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_RateDetails_StartDate_Edit);
	}
	
	public boolean verifyRateDetailsStartDatEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_RateDetails_StartDate_Edit, EditBoxMaxLength);
	}
	
	public boolean verifyRateDetailsStartDateEditBoxDefaultText(String EditBoxDefaultText)throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(ContractInformation_Add_RateDetails_StartDate_Edit, EditBoxDefaultText);
	}
	
	//  Rate Details - End Date
	public boolean verifyRateDetailsEndDateEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_RateDetails_EndDate_Edit);
	}
	
	public boolean verifyRateDetailsEndDateEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_RateDetails_EndDate_Edit);
	}
	
	public boolean verifyRateDetailsEndDateEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_RateDetails_EndDate_Edit, EditBoxMaxLength);
	}
	
	public boolean verifyRateDetailsEndDateEditBoxDefaultText(String EditBoxDefaultText)throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(ContractInformation_Add_RateDetails_EndDate_Edit, EditBoxDefaultText);
	}
	
	//  Rate Details - Line Of Business
	public boolean verifyLineOfBusinessListBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_RateDetails_LineOfBusiness_List);
	}
	
	public boolean verifyLineOfBusinessListBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_RateDetails_LineOfBusiness_List);
	}
	
	public boolean verifyLineOfBusinessListBoxItems(String ListBoxItems )throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_RateDetails_LineOfBusiness_List, ListBoxItems);
	}
	
	//  Rate Details - Transparency
	public boolean verifyTransparencyListBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_Transparency_List);
	}
	
	public boolean verifyTransparencyListBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_Transparency_List);
	}
	
	public boolean verifyTransparencyListBoxItems(String ListBoxItems )throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_Transparency_List, ListBoxItems);
	}
	
	//  Rate Details - Fee method
	public boolean verifyFeeMethodListBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_FeeMethod_List);
	}
	
	public boolean verifyFeeMethodListBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_FeeMethod_List);
	}
	
	public boolean verifyFeeMethodListBoxItems(String ListBoxItems)throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_FeeMethod_List, ListBoxItems);
	}
	
	//  Rate Details - Vendor Rebate Share
	public boolean verifyVendorRebateShareEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_VendorRebateShare_Edit);
	}
	
	public boolean verifyVendorRebateShareEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_VendorRebateShare_Edit);
	}
	
	public boolean verifyVendorRebateShareEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_VendorRebateShare_Edit, EditBoxMaxLength);
	}
	
	//  Rate Details - AdminFee
	public boolean verifyRateDetailsAdminFeeEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_AdminFee_Edit);
	}
	
	public boolean verifyRateDetailsAdminFeeEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_AdminFee_Edit);
	}
	
	public boolean verifyRateDetailsAdminFeeEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_AdminFee_Edit, EditBoxMaxLength);
	}
	
	//  Rate Details - DST Rebate Share
	public boolean verifyRateDetailsDSTRebateShareEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_DSTRebateShare_Edit);
	}
	
	public boolean verifyRateDetailsDSTRebateShareEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_DSTRebateShare_Edit);
	}
	
	public boolean verifyRateDetailsDSTRebateShareEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_DSTRebateShare_Edit, EditBoxMaxLength);
	}
	
	//  Rate Details - Customer Rebate Share
	public boolean verifyCustomerRebateShareEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_CustomerRebateShare_Edit);
	}
	
	public boolean verifyCustomerRebateShareEditBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsDisabled(ContractInformation_Add_CustomerRebateShare_Edit);
	}
	
	//  Rate Details - DST Revenue
	public boolean verifyDSTRevenueEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_DSTRevenue_Edit);
	}
	
	public boolean verifyDSTRevenueEditBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsDisabled(ContractInformation_Add_DSTRevenue_Edit);
	}
	
	// Rate Details - Vendor adj day supply option
	public boolean verifyVendorAdjDaySupplyOptionListBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_VendorAdjDaySupplyOption_Edit);
	}
	
	public boolean verifyVendorAdjDaySupplyOptionListBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_VendorAdjDaySupplyOption_Edit);
	}
	
	public boolean verifyVendorAdjDaySupplyOptionListBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsDisabled(ContractInformation_Add_VendorAdjDaySupplyOption_Edit);
	}
	
	public boolean verifyVendorAdjDaySupplyOptionListBoxItems(String ListBoxItems )throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_VendorAdjDaySupplyOption_Edit, ListBoxItems);
	}
	
	// Rate Details - Customer Adj Day Supply Option
	public boolean verifyCustomerAdjDaySupplyOptionListBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(ContractInformation_Add_CustomerAdjDaySupplyOption_Edit);
	}
	
	public boolean verifyCustomerAdjDaySupplyOptionListBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(ContractInformation_Add_CustomerAdjDaySupplyOption_Edit);
	}
	
	public boolean verifyCustomerAdjDaySupplyOptionListBoxIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsDisabled(ContractInformation_Add_CustomerAdjDaySupplyOption_Edit);
	}
	
	public boolean verifyCustomerAdjDaySupplyOptionListBoxItems(String ListBoxItemsCount )throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(ContractInformation_Add_CustomerAdjDaySupplyOption_Edit, ListBoxItemsCount);
	}
	
	//  Rate Details - Notes
	public boolean verifyNotesEditBoxIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(ContractInformation_Add_Notes_Edit);
	}
	
	public boolean verifyNotesEditBoxIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(ContractInformation_Add_Notes_Edit);
	}
	
	public boolean verifyNotesEditBoxMaxLength(String EditBoxMaxLength)throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(ContractInformation_Add_Notes_Edit, EditBoxMaxLength);
	}
	
	//  Rate Details - Table
	public boolean verifyRateDetailsTablePresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyTablePresence(ContractInformation_Add_RateDetails_Table);
	}
	
	// click on checck box in rate details table
	
	public boolean clickOnCheckBoxInRateDetailsTable(String Operation, String strValue) throws Throwable
	{
		return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(ContractInformation_Add_RateDetails_Table, Operation, strValue);
	}
	
	//  Rate Details - Add Button
	public boolean verifyAddButtonIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(ContractInformation_Add_Button);
	}
	
	public boolean clickOnAddButton()throws Throwable 
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Add_Button);
	}
	
	public boolean verifyAddButtonIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(ContractInformation_Add_Button);
	}
	
	public boolean verifyAddButtonIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(ContractInformation_Add_Button);
	}
	
	//  Rate Details - Next Button
	public boolean verifyNextButtonIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(ContractInformation_Add_Next_Button);
	}
	
	public boolean verifyNextButtonIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(ContractInformation_Add_Next_Button);
	}
	
	public boolean verifyNextButtonIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(ContractInformation_Add_Next_Button);
	}
	
	public boolean clickOnNextButton()  throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Add_Next_Button);
	}
	
	//  Rate Details - Remove Button
	public boolean verifyRemoveButtonIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(ContractInformation_Add_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(ContractInformation_Add_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(ContractInformation_Add_Remove_Button);
	}
	
//  Rate Details - Update Button
	public boolean verifyUpdateButtonIsPresent()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(ContractInformation_Add_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsEnabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(ContractInformation_Add_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsDisabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(ContractInformation_Add_Update_Button);
	}
		
}
