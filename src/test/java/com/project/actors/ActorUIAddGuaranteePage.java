package com.project.actors;

import java.util.List;

import com.project.pages.AddGuaranteePage;
import com.project.pages.UIAddGuaranteePage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddGuaranteePage 
{
	@Steps
	UIAddGuaranteePage uiaddGuaranteePage;
	
	@Steps
	AddGuaranteePage addGuaranteePage;
	
	
	
	// Add Button
	@Step
	public void Verify_the_Gurantee_Add_button_present()throws Throwable
	{
		uiaddGuaranteePage.verify_Add_Button_Presence();
	}
	
	@Step
	public void Verify_the_Gurantee_Add_button_disabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Add_Button_Disabled();
	}
	
	@Step
	public void Verify_the_Gurantee_Add_button_enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Add_Button_Enabled();
	}
	
	// Next button
	@Step
	public void Verify_the_Gurantee_Next_button_present()throws Throwable
	{
		uiaddGuaranteePage.verify_Next_Button_Presence();
	}
	
	@Step
	public void Verify_the_Gurantee_Next_button_disabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Next_Button_Disabled();
	}
	
	@Step
	public void Verify_the_Gurantee_Next_button_enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Next_Button_Enabled();
	}
	
	// Previous button
	@Step
	public void Verify_the_Gurantee_Previous_button_present()throws Throwable
	{
		uiaddGuaranteePage.verify_Previous_Button_Presence();
	}
	
	@Step
	public void Verify_the_Gurantee_Previous_button_enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Previous_Button_Enabled();
	}

	// Update button
	@Step 	
	public void Verify_the_Gurantee_Update_button_present()throws Throwable
	{
		uiaddGuaranteePage.verify_Update_Button_Presence();
	}
	
	@Step
	public void Verify_the_Gurantee_Update_button_disabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Update_Button_Disabled();
	}
	
	@Step
	public void Verify_the_Gurantee_Update_button_enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Update_Button_Enabled();
	}

	// Remove button
	@Step  	
	public void Verify_the_Gurantee_Remove_button_present()throws Throwable
	{
		uiaddGuaranteePage.verify_Remove_Button_Presence();
	}

	@Step
	public void Verify_the_Gurantee_Remove_button_disabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Remove_Button_Disabled();
	}
	
	@Step
	public void Verify_the_Gurantee_Remove_button_enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Remove_Button_Enabled();
	}
	
	// Browse Notes button
	@Step  	
	public void Verify_the_Gurantee_Browse_Notes_button_present()throws Throwable
	{
		uiaddGuaranteePage.verify_BrowseNotes_Button_Presence();
	}
	
	@Step
	public void Verify_the_Gurantee_Browse_Notes_button_disabled()throws Throwable
	{
		uiaddGuaranteePage.verify_BrowseNotes_Button_Disabled();
	}
	
	@Step
	public void Verify_the_Gurantee_Browse_Notes_button_enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_BrowseNotes_Button_Enabled();
	}
	
	// Gurantee Table
	@Step  	
	public void Verify_the_Gurantee_Table_present()throws Throwable
	{
		uiaddGuaranteePage.verifyGuaranteePanel_Table_Presence();
	}

	@Step
	public void Gurantee_Table_should_be_displayed()throws Throwable
	{
		uiaddGuaranteePage.verifyGuaranteePanel_Table_Presence();
	}
	
  	// Start Date
	@Step
	public void verify_the_Guarantee_Start_Date_Edit_Box_presence() throws Throwable
  	{
		uiaddGuaranteePage.verify_Start_Date_Edit_Box_Presence();
  	}
	
	@Step 
	public void verify_the_Guarantee_Start_Date_Edit_Box_enabled() throws Throwable
  	{
		uiaddGuaranteePage.verify_Start_Date_Edit_Box_Is_Enabled();
  	}
	
	@Step
	public void verify_the_Guarantee_Start_Date_Edit_Box_Max_Length(DataTable guaranteeStartDate_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> guaranteeStartDate_length = guaranteeStartDate_EditBoxMaxLength.raw();
		String strguaranteeStartDate_length = guaranteeStartDate_length.get(1).get(0);
		uiaddGuaranteePage.verify_Start_Date_Edit_Box_Max_Length(strguaranteeStartDate_length);
  	}
	
	@Step
	public void verify_the_Guarantee_Start_Date_Edit_Box_Default_Text(DataTable guaranteeStartDate_EditBoxDefaultText) throws Throwable
  	{
		List<List<String>> guaranteeStartDate_defaultText = guaranteeStartDate_EditBoxDefaultText.raw();
		String strguaranteeStartDate_defaultText = guaranteeStartDate_defaultText.get(1).get(0);
		uiaddGuaranteePage.verify_Start_Date_Edit_Default_Text(strguaranteeStartDate_defaultText);
  	}
	
	@Step
	public void input_value_into_Guarantee_Start_Date_Edit_Box(DataTable guaranteeStartDate_EditBoxValue) throws Throwable
  	{
		List<List<String>> guaranteeStartDate_Value = guaranteeStartDate_EditBoxValue.raw();
		String strguaranteeStartDate_EditBoxValue = guaranteeStartDate_Value.get(1).get(0);
		addGuaranteePage.setTextIntoStartDateEdit(strguaranteeStartDate_EditBoxValue);
  	}
	
	// ----------------------- End Date
	@Step
  	public void verify_the_Guarantee_End_Date_Edit_Box_presence() throws Throwable
  	{
		uiaddGuaranteePage.verify_End_Date_Edit_Box_Presence();
  	}
  		
	@Step
  	public void verify_the_Guarantee_End_Date_Edit_Box_enabled() throws Throwable
  	{
		uiaddGuaranteePage.verify_End_Date_Edit_Box_Is_Enabled();
  	}
  		
	@Step
  	public void verify_the_Guarantee_End_Date_Edit_Box_Max_Length(DataTable endDate_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> endDate_length = endDate_EditBoxMaxLength.raw();
		String strEndDate_EditBoxMaxLength = endDate_length.get(1).get(0);
		uiaddGuaranteePage.verify_End_Date_Edit_Box_Max_Length(strEndDate_EditBoxMaxLength);
  	}

	@Step
  	public void verify_the_Guarantee_End_Date_Edit_Box_Default_Text(DataTable guaranteeEndDate_EditBoxDefaultText) throws Throwable
  	{
		List<List<String>> guaranteeEndDate_defaultText = guaranteeEndDate_EditBoxDefaultText.raw();
		String strguaranteeEndDate_defaultText = guaranteeEndDate_defaultText.get(1).get(0);
		uiaddGuaranteePage.verify_End_Date_Edit_Default_Text(strguaranteeEndDate_defaultText);
  	}

	@Step
  	public void input_value_into_Guarantee_End_Date_Edit_Box(DataTable guaranteeEndDate_EditBoxValue) throws Throwable
  	{
		List<List<String>> guaranteeEndDate_Value = guaranteeEndDate_EditBoxValue.raw();
		String strguaranteeEndDate_EditBoxValue = guaranteeEndDate_Value.get(1).get(0);
		addGuaranteePage.setTextIntoEndDateEdit(strguaranteeEndDate_EditBoxValue);
  	}
	
	// --------- Vendor formulary ID
	@Step
  	public void verify_the_Vendor_formulary_ID_Edit_Box_presence() throws Throwable
  	{
		uiaddGuaranteePage.verify_VendorFormulary_ID_Edit_Box_Presence();
  	}

	@Step
  	public void verify_the_Vendor_formulary_ID_Edit_Box_enabled() throws Throwable
  	{
		uiaddGuaranteePage.verify_VendorFormulary_ID_Edit_Box_Is_Enabled();
  	}
  		
	@Step
  	public void verify_the_Vendor_formulary_ID_Edit_Box_Max_Length(DataTable VendorFormularyID_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> VendorFormularyID_length = VendorFormularyID_EditBoxMaxLength.raw();
		String strVendorFormularyID_EditBoxMaxLength = VendorFormularyID_length.get(1).get(0);
		uiaddGuaranteePage.verify_VendorFormulary_ID_Edit_Box_Max_Length(strVendorFormularyID_EditBoxMaxLength);
  	}

	@Step 
  	public void input_value_into_Vendor_formulary_ID_Edit_Box(DataTable VendorFormularyID_EditBoxValue) throws Throwable
  	{
		List<List<String>> VendorFormularyID_Value = VendorFormularyID_EditBoxValue.raw();
		String strVendorFormularyID_EditBoxValue = VendorFormularyID_Value.get(1).get(0);
		addGuaranteePage.setTextIntoVendorFormularyIDEdit(strVendorFormularyID_EditBoxValue);
  	}
	
	// Vendor formulary type
	@Step
	public void verify_Vendor_Formulary_Type_List_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_Vendor_Formulary_Type_List_Box_Presence();
	}
	
	@Step
	public void verify_Vendor_Formulary_Type_List_Box_Enabled() throws Throwable
	{
		uiaddGuaranteePage.verify_Vendor_Formulary_Type_List_Box_Enabled();
	}
	
	@Step
	public void verify_Vendor_Formulary_Type_List_Box_Items(DataTable VendorFormularyType_ListBoxItems ) throws Throwable
	{
		List<List<String>> VendorFormularyType_Items = VendorFormularyType_ListBoxItems.raw();
		String strVendorFormularyType_ListBoxItems = VendorFormularyType_Items.get(1).get(0);
		uiaddGuaranteePage.verify_Vendor_Formulary_Type_List_Box_Items(strVendorFormularyType_ListBoxItems);
	}
	
	@Step
	public void select_value_from_Vendor_Formulary_Type_List_Box(DataTable VendorFormularyType_ListBoxValue ) throws Throwable
	{
		List<List<String>> vendorFormularyType_ListBoxValue = VendorFormularyType_ListBoxValue.raw();
		String strVendorFormularyType_ListBoxValue = vendorFormularyType_ListBoxValue.get(1).get(0);
		addGuaranteePage.selectValueFromVendorFormularyTypeList(strVendorFormularyType_ListBoxValue);
	}
	
	// DST formulary type
	@Step
	public void verify_DST_Formulary_Type_List_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_DST_Formulary_Type_List_Box_Presence();
	}
	
	@Step
	public void verify_DST_Formulary_Type_List_Box_Enabled() throws Throwable
	{
		uiaddGuaranteePage.verify_DST_Formulary_Type_List_Box_Enabled();
	}
	
	@Step
	public void verify_DST_Formulary_Type_List_Box_Items(DataTable DSTFormularyType_ListBoxItems ) throws Throwable
	{
		List<List<String>> DSTFormularyType_Value = DSTFormularyType_ListBoxItems.raw();
		String strDSTrFormularyType_ListBoxItems = DSTFormularyType_Value.get(1).get(0);
		uiaddGuaranteePage.verify_DST_Formulary_Type_List_Box_Items(strDSTrFormularyType_ListBoxItems);
	}
	
	@Step
	public void select_value_from_DST_Formulary_Type_List_Box(DataTable DSTFormularyType_ListBoxValue ) throws Throwable
	{
		List<List<String>> dstFormularyType_ListBoxValue = DSTFormularyType_ListBoxValue.raw();
		String strDstFormularyType_ListBoxValue = dstFormularyType_ListBoxValue.get(1).get(0);
		addGuaranteePage.selectValueFromDSTFormularyTypeList(strDstFormularyType_ListBoxValue);
	}
	
	// Tier type
	@Step
	public void verify_Tier_Type_Edit_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_Tier_Type_Edit_Box_Presence();
	}
	
	@Step
	public void verify_Tier_Type_Edit_Box_Is_Enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Tier_Type_Edit_Box_Is_Enabled();
	}
	
	@Step
	public void verify_Tier_Type_Edit_Box_Max_Length(DataTable tierType_EditBoxMaxLength) throws Throwable
	{
		List<List<String>> tierType_Value = tierType_EditBoxMaxLength.raw();
		String strtierType_EditBoxValue = tierType_Value.get(1).get(0);
		uiaddGuaranteePage.verify_Tier_Type_Edit_Box_Max_Length(strtierType_EditBoxValue);
	}
	
	@Step
	public void input_value_into_tier_type_edit_box(DataTable tierType_EditBoxValue) throws Throwable
	{
		List<List<String>> tierType_EditValue = tierType_EditBoxValue.raw();
		String strtierType_EditBoxValue = tierType_EditValue.get(1).get(0);
		addGuaranteePage.setTextIntoTierTypeEdit(strtierType_EditBoxValue);
	}
	
	//  ----- Channel
	@Step
	public void verify_Channel_List_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_Channel_List_Box_Presence();
	}
	
	@Step
	public void verify_Channel_List_Box_Enabled() throws Throwable
	{
		uiaddGuaranteePage.verify_Channel_List_Box_Enabled();
	}
	
	@Step
	public void verify_Channel_List_Box_Items(DataTable channel_ListBoxItems ) throws Throwable
	{
		List<List<String>> channel_listBoxItems = channel_ListBoxItems.raw();
		String strChannel_ListBoxValue = channel_listBoxItems.get(1).get(0);
		uiaddGuaranteePage.verify_Channel_List_Box_Items(strChannel_ListBoxValue);
	}
	
	@Step
	public void select_value_from_Channel_List_Box(DataTable Channel_ListBoxValue ) throws Throwable
	{
		List<List<String>> channel_ListBoxValue = Channel_ListBoxValue.raw();
		String strchannel_ListBoxValue_ListBoxValue = channel_ListBoxValue.get(1).get(0);
		addGuaranteePage.selectValueFromChannelList(strchannel_ListBoxValue_ListBoxValue);
	}
	
	//  ----  Guarantee Line of business
	@Step
	public void verify_Guarantee_Line_Of_Business_List_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_Guarantee_Line_Of_Business_List_Box_Presence();
	}
	
	@Step
	public void verify_Guarantee_Line_Of_Business_List_Box_Enabled() throws Throwable
	{
		uiaddGuaranteePage.verify_Guarantee_Line_Of_Business_List_Box_Enabled();
	}
	
	@Step
	public void verify_Guarantee_Line_Of_Business_List_Box_Items(DataTable GuaranteeLineOfBusiness_ListBoxItems ) throws Throwable
	{
		List<List<String>> GuaranteeLineOfBusiness_listBoxItems = GuaranteeLineOfBusiness_ListBoxItems.raw();
		String strGuaranteeLineOfBusiness_ListBoxValue = GuaranteeLineOfBusiness_listBoxItems.get(1).get(0);
		uiaddGuaranteePage.verify_Guarantee_Line_Of_Business_List_Box_Items(strGuaranteeLineOfBusiness_ListBoxValue);
	}
	
	@Step
	public void select_value_from_Guarantee_Line_Of_Business_List_Box(DataTable GuaranteeLineOfBusiness_ListBoxValue) throws Throwable
	{
		List<List<String>> guaranteeLineOfBusiness_ListBoxValue = GuaranteeLineOfBusiness_ListBoxValue.raw();
		String strGuaranteeLineOfBusiness_ListBoxValue = guaranteeLineOfBusiness_ListBoxValue.get(1).get(0);
		addGuaranteePage.selectValueFromLineOfBusinessList(strGuaranteeLineOfBusiness_ListBoxValue);
	}
	
	// ---  Vendor brand guarantee
	@Step
	public void verify_Vendor_Brand_Guarantee_Edit_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_Vendor_Brand_Guarantee_Edit_Box_Presence();
	}
	
	@Step
	public void verify_Vendor_Brand_Guarantee_Edit_Box_Is_Enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Vendor_Brand_Guarantee_Edit_Box_Is_Enabled();
	}
	
	@Step
	public void verify_Vendor_Brand_Guarantee_Edit_Box_Max_Length(DataTable VendorBrandGuarantee_EditBoxMaxLength) throws Throwable
	{
		List<List<String>> VendorBrandGuarantee_length = VendorBrandGuarantee_EditBoxMaxLength.raw();
		String strVendorBrandGuarantee_EditBoxMaxLength = VendorBrandGuarantee_length.get(1).get(0);
		uiaddGuaranteePage.verify_Vendor_Brand_Guarantee_Edit_Box_Max_Length(strVendorBrandGuarantee_EditBoxMaxLength);
	}
	
	@Step
	public void input_value_into_Vendor_Brand_Guarantee_Edit_Box(DataTable VendorBrandGuarantee_EditBoxValue) throws Throwable
	{
		List<List<String>> VendorBrandGuarantee_EditValue = VendorBrandGuarantee_EditBoxValue.raw();
		String strVendorBrandGuarantee_EditBoxValue = VendorBrandGuarantee_EditValue.get(1).get(0);
		addGuaranteePage.setTextIntoVendorBrandGuaranteeEdit(strVendorBrandGuarantee_EditBoxValue);
	}
	
	// Customer brand guarantee
	@Step
	public void verify_Customer_Brand_Guarantee_Edit_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_Customer_Brand_Guarantee_Edit_Box_Presence();
	}
	
	@Step
	public void verify_Customer_Brand_Guarantee_Edit_Box_Is_Enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_Customer_Brand_Guarantee_Edit_Box_Is_Enabled();
	}
	
	@Step
	public void verify_Customer_Brand_Guarantee_Edit_Box_Max_Length(DataTable CustomerBrandGuarantee_EditBoxMaxLength)throws Throwable
	{
		List<List<String>> CustomerBrandGuarantee_length = CustomerBrandGuarantee_EditBoxMaxLength.raw();
		String strCustomerBrandGuarantee_length = CustomerBrandGuarantee_length.get(1).get(0);
		uiaddGuaranteePage.verify_Customer_Brand_Guarantee_Edit_Box_Max_Length(strCustomerBrandGuarantee_length);
	}
	
	@Step
	public void input_value_into_Customer_Brand_Guarantee_Edit_Box_Value(DataTable customerBrandGuarantee_EditBoxValue) throws Throwable
	{
		List<List<String>> CustomerBrandGuarantee_EditBoxValue =  customerBrandGuarantee_EditBoxValue.raw();
		String strCustomerBrandGuarantee_EditBoxValue = CustomerBrandGuarantee_EditBoxValue.get(1).get(0);
		addGuaranteePage.setTextIntoCustomerBrandGuaranteeEdit(strCustomerBrandGuarantee_EditBoxValue);
	}
	
	// Benefit design
	@Step
	public void verify_Benefit_Design_List_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_Benefit_Design_List_Box_Presence();
	}
	
	@Step
	public void verify_Benefit_Design_List_Box_Enabled() throws Throwable
	{
		uiaddGuaranteePage.verify_Benefit_Design_List_Box_Presence();
	}
	
	@Step
	public void verify_Benefit_Design_List_Box_Items(DataTable benefitDesign_ListBoxItems ) throws Throwable
	{
		List<List<String>> benefitDesign_listBoxItems = benefitDesign_ListBoxItems.raw();
		String strbenefitDesign_ListBoxValue = benefitDesign_listBoxItems.get(1).get(0);
		uiaddGuaranteePage.verify_Benefit_Design_List_Box_Items(strbenefitDesign_ListBoxValue)	;
	}
	
	@Step
	public void select_value_from_Benefit_Design_List_Box_Value(DataTable BenefitDesign_ListBoxValue) throws Throwable
	{
		List<List<String>> benefitDesign_ListBoxValue = BenefitDesign_ListBoxValue.raw();
		String strbenefitDesign_ListBoxValue = benefitDesign_ListBoxValue.get(1).get(0);
		addGuaranteePage.selectValueFromBenefitDesignList(strbenefitDesign_ListBoxValue);
	}
	
	// UM option
	
	@Step
	public void verify_UM_Option_List_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_UM_Option_List_Box_Presence();
	}
	
	@Step
	public void verify_UM_Option_List_Box_Enabled() throws Throwable
	{
		uiaddGuaranteePage.verify_UM_Option_List_Box_Enabled();
	}
	
	@Step
	public void verify_UM_Option_List_Box_Items(DataTable UMOption_ListBoxItems ) throws Throwable
	{
		List<List<String>> umOption_listBoxItems = UMOption_ListBoxItems.raw();
		String strumOption_ListBoxValue = umOption_listBoxItems.get(1).get(0);
		uiaddGuaranteePage.verify_UM_Option_List_Box_Items(strumOption_ListBoxValue);
	}
	
	@Step
	public void select_value_from_UM_Option_List_Box_Value(DataTable UMOption_ListBoxValue ) throws Throwable
	{
		List<List<String>> umOption_ListBoxValue = UMOption_ListBoxValue.raw();
		String strumOption_ListBoxValue = umOption_ListBoxValue.get(1).get(0);
		addGuaranteePage.selectValueFromUMOptionList(strumOption_ListBoxValue);
	}
	
	// Benefit design description notes
	@Step
	public void verify_BenefitDesignDescriptionNotes_Edit_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_BenefitDesignDescriptionNotes_Edit_Box_Presence();
	}
	
	@Step
	public void verify_BenefitDesignDescriptionNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_BenefitDesignDescriptionNotes_Edit_Box_Is_Enabled();
	}
	
	@Step
	public void verify_BenefitDesignDescriptionNotes_Edit_Box_Max_Length(DataTable BenefitDesignDescriptionNotes_EditBoxMaxLength) throws Throwable
	{
		List<List<String>> BenefitDesignDescriptionNotes_length = BenefitDesignDescriptionNotes_EditBoxMaxLength.raw();
		String strBenefitDesignDescriptionNotes_length = BenefitDesignDescriptionNotes_length.get(1).get(0);
		uiaddGuaranteePage.verify_BenefitDesignDescriptionNotes_Edit_Box_Max_Length(strBenefitDesignDescriptionNotes_length);
	}
	
	@Step
	public void input_value_into_BenefitDesignDescriptionNotes_Edit_Box(DataTable BenefitDesignDescriptionNotes_EditBoxValue) throws Throwable
	{
		List<List<String>> benefitDesignDescriptionNotes_EditBoxValue =  BenefitDesignDescriptionNotes_EditBoxValue.raw();
		String strbenefitDesignDescriptionNotes_EditBoxValue = benefitDesignDescriptionNotes_EditBoxValue.get(1).get(0);
		addGuaranteePage.setTextIntoBenefitDesignDescriptionNotesEdit(strbenefitDesignDescriptionNotes_EditBoxValue);
	}
	
	//Plan design notes
	@Step
	public void verify_PlanDesignNotes_Edit_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_PlanDesignNotes_Edit_Box_Presence();
	}
	
	@Step
	public void verify_PlanDesignNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_PlanDesignNotes_Edit_Box_Is_Enabled();
	}
	
	@Step
	public void verify_PlanDesignNotes_Edit_Box_Max_Length(DataTable PlanDesignNotes_EditBoxMaxLength)throws Throwable
	{
		List<List<String>> planDesignNotes_length = PlanDesignNotes_EditBoxMaxLength.raw();
		String strplanDesignNotes_length = planDesignNotes_length.get(1).get(0);
		uiaddGuaranteePage.verify_PlanDesignNotes_Edit_Box_Max_Length(strplanDesignNotes_length);
	}
	
	@Step
	public void input_value_into_plan_design_notes_edit_box(DataTable PlanDesignNotes_EditBoxValue) throws Throwable
	{
		List<List<String>> planDesignNotes_EditBoxValue =  PlanDesignNotes_EditBoxValue.raw();
		String strplanDesignNotes_EditBoxValue = planDesignNotes_EditBoxValue.get(1).get(0);
		addGuaranteePage.setTextIntoPlanDesignNotesEdit(strplanDesignNotes_EditBoxValue);
	}
	
	//UM option notes 
	@Step
	public void verify_UMOptionNotes_Edit_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_UMOptionNotes_Edit_Box_Presence();
	}
	
	@Step
	public void verify_UMOptionNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_UMOptionNotes_Edit_Box_Is_Enabled();
	}
	
	@Step
	public void verify_UMOptionNotes_Edit_Box_Max_Length(DataTable UMOptionNotes_EditBoxMaxLength)throws Throwable
	{
		List<List<String>> UMOptionNotes_length = UMOptionNotes_EditBoxMaxLength.raw();
		String strUMOptionNotes_length = UMOptionNotes_length.get(1).get(0);
		uiaddGuaranteePage.verify_UMOptionNotes_Edit_Box_Max_Length(strUMOptionNotes_length);
	}
	
	@Step
	public void input_value_into_um_option_notes_edit_box(DataTable UMOptionNotes_EditBoxValue) throws Throwable
	{
		List<List<String>> umOptionNotes_EditBoxValue =  UMOptionNotes_EditBoxValue.raw();
		String strumOptionNotes_EditBoxValue = umOptionNotes_EditBoxValue.get(1).get(0);
		addGuaranteePage.setTextIntoUMOptionNotesEdit(strumOptionNotes_EditBoxValue);
	}
	
	// Formulary design notes
	@Step
	public void verify_FormularyDesignNotes_Edit_Box_Presence() throws Throwable
	{
		uiaddGuaranteePage.verify_FormularyDesignNotes_Edit_Box_Presence();
	}
	
	@Step
	public void verify_FormularyDesignNotes_Edit_Box_Is_Enabled()throws Throwable
	{
		uiaddGuaranteePage.verify_FormularyDesignNotes_Edit_Box_Is_Enabled();
	}
	
	@Step
	public void verify_FormularyDesignNotes_Edit_Box_Max_Length(DataTable FormularyDesignNotes_EditBoxMaxLength)throws Throwable
	{
		List<List<String>> FormularyDesignNotes_length = FormularyDesignNotes_EditBoxMaxLength.raw();
		String strFormularyDesignNotes_length = FormularyDesignNotes_length.get(1).get(0);
		uiaddGuaranteePage.verify_FormularyDesignNotes_Edit_Box_Max_Length(strFormularyDesignNotes_length);		
	}
	
	@Step
	public void input_value_into_formulary_design_notes_edit_box(DataTable FormularyDesignNotes_EditBoxValue) throws Throwable
	{
		List<List<String>> formularyDesignNotes_EditBoxValue =  FormularyDesignNotes_EditBoxValue.raw();
		String strformularyDesignNotes_EditBoxValue = formularyDesignNotes_EditBoxValue.get(1).get(0);
		addGuaranteePage.setTextIntoFormularyDesignNotesEdit(strformularyDesignNotes_EditBoxValue);
	}
	
	@Step
	public void click_on_add_button() throws Throwable
	{
		addGuaranteePage.clickOnAddButton();
	}
	
	@Step
	public void click_on_next_button() throws Throwable
	{
		addGuaranteePage.clickOnNextButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
