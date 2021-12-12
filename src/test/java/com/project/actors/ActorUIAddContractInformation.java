package com.project.actors;

import java.util.List;
import com.project.pages.AddContractInformationPage;
import com.project.pages.UIAddContractInformationPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddContractInformation 
{
	
	@Steps
	AddContractInformationPage addContractInformation;
	
	UIAddContractInformationPage uiaddContractInformation;
	
	//  -- Steps
	@Step
	public void user_is_on_contract_creation_page() throws Throwable
	{
		uiaddContractInformation.verifyContractInformationPanelIsDisplayed();
	}
	
	//  -------------------- Vendor list box
	@Step
	public void verify_the_vendor_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyVendorListBoxIsPresent();
	}
	
	@Step
	public void verify_the_vendor_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyVendorListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_vendor_list_box_items(DataTable vendor_ListBoxItems) throws Throwable
	{
		List<List<String>> vendor_list_items = vendor_ListBoxItems.raw();
		String strVendor_ListBoxItems = vendor_list_items.get(1).get(0);
		uiaddContractInformation.verifyVendorListBoxItems(strVendor_ListBoxItems);
	}
	
	@Step
	public void input_vendor_list_box_value(DataTable vendor_ListBoxValue ) throws Throwable
	{
		List<List<String>> vendor_list = vendor_ListBoxValue.raw();
		String strVendor_ListBoxValue = vendor_list.get(1).get(0);
		addContractInformation.selectValueFromVendorList(strVendor_ListBoxValue);
	}
	
	// ------- Vendor contract type
	@Step
	public void verify_the_vendor_contract_type_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyVendorContractTypeListBoxIsPresent();
	}
	
	@Step
	public void verify_the_vendor_contract_type_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyVendorContractTypeListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_vendor_contract_type_list_box_items(DataTable vendorcontracttype_ListBoxItems) throws Throwable
	{
		List<List<String>> vendor_contract_type_list_items = vendorcontracttype_ListBoxItems.raw();
		String strvendorContractType_ListBoxItems = vendor_contract_type_list_items.get(1).get(0);
		uiaddContractInformation.verifyVendorContractTypeListBoxItems(strvendorContractType_ListBoxItems);
	}
	
	@Step
	public void select_vendor_contract_type_list_box_value(DataTable vendorcontracttypeListBoxValue ) throws Throwable
	{
		List<List<String>> vendor_contract_type_list = vendorcontracttypeListBoxValue.raw();
		String strvendorContractType_ListBoxValue = vendor_contract_type_list.get(1).get(0);
		addContractInformation.selectValueFromVendorContractTypeList(strvendorContractType_ListBoxValue);
	}
	
	// ------- Vendor claim basis
	@Step
	public void verify_the_vendor_claim_basis_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyVendorClaimBasisListBoxIsPresent();
	}
	
	@Step
	public void verify_the_vendor_claim_basis_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyVendorClaimBasisListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_vendor_claim_basis_list_box_items(DataTable vendorclaimbasis_ListBoxItems) throws Throwable
	{
		List<List<String>> vendor_claim_basis_list_items = vendorclaimbasis_ListBoxItems.raw();
		String strVendorClaimBasis_ListBoxItems = vendor_claim_basis_list_items.get(1).get(0);
		uiaddContractInformation.verifyVendorClaimBasisListBoxItems(strVendorClaimBasis_ListBoxItems);
	}
	
	@Step
	public void input_vendor_claim_basis_list_box_value(DataTable vendorclaimbasis_ListBoxValue ) throws Throwable
	{
		List<List<String>> vendor_claim_basis_list = vendorclaimbasis_ListBoxValue.raw();
		String strVendorClaimBasis_ListBoxValue = vendor_claim_basis_list.get(1).get(0);
		addContractInformation.selectValueFromVendorClaimBasisList(strVendorClaimBasis_ListBoxValue);
	}
	
	// -------------------  Vendor day supply
	@Step
	public void verify_the_vendor_day_supply_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyVendorDaySupplyListBoxIsPresent();
	}
	
	@Step
	public void verify_the_vendor_day_supply_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyVendorDaySupplyListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_vendor_day_supply_list_box_items(DataTable vendordaysupply_ListBoxItems) throws Throwable
	{
		List<List<String>> vendor_day_supply_list_items = vendordaysupply_ListBoxItems.raw();
		String strVendorDaySupply_ListBoxItems = vendor_day_supply_list_items.get(1).get(0);
		uiaddContractInformation.verifyVendorDaySupplyListBoxItems(strVendorDaySupply_ListBoxItems);
	}
	
	@Step
	public void input_vendor_day_supply_list_box_value(DataTable vendordaysupply_ListBoxValue ) throws Throwable
	{
		List<List<String>> vendor_daysupply_list = vendordaysupply_ListBoxValue.raw();
		String strVendorDaysSupply_ListBoxValue =vendor_daysupply_list.get(1).get(0);
		addContractInformation.selectValueFromVendorDaySupplyList(strVendorDaysSupply_ListBoxValue);
	}
	
	// ----------------------- Client type:
	@Step
	public void verify_the_client_type_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyClientTypeListBoxIsPresent();
	}
	
	@Step
	public void verify_the_client_type_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyClientTypeListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_client_type_list_box_items(DataTable clienttype_ListBoxItems) throws Throwable
	{
		List<List<String>> clienttype_list_items = clienttype_ListBoxItems.raw();
		String strClientType_ListBoxItems = clienttype_list_items.get(1).get(0);
		uiaddContractInformation.verifyClientTypeListBoxItems(strClientType_ListBoxItems);
	}
	
	@Step
	public void select_value_from_client_type_list_box(DataTable clienttype_ListBoxValue ) throws Throwable
	{
		List<List<String>> clienttype_list = clienttype_ListBoxValue.raw();
		String strClientType_ListBoxValue = clienttype_list.get(1).get(0);
		addContractInformation.selectValueFromClientTypeList(strClientType_ListBoxValue);
	}
	
	// --------------------------- Master customer set
	@Step
	public void verify_the_MCS_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyMasterCustomerSetTypeListBoxIsPresent();
	}
	
	@Step
	public void verify_the_MCS_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyMasterCustomerSetTypeListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_MCS_list_box_items(DataTable MCS_ListBoxItems) throws Throwable
	{
		List<List<String>> MCS_list_items = MCS_ListBoxItems.raw();
		String strMasterCustomerSet_ListBoxItems = MCS_list_items.get(1).get(0);
		uiaddContractInformation.verifyMasterCustomerSetListBoxItems(strMasterCustomerSet_ListBoxItems);
	}
	
	@Step
	public void input_MCS_list_box_value(DataTable MCS_ListBoxValue ) throws Throwable
	{
		List<List<String>> MCS_list = MCS_ListBoxValue.raw();
		String strMasterCustomerSet_ListBoxValue = MCS_list.get(1).get(0);
		addContractInformation.selectValueFromMasterCustomerSetList(strMasterCustomerSet_ListBoxValue);
	}
	
	// -----------------------------------------  Customer ID:
	@Step
	public void verify_the_CustomerID_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyCustomerIDListBoxIsPresent();
	}
	
	@Step
	public void verify_the_CustomerID_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyCustomerIDListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_CustomerID_list_box_items(DataTable CustomerID_ListBoxItems) throws Throwable
	{
		List<List<String>> CustomerID_list_items = CustomerID_ListBoxItems.raw();
		String strCustomerID_ListBoxItems = CustomerID_list_items.get(1).get(0);
		uiaddContractInformation.verifyCustomerIDListBoxItems(strCustomerID_ListBoxItems);
	}
	
	@Step
	public void input_CustomerID_list_box_value(DataTable CustomerID_ListValue ) throws Throwable
	{
		List<List<String>> CustomerID_list = CustomerID_ListValue.raw();
		String strCustomerID_ListBoxValue = CustomerID_list.get(1).get(0);
		addContractInformation.selectValueFromCustomerIDList(strCustomerID_ListBoxValue);
	}
	
	// ---------------------- Contract name:
	@Step
	public void verify_the_contract_name_edit_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyContractNameEditBoxIsPresent();
	}
	
	@Step
  	public void verify_the_contract_name_edit_box_enabled()throws Throwable
  	{
  		uiaddContractInformation.verifyContractNameEditBoxIsEnabled();
  	}
	
	@Step
  	public void verify_the_contract_name_edit_box_max_length(DataTable contractName_editBoxMaxLength)throws Throwable
  	{
		List<List<String>> ContractnameLength = contractName_editBoxMaxLength.raw();
		String strContractName_EditBoxMaxLength = ContractnameLength.get(1).get(0);
		uiaddContractInformation.verifyContractNameEditBoxMaxLength(strContractName_EditBoxMaxLength);
  	}
	
	@Step
	public void set_Text_Into_Contract_Name_Edit_Box(DataTable contractName_EditBoxValue) throws Throwable
	{
		List<List<String>> ContractnameValue = contractName_EditBoxValue.raw();
		String strcontractName_EditBoxValue = ContractnameValue.get(1).get(0);
		addContractInformation.setTextIntoContractNameEdit(strcontractName_EditBoxValue);
	}
	
	//  ------------------- Reclassification drug vendor
	@Step
	public void verify_the_ReclassificationDrugVendor_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyReclassificationDrugVendorListBoxIsPresent();
	}
	
	@Step
	public void verify_the_ReclassificationDrugVendor_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyReclassificationDrugVendorListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_ReclassificationDrugVendor_list_box_items(DataTable reclassificationDrugVendor_ListBoxItems) throws Throwable
	{
		List<List<String>> ReclassificationDrugVendor_list_items = reclassificationDrugVendor_ListBoxItems.raw();
		String strReclassificationDrugVendor_ListBoxItems = ReclassificationDrugVendor_list_items.get(1).get(0);
		uiaddContractInformation.verifyReclassificationDrugVendorListBoxItems(strReclassificationDrugVendor_ListBoxItems);
	}
	
	@Step
	public void input_ReclassificationDrugVendor_list_box_value(DataTable reclassificationDrugVendor_ListBoxValue ) throws Throwable
	{
		List<List<String>> ReclassificationDrugVendor_list = reclassificationDrugVendor_ListBoxValue.raw();
		String strreclassificationDrugVendor_ListBoxValue = ReclassificationDrugVendor_list.get(1).get(0);
		addContractInformation.selectValueFromReClassificationDrugVendorList(strreclassificationDrugVendor_ListBoxValue);
	}
	
	//  ------------------- Internal_External
	@Step
	public void verify_the_Internal_External_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyInternalExternalListBoxIsPresent();
	}
	
	@Step
	public void verify_the_Internal_External_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyInternalExternalListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_Internal_External_list_box_items(DataTable internalExternal_ListBoxItems) throws Throwable
	{
		List<List<String>> Internal_External_list_items = internalExternal_ListBoxItems.raw();
		String strInternalExternal_ListBoxItems = Internal_External_list_items.get(1).get(0);
		uiaddContractInformation.verifyInternalExternalListBoxItems(strInternalExternal_ListBoxItems);
	}
	
	@Step
	public void input_Internal_External_list_box_value(DataTable internalExternal_ListBoxValue ) throws Throwable
	{
		List<List<String>> Internal_External_list = internalExternal_ListBoxValue.raw();
		String strInternalExternal_ListBoxValue = Internal_External_list.get(1).get(0);
		addContractInformation.selectValueFromInternalOrExternalList(strInternalExternal_ListBoxValue);
	}
	
	//  --------------- Contract line of business:
	@Step
	public void verify_the_Contract_LOB_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyContractLineOfBusinessListBoxIsPresent();
	}
	
	@Step
	public void verify_the_Contract_LOB_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyContractLineOfBusinessListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_Contract_LOB_list_box_items(DataTable ContractLOB_ListBoxItems) throws Throwable
	{
		List<List<String>> Contract_LOB_list_items = ContractLOB_ListBoxItems.raw();
		String strcontractLOB_ListBoxItems = Contract_LOB_list_items.get(1).get(0);
		uiaddContractInformation.verifyContractLineOfBusinessListBoxItems(strcontractLOB_ListBoxItems);
	}
	
	@Step
	public void input_Contract_LOB_list_box_value(DataTable contractLOB_ListBoxValue ) throws Throwable
	{
		List<List<String>> Contract_LOB_list = contractLOB_ListBoxValue.raw();
		String strcontractLOB_ListBoxValue = Contract_LOB_list.get(1).get(0);
		addContractInformation.selectValueFromContractLineOfBusinessList(strcontractLOB_ListBoxValue);
	}
	
	@Step
	public void verify_the_vendor_adj_day_supply_option_list_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyVendorAdjDaySupplyOptionListBoxIsPresent();
	}
	
	@Step
	public void verify_the_vendor_adj_day_supply_option_list_box_disabled()throws Throwable
	{
		uiaddContractInformation.verifyVendorAdjDaySupplyOptionListBoxIsDisabled();
	}
	
	@Step
	public void verify_the_Customer_adj_day_supply_option_list_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyCustomerAdjDaySupplyOptionListBoxIsPresent();
	}
	
	@Step
	public void verify_the_Customer_adj_day_supply_option_list_box_disabled()throws Throwable
  	{
		uiaddContractInformation.verifyCustomerAdjDaySupplyOptionListBoxIsDisabled();
  	}
	
	//  --------------- Contract Type
	@Step
	public void verify_the_contract_type_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyContractTypeListBoxIsPresent();
	}
	
	@Step
	public void verify_the_contract_type_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyContractTypeListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_contract_type_list_box_items(DataTable contracttype_ListBoxItems) throws Throwable
	{
		List<List<String>> contract_type_list_items = contracttype_ListBoxItems.raw();
		String strcontractType_ListBoxItems = contract_type_list_items.get(1).get(0);
		uiaddContractInformation.verifyContractTypeListBoxItems(strcontractType_ListBoxItems);
	}
	
	@Step
	public void input_contract_type_list_box_value(DataTable contracttype_ListBoxValue ) throws Throwable
	{
		List<List<String>> contracttype_list = contracttype_ListBoxValue.raw();
		String strcontractType_ListBoxValue = contracttype_list.get(1).get(0);
		addContractInformation.selectValueFromContractTypeList(strcontractType_ListBoxValue);
	}
	
	//  --------------- Claim basis
	@Step
	public void verify_the_claim_basis_list_box_presence() throws Throwable
	{
		uiaddContractInformation.verifyClaimBasisListBoxIsPresent();
	}
	
	@Step
	public void verify_the_claim_basis_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyClaimBasisListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_claim_basis_list_box_items(DataTable claimbasis_ListBoxItems) throws Throwable
	{
		List<List<String>> claim_basis_list_items = claimbasis_ListBoxItems.raw();
		String strClaimBasis_ListBoxItems = claim_basis_list_items.get(1).get(0);
		uiaddContractInformation.verifyClaimBasisListBoxItems(strClaimBasis_ListBoxItems);
	}
	
	@Step
	public void select_vendor_basis_list_box_value(DataTable claimbasis_ListBoxValue ) throws Throwable
	{
		List<List<String>> claim_basis_list = claimbasis_ListBoxValue.raw();
		String strClaimBasis_ListBoxValue = claim_basis_list.get(1).get(0);
		addContractInformation.selectValueFromClaimBasisList(strClaimBasis_ListBoxValue);
	}
	
	// ------ Vendor contract Start Date Edit Box
	
	@Step
	public void verify_the_Vendor_Start_Date_Edit_Box_presence()throws Throwable
 	{
		uiaddContractInformation.verifyContractStartDateEditBoxIsPresent();
 	}
	
	@Step
	public void verify_the_Vendor_Start_Date_Edit_Box_enabled()throws Throwable
  	{
		uiaddContractInformation.verifyContractStartDateEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_Vendor_Start_Date_Edit_Box_maximum_length(DataTable startDate_EditBoxMaxLength)throws Throwable
  	{
		List<List<String>> startDateMaxLength = startDate_EditBoxMaxLength.raw();
		String strstartDate_EditBoxMaxLength = startDateMaxLength.get(1).get(0);
		uiaddContractInformation.verifyContractStartDateEditBoxMaxLength(strstartDate_EditBoxMaxLength);
  	}
	
	@Step
	public void verify_the_Vendor_Start_Date_Edit_Box_Default_text(DataTable startDate_EditBoxDefaultText)throws Throwable
  	{
		List<List<String>> startDateDefaultText = startDate_EditBoxDefaultText.raw();
		String strstartDate_EditBoxDefaultText = startDateDefaultText.get(1).get(0);
		uiaddContractInformation.verifyContractStartDateEditBoxDefaultText(strstartDate_EditBoxDefaultText);
  	}
	
	@Step
	public void input_value_into_Vendor_Start_Date_Edit_Box(DataTable startDate_EditBoxValue)throws Throwable
  	{
		List<List<String>> startDateEdit = startDate_EditBoxValue.raw();
		String strstartDate_EditBoxValue = startDateEdit.get(1).get(0);
		addContractInformation.setTextIntoStartDateEdit(strstartDate_EditBoxValue);
  	}
	
	// ------ Vendor contract End Date Edit Box
	@Step
	public void verify_the_Vendor_End_Date_Edit_Box_presence()throws Throwable
 	{
		uiaddContractInformation.verifyContractEndDateEditBoxIsPresent();
 	}
	
	@Step
	public void verify_the_Vendor_End_Date_Edit_Box_enabled()throws Throwable
  	{
		uiaddContractInformation.verifyContractEndDateEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_Vendor_End_Date_Edit_Box_maximum_length(DataTable endDate_EditBoxMaxLength)throws Throwable
  	{
		List<List<String>> endDateMaxLength = endDate_EditBoxMaxLength.raw();
		String strendDate_EditBoxMaxLength = endDateMaxLength.get(1).get(0);
		uiaddContractInformation.verifyContractEndDateEditBoxMaxLength(strendDate_EditBoxMaxLength);
  	}
	
	@Step
	public void verify_the_Vendor_End_Date_Edit_Box_Default_text(DataTable endDate_EditBoxDefaultText)throws Throwable
  	{
		List<List<String>> endDateDefaultText = endDate_EditBoxDefaultText.raw();
		String strendDate_DefaultText = endDateDefaultText.get(1).get(0);
		uiaddContractInformation.verifyContractEndDateEditBoxDefaultText(strendDate_DefaultText);
  	}
	
	@Step
	public void input_value_into_Vendor_End_Date_Edit_Box(DataTable endDate_EditBoxValue)throws Throwable
  	{
		List<List<String>> endDateEdit = endDate_EditBoxValue.raw();
		String strendDate_EditBoxValue = endDateEdit.get(1).get(0);
		addContractInformation.setTextIntoEndDateEdit(strendDate_EditBoxValue);
  	}
	
	// -------Cosmetic drugs		
	@Step
	public void verify_the_Cosmetic_drugs_check_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyCosmeticDrugsCheckBoxIsPresent();
	}

	@Step
	public void verify_the_Cosmetic_drugs_check_box_enabled()throws Throwable
	{
		uiaddContractInformation.verifyCosmeticDrugsCheckBoxIsEnabled();
	}
	
	// -------Compound drugs
	@Step
	public void verify_the_Compound_drugs_check_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyCompoundDrugsCheckBoxIsPresent();
	}

	@Step
	public void verify_the_Compound_drugs_check_box_enabled()throws Throwable
	{
		uiaddContractInformation.verifyCompoundDrugsCheckBoxIsEnabled();
	}
	
	// ---------- Multisource brand drugs
	@Step
	public void verify_the_Multisource_brand_drugs_check_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyMultisourceBrandDrugsCheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_Multisource_brand_drugs_check_box_enabled()throws Throwable
	{
		uiaddContractInformation.verifyMultisourceBrandDrugsCheckBoxIsEnabled();
	}
	
	// ----------- Vaccines
	@Step
	public void verify_the_Vaccines_check_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyVaccinesCheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_Vaccines_check_box_enabled()throws Throwable
	{
		uiaddContractInformation.verifyVaccinesCheckBoxIsEnabled();
	}
	
	// ----------   Over the counter drugs
	@Step
	public void verify_the_Over_the_counter_drugs_check_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyOverTheCounterDrugsCheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_Over_the_counter_drugs_check_box_enabled()throws Throwable
	{
		uiaddContractInformation.verifyOverTheCounterDrugsCheckBoxIsPresent();
	}
	
	@Step
    public void click_on_the_Over_the_counter_drugs_check_box(DataTable overTheCounterDrugs_CheckBoxValue)throws Throwable
    {
    	List<List<String>> overTheCounterDrugs_checkBoxVal = overTheCounterDrugs_CheckBoxValue.raw();
    	String stroverTheCounterDrugs_CheckBoxValue = overTheCounterDrugs_checkBoxVal.get(1).get(0);
    	addContractInformation.clickOnOverTheCounterDrugs_CheckBox(stroverTheCounterDrugs_CheckBoxValue);
    }
	
	// -------- Except insulins
	@Step
	public void verify_the_Except_insulins_check_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyExceptInsulinsCheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_Except_insulins_check_box_disabled()throws Throwable
	{
		uiaddContractInformation.verifyExceptInsulinsCheckBoxIsDisabled();
	}
	
	@Step
	public void verify_the_Except_insulins_check_box_eabled()throws Throwable
	{
		uiaddContractInformation.verifyExceptInsulinsCheckBoxIsEnabled();
	}
	
	// ----     Except diabetic supplies and test strips		
	@Step
	public void verify_the_Except_diabetic_supplies_and_test_strips_check_box_presence()throws Throwable
	{
		uiaddContractInformation.verifyExceptDiabeticSuppliesAndTestStripsCheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_Except_diabetic_supplies_and_test_strips_check_box_disabled()throws Throwable
	{
		uiaddContractInformation.verifyExceptDiabeticSuppliesAndTestStripsCheckBoxIsDisabled();
	}
	
	@Step
	public void verify_the_Except_diabetic_supplies_and_test_strips_check_box_eabled()throws Throwable
	{
		uiaddContractInformation.verifyExceptDiabeticSuppliesAndTestStripsCheckBoxIsEnabled();
	}
	
	// Reclassify specialty claims to retail
	@Step
	public void verify_the_Reclassify_specialty_claims_to_retail_presence() throws Throwable
	{
		uiaddContractInformation.verifyReclassifySpecialtyClaimsToRetailCheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_Reclassify_specialty_claims_to_retail_enabled() throws Throwable
	{
		uiaddContractInformation.verifyReclassifySpecialtyClaimsToRetailCheckBoxIsEnabled();
	}
	
	// Reclassify day supply break at 34
	@Step
	public void verify_the_reclassify_day_supply_break_at_34_presence() throws Throwable
	{
		uiaddContractInformation.verifyReclassifyDaySupplyBreakAt34CheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_reclassify_day_supply_break_at_34_enabled() throws Throwable
	{
		uiaddContractInformation.verifyReclassifyDaySupplyBreakAt34CheckBoxIsEnabled();
	}
	
	// Reclassify brand claims to generic
	@Step
	public void verify_the_reclassify_brand_claims_to_generic_presence() throws Throwable
	{
		uiaddContractInformation.verifyReclassifyBrandClaimsToGenericCheckBoxIsPresent();
	}
	
	@Step
	public void verify_the_reclassify_brand_claims_to_generic_enabled() throws Throwable
	{
		uiaddContractInformation.verifyReclassifyBrandClaimsToGenericCheckBoxIsEnabled();
	}
	
	
	// ---------------------  Monthly penalty
	@Step
	public void verify_the_monthly_penalty_edit_box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyMonthlyPenaltyEditBoxIsPresent();
  	}
  	
	@Step
  	public void verify_the_monthly_penalty_edit_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyMonthlyPenaltyEditBoxIsEnabled();
  	}
  	
	@Step
  	public void verify_the_monthly_penalty_edit_box_max_length(DataTable monthlyPenalty_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> monthlyPenalty_EditBoxVal = monthlyPenalty_EditBoxMaxLength.raw();
    	String strmonthlyPenalty_EditBoxMaxLength = monthlyPenalty_EditBoxVal.get(1).get(0);
    	uiaddContractInformation.verifyMonthlyPenaltyEditBoxMaxLength(strmonthlyPenalty_EditBoxMaxLength);
  	}
	
	@Step
  	public void set_text_into_monthly_penalty_edit_box(DataTable monthlyPenalty_EditBoxValue) throws Throwable
  	{
		List<List<String>> monthlyPenalty_EditBoxVal = monthlyPenalty_EditBoxValue.raw();
    	String strmonthlyPenalty_EditBoxValue = monthlyPenalty_EditBoxVal.get(1).get(0);
    	addContractInformation.setTextIntoMonthlyPenaltyEdit(strmonthlyPenalty_EditBoxValue);    	
  	}
  	
	// ----------- Minimum claims to avoid penalty
	@Step
  	public void verify_the_minimum_claims_to_avoid_penalty_edit_box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyMinimumClaimsToAvoidPenaltyEditBoxIsPresent();
  	}
  	
	@Step
  	public void verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_disabled() throws Throwable
  	{
		uiaddContractInformation.verifyMinimumClaimsToAvoidPenaltyEditBoxIsDisabled();
  	}
	
	@Step
  	public void verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyMinimumClaimsToAvoidPenaltyEditBoxIsEnabled();		
  	}
	
	@Step
  	public void verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_max_length(DataTable minimumClaimsToAvoidPenalty_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> minimumClaimsToAvoidPenalty_Val = minimumClaimsToAvoidPenalty_EditBoxMaxLength.raw();
		String strminimumClaimsToAvoidPenalty_EditBoxMaxLength = minimumClaimsToAvoidPenalty_Val.get(1).get(0);
		uiaddContractInformation.verifyMinimumClaimsToAvoidPenaltyEditBoxMaxLength(strminimumClaimsToAvoidPenalty_EditBoxMaxLength);
  	}
	
	@Step
  	public void set_text_into_Minimum_claims_to_avoid_penalty_Edit_Box(DataTable minimumClaimsToAvoidPenalty_EditBoxValue) throws Throwable
  	{
		List<List<String>> minimumClaimsToAvoidPenalty_Val = minimumClaimsToAvoidPenalty_EditBoxValue.raw();
		String strminimumClaimsToAvoidPenalty_EditBoxValue = minimumClaimsToAvoidPenalty_Val.get(1).get(0);
		addContractInformation.setTextIntoMinimumClaimsToAvoidPenaltyEdit(strminimumClaimsToAvoidPenalty_EditBoxValue);
  	}
	
	// ----------  penalty Start date
	@Step
	public void verify_the_penalty_start_Date_Edit_Box_Presence()throws Throwable
	{
		uiaddContractInformation.verifyPenaltyStartDateEditBoxIsPresent();
	}
	@Step
	public void verify_the_penalty_start_Date_Edit_Box_Disabled()throws Throwable
	{
		uiaddContractInformation.verifyPenaltyStartDateEditBoxIsDisabled();
	}
	
	@Step
	public void verify_the_penalty_start_Date_Edit_Box_Eabled()throws Throwable
	{
		uiaddContractInformation.verifyPenaltyStartDateEditBoxIsEnabled();
	}
	
	@Step
	public void verify_the_penalty_start_Date_Edit_Box_Max_Length(DataTable startDate_EditBoxMaxLength)throws Throwable
	{
		List<List<String>> startDate_maxLength = startDate_EditBoxMaxLength.raw();
		String strstartDate_EditBoxMaxLength = startDate_maxLength.get(1).get(0);
		uiaddContractInformation.verifyPenaltyStartDateEditBoxMaxLength(strstartDate_EditBoxMaxLength);
	}
	
	@Step
	public void verify_the_penalty_start_Date_Edit_Box_Default_Text(DataTable startDate_EditBoxDefaultText)throws Throwable
	{
		List<List<String>> startdate_EditBoxDefaultText = startDate_EditBoxDefaultText.raw();
		String strstartDate_EditBoxDefaultText = startdate_EditBoxDefaultText.get(1).get(0);
		uiaddContractInformation.verifyPenaltyStartDateEditBoxDefaultText(strstartDate_EditBoxDefaultText);
	}
	
	@Step
	public void input_value_Into_penalty_start_Date_Edit_Box(DataTable startDate_EditBoxValue)throws Throwable
	{
		List<List<String>> startDate_Val = startDate_EditBoxValue.raw();
		String strstartDate_EditBoxValue = startDate_Val.get(1).get(0);
		addContractInformation.setTextIntoPenaltyStartDateEdit(strstartDate_EditBoxValue);
	}
	
	
	// --------- penalty End date
	@Step
	public void verify_the_penalty_end_Date_Edit_Box_Presence()throws Throwable
	{
		uiaddContractInformation.verifyPenaltyEndDateEditBoxIsPresent();
	}
	@Step
	public void verify_the_penalty_end_Date_Edit_Box_Disabled()throws Throwable
	{
		uiaddContractInformation.verifyPenaltyEndDateEditBoxIsDisabled();
	}
	
	@Step
	public void verify_the_penalty_end_Date_Edit_Box_Eabled()throws Throwable
	{
		uiaddContractInformation.verifyPenaltyEndDateEditBoxIsEnabled();
	}
	
	@Step
	public void verify_the_penalty_end_Date_Edit_Box_Max_Length(DataTable endDate_EditBoxMaxLength)throws Throwable
	{
		List<List<String>> endDate_maxLength = endDate_EditBoxMaxLength.raw();
		String strendDate_EditBoxMaxLength = endDate_maxLength.get(1).get(0);
		uiaddContractInformation.verifyPenaltyEndDateEditBoxMaxLength(strendDate_EditBoxMaxLength);
	}
	
	@Step
	public void verify_the_penalty_end_Date_Edit_Box_Default_Text(DataTable endDate_EditBoxDefaultText)throws Throwable
	{
		List<List<String>> enddate_EditBoxDefaultText = endDate_EditBoxDefaultText.raw();
		String strendDate_EditBoxDefaultText = enddate_EditBoxDefaultText.get(1).get(0);
		uiaddContractInformation.verifyPenaltyEndDateEditBoxDefaultText(strendDate_EditBoxDefaultText);
	}
	
	@Step
	public void input_value_Into_penalty_end_Date_Edit_Box(DataTable endDate_EditBoxValue)throws Throwable
	{
		List<List<String>> endDate_Val = endDate_EditBoxValue.raw();
		String strendDate_EditBoxValue = endDate_Val.get(1).get(0);
		addContractInformation.setTextIntoPenaltyEndDateEdit(strendDate_EditBoxValue);
	}
	
	// -----------------------------------------------------------------------------------------------------------
	// Rate Details Panel
	// ------------------------------------------------------------------------------------------------------------
	
	// Start Date Edit Box 
	
	@Step
	public void verify_the_rate_details_start_date_edit_box_presence()	throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsStartDateEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_rate_details_start_date_edit_box_enabled()	throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsStartDateEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_rate_details_start_date_edit_box_max_length(DataTable startDate_EditBoxMaxLength)	throws Throwable
  	{
		List<List<String>> startDate_Val = startDate_EditBoxMaxLength.raw();
		String strstartDate_EditBoxMaxLength = startDate_Val.get(1).get(0);
		uiaddContractInformation.verifyRateDetailsStartDatEditBoxMaxLength(strstartDate_EditBoxMaxLength);
  	}
	
	@Step
	public void verify_the_rate_details_start_date_edit_box_default_text(DataTable startDate_EditBoxDefaultText)	throws Throwable
  	{
		List<List<String>> startdate_EditBoxDefaultText = startDate_EditBoxDefaultText.raw();
		String strstartDate_EditBoxDefaultText = startdate_EditBoxDefaultText.get(1).get(0);
		uiaddContractInformation.verifyRateDetailsStartDateEditBoxDefaultText(strstartDate_EditBoxDefaultText);
  	}
	
	@Step
	public void input_value_into_rate_details_start_date_edit_box(DataTable startDate_EditBoxValue)throws Throwable
  	{
		List<List<String>> startDate_Val = startDate_EditBoxValue.raw();
		String strstartDate_EditBoxValue = startDate_Val.get(1).get(0);
		addContractInformation.setTextIntoRateDetailsStartDateEdit(strstartDate_EditBoxValue);
  	}
	
	// End Date Edit Box
	@Step
	public void verify_the_rate_details_end_date_edit_box_presence()	throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsEndDateEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_rate_details_end_date_edit_box_enabled()	throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsEndDateEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_rate_details_end_date_edit_box_max_length(DataTable endDate_EditBoxMaxLength)	throws Throwable
  	{
		List<List<String>> endDate_Val = endDate_EditBoxMaxLength.raw();
		String strendDate_EditBoxMaxLength = endDate_Val.get(1).get(0);
		uiaddContractInformation.verifyRateDetailsEndDateEditBoxMaxLength(strendDate_EditBoxMaxLength);
  	}
	
	@Step
	public void verify_the_rate_details_end_date_edit_box_default_text(DataTable endDate_EditBoxDefaultText)	throws Throwable
  	{
		List<List<String>> enddate_EditBoxDefaultText = endDate_EditBoxDefaultText.raw();
		String strendDate_EditBoxDefaultText = enddate_EditBoxDefaultText.get(1).get(0);
		uiaddContractInformation.verifyRateDetailsEndDateEditBoxDefaultText(strendDate_EditBoxDefaultText);
  	}
	
	@Step
	public void input_value_into_rate_details_end_date_edit_box(DataTable endDate_EditBoxValue) throws Throwable
  	{
		List<List<String>> endDate_Val = endDate_EditBoxValue.raw();
		String strendDate_EditBoxValue = endDate_Val.get(1).get(0);
		addContractInformation.setTextIntoRateDetailsEndDateEdit(strendDate_EditBoxValue);
  	}
	
	// ---------- Rate Details Line Of Business
	@Step
	public void verify_the_rate_details_line_of_business_list_box_presence()throws Throwable
  	{
		uiaddContractInformation.verifyLineOfBusinessListBoxIsPresent();
  	}
	
	@Step
	public void verify_the_rate_details_line_of_business_list_box_enabled()throws Throwable
  	{
		uiaddContractInformation.verifyLineOfBusinessListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_rate_details_line_of_business_list_box_items(DataTable rateDetailsLOB_ListBoxItems) throws Throwable
  	{
		List<List<String>> rateDetailsLOB_Val = rateDetailsLOB_ListBoxItems.raw();
		String strrateDetailsLOB_ListBoxItems = rateDetailsLOB_Val.get(1).get(0);
		uiaddContractInformation.verifyLineOfBusinessListBoxItems(strrateDetailsLOB_ListBoxItems);
		
  	}
	
	@Step
	public void select_value_from_rate_details_line_of_business_list_box(DataTable rateDetailsLOB_ListBoxValue) throws Throwable
  	{
		List<List<String>> rateDetailsLOB_Val = rateDetailsLOB_ListBoxValue.raw();
		String strrateDetailsLOB_ListBoxValue = rateDetailsLOB_Val.get(1).get(0);
		addContractInformation.selectValueFromRateDetailsLineOfBusinessList(strrateDetailsLOB_ListBoxValue);
  	}
	
	// ---------- Transparency
	@Step
	public void verify_the_transparency_list_box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyTransparencyListBoxIsPresent();
  	}
	
	@Step
	public void verify_the_transparency_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyTransparencyListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_transparency_list_box_items(DataTable transparency_ListBoxItems) throws Throwable
  	{
		List<List<String>> transparency_Val = transparency_ListBoxItems.raw();
		String strtransparency_ListBoxItems = transparency_Val.get(1).get(0);
		uiaddContractInformation.verifyTransparencyListBoxItems(strtransparency_ListBoxItems);
  	}
	
	@Step
	public void select_value_from_transparency_list_box(DataTable transparency_ListBoxValue) throws Throwable
  	{
		List<List<String>> transparency_Val = transparency_ListBoxValue.raw();
		String strtransparency_ListBoxValue = transparency_Val.get(1).get(0);
		addContractInformation.selectValueFromTransparencyList(strtransparency_ListBoxValue);
  	}
	
	// Fee Method
	
	@Step
	public void verify_the_fee_method_list_box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyFeeMethodListBoxIsPresent();
  	}
	
	@Step
	public void verify_the_fee_method_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyFeeMethodListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_fee_method_list_box_items(DataTable feemethod_ListBoxItems) throws Throwable
  	{
		List<List<String>> feemethod_Val = feemethod_ListBoxItems.raw();
		String strfeemethod_ListBoxItems = feemethod_Val.get(1).get(0);
		uiaddContractInformation.verifyFeeMethodListBoxItems(strfeemethod_ListBoxItems);
  	}
	
	@Step
	public void select_value_from_fee_method_list_box(DataTable feemethod_ListBoxValue) throws Throwable
  	{
		List<List<String>> feemethod_Val = feemethod_ListBoxValue.raw();
		String strfeemethod_ListBoxValue = feemethod_Val.get(1).get(0);
		addContractInformation.selectValueFromFeeMethodList(strfeemethod_ListBoxValue);
  	}
	
	// ------------------------------------------------ Vendor rebate share
	@Step
	public void verify_the_Vendor_rebate_share_Edit_Box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyVendorRebateShareEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_Vendor_rebate_share_Edit_Box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyVendorRebateShareEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_Vendor_rebate_share_Edit_Box_Max_Length(DataTable vendorRebateShare_EditBoxMaxLength) throws Throwable
	{
		List<List<String>> vendorRebateShare_Val = vendorRebateShare_EditBoxMaxLength.raw();
		String strvendorRebateShare_EditBoxMaxLength = vendorRebateShare_Val.get(1).get(0);
		uiaddContractInformation.verifyVendorRebateShareEditBoxMaxLength(strvendorRebateShare_EditBoxMaxLength);
  	}
	
	@Step
	public void input_value_into_Vendor_rebate_share_Edit_Box(DataTable vendorRebateShare_EditBoxValue) throws Throwable
  	{
		List<List<String>> vendorRebateShare_EditVal = vendorRebateShare_EditBoxValue.raw();
		String strvendorRebateShare_EditBoxValue = vendorRebateShare_EditVal.get(1).get(0);
		addContractInformation.setTextIntoVendorRebateShareEdit(strvendorRebateShare_EditBoxValue);
  	}
	
	// --------------------------------------------  Admin Fee Edit Box
	@Step
	public void  verify_the_admin_fee_edit_box_presence()throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsAdminFeeEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_admin_fee_edit_box_enabled()throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsAdminFeeEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_admin_fee_edit_box_max_length(DataTable adminFee_EditBox_MaxLength)throws Throwable
  	{
		List<List<String>> adminFee_Length = adminFee_EditBox_MaxLength.raw();
		String stradminFee_EditBoxMaxLength = adminFee_Length.get(1).get(0);
		uiaddContractInformation.verifyRateDetailsAdminFeeEditBoxMaxLength(stradminFee_EditBoxMaxLength);
  	}
	
	@Step
	public void input_value_into_admin_fee_edit_box(DataTable adminFee_EditBox_Value)throws Throwable
  	{
		List<List<String>> adminFee_EditVal = adminFee_EditBox_Value.raw();
		String strvendorRebateShare_EditBoxValue = adminFee_EditVal.get(1).get(0);
		addContractInformation.setTextIntoAdminFeeEdit(strvendorRebateShare_EditBoxValue);
  	}
	
	// -------------------------------------------------- DST rebate share Edit box
	@Step
	public void verify_the_dst_rebate_share_edit_box_presence()throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsDSTRebateShareEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_dst_rebate_share_edit_box_enabled()throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsDSTRebateShareEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_dst_rebate_share_edit_box_max_length(DataTable DSTRebateShare_EditBox_MaxLength)throws Throwable
  	{
		List<List<String>> DSTRebateShare_Length = DSTRebateShare_EditBox_MaxLength.raw();
		String strDSTRebateShare_EditBoxMaxLength = DSTRebateShare_Length.get(1).get(0);
		uiaddContractInformation.verifyRateDetailsDSTRebateShareEditBoxMaxLength(strDSTRebateShare_EditBoxMaxLength);
  	}
	
	@Step
	public void input_value_into_dst_rebate_share_edit_box(DataTable DSTRebateShare_EditBox_Value) throws Throwable
  	{
		List<List<String>> DSTRebateShare_EditVal = DSTRebateShare_EditBox_Value.raw();
		String strDSTRebateShare_EditBoxValue = DSTRebateShare_EditVal.get(1).get(0);
		addContractInformation.setTextIntoDSTRebateShareEdit(strDSTRebateShare_EditBoxValue);
  	}
	
	// -------------------------------Customer rebate share Edit Box
	@Step
	public void verify_the_Customer_rebate_share_Edit_Box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyCustomerRebateShareEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_Customer_rebate_share_Edit_Box_disabled() throws Throwable
  	{
		uiaddContractInformation.verifyCustomerRebateShareEditBoxIsDisabled();
  	}
	
	// ------------------ dst revenue
	@Step
	public void verify_the_dst_revenue_edit_box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyDSTRevenueEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_dst_revenue_edit_box_disabled() throws Throwable
  	{
		uiaddContractInformation.verifyDSTRevenueEditBoxIsDisabled();
  	}
	
	// -----------------------------   Vendor adj day supply option box
	@Step
	public void verify_the_vendor_adj_day_supply_option_list_box_enabled()throws Throwable
  	{
		uiaddContractInformation.verifyVendorAdjDaySupplyOptionListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_vendor_adj_day_supply_option_list_box_items(DataTable vendorAdjDaySupplyOption_ListBoxItems)throws Throwable
  	{
		List<List<String>> vendorAdjDaySupplyOption_listItem = vendorAdjDaySupplyOption_ListBoxItems.raw();
		String strvendorAdjDaySupplyOption_ListBoxItems = vendorAdjDaySupplyOption_listItem.get(1).get(0);
		uiaddContractInformation.verifyVendorAdjDaySupplyOptionListBoxItems(strvendorAdjDaySupplyOption_ListBoxItems);
  	}
	
	@Step
	public void select_value_from_the_vendor_adj_day_supply_option_list_box(DataTable vendorAdjDaySupplyOption_ListBoxValue) throws Throwable
  	{
		List<List<String>> vendorAdjDaySupplyOption_listValue = vendorAdjDaySupplyOption_ListBoxValue.raw();
		String strvendorAdjDaySupplyOption_ListBoxValue = vendorAdjDaySupplyOption_listValue.get(1).get(0);		
		addContractInformation.selectValueFromVendorAdjDaySupplyOptionList(strvendorAdjDaySupplyOption_ListBoxValue);
		
  	}
	
	// ------------------------------- Customer adj day supply option
	@Step
	public void verify_the_customer_adj_day_supply_option_list_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyCustomerAdjDaySupplyOptionListBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_customer_adj_day_supply_option_list_box_items(DataTable customerAdjDaySupplyOption_ListBoxItems) throws Throwable
  	{
		List<List<String>> customerAdjDaySupplyOption_Val = customerAdjDaySupplyOption_ListBoxItems.raw();
		String strcustomerAdjDaySupplyOption_ListBoxItems = customerAdjDaySupplyOption_Val.get(1).get(0);
		uiaddContractInformation.verifyCustomerAdjDaySupplyOptionListBoxItems(strcustomerAdjDaySupplyOption_ListBoxItems);
  	}
	
	@Step
	public void select_value_from_customer_adj_day_supply_option_list_box(DataTable customerAdjDaySupplyOption_ListBoxValue) throws Throwable
  	{
		List<List<String>> customerAdjDaySupplyOption_ListVal = customerAdjDaySupplyOption_ListBoxValue.raw();
		String strcustomerAdjDaySupplyOption_ListBoxValue = customerAdjDaySupplyOption_ListVal.get(1).get(0);
		addContractInformation.selectValueFromCustomerAdjDaySupplyOptionList(strcustomerAdjDaySupplyOption_ListBoxValue);
  	}
	
	// -----------------------------------  Notes
	@Step
	public void verify_the_notes_edit_box_presence() throws Throwable
  	{
		uiaddContractInformation.verifyNotesEditBoxIsPresent();
  	}
	
	@Step
	public void verify_the_notes_edit_box_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyNotesEditBoxIsEnabled();
  	}
	
	@Step
	public void verify_the_notes_edit_box_max_length(DataTable notes_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> notes_EditLength = notes_EditBoxMaxLength.raw();
		String strnotes_EditBoxLength = notes_EditLength.get(1).get(0);
		uiaddContractInformation.verifyNotesEditBoxMaxLength(strnotes_EditBoxLength);
  	}
	
	@Step
	public void input_value_into_notes_edit_box(DataTable notes_EditBoxValue) throws Throwable
  	{
		List<List<String>> notes_EditValue = notes_EditBoxValue.raw();
		String strnotes_EditBoxValue = notes_EditValue.get(1).get(0);
		addContractInformation.setTextIntoNotesEdit(strnotes_EditBoxValue);
  	}
	
	
	// --------------------------- Add Button
	@Step
	public void verify_add_button_presence() throws Throwable
  	{
		uiaddContractInformation.verifyAddButtonIsPresent();
  	}
	
	@Step
	public void verify_add_button_disabled() throws Throwable
  	{
		uiaddContractInformation.verifyAddButtonIsDisabled();
  	}
	
	@Step
	public void verify_add_button_enabled() throws Throwable
  	{
		uiaddContractInformation.verifyAddButtonIsEnabled();
  	}
	
	@Step
	public void click_on_add_button()throws Throwable
  	{
		uiaddContractInformation.clickOnAddButton();
  	}
	
	@Step
	public void click_on_next_button() throws Throwable
  	{
		uiaddContractInformation.clickOnNextButton();
  	}

	// ------------------------ Next Button
	@Step
	public void verify_next_button_presence() throws Throwable
  	{
		uiaddContractInformation.verifyNextButtonIsPresent();
  	}
	
	@Step
	public void verify_next_button_disabled() throws Throwable
  	{
		uiaddContractInformation.verifyNextButtonIsDisabled();
  	}
	
	@Step
	public void verify_the_next_button_enable() throws Throwable
  	{
		uiaddContractInformation.verifyNextButtonIsEnabled();
  	}
	
	// ------------------------- Update Button
	@Step
	public void verify_update_button_presence() throws Throwable
   	{
		uiaddContractInformation.verifyUpdateButtonIsPresent();
   	}
	
	@Step
	public void verify_update_button_disabled() throws Throwable
   	{
		uiaddContractInformation.verifyUpdateButtonIsDisabled();
   	}
	
	@Step
	public void verify_the_update_button_enabled() throws Throwable
   	{
		uiaddContractInformation.verifyUpdateButtonIsEnabled();
   	}
	
	// -------------------------- Remove Button
	@Step
	public void verify_remove_button_presence() throws Throwable
   	{
		uiaddContractInformation.verifyRemoveButtonIsPresent();
   	}
	
	@Step
	public void verify_remove_button_disabled() throws Throwable
   	{
		uiaddContractInformation.verifyRemoveButtonIsDisabled();
   	}
	
	@Step
	public void verify_remove_button_enabled() throws Throwable
   	{
		uiaddContractInformation.verifyRemoveButtonIsEnabled();
   	}
	
	// ---------------------------- Rate Details Table
	@Step
	public void verify_the_rate_details_table_presence()throws Throwable
   	{
		uiaddContractInformation.verifyRateDetailsTablePresence();
   	}
	
	@Step
	public void rate_details_table_should_be_displayed()throws Throwable
  	{
		uiaddContractInformation.verifyRateDetailsTablePresence();
  	}
	
	@Step
	public void click_on_matching_check_box(DataTable CheckBoxDetailsForcheckOperation)throws Throwable
  	{
		List<List<String>> checkOperation = CheckBoxDetailsForcheckOperation.raw();
		String strCheckOperation = checkOperation.get(1).get(0);
		String strStart_Date = checkOperation.get(1).get(1);
		String strEnd_Date  = checkOperation.get(1).get(2);
		String strLine_Of_Business = checkOperation.get(1).get(3);
		String strTransparency = checkOperation.get(1).get(4); 
		String strFee_Method = checkOperation.get(1).get(5);
		String strVendor_Rebate_Share = checkOperation.get(1).get(6); 
		String strAdmin_Fee = checkOperation.get(1).get(7);
		String strDST_Rebate_Share = checkOperation.get(1).get(8);
		
		String strValueForCheck = strStart_Date + "*" + strEnd_Date + "*" + strLine_Of_Business+"*"+ strTransparency + "*" + strFee_Method + "*"+strVendor_Rebate_Share+"*"+strAdmin_Fee + "*"+ strDST_Rebate_Share; 
		
		uiaddContractInformation.clickOnCheckBoxInRateDetailsTable(strCheckOperation, strValueForCheck);
  	}
	
	@Step
	public void uncheck_the_selected_check_box(DataTable CheckBoxDetailsForUncheckOperation) throws Throwable
  	{
		List<List<String>> uncheckOperation = CheckBoxDetailsForUncheckOperation.raw();
		String strunCheckOperation = uncheckOperation.get(1).get(0);
		String strStart_Date = uncheckOperation.get(1).get(1);
		String strEnd_Date  = uncheckOperation.get(1).get(2);
		String strLine_Of_Business = uncheckOperation.get(1).get(3);
		String strTransparency = uncheckOperation.get(1).get(4); 
		String strFee_Method = uncheckOperation.get(1).get(5);
		String strVendor_Rebate_Share = uncheckOperation.get(1).get(6); 
		String strAdmin_Fee = uncheckOperation.get(1).get(7);
		String strDST_Rebate_Share = uncheckOperation.get(1).get(8);
		
		String strValueForunCheck = strStart_Date + "*" + strEnd_Date + "*" + strLine_Of_Business+"*"+ strTransparency + "*" + strFee_Method + "*"+strVendor_Rebate_Share+"*"+strAdmin_Fee + "*"+ strDST_Rebate_Share; 
		
		uiaddContractInformation.clickOnCheckBoxInRateDetailsTable(strunCheckOperation, strValueForunCheck);
  	}	
}