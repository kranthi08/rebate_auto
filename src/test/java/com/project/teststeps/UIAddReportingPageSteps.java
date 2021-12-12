package com.project.teststeps;

import com.project.actors.ActorUIAddReportingPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UIAddReportingPageSteps 
{
	@Steps
	ActorUIAddReportingPage actorUIaddReportingPage;
	
	// Add Button
	@When("^verify the Reporting Add button is presence$")
	public void verify_the_reporting_Add_button_is_presence() throws Throwable
	{
		actorUIaddReportingPage.verify_the_Reporting_Add_button_is_presence();
	}
	
  	@Then("^verify the Reporting Add button is disabled$")
  	public void verify_the_reporting_Add_button_is_disabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Add_button_is_disabled();
	}
  	
  	@Then("^click on Add button in Reporting Panel$")
  	public void click_on_add_button_in_reporting_panel() throws Throwable
  	{
  		actorUIaddReportingPage.click_on_add_button();
  	}
  	
  	// Update Button
  	@When("^verify the Reporting Update button is presence$")
  	public void verify_the_reporting_Update_button_is_presence() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Update_button_is_presence();
	}
  	
  	@Then("^verify the Reporting Update button is disabled$")
  	public void verify_the_reporting_Update_button_is_disabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Update_button_is_disabled();
	}
  	
  	// Remove Button
  	@When("^verify the Reporting Remove button is presence$")
  	public void verify_the_reporting_Remove_button_is_presence() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Remove_button_is_presence();
	}
  	
  	@Then("^verify the Reporting Remove button is disabled$")
  	public void verify_the_reporting_Remove_button_is_disabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Remove_button_is_disabled();
	}
  	
  	// Previous Button
  	@When("^verify the Reporting Previous button is presence$")
  	public void verify_the_reporting_Previous_button_is_presence() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Previous_button_is_presence();
	}
  	
  	@Then("^verify the Reporting Previous button is enabled$")
  	public void verify_the_reporting_Previous_button_is_enabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Previous_button_is_enabled();
	}
  	
  	// Next Nutton
  	@When("^verify the Reporting Next button is presence$")
  	public void verify_the_reporting_Next_button_is_presence() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Next_button_is_presence();
	}
  	
  	@Then("^verify the Reporting Next button is enabled$")
  	public void verify_the_reporting_Next_button_is_enabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Next_button_is_enabled();
	}
  	
  	@Then("^verify the Reporting Next button is disabled$")
  	public void verify_the_reporting_Next_button_is_disabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Next_button_is_disabled();
	}
  	
  	// Reporting Table
  	@When("^verify the Reporting Table is presence$")
  	public void verify_the_reporting_Table_is_presence() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_Reporting_Table_is_presence();
	}
  	
  	@Then("^Reporting Table should be displayed$")
  	public void reporting_Table_should_be_displayed() throws Throwable
	{
  		actorUIaddReportingPage.Reporting_Table_should_be_displayed();
	}
  	
  	// Package List Box
  	
  	@When("^verify the Package List Box presence$")
  	public void verify_the_Package_List_Box_presence() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_package_List_Box_presence();
	}
  	
  	@Then("^verify the Package List Box enabled$")
  	public void verify_the_Package_List_Box_enabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_package_List_Box_enabled();
	}
  	
  	@And("^verify the Package List Box items$")
  	public void verify_the_Package_List_Box_items(DataTable Package_ListBoxitems) throws Throwable
	{
  		actorUIaddReportingPage.verify_the_package_List_Box_items(Package_ListBoxitems);
	}
  	
  	@And("^select value from Package List Box$")
  	public void select_value_from_Package_List_Box(DataTable Package_ListBoxitems_ListBoxValue) throws Throwable
	{
  		actorUIaddReportingPage.select_value_from_package_List_Box(Package_ListBoxitems_ListBoxValue);
	}
  	
  	// Level List
  	@When("^verify the Level List Box presence$")
  	public void verify_the_Level_List_Box_presence() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_level_List_Box_presence();
	}
  	
  	@Then("^verify the Level List Box enabled$")
  	public void verify_the_Level_List_Box_enabled() throws Throwable
	{
  		actorUIaddReportingPage.verify_the_level_List_Box_enabled();
	}
  	
  	@And("^verify the Level List Box items$")
  	public void verify_the_Level_List_Box_items(DataTable level_ListBoxitems) throws Throwable
	{
  		actorUIaddReportingPage.verify_the_level_List_Box_items(level_ListBoxitems);
	}
  	
  	@And("^select value from Level List Box$")
  	public void select_value_from_Level_List_Box(DataTable level_ListBoxValue) throws Throwable
	{
  		actorUIaddReportingPage.select_value_from_level_List_Box(level_ListBoxValue);
	}
  	
 // Start Date
   	@When("^verify the Reporting Start Date Edit Box presence$")
   	public void verify_the_Reporting_Start_Date_Edit_Box_presence() throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_Start_Date_Edit_Box_presence();
   	}
 	
   	@Then("^verify the Reporting Start Date Edit Box enabled$")
   	public void verify_the_Reporting_Start_Date_Edit_Box_enabled() throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_Start_Date_Edit_Box_enabled();
   	}
   		
   	@And("^verify the Reporting Start Date Edit Box Max Length$")
   	public void verify_the_Reporting_Start_Date_Edit_Box_Max_Length(DataTable guaranteeStartDate_EditBoxMaxLength) throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_Start_Date_Edit_Box_Max_Length(guaranteeStartDate_EditBoxMaxLength);
   	}

   	@And("^verify the Reporting Start Date Edit Box Default Text$")
   	public void verify_the_Reporting_Start_Date_Edit_Box_Default_Text(DataTable guaranteeStartDate_EditBoxDefaultText) throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_Start_Date_Edit_Box_Default_Text(guaranteeStartDate_EditBoxDefaultText);
   	}

   	@And("^input value into Reporting Start Date Edit Box$")
   	public void input_value_into_Reporting_Start_Date_Edit_Box(DataTable guaranteeStartDate_EditBoxValue) throws Throwable
   	{
   		actorUIaddReportingPage.input_value_into_Reporting_Start_Date_Edit_Box(guaranteeStartDate_EditBoxValue);
   	}

   	// ----------------------- End Date
   	@When("^verify the Reporting End Date Edit Box presence$")
   	public void verify_the_Reporting_End_Date_Edit_Box_presence() throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_End_Date_Edit_Box_presence();
   	}
   		
   	@Then("^verify the Reporting End Date Edit Box enabled$")
   	public void verify_the_Reporting_End_Date_Edit_Box_enabled() throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_End_Date_Edit_Box_enabled();
   	}
   		
   	@And("^verify the Reporting End Date Edit Box Max Length$")
   	public void verify_the_Reporting_End_Date_Edit_Box_Max_Length(DataTable endDate_EditBoxMaxLength) throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_End_Date_Edit_Box_Max_Length(endDate_EditBoxMaxLength);
   	}

   	@And("^verify the Reporting End Date Edit Box Default Text$")
   	public void verify_the_Reporting_End_Date_Edit_Box_Default_Text(DataTable guaranteeEndDate_EditBoxDefaultText) throws Throwable
   	{
   		actorUIaddReportingPage.verify_the_Reporting_End_Date_Edit_Box_Default_Text(guaranteeEndDate_EditBoxDefaultText);
   	}

   	@And("^input value into Reporting End Date Edit Box$") 
   	public void input_value_into_Reporting_End_Date_Edit_Box(DataTable guaranteeEndDate_EditBoxValue) throws Throwable
   	{
   		actorUIaddReportingPage.input_value_into_Reporting_End_Date_Edit_Box(guaranteeEndDate_EditBoxValue);
   	}
   	
   	// Package Notes Edit box
   	
   	@When("^verify the Package notes Edit Box presence$")
   	public void verify_the_Reporting_package_Notes_Edit_Box_presence() throws Throwable
  	{
   		actorUIaddReportingPage.verify_the_Reporting_package_Notes_Edit_Box_presence();
  	}
   	
  	@Then("^verify the Package notes Edit Box enabled$")
  	public void verify_the_Reporting_package_Notes_Edit_Box_enabled() throws Throwable
  	{
  		actorUIaddReportingPage.verify_the_Reporting_package_Notes_Edit_Box_enabled();
  	}
  	
  	@And("^verify the Package notes Edit Box Max Length$")
  	public void verify_the_Reporting_package_Notes_Edit_Box_Max_Length(DataTable package_Notes_EditBoxMaxLength) throws Throwable
  	{
  		actorUIaddReportingPage.verify_the_Reporting_package_Notes_Edit_Box_Max_Length(package_Notes_EditBoxMaxLength);
  	}
  	
  	@And("^input value into Package Notes Edit Box$")
  	public void input_value_into_Reporting_package_Notes_Edit_Box(DataTable package_Notes_EditBoxValue) throws Throwable
  	{
  		actorUIaddReportingPage.input_value_into_Reporting_package_Notes_Edit_Box(package_Notes_EditBoxValue);
  	}
  	
  	// Level Notes edit box
  	@When("^verify the Level notes Edit Box presence$")
  	public void verify_the_Reporting_level_Notes_Edit_Box_presence() throws Throwable
  	{
  		actorUIaddReportingPage.verify_the_Reporting_level_Notes_Edit_Box_presence();
  	}
  	
  	@Then("^verify the Level notes Edit Box enabled$")
  	public void verify_the_Reporting_level_Notes_Edit_Box_enabled() throws Throwable
  	{
  		actorUIaddReportingPage.verify_the_Reporting_level_Notes_Edit_Box_enabled();
  	}
  
  	@And("^verify the Level notes Edit Box Max Length$")
  	public void verify_the_Reporting_level_Notes_Edit_Box_Max_Length(DataTable package_Notes_EditBoxMaxLength) throws Throwable
  	{
  		actorUIaddReportingPage.verify_the_Reporting_level_Notes_Edit_Box_Max_Length(package_Notes_EditBoxMaxLength);
  	}
  	
  	@And("^input value into Level notes Edit Box$")
  	public void input_value_into_level_package_Notes_Edit_Box(DataTable package_Notes_EditBoxValue) throws Throwable
  	{
  		actorUIaddReportingPage.input_value_into_level_package_Notes_Edit_Box(package_Notes_EditBoxValue);
  	}
  	
  	@When("^check the matching check box in Reporting Table$")
  	public void check_on_matching_check_box_in_reporting_table(DataTable reportingTableValues) throws Throwable
  	{
  		actorUIaddReportingPage.click_on_matching_check_box_in_reporting_table(reportingTableValues);
  	}
  	
  	@Then("^verify Update button enabled in Reporting panel$")
  	public void veify_update_button_enabled_in_reporting_panel() throws Throwable
  	{
  		actorUIaddReportingPage.veify_update_button_enabled_in_reporting_panel();
  	}
  	
  	@And("^verify Remove button enabled in Reporting panel$")
  	public void verify_remove_button_enabled_in_reporting_panel() throws Throwable
  	{
  		actorUIaddReportingPage.verify_remove_button_enabled_in_reporting_panel();
  	}
  	
  	@When("^uncheck the matching check box in Reporting Table$")
  	public void uncheck_the_matching_check_box_in_reporting_table(DataTable reportingTableValues) throws Throwable
  	{
  		actorUIaddReportingPage.click_on_matching_check_box_in_reporting_table(reportingTableValues);
  	}
  	
  	
  	@Then("^verify Update button disabled in Reporting panel$")
  	public void verify_update_button_disabled_in_reporting_panel() throws Throwable
  	{
  		actorUIaddReportingPage.verify_the_Reporting_Update_button_is_disabled();
  	}
  	
  	@And("^verify Remove button disabled in Reporting panel$")
  	public void verify_remove_button_disabled_in_reporting_panel() throws Throwable
  	{
  		actorUIaddReportingPage.verify_the_Reporting_Remove_button_is_disabled();
  	}
   	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
