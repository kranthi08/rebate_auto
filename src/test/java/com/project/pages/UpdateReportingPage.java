package com.project.pages;

import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateReportingPanel;

public class UpdateReportingPage extends BasePage 
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	
	@ByAngularModel.FindBy(model=UpdateReportingPanel.Reporting_Update_Package_List)
	private BaseElement Reporting_Update_Package_List;
	
	@ByAngularModel.FindBy(model=UpdateReportingPanel.Reporting_Update_Level_List)
	private BaseElement Reporting_Update_Level_List;
	
	@ByAngularModel.FindBy(model=UpdateReportingPanel.Reporting_Update_StartDate_Edit)
	private BaseElement Reporting_Update_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateReportingPanel.Reporting_Update_EndDate_Edit)
	private BaseElement Reporting_Update_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateReportingPanel.Reporting_Update_PackageNotes_Edit)
	private BaseElement Reporting_Update_PackageNotes_Edit;
	
	@ByAngularModel.FindBy(model=UpdateReportingPanel.Reporting_Update_LevelNotes_Edit)
	private BaseElement Reporting_Update_LevelNotes_Edit;
	
	@FindBy(xpath=UpdateReportingPanel.Reporting_Update_Update_Button_At_ReportingPanel)
	private BaseElement Reporting_Update_Update_Button_At_ReportingPanel;
	
	@FindBy(xpath=UpdateReportingPanel.Reporting_Update_AddOrUpdateButton)
	private BaseElement Reporting_Update_AddOrUpdateButton;
	
	@FindBy(xpath=UpdateReportingPanel.Reporting_Update_ReportingPanel_Table)
	private BaseElement Reporting_Update_ReportingPanel_Table;
	
	@FindBy(xpath=UpdateReportingPanel.Reporting_Update_Table_Remove_Button)
	private BaseElement Reporting_Update_Table_Remove_Button;
	
	@FindBy(xpath=UpdateReportingPanel.Reporting_Update_Table_Update_Button)
	private BaseElement Reporting_Update_Table_Update_Button;
	
	@FindBy(xpath=UpdateReportingPanel.Reporting_Update_Save_Button)
	private BaseElement Reporting_Update_Save_Button;
	
	public boolean verifyReportingPanelIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(Reporting_Update_LevelNotes_Edit.exists(5000))		
		{
			Log.info("Reporting Panel is displayed in update Mode");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectValueFromPackageList(String strPackageListValue) throws Throwable
	{
		if(!strPackageListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Reporting_Update_Package_List, strPackageListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromLevelList(String strLevelListValue) throws Throwable
	{
		if(!strLevelListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Reporting_Update_Level_List, strLevelListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoStartDateEdit(String strStartDateEditValue)	throws Throwable
	{
		if(!strStartDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Update_StartDate_Edit, strStartDateEditValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoEndDateEdit(String strEndDateEditValue)	throws Throwable
	{
		if(!strEndDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Update_EndDate_Edit, strEndDateEditValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoPackageNotesEdit(String strPackageNotesEditValue)	throws Throwable
	{
		if(!strPackageNotesEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Update_PackageNotes_Edit, strPackageNotesEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean setTextIntoLevelNotesEdit(String strLevelNotesEditValue)	throws Throwable
	{
		if(!strLevelNotesEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Update_LevelNotes_Edit, strLevelNotesEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean clickOnUpdateButtonAtReportingPanel() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Update_Update_Button_At_ReportingPanel);
	}
	
	public boolean clickOnAddOrUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Update_AddOrUpdateButton);
	}
	
	public boolean clickOnUpdateTableUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Update_Table_Update_Button);
	}
	
	public boolean clickOnUpdateTableRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Update_Table_Remove_Button);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Update_Save_Button);
	}
	
	public boolean verifyTheExistingRecordAndClickOnRequiredCheckBox(String strExistingRecord) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(Reporting_Update_ReportingPanel_Table, strExistingRecord);
	}
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
	
	
	
	
	
	
	
	
}
