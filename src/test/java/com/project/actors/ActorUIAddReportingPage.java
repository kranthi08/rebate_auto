package com.project.actors;

import java.util.List;

import com.project.pages.AddReportingPage;
import com.project.pages.UIAddReportingPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddReportingPage 
{
	@Steps
	UIAddReportingPage uiaddReportingPage;
	AddReportingPage addReportingPage;
	
	
	// Add Button
	@Step
	public void verify_the_Reporting_Add_button_is_presence() throws Throwable
	{
		uiaddReportingPage.verifyAddButtonIsPresent();
	}
	
	@Step
	public void verify_the_Reporting_Add_button_is_disabled() throws Throwable
	{
		uiaddReportingPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void click_on_add_button() throws Throwable
	{
		addReportingPage.clickOnAddButton();
	}
	
	// Update Button
	@Step
	public void verify_the_Reporting_Update_button_is_presence() throws Throwable
	{
		uiaddReportingPage.update_button_presence();
	}
	
	@Step
	public void verify_the_Reporting_Update_button_is_disabled() throws Throwable
	{
		uiaddReportingPage.update_button_disbled();
	}
	
	@Step
	public void veify_update_button_enabled_in_reporting_panel() throws Throwable
  	{
		uiaddReportingPage.update_button_enabled();
  	}
	
	//Remove Button
	@Step
	public void verify_the_Reporting_Remove_button_is_presence() throws Throwable
	{
		uiaddReportingPage.remove_button_presence();
	}
	
	@Step
	public void verify_the_Reporting_Remove_button_is_disabled() throws Throwable
	{
		uiaddReportingPage.remove_button_disbled();
	}
	
	@Step
	public void verify_remove_button_enabled_in_reporting_panel() throws Throwable
  	{
		uiaddReportingPage.update_button_enabled();
  	}
	
	// Previous button
	@Step
	public void verify_the_Reporting_Previous_button_is_presence() throws Throwable
	{
		uiaddReportingPage.previous_button_presence();
	}
	
	@Step
	public void verify_the_Reporting_Previous_button_is_enabled() throws Throwable
	{
		uiaddReportingPage.previous_button_enabled();
	}
	
	// Next Button
	@Step
	public void verify_the_Reporting_Next_button_is_presence() throws Throwable
	{
		uiaddReportingPage.next_button_presence();
	}
	
	@Step
	public void verify_the_Reporting_Next_button_is_enabled() throws Throwable
	{
		uiaddReportingPage.next_button_enabled();
	}
	
	@Step
	public void verify_the_Reporting_Next_button_is_disabled() throws Throwable
	{
		uiaddReportingPage.next_button_disabled();
	}
	
	// Rebate Table
	@Step
	public void verify_the_Reporting_Table_is_presence() throws Throwable
	{
		uiaddReportingPage.verify_Reporting_Table_presence();
	}
	
	@Step
	public void Reporting_Table_should_be_displayed() throws Throwable
	{
		uiaddReportingPage.verify_Reporting_Table_presence();
	}
	
	// Package List box
	@Step
	public void verify_the_package_List_Box_presence() throws Throwable
	{
		uiaddReportingPage.verifyPackageListBoxIsPresent();
	}
	
	@Step
	public void verify_the_package_List_Box_enabled() throws Throwable
	{
		uiaddReportingPage.verifyPackageListBoxIsEnabled();
	}
	
	@Step
	public void verify_the_package_List_Box_items(DataTable package_ListBoxitems) throws Throwable
	{
		List<List<String>> package_listboxitems = package_ListBoxitems.raw();
		String strpackage_listboxitems = package_listboxitems.get(1).get(0);
		uiaddReportingPage.verifyPackageListBoxItems(strpackage_listboxitems);
	}
	
	@Step
	public void select_value_from_package_List_Box(DataTable package_ListBoxValue) throws Throwable
	{
		List<List<String>> package_listboxvalue = package_ListBoxValue.raw();
		String strpackage_listboxValue = package_listboxvalue.get(1).get(0);		
		addReportingPage.selectValueFromPackageList(strpackage_listboxValue);
	}
	
	// Level List box
	@Step
	public void verify_the_level_List_Box_presence() throws Throwable
	{
		uiaddReportingPage.verifyLevelListBoxIsPresent();
	}
	
	@Step
	public void verify_the_level_List_Box_enabled() throws Throwable
	{
		uiaddReportingPage.verifyLevelListBoxIsEnabled();
	}
	
	@Step
	public void verify_the_level_List_Box_items(DataTable level_ListBoxitems) throws Throwable
	{
		List<List<String>> level_listboxitems = level_ListBoxitems.raw();
		String strlevel_listboxitems = level_listboxitems.get(1).get(0);
		uiaddReportingPage.verifyLevelListBoxItemsCount(strlevel_listboxitems);
	}
	
	@Step
	public void select_value_from_level_List_Box(DataTable level_ListBoxValue) throws Throwable
	{
		List<List<String>>level_listboxvalue = level_ListBoxValue.raw();
		String strlevel_listboxValue = level_listboxvalue.get(1).get(0);		
		addReportingPage.selectValueFromLevelList(strlevel_listboxValue);
	}
	
	// start date edit
	@Step
	public void verify_the_Reporting_Start_Date_Edit_Box_presence() throws Throwable
  	{
		uiaddReportingPage.verifyStartDateEditBoxPresence();
  	}
	
	@Step 
	public void verify_the_Reporting_Start_Date_Edit_Box_enabled() throws Throwable
  	{
		uiaddReportingPage.verifyStartDateEditBoxEnabled();
  	}
	
	@Step
	public void verify_the_Reporting_Start_Date_Edit_Box_Max_Length(DataTable guaranteeStartDate_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> guaranteeStartDate_length = guaranteeStartDate_EditBoxMaxLength.raw();
		String strguaranteeStartDate_length = guaranteeStartDate_length.get(1).get(0);
		uiaddReportingPage.verifyStartDateEditBoxMaxLength(strguaranteeStartDate_length);
  	}
	
	@Step
	public void verify_the_Reporting_Start_Date_Edit_Box_Default_Text(DataTable guaranteeStartDate_EditBoxDefaultText) throws Throwable
  	{
		List<List<String>> guaranteeStartDate_defaultText = guaranteeStartDate_EditBoxDefaultText.raw();
		String strguaranteeStartDate_defaultText = guaranteeStartDate_defaultText.get(1).get(0);
		uiaddReportingPage.verifyStartDateEditBoxDefaultText(strguaranteeStartDate_defaultText);
  	}
	
	@Step
	public void input_value_into_Reporting_Start_Date_Edit_Box(DataTable guaranteeStartDate_EditBoxValue) throws Throwable
  	{
		List<List<String>> guaranteeStartDate_Value = guaranteeStartDate_EditBoxValue.raw();
		String strguaranteeStartDate_EditBoxValue = guaranteeStartDate_Value.get(1).get(0);
		addReportingPage.setTextIntoStartDateEdit(strguaranteeStartDate_EditBoxValue);
  	}
	
	// ----------------------- End Date
	@Step
  	public void verify_the_Reporting_End_Date_Edit_Box_presence() throws Throwable
  	{
		uiaddReportingPage.verifyEndDateEditBoxPresence();
  	}
  		
	@Step
  	public void verify_the_Reporting_End_Date_Edit_Box_enabled() throws Throwable
  	{
		uiaddReportingPage.verifyEndDateEditBoxEnabled();
  	}
  		
	@Step
  	public void verify_the_Reporting_End_Date_Edit_Box_Max_Length(DataTable endDate_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> endDate_length = endDate_EditBoxMaxLength.raw();
		String strEndDate_EditBoxMaxLength = endDate_length.get(1).get(0);
		uiaddReportingPage.verifyEndDateEditBoxMaxLength(strEndDate_EditBoxMaxLength);
  	}

	@Step
  	public void verify_the_Reporting_End_Date_Edit_Box_Default_Text(DataTable guaranteeEndDate_EditBoxDefaultText) throws Throwable
  	{
		List<List<String>> guaranteeEndDate_defaultText = guaranteeEndDate_EditBoxDefaultText.raw();
		String strguaranteeEndDate_defaultText = guaranteeEndDate_defaultText.get(1).get(0);
		uiaddReportingPage.verifyEndDateEditBoxDefaultText(strguaranteeEndDate_defaultText);
  	}

	@Step
  	public void input_value_into_Reporting_End_Date_Edit_Box(DataTable guaranteeEndDate_EditBoxValue) throws Throwable
  	{
		List<List<String>> guaranteeEndDate_Value = guaranteeEndDate_EditBoxValue.raw();
		String strguaranteeEndDate_EditBoxValue = guaranteeEndDate_Value.get(1).get(0);
		addReportingPage.setTextIntoEndDateEdit(strguaranteeEndDate_EditBoxValue);
  	}
	
	// package Notes	
	@Step
	public void verify_the_Reporting_package_Notes_Edit_Box_presence() throws Throwable
  	{
		uiaddReportingPage.verify_package_notes_edit_box_Present();
  	}
	
	@Step 
	public void verify_the_Reporting_package_Notes_Edit_Box_enabled() throws Throwable
  	{
		uiaddReportingPage.verify_package_notes_edit_box_Enabled();
  	}
	
	@Step
	public void verify_the_Reporting_package_Notes_Edit_Box_Max_Length(DataTable package_Notes_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> package_Notes_length = package_Notes_EditBoxMaxLength.raw();
		String strpackage_Notes_length = package_Notes_length.get(1).get(0);
		uiaddReportingPage.verify_package_notes_edit_box_MaxLength(strpackage_Notes_length);
  	}
	
	@Step
	public void input_value_into_Reporting_package_Notes_Edit_Box(DataTable package_Notes_EditBoxValue) throws Throwable
  	{
		List<List<String>> package_Notes_Value = package_Notes_EditBoxValue.raw();
		String strpackage_Notes_EditBoxValue = package_Notes_Value.get(1).get(0);
		addReportingPage.setTextIntoPackageNotesEdit(strpackage_Notes_EditBoxValue);
  	}
	
	// level Notes	
	@Step
	public void verify_the_Reporting_level_Notes_Edit_Box_presence() throws Throwable
  	{
		uiaddReportingPage.verify_level_notes_edit_box_Present();
  	}
	
	@Step 
	public void verify_the_Reporting_level_Notes_Edit_Box_enabled() throws Throwable
  	{
		uiaddReportingPage.verify_level_notes_edit_box_Enabled();
  	}
	
	@Step
	public void verify_the_Reporting_level_Notes_Edit_Box_Max_Length(DataTable package_Notes_EditBoxMaxLength) throws Throwable
  	{
		List<List<String>> package_Notes_length = package_Notes_EditBoxMaxLength.raw();
		String strpackage_Notes_length = package_Notes_length.get(1).get(0);
		uiaddReportingPage.verify_level_notes_edit_box_MaxLength(strpackage_Notes_length);
  	}
	
	@Step
	public void input_value_into_level_package_Notes_Edit_Box(DataTable package_Notes_EditBoxValue) throws Throwable
  	{
		List<List<String>> package_Notes_Value = package_Notes_EditBoxValue.raw();
		String strpackage_Notes_EditBoxValue = package_Notes_Value.get(1).get(0);
		addReportingPage.setTextIntoLevelNotesEdit(strpackage_Notes_EditBoxValue);
  	}
	
	@Step
	public void click_on_matching_check_box_in_reporting_table(DataTable reportingTableValues) throws Throwable
  	{
		List<List<String>> table_Values = reportingTableValues.raw();
		String StrOperation = table_Values.get(1).get(0);
		String strPackage = table_Values.get(1).get(1);
		String strLevel =  table_Values.get(1).get(2);
		String strStartDate =  table_Values.get(1).get(3);
		String strEndDate =  table_Values.get(1).get(4);
		
		String strValuesForCheck = strPackage + "*" + strLevel + "*" + strStartDate + "*" + strEndDate;
		uiaddReportingPage.clickOnCheckBoxInReportingTable(StrOperation, strValuesForCheck);	
  	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
