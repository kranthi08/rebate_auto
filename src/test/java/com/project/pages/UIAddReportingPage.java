package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddReportingPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class UIAddReportingPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddReportingPanel.Reporting_Add_Package_List)
	private BaseElement Reporting_Add_Package_List;
	
	@ByAngularModel.FindBy(model=AddReportingPanel.Reporting_Add_Level_List)
	private BaseElement Reporting_Add_Level_List;
	
	@ByAngularModel.FindBy(model=AddReportingPanel.Reporting_Add_StartDate_Edit)
	private BaseElement Reporting_Add_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddReportingPanel.Reporting_Add_EndDate_Edit)
	private BaseElement Reporting_Add_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=AddReportingPanel.Reporting_Add_PackageNotes_Edit)
	private BaseElement Reporting_Add_PackageNotes_Edit;
	
	@ByAngularModel.FindBy(model=AddReportingPanel.Reporting_Add_LevelNotes_Edit)
	private BaseElement Reporting_Add_LevelNotes_Edit;
	
	@FindBy(xpath=AddReportingPanel.Reporting_Add_Add_Button)
	private BaseElement Reporting_Add_Add_Button;
	
	@FindBy(xpath=AddReportingPanel.Reporting_Add_Next_Button)
	private BaseElement Reporting_Add_Next_Button;
	
	@FindBy(xpath=AddReportingPanel.Reporting_Add_Previous_Button)
	private BaseElement Reporting_Add_Previous_Button;
	
	@FindBy(xpath=AddReportingPanel.Reporting_Add_Remove_Button)
	private BaseElement Reporting_Add_Remove_Button;
	
	@FindBy(xpath=AddReportingPanel.Reporting_Add_Update_Button)
	private BaseElement Reporting_Add_Update_Button;
	
	@FindBy(xpath=AddReportingPanel.Reporting_Add_ReportingPanel_Table)
	private BaseElement Reporting_Add_ReportingPanel_Table;
	
	//  Methods
	
	// Reporting Details
	
	// Package List Box
	public boolean verifyPackageListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Reporting_Add_Package_List);
	}
	
	public boolean verifyPackageListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Reporting_Add_Package_List);
	}
	
	public boolean verifyPackageListBoxItems(String PackageListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Reporting_Add_Package_List, PackageListItems);
	}
	
	//  Level List Box
	public boolean verifyLevelListBoxIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(Reporting_Add_Level_List);
	}
	
	public boolean verifyLevelListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(Reporting_Add_Level_List);
	}
	
	public boolean verifyLevelListBoxItemsCount(String LevelListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(Reporting_Add_Level_List, LevelListItems);
	}
	
	// Start Date
	public boolean verifyStartDateEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Reporting_Add_StartDate_Edit);
	}
	
	public boolean verifyStartDateEditBoxEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Reporting_Add_StartDate_Edit);
	}
	
	public boolean verifyStartDateEditBoxMaxLength(String editBoxMaxLenght) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Reporting_Add_StartDate_Edit, editBoxMaxLenght);
	}
	
	public boolean verifyStartDateEditBoxDefaultText(String strEditBoxDefaultText)  throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(Reporting_Add_StartDate_Edit, strEditBoxDefaultText);
	}
	
	// End Date
	public boolean verifyEndDateEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Reporting_Add_EndDate_Edit);
	}
	
	public boolean verifyEndDateEditBoxEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Reporting_Add_EndDate_Edit);
	}
	
	public boolean verifyEndDateEditBoxMaxLength(String editBoxMaxLenght) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Reporting_Add_EndDate_Edit, editBoxMaxLenght);
	}
	
	public boolean verifyEndDateEditBoxDefaultText(String strEditBoxDefaultText) throws Throwable 
	{
		return rxNovaCommonUtil.verifyEditBoxDefaultText(Reporting_Add_EndDate_Edit, strEditBoxDefaultText);
	}
	
	// Add Button
	public boolean verifyAddButtonIsPresent() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Reporting_Add_Add_Button);
	}
	
	public boolean verifyAddButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Reporting_Add_Add_Button);	
	}
	
	public boolean verifyAddButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Reporting_Add_Add_Button);
	}
	
	// Next button
	public boolean next_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Reporting_Add_Next_Button);
	}
	
	public boolean next_button_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Reporting_Add_Next_Button);				
	}
	
	public boolean next_button_disabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Reporting_Add_Next_Button);				
	}
	
	// Previous button 
	
	public boolean previous_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Reporting_Add_Previous_Button);
	}
	
	public boolean previous_button_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Reporting_Add_Previous_Button);				
	}
	
	// remove button
	public boolean remove_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Reporting_Add_Remove_Button);
	}
	
	public boolean remove_button_disbled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Reporting_Add_Remove_Button);				
	}
	
	public boolean remove_button_enbled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Reporting_Add_Remove_Button);				
	}
	
	// Reporting Table
	public boolean verify_Reporting_Table_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyTablePresence(Reporting_Add_ReportingPanel_Table);
	}
	
	// Update Button 
	public boolean update_button_presence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(Reporting_Add_Update_Button);
	}
	
	public boolean update_button_disbled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(Reporting_Add_Update_Button);				
	}
	
	public boolean update_button_enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(Reporting_Add_Update_Button);				
	}
	
	// package
	public boolean verify_package_notes_edit_box_Present() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Reporting_Add_PackageNotes_Edit);
	}
	
	public boolean verify_package_notes_edit_box_Enabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Reporting_Add_PackageNotes_Edit);
	}
	
	public boolean verify_package_notes_edit_box_MaxLength(String packageNotes_MaxtLength) throws Throwable	
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Reporting_Add_PackageNotes_Edit, packageNotes_MaxtLength);
	}
	
	
	
	// level notes edit box
	
	public boolean verify_level_notes_edit_box_Present()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(Reporting_Add_LevelNotes_Edit);
	}
	
	public boolean verify_level_notes_edit_box_Enabled()throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(Reporting_Add_LevelNotes_Edit);
	}
	
	public boolean verify_level_notes_edit_box_MaxLength(String levelNotes_MaxtLength)	throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(Reporting_Add_LevelNotes_Edit, levelNotes_MaxtLength);
	}
	
	public boolean clickOnCheckBoxInReportingTable(String Operation, String strValue) throws Throwable
	{
		return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(Reporting_Add_ReportingPanel_Table, Operation, strValue);
	}
	
	
	
	
	
	
}
