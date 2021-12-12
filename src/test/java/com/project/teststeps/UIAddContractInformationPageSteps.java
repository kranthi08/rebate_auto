package com.project.teststeps;

import com.project.actors.ActorUIAddContractInformation;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddContractInformationPageSteps 
{
	@Steps
	ActorUIAddContractInformation actorUIaddContractInformation;
	
	@Given("^User is on Customer Contract Creation page$")
	public void user_is_on_contract_creation_page()	throws Throwable
	{
		actorUIaddContractInformation.user_is_on_contract_creation_page();
	}
	
	// --------------------- Vendor List Box
	@When("^verify the Vendor List Box presence$")
	public void verify_the_vendor_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_list_box_presence();
	}
  	
	@Then("^verify the Vendor List Box enabled$")
  	public void verify_the_vendor_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_list_box_enabled();
  	}
  	
	@And("^verify the Vendor List Box items$")
	public void verify_the_vendor_list_box_items(DataTable vendorListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_list_box_items(vendorListItems);;
	}
	
	@And("^select Vendor List Box value$")
	public void input_vendor_list_box_value(DataTable vendorListValue)throws Throwable
	{
		actorUIaddContractInformation.input_vendor_list_box_value(vendorListValue);
	}
	
	// -------------------------------- Vendor contract type
	@When("^verify the Vendor Contract Type List Box presence$")
	public void verify_the_vendor_contract_type_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_contract_type_list_box_presence();
	}
  	
	@Then("^verify the Vendor Contract Type List Box enabled$")
  	public void verify_the_vendor_contract_type_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_contract_type_list_box_enabled();
  	}
  	
	@And("^verify the Vendor Contract Type List Box items$")
	public void verify_the_vendor_contract_type_list_box_items(DataTable vendorcontracttypeListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_contract_type_list_box_items(vendorcontracttypeListItems);;
	}
	
	@And("^select Vendor Contract Type List Box value$")
	public void select_vendor_contract_type_list_box_value(DataTable vendorcontracttypeListValue)throws Throwable
	{
		actorUIaddContractInformation.select_vendor_contract_type_list_box_value(vendorcontracttypeListValue);
	}
	
	// -------------------------------- Vendor claim basis
	@When("^verify the Vendor Claim Basis List Box presence$")
	public void verify_the_vendor_claim_basis_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_claim_basis_list_box_presence();
	}
  	
	@Then("^verify the Vendor Claim Basis List Box enabled$")
  	public void verify_the_vendor_claim_basis_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_claim_basis_list_box_enabled();
  	}
  	
	@And("^verify the Vendor Claim Basis List Box items$")
	public void verify_the_vendor_claim_basis_list_box_items(DataTable vendorclaimbasisListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_claim_basis_list_box_items(vendorclaimbasisListItems);;
	}
	
	@And("^select Vendor Claim Basis List Box value$")
	public void input_vendor_claim_basis_list_box_value(DataTable vendorclaimbasisListValue)throws Throwable
	{
		actorUIaddContractInformation.input_vendor_claim_basis_list_box_value(vendorclaimbasisListValue);
	}
	
	// -------------------------------- Vendor day supply
	@When("^verify the Vendor Day Supply List Box presence$")
	public void verify_the_vendor_day_supply_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_day_supply_list_box_presence();
	}
  	
	@Then("^verify the Vendor Day Supply List Box enabled$")
  	public void verify_the_vendor_day_supply_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_day_supply_list_box_enabled();
  	}
  	
	@And("^verify the Vendor Day Supply List Box items$")
	public void verify_the_vendor_day_supply_list_box_items(DataTable vendordaysupplyListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_day_supply_list_box_items(vendordaysupplyListItems);;
	}
	
	@And("^select Vendor Day Supply List Box value$")
	public void input_vendor_day_supply_list_box_value(DataTable vendordaysupplyListValue)throws Throwable
	{
		actorUIaddContractInformation.input_vendor_day_supply_list_box_value(vendordaysupplyListValue);
	}
	
	// -------------------------------- client type
	@When("^verify the Client Type List Box presence$")
	public void verify_the_client_type_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_client_type_list_box_presence();
	}
  	
	@Then("^verify the Client Type List Box enabled$")
  	public void verify_the_client_type_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_day_supply_list_box_enabled();
  	}
  	
	@And("^verify the Client Type List Box items$")
	public void verify_the_client_type_list_box_items(DataTable clienttypeListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_client_type_list_box_items(clienttypeListItems);;
	}
	
	@And("^select Client Type List Box value$")
	public void select_client_type_list_box_value(DataTable clienttypeListValue)throws Throwable
	{
		actorUIaddContractInformation.select_value_from_client_type_list_box(clienttypeListValue);
	}
	
	// -------------------------------- Master Customer Set
	@When("^verify the Master Customer Set List Box presence$")
	public void verify_the_MCS_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_MCS_list_box_presence();
	}
  	
	@Then("^verify the Master Customer Set List Box enabled$")
  	public void verify_the_MCS_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_MCS_list_box_enabled();
  	}
  	
	@And("^verify the Master Customer Set List Box items$")
	public void verify_the_MCS_list_box_items(DataTable mcsListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_MCS_list_box_items(mcsListItems);;
	}
	
	@And("^select Master Customer Set List Box value$")
	public void input_MCS_list_box_value(DataTable mcsListValue)throws Throwable
	{
		actorUIaddContractInformation.input_MCS_list_box_value(mcsListValue);
	}
	
	// -------------------------------- Customer ID
	@When("^verify the Customer ID List Box presence$")
	public void verify_the_Customer_ID_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_CustomerID_list_box_presence();
	}
  	
	@Then("^verify the Customer ID List Box enabled$")
  	public void verify_the_Customer_ID_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_CustomerID_list_box_enabled();
  	}
  	
	@And("^verify the Customer ID List Box items$")
	public void verify_the_Customer_ID_list_box_items(DataTable customeridListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_CustomerID_list_box_items(customeridListItems);;
	}
	
	@And("^select Customer ID List Box value$")
	public void input_Customer_ID_list_box_value(DataTable customeridListValue)throws Throwable
	{
		actorUIaddContractInformation.input_CustomerID_list_box_value(customeridListValue);
	}
	
	// Customer Name Edit Box
	
	@When("^verify the Contract Name Edit Box presence$")
	public void verify_the_contract_name_edit_box_presence()throws Throwable
	{
		actorUIaddContractInformation.verify_the_contract_name_edit_box_presence();
	}
	
  	@Then("^verify the Contract Name Edit Box enabled$")
  	public void verify_the_contract_name_edit_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_contract_name_edit_box_enabled();
  	}
  	@And("^verify the Contract Name Edit Box max Length$")
  	public void verify_the_contract_name_edit_box_max_length(DataTable editBoxMaxLength)throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_contract_name_edit_box_max_length(editBoxMaxLength);
  	}
  	
  	@And("^input Contract Name Edit Box value$")
  	public void input_contract_name_edit_box_value(DataTable contractNameEditBoxValue)throws Throwable
  	{
  		actorUIaddContractInformation.set_Text_Into_Contract_Name_Edit_Box(contractNameEditBoxValue);
  	}
  	
  	// -- Reclassification drug vendor
  	@When("^verify the Reclassification drug vendor List Box presence$")
	public void verify_the_Reclassification_drug_vendor_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_ReclassificationDrugVendor_list_box_presence();
	}
  	
	@Then("^verify the Reclassification drug vendor List Box enabled$")
  	public void verify_the_Reclassification_drug_vendor_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_ReclassificationDrugVendor_list_box_enabled();
  	}
  	
	@And("^verify the Reclassification drug vendor List Box items$")
	public void verify_the_Reclassification_drug_vendor_list_box_items(DataTable ReclassificationDrugVendorListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_ReclassificationDrugVendor_list_box_items(ReclassificationDrugVendorListItems);;
	}
	
	@And("^select Reclassification drug vendor List Box value$")
	public void input_Reclassification_drug_vendor_list_box_value(DataTable ReclassificationDrugVendorListValue)throws Throwable
	{
		actorUIaddContractInformation.input_ReclassificationDrugVendor_list_box_value(ReclassificationDrugVendorListValue);
	}
	
	// ----  Internal_External
	@When("^verify the Internal External List Box presence$")
	public void verify_the_Internal_External_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_Internal_External_list_box_presence();
	}
  	
	@Then("^verify the Internal External List Box enabled$")
  	public void verify_the_Internal_External_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Internal_External_list_box_enabled();
  	}
  	
	@And("^verify the Internal External List Box items$")
	public void verify_the_Internal_External_list_box_items(DataTable Internal_ExternalListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_Internal_External_list_box_items(Internal_ExternalListItems);;
	}
	
	@And("^select Internal External List Box value$")
	public void input_Internal_External_list_box_value(DataTable Internal_ExternalListValue)throws Throwable
	{
		actorUIaddContractInformation.input_Internal_External_list_box_value(Internal_ExternalListValue);
	}
	
	// --    Contract line of business:
	@When("^verify the Contract Line Of Business List Box presence$")
	public void verify_the_Contract_Line_Of_Business_list_box_presence() throws Throwable
	{
		actorUIaddContractInformation.verify_the_Contract_LOB_list_box_presence();
	}
  	
	@Then("^verify the Contract Line Of Business List Box enabled$")
  	public void verify_the_Contract_Line_Of_Business_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Contract_LOB_list_box_enabled();
  	}
  	
	@And("^verify the Contract Line Of Business List Box items$")
	public void verify_the_Contract_Line_Of_Business_list_box_items(DataTable Internal_ExternalListItems) throws Throwable
	{
		actorUIaddContractInformation.verify_the_Contract_LOB_list_box_items(Internal_ExternalListItems);
	}
	
	@Then("^select Contract Line Of Business List Box value$")
	public void select_contract_line_of_business_list_box_value(DataTable contractLineOfBusinessListValue)throws Throwable
	{
		actorUIaddContractInformation.input_Contract_LOB_list_box_value(contractLineOfBusinessListValue);
	}
	
	// Vendor adj day supply option List Box
	@When("^verify the Vendor adj day supply option List Box presence$")
	public void verify_the_vendor_adj_day_supply_option_list_box_presence()throws Throwable
	{
		actorUIaddContractInformation.verify_the_vendor_adj_day_supply_option_list_box_presence();
	}
  	@Then("^verify the Vendor adj day supply option List box disabled$")
  	public void verify_the_vendor_adj_day_supply_option_list_box_disabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_adj_day_supply_option_list_box_disabled();
  	}
  	
  	// Customer adj day supply option List Box
  	@When("^verify the Customer adj day supply option List Box presence$")
  	public void verify_the_Customer_adj_day_supply_option_list_box_presence()throws Throwable
	{
  		actorUIaddContractInformation.verify_the_Customer_adj_day_supply_option_list_box_presence();
	}
  	@Then("^verify the Customer adj day supply option List Box disabled$")
  	public void verify_the_Customer_adj_day_supply_option_list_box_disabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Customer_adj_day_supply_option_list_box_disabled();
  	}
  	
 // -------------------------------- contract type
 	@When("^verify the Contract Type List Box presence$")
 	public void verify_the_contract_type_list_box_presence() throws Throwable
 	{
 		actorUIaddContractInformation.verify_the_contract_type_list_box_presence();
 	}
   	
 	@Then("^verify the Contract Type List Box enabled$")
   	public void verify_the_contract_type_list_box_enabled() throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_contract_type_list_box_enabled();
   	}
   	
 	@And("^verify the Contract Type List Box items$")
 	public void verify_the_contract_type_list_box_items(DataTable vendorcontracttypeListItems) throws Throwable
 	{
 		actorUIaddContractInformation.verify_the_contract_type_list_box_items(vendorcontracttypeListItems);;
 	}
 	
 	@And("^select Contract Type List Box value$")
 	public void select_contract_type_list_box_value(DataTable vendorcontracttypeListValue)throws Throwable
 	{
 		actorUIaddContractInformation.input_contract_type_list_box_value(vendorcontracttypeListValue);
 	}
 	
 	// -------------------------------- claim basis
 	@When("^verify the Claim Basis List Box presence$")
 	public void verify_the_claim_basis_list_box_presence() throws Throwable
 	{
 		actorUIaddContractInformation.verify_the_claim_basis_list_box_presence();
 	}
   	
 	@Then("^verify the Claim Basis List Box enabled$")
   	public void verify_the_claim_basis_list_box_enabled() throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_claim_basis_list_box_enabled();
   	}
   	
 	@And("^verify the Claim Basis List Box items$")
 	public void verify_the_claim_basis_list_box_items(DataTable vendorclaimbasisListItems) throws Throwable
 	{
 		actorUIaddContractInformation.verify_the_claim_basis_list_box_items(vendorclaimbasisListItems);;
 	}
 	
 	@And("^select Claim Basis List Box value$")
 	public void select_claim_basis_list_box_value(DataTable vendorclaimbasisListValue)throws Throwable
 	{
 		actorUIaddContractInformation.select_vendor_basis_list_box_value(vendorclaimbasisListValue);
 	}
 	
 	// ------------------------------------- Vendor Start Date
 	
 	@When("^verify the Vendor Start Date Edit Box presence$")
 	public void verify_the_Vendor_Start_Date_Edit_Box_presence()throws Throwable
 	{
 		actorUIaddContractInformation.verify_the_Vendor_Start_Date_Edit_Box_presence();
 	}
  	@Then("^verify the Vendor Start Date Edit Box enabled$")
  	public void verify_the_Vendor_Start_Date_Edit_Box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vendor_Start_Date_Edit_Box_enabled();
  	}
  	@And("^verify the Vendor Start Date Edit Box maximum length$")
  	public void verify_the_Vendor_Start_Date_Edit_Box_maximum_length(DataTable startDateEditBoxMaxLength)throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vendor_Start_Date_Edit_Box_maximum_length(startDateEditBoxMaxLength);
  	}
  	@And("^verify the Vendor Start Date Edit Box Default text$")
  	public void verify_the_Vendor_Start_Date_Edit_Box_Default_text(DataTable startDateEditBoxDefaultText)throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vendor_Start_Date_Edit_Box_Default_text(startDateEditBoxDefaultText);
  	}
  	@And("^input value into Vendor Start Date Edit Box$")
  	public void input_value_into_Vendor_Start_Date_Edit_Box(DataTable startDateEditBoxText)throws Throwable
  	{
  		actorUIaddContractInformation.input_value_into_Vendor_Start_Date_Edit_Box(startDateEditBoxText);
  	}
  	
 // ------------------------------------- Vendor End Date
 	
  	@When("^verify the Vendor End Date Edit Box presence$")
  	public void verify_the_Vendor_End_Date_Edit_Box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vendor_End_Date_Edit_Box_presence();
  	}
   	@Then("^verify the Vendor End Date Edit Box enabled$")
   	public void verify_the_Vendor_End_Date_Edit_Box_enabled()throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_Vendor_End_Date_Edit_Box_enabled();
   	}
   	@And("^verify the Vendor End Date Edit Box maximum length$")
   	public void verify_the_Vendor_Start_End_Edit_Box_maximum_length(DataTable startDateEditBoxMaxLength)throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_Vendor_End_Date_Edit_Box_maximum_length(startDateEditBoxMaxLength);
   	}
   	@And("^verify the Vendor End Date Edit Box Default text$")
   	public void verify_the_Vendor_Start_End_Edit_Box_Default_text(DataTable startDateEditBoxDefaultText)throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_Vendor_End_Date_Edit_Box_Default_text(startDateEditBoxDefaultText);
   	}
   	@And("^input value into Vendor End Date Edit Box$")
   	public void input_value_into_Vendor_End_Date_Edit_Box(DataTable startDateEditBoxText)throws Throwable
   	{
   		actorUIaddContractInformation.input_value_into_Vendor_End_Date_Edit_Box(startDateEditBoxText);
   	}
	
   	// ------- Reclassify claims from accepted to rejected for:
   	// -------Cosmetic drugs
   	@When("^verify the Cosmetic drugs Check Box presence$")
   	public void verify_the_Cosmetic_drugs_check_box_presence()throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_Cosmetic_drugs_check_box_presence();
   	}
   	   	
  	@Then("^verify the Cosmetic drugs Check Box enabled$")
  	public void verify_the_Cosmetic_drugs_check_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Cosmetic_drugs_check_box_enabled();
  	}
  	
  	// -------------  Compound drugs
  	@When("^verify the Compound drugs Check Box presence$")
  	public void verify_the_Compound_drugs_check_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Compound_drugs_check_box_presence();
  	}
  	
  	@Then("^verify the Compound drugs Check Box enabled$")
  	public void verify_the_Compound_drugs_check_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Compound_drugs_check_box_enabled();
  	}
  	
  	//  ------------------------- Multisource brand drugs
  	@When("^verify the Multisource brand drugs Check Box presence$")
  	public void verify_the_Multisource_brand_drugs_check_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Multisource_brand_drugs_check_box_presence();
  	}
  	
  	@Then("^verify the Multisource brand drugs Check Box enabled$")
  	public void verify_the_Multisource_brand_drugs_check_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Multisource_brand_drugs_check_box_enabled();
  	}
  	
  	// -------- Vaccines
  	@When("^verify the Vaccines Check Box presence$")
  	public void verify_the_Vaccines_check_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vaccines_check_box_presence();
  	}
  	
  	@Then("^verify the Vaccines Check Box enabled$")
  	public void verify_the_Vaccines_check_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vaccines_check_box_enabled();
  	}
  	
  	// -------------------  Over the counter drugs
  	@When("^verify the Over the counter drugs Check Box presence$")
  	public void verify_the_Over_the_counter_drugs_check_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Over_the_counter_drugs_check_box_presence();
  	}
  	
  	@Then("^verify the Over the counter drugs Check Box enabled$")
  	public void verify_the_Over_the_counter_drugs_check_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Over_the_counter_drugs_check_box_enabled();
  	}
  	
  	@When("^click on the Over the counter drugs check box$")
  	public void click_on_the_over_counter_drugs_check_box(DataTable overTheCounterDrugsCheckBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.click_on_the_Over_the_counter_drugs_check_box(overTheCounterDrugsCheckBoxValue);
  	}
  	
  	// --------------    Except insulins
  	@When("^verify the Except insulins Check Box presence$")
  	public void verify_the_Except_insulins_check_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Except_insulins_check_box_presence();
  	}
  	
  	@Then("^verify the Except insulins Check Box disabled$")
  	public void verify_the_Except_insulins_check_box_disabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Except_insulins_check_box_disabled();
  	}
  	
  	@Then("^verify the Except insulins check box enabled$")
  	public void verify_the_except_insulins_check_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Except_insulins_check_box_eabled();
  	}
  	
  	// -------------   Except diabetic supplies and test strips
  	@When("^verify the Except diabetic supplies and test strips Check Box presence$")
  	public void verify_the_Except_diabetic_supplies_and_test_strips_check_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Except_diabetic_supplies_and_test_strips_check_box_presence();
  	}
  	
  	@Then("^verify the Except diabetic supplies and test strips Check Box disabled$")
  	public void verify_the_Except_diabetic_supplies_and_test_strips_check_box_disabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Except_diabetic_supplies_and_test_strips_check_box_disabled();
  	}
  	
  	@When("^verify the Except diabetic supplies and test strips check box enabled$")
  	public void verify_the_Except_diabetic_supplies_and_test_strips_check_box_eabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Except_diabetic_supplies_and_test_strips_check_box_eabled();
  	}
  	
  	@Then("^Except diabetic supplies and test strips check box should be enabled$")
  	public void Except_diabetic_supplies_and_test_strips_check_box_should_be_eabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Except_diabetic_supplies_and_test_strips_check_box_eabled();
  	}
  	
  	//  Reclassify specialty claims to retail
  	@When("^verify the Reclassify specialty claims to retail check box presence$")
  	public void verify_the_reclassify_specialty_claims_to_retail_check_box_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Reclassify_specialty_claims_to_retail_presence();
  	}
  	
  	@Then("^verify Reclassify specialty claims to retail check box should be enabled$")
  	public void verify_Reclassify_specialty_claims_to_retail_check_box_should_be_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Reclassify_specialty_claims_to_retail_enabled();
  	}
  	
  	// Reclassify day supply break at 34
  	@When("^verify the Reclassify day supply break at 34 check box presence$")
  	public void verify_the_Reclassify_day_supply_break_at_34_check_box_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_reclassify_day_supply_break_at_34_presence();
  	}

  	@Then("^verify Reclassify day supply break at 34 check box should be enabled$")
  	public void verify_Reclassify_day_supply_break_at_34_check_box_should_be_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_reclassify_day_supply_break_at_34_enabled();
  	}
  	
  	// Reclassify brand claims to generic
  	@When("^verify the Reclassify brand claims to generic check box presence$")
  	public void verify_the_Reclassify_brand_claims_to_generic_check_box_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_reclassify_brand_claims_to_generic_presence();
  	}

  	@Then("^verify Reclassify brand claims to generic check box should be enabled$")
  	public void verify_Reclassify_brand_claims_to_generic_check_box_should_be_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_reclassify_brand_claims_to_generic_enabled();
  	}
  	
  	// ---------   Monthly penalty
  	@When("^verify the Monthly penalty Edit Box presence$")
  	public void verify_the_monthly_penalty_edit_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_monthly_penalty_edit_box_presence();
  	}
  	
  	@Then("^verify the Monthly penalty Edit Box enabled$")
  	public void verify_the_monthly_penalty_edit_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_monthly_penalty_edit_box_enabled();
  	}
  	
  	@And("^verify the Monthly penalty Edit Box maximum length$")
  	public void verify_the_monthly_penalty_edit_box_max_length(DataTable monthlyPenalty_EditBoxMaxLength)throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_monthly_penalty_edit_box_max_length(monthlyPenalty_EditBoxMaxLength);
  	}
  	
  	@Then("^input value into Monthly penalty Edit Box$")
  	public void input_value_into_monthly_penalty_edit_box(DataTable monthPenalty_EditBoxValue)throws Throwable
  	{
  		actorUIaddContractInformation.set_text_into_monthly_penalty_edit_box(monthPenalty_EditBoxValue);
  	}
  	
  	// ----   -----  Minimum claims to avoid penalty
  	@When("^verify the Minimum claims to avoid penalty Edit Box presence$")
  	public void verify_the_minimum_claims_to_avoid_penalty_edit_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_minimum_claims_to_avoid_penalty_edit_box_presence();
  	}
  	
  	@Then("^verify the Minimum claims to avoid penalty Edit Box disabled$")
  	public void verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_disabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_disabled();
  	}
  	
  	@When("^verify the Minimum claims to avoid penalty Edit Box is enabled$")
  	public void verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_is_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_enabled();
  	}
  	
  	@Then("^Minimum claims to avoid penalty Edit Box should be enabled$")
  	public void minimum_claims_to_avoid_penalty_edit_box_should_be_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_enabled();
  	}
  	
  	@Then("^verify the Minimum claims to avoid penalty Edit Box Max Length$")
  	public void verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_max_length(DataTable minimumClaimsToAvoidPenalty_EditBoxMaxLength) throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Minimum_claims_to_avoid_penalty_Edit_Box_max_length(minimumClaimsToAvoidPenalty_EditBoxMaxLength);
  	}
  	
  	@Then("^input value into Minimum claims to avoid penalty Edit Box$")
  	public void input_value_into_Minimum_claims_to_avoid_penalty_Edit_Box(DataTable minimumClaimsToAvoidPenalty_EditBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.set_text_into_Minimum_claims_to_avoid_penalty_Edit_Box(minimumClaimsToAvoidPenalty_EditBoxValue);
  	}
  	
  	// ------  Penalty Start date Edit Box
  	@When("^verify the Penalty Start date Edit Box presence$")
  	public void verify_the_penalty_start_Date_Edit_Box_Presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_penalty_start_Date_Edit_Box_Presence();
  	}
  	
  	@Then("^verify the Penalty Start date Edit Box disabled$")
  	public void verify_the_penalty_start_Date_Edit_Box_Disabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_penalty_start_Date_Edit_Box_Disabled();
  	}
  	
  	@Then("^verify the Penalty Start date Edit Box is enabled$")
  	public void verify_the_penalty_start_Date_Edit_Box_Eabled()throws Throwable
	{
  		actorUIaddContractInformation.verify_the_penalty_start_Date_Edit_Box_Eabled();
	}
  	
  	@Then("^verify the Penalty Start date Edit Box max length$")
  	public void verify_the_penalty_start_Date_Edit_Box_Max_Length(DataTable startDate_EditBoxMaxLength)throws Throwable
	{
  		actorUIaddContractInformation.verify_the_penalty_start_Date_Edit_Box_Max_Length(startDate_EditBoxMaxLength);
	}
  	
  	@Then("^verify the Penalty Start date Edit Box default text$")
  	public void verify_the_penalty_start_Date_Edit_Box_Default_Text(DataTable startDate_EditBoxDefaultText)throws Throwable
	{
  		actorUIaddContractInformation.verify_the_penalty_start_Date_Edit_Box_Default_Text(startDate_EditBoxDefaultText);
	}
  	
  	@Then("^input value into Penalty Start date Edit Box$")
  	public void input_value_Into_penalty_start_Date_Edit_Box(DataTable startDate_EditBoxValue)throws Throwable
	{
  		actorUIaddContractInformation.input_value_Into_penalty_start_Date_Edit_Box(startDate_EditBoxValue);
	}
  	
  	// ----- --- Penalty End date Edit Box
  	@When("^verify the Penalty End date Edit Box presence$")
  	public void verify_the_penalty_end_date_edit_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_penalty_end_Date_Edit_Box_Presence();
  	}
  	@Then("^verify the Penalty End date Edit Box disabled$")
  	public void verify_the_penalty_end_date_edit_box_disabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_penalty_end_Date_Edit_Box_Disabled();
  	}
  	
  	@Then("^verify the Penalty End date Edit Box is enabled$")
  	public void verify_the_penalty_end_Date_Edit_Box_Eabled()throws Throwable
	{
  		actorUIaddContractInformation.verify_the_penalty_end_Date_Edit_Box_Eabled();
	}
  	
  	@Then("^verify the Penalty End date Edit Box max length$")
  	public void verify_the_penalty_end_Date_Edit_Box_Max_Length(DataTable endDate_EditBoxMaxLength)throws Throwable
	{
  		actorUIaddContractInformation.verify_the_penalty_end_Date_Edit_Box_Max_Length(endDate_EditBoxMaxLength);
	}
  	
  	@Then("^verify the Penalty End date Edit Box default text$")
  	public void verify_the_penalty_end_Date_Edit_Box_Default_Text(DataTable endDate_EditBoxDefaultText)throws Throwable
	{
  		actorUIaddContractInformation.verify_the_penalty_end_Date_Edit_Box_Default_Text(endDate_EditBoxDefaultText);
	}
  	
  	@Then("^input value into Penalty End date Edit Box$")
  	public void input_value_Into_penalty_end_Date_Edit_Box(DataTable endDate_EditBoxValue)throws Throwable
	{
  		actorUIaddContractInformation.input_value_Into_penalty_end_Date_Edit_Box(endDate_EditBoxValue);
	}
  	
  	//  ---------------------------------------------------------------------------------------------------
  	//  ----------------------- Rate Details                             --------------------------------------------
  	// ----------------------------------------------------------------------------------------------------
  	// Start Date Edit Box
  	
  	@When("^verify the Rate Details Start Date Edit Box presence$")
  	public void verify_the_rate_details_start_date_edit_box_presence()	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_start_date_edit_box_presence();
  	}
  	
  	@Then("^verify the Rate Details Start Date Edit Box enabled$")
  	public void verify_the_rate_details_start_date_edit_box_enabled()	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_start_date_edit_box_enabled();
  	}
  	
  	@And("^verify the Rate Details Start Date Edit Box Max Length$")
  	public void verify_the_rate_details_start_date_edit_box_max_length(DataTable startDate_EditBoxMaxLength)	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_start_date_edit_box_max_length(startDate_EditBoxMaxLength);
  	}
  	
  	@And("^verify the Rate Details Start Date Edit Box Default Text$")
  	public void verify_the_rate_details_start_date_edit_box_default_text(DataTable startDate_EditBoxDefaultText)	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_start_date_edit_box_default_text(startDate_EditBoxDefaultText);
  	}
  	
  	@And("^input value into Rate Details Start Date Edit Box$")
  	public void input_value_into_rate_details_start_date_edit_box(DataTable startDate_EditBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.input_value_into_rate_details_start_date_edit_box(startDate_EditBoxValue);
  	}
  	
