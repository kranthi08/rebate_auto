package com.project.teststeps;

import com.project.actors.ActorUIAddGuaranteePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddGuaranteePageSteps 
{
	@Steps
	ActorUIAddGuaranteePage actorUIaddGuaranteePage;
	
	
	//Add button 
	@When("^Verify the Gurantee Add button present$")
	public void Verify_the_Gurantee_Add_button_present()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Add_button_present();
	}

	@Then("^Verify the Gurantee Add button disabled$")
	public void Verify_the_Gurantee_Add_button_disabled()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Add_button_disabled();
	}
	
	// Next button
	@When("^Verify the Gurantee Next button present$")  	
	public void Verify_the_Gurantee_Next_button_present()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Next_button_present();
	}
	
	@Then("^Verify the Gurantee Next button disabled$")
	public void Verify_the_Gurantee_Next_button_disabled()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Next_button_disabled();
	}

	// Previous button
	@When("^Verify the Gurantee Previous button present$")  	
	public void Verify_the_Gurantee_Previous_button_present()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Previous_button_present();
	}
	
	@Then("^Verify the Gurantee Previous button enabled$")
	public void Verify_the_Gurantee_Previous_button_enabled()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Previous_button_enabled();
	}

	// Update button
	@When("^Verify the Gurantee Update button present$")  	
	public void Verify_the_Gurantee_Update_button_present()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Update_button_present();
	}

	@Then("^Verify the Gurantee Update button disabled$")
	public void Verify_the_Gurantee_Update_button_disabled()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Update_button_disabled();
	}

	// // Remove button
	@When("^Verify the Gurantee Remove button present$")  	
	public void Verify_the_Gurantee_Remove_button_present()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Remove_button_present();
	}

	@Then("^Verify the Gurantee Remove button disabled$")
	public void Verify_the_Gurantee_Remove_button_disabled()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Remove_button_disabled();
	}
	
	// Browse Notes button
	@When("^Verify the Gurantee Browse Notes button present$")  	
	public void Verify_the_Gurantee_Browse_Notes_button_present()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Browse_Notes_button_present();
	}
	
	@Then("^Verify the Gurantee Browse Notes button disabled$")
	public void Verify_the_Gurantee_Browse_Notes_button_disabled()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Browse_Notes_button_disabled();
	}
	
	// Gurantee Table
	@When("^Verify the Gurantee Table present$")  	
	public void Verify_the_Gurantee_Table_present()throws Throwable
	{
		actorUIaddGuaranteePage.Verify_the_Gurantee_Table_present();
	}

	@Then("^Gurantee Table should be displayed$")
	public void Gurantee_Table_should_be_displayed()throws Throwable
	{
		actorUIaddGuaranteePage.Gurantee_Table_should_be_displayed();
	}
	
  	// Start Date
  	@When("^verify the Guarantee Start Date Edit Box presence$")
  	public void verify_the_Guarantee_Start_Date_Edit_Box_presence() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_Start_Date_Edit_Box_presence();
  	}
	
  	@Then("^verify the Guarantee Start Date Edit Box enabled$")
  	public void verify_the_Guarantee_Start_Date_Edit_Box_enabled() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_Start_Date_Edit_Box_enabled();
  	}
  		
  	@And("^verify the Guarantee Start Date Edit Box Max Length$")
  	public void verify_the_Guarantee_Start_Date_Edit_Box_Max_Length(DataTable guaranteeStartDate_EditBoxMaxLength) throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_Start_Date_Edit_Box_Max_Length(guaranteeStartDate_EditBoxMaxLength);
  	}

  	@And("^verify the Guarantee Start Date Edit Box Default Text$")
  	public void verify_the_Guarantee_Start_Date_Edit_Box_Default_Text(DataTable guaranteeStartDate_EditBoxDefaultText) throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_Start_Date_Edit_Box_Default_Text(guaranteeStartDate_EditBoxDefaultText);
  	}

  	@And("^input value into Guarantee Start Date Edit Box$")
  	public void input_value_into_Guarantee_Start_Date_Edit_Box(DataTable guaranteeStartDate_EditBoxValue) throws Throwable
  	{
  		actorUIaddGuaranteePage.input_value_into_Guarantee_Start_Date_Edit_Box(guaranteeStartDate_EditBoxValue);
  	}

  	// ----------------------- End Date
  	@When("^verify the Guarantee End Date Edit Box presence$")
  	public void verify_the_Guarantee_End_Date_Edit_Box_presence() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_End_Date_Edit_Box_presence();
  	}
  		
  	@Then("^verify the Guarantee End Date Edit Box enabled$")
  	public void verify_the_Guarantee_End_Date_Edit_Box_enabled() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_End_Date_Edit_Box_enabled();
  	}
  		
  	@And("^verify the Guarantee End Date Edit Box Max Length$")
  	public void verify_the_Guarantee_End_Date_Edit_Box_Max_Length(DataTable endDate_EditBoxMaxLength) throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_End_Date_Edit_Box_Max_Length(endDate_EditBoxMaxLength);
  	}

  	@And("^verify the Guarantee End Date Edit Box Default Text$")
  	public void verify_the_Guarantee_End_Date_Edit_Box_Default_Text(DataTable guaranteeEndDate_EditBoxDefaultText) throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Guarantee_End_Date_Edit_Box_Default_Text(guaranteeEndDate_EditBoxDefaultText);
  	}

  	@And("^input value into Guarantee End Date Edit Box$") 
  	public void input_value_into_Guarantee_End_Date_Edit_Box(DataTable guaranteeEndDate_EditBoxValue) throws Throwable
  	{
  		actorUIaddGuaranteePage.input_value_into_Guarantee_End_Date_Edit_Box(guaranteeEndDate_EditBoxValue);
  	}

  	// --------- Vendor formulary ID
  	@When("^verify the Vendor formulary ID Edit Box presence$") 
  	public void verify_the_Vendor_formulary_ID_Edit_Box_presence() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Vendor_formulary_ID_Edit_Box_presence();
  	}

  	@Then("^verify the Vendor formulary ID Edit Box enabled$")
  	public void verify_the_Vendor_formulary_ID_Edit_Box_enabled() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Vendor_formulary_ID_Edit_Box_enabled();
  	}
  		
  	@And("^verify the Vendor formulary ID Edit Box Max Length$")
  	public void verify_the_Vendor_formulary_ID_Edit_Box_Max_Length(DataTable VendorFormularyID_EditBoxMaxLength) throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_the_Vendor_formulary_ID_Edit_Box_Max_Length(VendorFormularyID_EditBoxMaxLength);
  	}

  	@And("^input value into Vendor formulary ID Edit Box$") 
  	public void input_value_into_Vendor_formulary_ID_Edit_Box(DataTable VendorFormularyID_EditBoxValue) throws Throwable
  	{
  		actorUIaddGuaranteePage.input_value_into_Vendor_formulary_ID_Edit_Box(VendorFormularyID_EditBoxValue);
  	}
  	
  	// --------   Vendor formulary type
  	@When("^verify the Vendor formulary type List Box presence$")
  	public void verify_vendor_formulary_type_list_box_presence() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_Vendor_Formulary_Type_List_Box_Presence();
  	}
  	
  	@Then("^verify the Vendor formulary type List Box enabled$")
  	public void verify_Vendor_Formulary_Type_List_Box_Enabled() throws Throwable
  	{
  		actorUIaddGuaranteePage.verify_Vendor_Formulary_Type_List_Box_Enabled();
  	}
  	
  	@And("^verify the Vendor formulary type List Box items$")
  	public void verify_Vendor_Formulary_Type_List_Box_Items(DataTable VendorFormularyType_ListBoxItems ) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Vendor_Formulary_Type_List_Box_Items(VendorFormularyType_ListBoxItems);
	}
  	@And("^select value from Vendor formulary type List Box$")
  	public void select_value_from_Vendor_Formulary_Type_List_Box(DataTable VendorFormularyType_ListBoxValue ) throws Throwable
	{
  		actorUIaddGuaranteePage.select_value_from_Vendor_Formulary_Type_List_Box(VendorFormularyType_ListBoxValue);
	}
  	
  	// -----------------  DST formulary type
  	@When("^verify the DST formulary type List Box presence$")
  	public void verify_DST_Formulary_Type_List_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_DST_Formulary_Type_List_Box_Presence();
	}
  	
  	@Then("^verify the DST formulary type List Box enabled$")
  	public void verify_DST_Formulary_Type_List_Box_Enabled() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_DST_Formulary_Type_List_Box_Enabled();
	}
  	
  	@And("^verify the DST formulary type List Box items$")
  	public void verify_DST_Formulary_Type_List_Box_Items(DataTable DSTFormularyType_ListBoxItems ) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_DST_Formulary_Type_List_Box_Items(DSTFormularyType_ListBoxItems);
	}
  	
  	@And("^select value from DST formulary type List Box$")
  	public void select_value_from_DST_Formulary_Type_List_Box(DataTable DSTFormularyType_ListBoxValue ) throws Throwable
	{
  		actorUIaddGuaranteePage.select_value_from_DST_Formulary_Type_List_Box(DSTFormularyType_ListBoxValue);
	}
  	
  	// ----------------  Tier type
  	@When("^verify the Tier type Edit Box presence$")
  	public void verify_Tier_Type_Edit_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Tier_Type_Edit_Box_Presence();
	}
  	
  	@Then("^verify the Tier type Edit Box enabled$")
  	public void verify_Tier_Type_Edit_Box_Is_Enabled()throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Tier_Type_Edit_Box_Is_Enabled();
	}
  	
  	@And("^verify the Tier type Edit Box Max Length$")
  	public void verify_Tier_Type_Edit_Box_Max_Length(DataTable tierType_EditBoxMaxLength) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Tier_Type_Edit_Box_Max_Length(tierType_EditBoxMaxLength);
	}
  	
  	@And("^input value into Tier type Edit Box$")
  	public void input_value_into_tier_type_edit_box(DataTable tierType_EditBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.input_value_into_tier_type_edit_box(tierType_EditBoxValue);
	}
  	
  	// -------  Channel
  	@When("^verify the Channel List Box presence$")
  	public void verify_Channel_List_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Channel_List_Box_Presence();
	}
  	@Then("^verify the Channel List Box enabled$")
  	public void verify_channel_list_box_enabled() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Channel_List_Box_Enabled();
	}
  	
  	@And("^verify the Channel List Box items$")
  	public void verify_channel_list_box_items(DataTable channel_ListBoxItems ) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Channel_List_Box_Items(channel_ListBoxItems);
	}
  	
  	@And("^select value from Channel List Box$")
  	public void select_value_from_channel_list_box(DataTable Channel_ListBoxValue ) throws Throwable
	{
  		actorUIaddGuaranteePage.select_value_from_Channel_List_Box(Channel_ListBoxValue);
	}
  	
  	// ------- Line of business List Box
  	
  	@When("^verify the Guarantee Line of business List Box presence$")
  	public void verify_Guarantee_Line_Of_Business_List_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Guarantee_Line_Of_Business_List_Box_Presence();
	}
  	
  	@Then("^verify the Guarantee Line of business List Box enabled$")
  	public void verify_Guarantee_Line_Of_Business_List_Box_Enabled() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Guarantee_Line_Of_Business_List_Box_Enabled();
	}
  	
  	@And("^select value from Guarantee Line of business List Box$")
  	public void select_value_from_Guarantee_Line_Of_Business_List_Box(DataTable GuaranteeLineOfBusiness_ListBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.select_value_from_Guarantee_Line_Of_Business_List_Box(GuaranteeLineOfBusiness_ListBoxValue);
	}
  	
  	// ----- -----------------Vendor brand guarantee
  	@When("^verify the Vendor brand guarantee Edit Box presence$")
  	public void verify_Vendor_Brand_Guarantee_Edit_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Vendor_Brand_Guarantee_Edit_Box_Presence();
	}
  	
  	@Then("^verify the Vendor brand guarantee Edit Box enabled$")
  	public void verify_Vendor_Brand_Guarantee_Edit_Box_Is_Enabled()throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Vendor_Brand_Guarantee_Edit_Box_Is_Enabled();
	}
  	
  	@And("^verify the Vendor brand guarantee Edit Box Max Length$")
  	public void verify_Vendor_Brand_Guarantee_Edit_Box_Max_Length(DataTable VendorBrandGuarantee_EditBoxMaxLength) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Vendor_Brand_Guarantee_Edit_Box_Max_Length(VendorBrandGuarantee_EditBoxMaxLength);
	}
  	
  	@And("^input value into Vendor brand guarantee Edit Box$")
  	public void input_value_into_Vendor_Brand_Guarantee_Edit_Box(DataTable VendorBrandGuarantee_EditBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.input_value_into_Vendor_Brand_Guarantee_Edit_Box(VendorBrandGuarantee_EditBoxValue);
	}
  	
  	// -------- ---------------Customer brand guarantee
  	@When("^verify the Customer brand guarantee Edit Box presence$")
  	public void verify_Customer_Brand_Guarantee_Edit_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Customer_Brand_Guarantee_Edit_Box_Presence();
	}
  	
  	@Then("^verify the Customer brand guarantee Edit Box enabled$")
  	public void verify_Customer_Brand_Guarantee_Edit_Box_Is_Enabled()throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Customer_Brand_Guarantee_Edit_Box_Is_Enabled();
	}
  	
  	@And("^verify the Customer brand guarantee Edit Box Max Length$")
  	public void verify_Customer_Brand_Guarantee_Edit_Box_Max_Length(DataTable CustomerBrandGuarantee_EditBoxMaxLength)throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Customer_Brand_Guarantee_Edit_Box_Max_Length(CustomerBrandGuarantee_EditBoxMaxLength);
	}
  	
  	@And("^input value into Customer brand guarantee Edit Box$")
  	public void input_value_into_Customer_Brand_Guarantee_Edit_Box_Value(DataTable customerBrandGuarantee_EditBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.input_value_into_Customer_Brand_Guarantee_Edit_Box_Value(customerBrandGuarantee_EditBoxValue);
	}
  	
  	// --------- --------------  Benefit design
  	@When("^verify the Benefit design List Box presence$")
  	public void verify_Benefit_Design_List_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Benefit_Design_List_Box_Presence();
	}
  	
  	@Then("^verify the Benefit design List Box enabled$")
  	public void verify_Benefit_Design_List_Box_Enabled() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Benefit_Design_List_Box_Enabled();
	}
  	
  	@And("^verify the Benefit design List Box items$")
  	public void verify_Benefit_Design_List_Box_Items(DataTable benefitDesign_ListBoxItems ) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_Benefit_Design_List_Box_Items(benefitDesign_ListBoxItems);
	}
  	
  	@And("^select value from Benefit design List Box$")
  	public void select_value_from_Benefit_Design_List_Box_Value(DataTable BenefitDesign_ListBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.select_value_from_Benefit_Design_List_Box_Value(BenefitDesign_ListBoxValue);
	}
  	//  ------------------------UM option
  	@When("^verify the UM option List Box presence$")
  	public void verify_UM_Option_List_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_UM_Option_List_Box_Presence();
	}
  	
  	@Then("^verify the UM option List Box enabled$")
  	public void verify_UM_Option_List_Box_Enabled() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_UM_Option_List_Box_Enabled();
	}
  	
  	@And("^verify the UM option List Box items$")
  	public void verify_UM_Option_List_Box_Items(DataTable UMOption_ListBoxItems ) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_UM_Option_List_Box_Items(UMOption_ListBoxItems);
	}
  	
  	@And("^select value from UM option List Box$")
  	public void select_value_from_UM_Option_List_Box_Value(DataTable UMOption_ListBoxValue ) throws Throwable
	{
  		actorUIaddGuaranteePage.select_value_from_UM_Option_List_Box_Value(UMOption_ListBoxValue);
	}
  	
  	//  -------------------------Benefit design description notes:
  	@When("^verify the Benefit design description notes Edit Box presence$")
  	public void verify_BenefitDesignDescriptionNotes_Edit_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_BenefitDesignDescriptionNotes_Edit_Box_Presence();
	}
  	
  	@Then("^verify the Benefit design description notes Edit Box enabled$")
  	public void verify_BenefitDesignDescriptionNotes_Edit_Box_Is_Enabled()throws Throwable
	{
  		actorUIaddGuaranteePage.verify_BenefitDesignDescriptionNotes_Edit_Box_Is_Enabled();
	}
  	
  	@And("^verify the Benefit design description notes Edit Box Max Length$")
  	public void verify_BenefitDesignDescriptionNotes_Edit_Box_Max_Length(DataTable BenefitDesignDescriptionNotes_EditBoxMaxLength) throws Throwable
	{
  		actorUIaddGuaranteePage.verify_BenefitDesignDescriptionNotes_Edit_Box_Max_Length(BenefitDesignDescriptionNotes_EditBoxMaxLength);
	}
  	
  	@And("^input value into Benefit design description notes Edit Box$")
  	public void input_value_into_BenefitDesignDescriptionNotes_Edit_Box(DataTable BenefitDesignDescriptionNotes_EditBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.input_value_into_BenefitDesignDescriptionNotes_Edit_Box(BenefitDesignDescriptionNotes_EditBoxValue);
	}
  		
  		
  	// --------------------------Plan design notes
  	@When("^verify the Plan design notes Edit Box presence$")
  	public void verify_PlanDesignNotes_Edit_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_PlanDesignNotes_Edit_Box_Presence();
	}
  	
  	@Then("^verify the Plan design notes Edit Box enabled$")
  	public void verify_PlanDesignNotes_Edit_Box_Is_Enabled()throws Throwable
	{
  		actorUIaddGuaranteePage.verify_PlanDesignNotes_Edit_Box_Is_Enabled();
	}
  	
  	@And("^verify the Plan design notes Edit Box Max Length$")
  	public void verify_PlanDesignNotes_Edit_Box_Max_Length(DataTable PlanDesignNotes_EditBoxMaxLength)throws Throwable
	{
  		actorUIaddGuaranteePage.verify_PlanDesignNotes_Edit_Box_Max_Length(PlanDesignNotes_EditBoxMaxLength);
	}
  	
  	@And("^input value into Plan design notes Edit Box$")
  	public void input_value_into_plan_design_notes_edit_box(DataTable PlanDesignNotes_EditBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.input_value_into_plan_design_notes_edit_box(PlanDesignNotes_EditBoxValue);
	}
  	
  	//  -------------------------UM option notes
  	@When("^verify the UM option notes Edit Box presence$")
  	public void verify_UMOptionNotes_Edit_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_UMOptionNotes_Edit_Box_Presence();
	}
  	
  	@Then("^verify the UM option notes Edit Box enabled$")
  	public void verify_UMOptionNotes_Edit_Box_Is_Enabled()throws Throwable
	{
  		actorUIaddGuaranteePage.verify_UMOptionNotes_Edit_Box_Is_Enabled();
	}
  	
  	@And("^verify the UM option notes Edit Box Max Length$")
  	public void verify_UMOptionNotes_Edit_Box_Max_Length(DataTable UMOptionNotes_EditBoxMaxLength)throws Throwable
	{
  		actorUIaddGuaranteePage.verify_UMOptionNotes_Edit_Box_Max_Length(UMOptionNotes_EditBoxMaxLength);
	}
  	
  	@And("^input value into UM option Notes Edit Box$")
  	public void input_value_into_um_option_notes_edit_box(DataTable UMOptionNotes_EditBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.input_value_into_um_option_notes_edit_box(UMOptionNotes_EditBoxValue);
	}
  		
  	// --------------------------Formulary design notes
  	@When("^verify the Formulary design notes Edit Box presence$")
  	public void verify_FormularyDesignNotes_Edit_Box_Presence() throws Throwable
	{
  		actorUIaddGuaranteePage.verify_FormularyDesignNotes_Edit_Box_Presence();
	}
  	
  	@Then("^verify the Formulary design notes Edit Box enabled$")
  	public void verify_FormularyDesignNotes_Edit_Box_Is_Enabled()throws Throwable
	{
  		actorUIaddGuaranteePage.verify_FormularyDesignNotes_Edit_Box_Is_Enabled();
	}
  	
  	@And("^verify the Formulary design notes Edit Box Max Length$")
  	public void verify_FormularyDesignNotes_Edit_Box_Max_Length(DataTable FormularyDesignNotes_EditBoxMaxLength)throws Throwable
	{
  		actorUIaddGuaranteePage.verify_FormularyDesignNotes_Edit_Box_Max_Length(FormularyDesignNotes_EditBoxMaxLength);
	}
  	
  	@And("^input value into Formulary design notes Edit Box$")
  	public void input_value_into_formulary_design_notes_edit_box(DataTable FormularyDesignNotes_EditBoxValue) throws Throwable
	{
  		actorUIaddGuaranteePage.input_value_into_formulary_design_notes_edit_box(FormularyDesignNotes_EditBoxValue);
	}
  	
  	@Then("^click on Add button$")
  	public void click_on_add_button()  throws Throwable
  	{
  		actorUIaddGuaranteePage.click_on_add_button();
  	}
  	
  	@Then("^click on next button$")
  	public void click_on_next_button() throws Throwable
  	{
  		actorUIaddGuaranteePage.click_on_next_button();
  	}
  		
}