//  ----------------------- Rate Details End Date Edit Box
  	@When("^verify the Rate Details End Date Edit Box presence$")
  	public void verify_the_rate_details_end_date_edit_box_presence()	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_end_date_edit_box_presence();
  	}
  	
  	@Then("^verify the Rate Details End Date Edit Box enabled$")
  	public void verify_the_rate_details_end_date_edit_box_enabled()	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_end_date_edit_box_enabled();
  	}
  	
  	@And("^verify the Rate Details End Date Edit Box Max Length$")
  	public void verify_the_rate_details_end_date_edit_box_max_length(DataTable endDate_EditBoxMaxLength)	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_end_date_edit_box_max_length(endDate_EditBoxMaxLength);
  	}
  	
  	@And("^verify the Rate Details End Date Edit Box Default Text$")
  	public void verify_the_rate_details_end_date_edit_box_default_text(DataTable endDate_EditBoxDefaultText)	throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_end_date_edit_box_default_text(endDate_EditBoxDefaultText);
  	}
  	
  	@And("^input value into Rate Details End Date Edit Box$")
  	public void input_value_into_rate_details_end_date_edit_box(DataTable endDate_EditBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.input_value_into_rate_details_end_date_edit_box(endDate_EditBoxValue);
  	}
  	
  	// --------   Rate Details Line Of Business
  	@When("^verify the Rate Details Line of business List Box presence$")
  	public void verify_the_rate_details_line_of_business_list_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_line_of_business_list_box_presence();
  	}
  	
  	@Then("^verify the Rate Details Line of business List Box enabled$")
  	public void verify_the_rate_details_line_of_business_list_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_line_of_business_list_box_enabled();
  	}
  	
  	@Then("^verify the Rate Details Line of business List Box Items$")
  	public void verify_the_rate_details_line_of_business_list_box_items(DataTable rateDetailsLOB_ListBoxItems) throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_rate_details_line_of_business_list_box_items(rateDetailsLOB_ListBoxItems);
  	}
  	
  	@And("^select value from Rate Details Line of business List Box$")
  	public void select_value_from_rate_details_line_of_business_list_box(DataTable RateDetailsLineOfBusiness_ListBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.select_value_from_rate_details_line_of_business_list_box(RateDetailsLineOfBusiness_ListBoxValue);
  	}
  	
  	//  ---------- Transparency
  	@When("^verify the Transparency List Box presence$")
  	public void verify_the_transparency_list_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_transparency_list_box_presence();
  	}
  	@Then("^verify the Transparency List Box enabled$")
  	public void verify_the_transparency_list_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_transparency_list_box_enabled();
  	}
  	@And("^verify the Transparency List Box items$")
  	public void verify_the_transparency_list_box_items(DataTable transparency_ListBoxItems)throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_transparency_list_box_items(transparency_ListBoxItems);
  	}
  	@And("^select value from Transparency List Box$")
  	public void select_value_from_transparency_list_box(DataTable transparency_ListBoxValue)throws Throwable
  	{
  		actorUIaddContractInformation.select_value_from_transparency_list_box(transparency_ListBoxValue);
  	}
  	
  	// ------ Fee Method
  	@When("^verify the Fee method List Box presence$")
  	public void verify_the_fee_method_list_box_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_fee_method_list_box_presence();
  	}
  	@Then("^verify the Fee method List Box enabled$")
  	public void verify_the_fee_method_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_fee_method_list_box_enabled();
  	}
  	@And("^verify the Fee method List Box items$")
  	public void verify_the_fee_method_list_box_items(DataTable feemethod_ListBoxItems) throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_fee_method_list_box_items(feemethod_ListBoxItems);
  	}
  	@And("^select value from Fee method List Box$")
  	public void select_value_from_fee_method_list_box(DataTable feemethod_ListBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.select_value_from_fee_method_list_box(feemethod_ListBoxValue);
  	}
  	
  	// ---- Vendor rebate share
  	@When("^verify the Vendor rebate share Edit Box presence$")
  	public void verify_the_Vendor_rebate_share_Edit_Box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vendor_rebate_share_Edit_Box_presence();
  	}
  	
  	@Then("^verify the Vendor rebate share Edit Box enabled$")
  	public void verify_the_Vendor_rebate_share_Edit_Box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Vendor_rebate_share_Edit_Box_enabled();
  	}
  	
  	@And("^verify the Vendor rebate share Edit Box Max Length$")
  	public void verify_the_Vendor_rebate_share_Edit_Box_Max_Length(DataTable vendorRebateShare_EditBoxMaxLength)throws Throwable
	{
  		actorUIaddContractInformation.verify_the_Vendor_rebate_share_Edit_Box_Max_Length(vendorRebateShare_EditBoxMaxLength);
  	}
  	
  	@And("^input value into Vendor rebate share Edit Box$")
  	public void input_value_into_Vendor_rebate_share_Edit_Box(DataTable vendorRebateShare_EditBoxValue)throws Throwable
  	{
  		actorUIaddContractInformation.input_value_into_Vendor_rebate_share_Edit_Box(vendorRebateShare_EditBoxValue);
  	}
  	
  	
  	// -------------------------------------- Admin fee
  	@When("^verify the Admin fee Edit Box presence$")
  	public void  verify_the_admin_fee_edit_box_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_admin_fee_edit_box_presence();
  	}
  	
  	@Then("^verify the Admin fee Edit Box enabled$")
  	public void verify_the_admin_fee_edit_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_admin_fee_edit_box_enabled();
  	}
  	@And("^verify the Admin fee Edit Box Max Length$")
  	public void verify_the_admin_fee_edit_box_max_length(DataTable adminFee_EditBox_MaxLength) throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_admin_fee_edit_box_max_length(adminFee_EditBox_MaxLength);
  	}
  	@And("^input value into Admin fee Edit Box$")
  	public void input_value_into_admin_fee_edit_box(DataTable adminFee_EditBox_Value) throws Throwable
  	{
  		actorUIaddContractInformation.input_value_into_admin_fee_edit_box(adminFee_EditBox_Value);
  	}
  	
  	// ----------------------------------- DST rebate share Edit Box
  	@When("^verify the DST rebate share Edit Box presence$")
  	public void verify_the_dst_rebate_share_edit_box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_dst_rebate_share_edit_box_presence();
  	}
  	
  	@Then("^verify the DST rebate share Edit Box enabled$")
  	public void verify_the_dst_rebate_share_edit_box_enabled()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_dst_rebate_share_edit_box_enabled();
  	}
  	
  	@And("^verify the DST rebate share Edit Box Max Length$")
  	public void verify_the_dst_rebate_share_edit_box_max_length(DataTable DSTRebateShare_EditBox_MaxLength)throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_dst_rebate_share_edit_box_max_length(DSTRebateShare_EditBox_MaxLength);
  	}
  	
  	@And("^input value into DST rebate share Edit Box$")
  	public void input_value_into_dst_rebate_share_edit_box(DataTable DSTRebateShare_EditBox_Value)throws Throwable
  	{
  		actorUIaddContractInformation.input_value_into_dst_rebate_share_edit_box(DSTRebateShare_EditBox_Value);
  	}
  	
  	// --------------------------Customer rebate share Edit Box 	
  	@When("^verify the Customer rebate share Edit Box presence$")
  	public void verify_the_Customer_rebate_share_Edit_Box_presence()throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Customer_rebate_share_Edit_Box_presence();
  	}
  	
  	@Then("^verify the Customer rebate share Edit Box disabled$")
  	public void verify_the_Customer_rebate_share_Edit_Box_disabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_Customer_rebate_share_Edit_Box_disabled();
  	}
  	
  	// -------------------------   DST revenue Edit Box
  	@When("^verify the DST revenue Edit Box presence$")
  	public void verify_the_dst_revenue_edit_box_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_dst_revenue_edit_box_presence();
  	}
  	
  	@Then("^verify the DST revenue Edit Box disabled$")
  	public void verify_the_dst_revenue_edit_box_disabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_dst_revenue_edit_box_disabled();
  	}
  	
  	// -----------------------------   Vendor adj day supply option box
  	@Then("^verify the Vendor adj day supply option List Box enabled$")
  	public void verify_the_vendor_adj_day_supply_option_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_adj_day_supply_option_list_box_enabled();
  	}
  	
  	@And("^verify the Vendor adj day supply option List Box items$")
  	public void verify_the_vendor_adj_day_supply_option_list_box_items(DataTable vendorAdjDaySupplyOption_ListBoxItems) throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_vendor_adj_day_supply_option_list_box_items(vendorAdjDaySupplyOption_ListBoxItems);
  	}
  	
  	@And("^select value from the Vendor adj day supply option List Box$")
  	public void select_value_from_the_vendor_adj_day_supply_option_list_box(DataTable vendorAdjDaySupplyOption_ListBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.select_value_from_the_vendor_adj_day_supply_option_list_box(vendorAdjDaySupplyOption_ListBoxValue);
  	}
  	
  	// ------------------------------- Customer adj day supply option
  	@Then("^verify the Customer adj day supply option List Box enabled$")
  	public void verify_the_customer_adj_day_supply_option_list_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_customer_adj_day_supply_option_list_box_enabled();
  	}
  	
  	@And("^verify the Customer adj day supply option List Box items$")
  	public void verify_the_customer_adj_day_supply_option_list_box_items(DataTable customerAdjDaySupplyOption_ListBoxItems) throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_customer_adj_day_supply_option_list_box_items(customerAdjDaySupplyOption_ListBoxItems);
  	}
  	
  	@And("^select value from Customer adj day supply option List Box$")
  	public void select_value_from_customer_adj_day_supply_option_list_box(DataTable customerAdjDaySupplyOption_ListBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.select_value_from_customer_adj_day_supply_option_list_box(customerAdjDaySupplyOption_ListBoxValue);
  	}
  	
  	
  	// -----------------------------------  Notes
  	@When("^verify the Notes Edit Box presence$")
  	public void verify_the_notes_edit_box_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_notes_edit_box_presence();
  	}
  	
  	@Then("^verify the Notes Edit Box enabled$")
  	public void verify_the_notes_edit_box_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_notes_edit_box_enabled();
  	}
  	
  	@And("^verify the Notes Edit Box Max Length$")
  	public void verify_the_notes_edit_box_max_length(DataTable notes_EditBoxMaxLength) throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_notes_edit_box_max_length(notes_EditBoxMaxLength);
  	}
  	
  	@And("^input value into Notes Edit Box$")
  	public void input_value_into_notes_edit_box(DataTable notes_EditBoxValue) throws Throwable
  	{
  		actorUIaddContractInformation.input_value_into_notes_edit_box(notes_EditBoxValue);
  	}
  	
  	// --------------------------- Add Button
  	@When("^verify the Add button presence$")
  	public void verify_add_button_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_add_button_presence();
  	}
  	@Then("^verify the Add button disabled$")
  	public void verify_add_button_disabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_add_button_disabled();
  	}
  	
  	@Then("^verify the Add button enabled$")
  	public void verify_the_add_button_enabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_add_button_enabled();
  	}
  	
  	@Then("^Click on Add button$")
  	public void click_on_add_button() throws Throwable
  	{
  		actorUIaddContractInformation.click_on_add_button();
  	}
  	
  	// ------------------------ Next Button
  	@When("^verify the Next button presence$")
  	public void verify_next_button_presence() throws Throwable
  	{
  		actorUIaddContractInformation.verify_next_button_presence();
  	}
  	@Then("^verify the Next button disabled$")
  	public void verify_next_button_disabled() throws Throwable
  	{
  		actorUIaddContractInformation.verify_next_button_disabled();
  	}
  	
  	@Then("^verify the Next button enabled$")
  	public void verify_the_next_button_enable() throws Throwable
  	{
  		actorUIaddContractInformation.verify_the_next_button_enable();
  	}
  	
  	// ------------------------- Update Button
   	@When("^verify the Update button presence$")
   	public void verify_update_button_presence() throws Throwable
   	{
   		actorUIaddContractInformation.verify_update_button_presence();
   	}
   	@Then("^verify the Update button disabled$")
   	public void verify_update_button_disabled() throws Throwable
   	{
   		actorUIaddContractInformation.verify_update_button_disabled();
   	}
   	
   	@Then("^verify the Update button enabled$")
   	public void verify_the_update_button_enabled() throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_update_button_enabled();
   	}
   	
   	// -------------------------- Remove Button
   	@When("^verify the Remove button presence$")
   	public void verify_remove_button_presence() throws Throwable
   	{
   		actorUIaddContractInformation.verify_remove_button_presence();
   	}
   	@And("^verify the Remove button disabled$")
   	public void verify_remove_button_disabled() throws Throwable
   	{
   		actorUIaddContractInformation.verify_remove_button_disabled();
   	}
   	
   	@And("^verify the Remove button enabled$")
   	public void verify_the_remove_button_enabled() throws Throwable
   	{
   		actorUIaddContractInformation.verify_remove_button_enabled();
   	}
   	
   	// ---------------------------- Rate Details Table 
   	
   	@When("^verify the Rate Details Table Presence$")
   	public void verify_the_rate_details_table_presence()throws Throwable
   	{
   		actorUIaddContractInformation.verify_the_rate_details_table_presence();
   	}
   	
  	@Then("^Rate Details Table should be displayed$")
  	public void rate_details_table_should_be_displayed()throws Throwable
  	{
  		actorUIaddContractInformation.rate_details_table_should_be_displayed();
  	}
  	
  	@When("^click on matching check box$")
  	public void click_on_matching_check_box(DataTable CheckBoxDetailsForcheckOperation) throws Throwable
  	{
  		actorUIaddContractInformation.click_on_matching_check_box(CheckBoxDetailsForcheckOperation);
  	}
  	
  	@When("^uncheck the selected check box$")
  	public void uncheck_the_selected_check_box(DataTable CheckBoxDetailsForUncheckOperation) throws Throwable
  	{
  		actorUIaddContractInformation.uncheck_the_selected_check_box(CheckBoxDetailsForUncheckOperation);
  	}
  	
  	
  	
  	
  	
  
	
	
	
	
	
	
	
	
	
}
