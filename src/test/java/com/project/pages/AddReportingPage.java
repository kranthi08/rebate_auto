package com.project.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddReportingPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class AddReportingPage extends BasePage
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
	
	public boolean verifyReportingPanelIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(Reporting_Add_PackageNotes_Edit.exists(1000))		
		{
			Log.info("Reporting Panel is displayed");
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Reporting_Add_Package_List, strPackageListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Reporting_Add_Level_List, strLevelListValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Add_StartDate_Edit, strStartDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Add_EndDate_Edit, strEndDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Add_PackageNotes_Edit, strPackageNotesEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(Reporting_Add_LevelNotes_Edit, strLevelNotesEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Add_Add_Button);
	}
	
	public boolean clickOnNextButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Add_Next_Button);
	}
	
	public boolean clickOnPreviousButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Add_Previous_Button);
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Add_Remove_Button);
	}
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_Add_Update_Button);
	}
	
	public boolean veifyReportingTableData(String strExpectedValue) throws Throwable
	{
		boolean blnMatched = false;
		if(Reporting_Add_ReportingPanel_Table.exists(3000))
		{
			List<WebElement> rows = null;
			List<WebElement> cols = null;
			
			WebElement objTblBody = Reporting_Add_ReportingPanel_Table.findElement(By.tagName("tbody"));
			rows = objTblBody.findElements(By.tagName("tr"));
			if(rows.size()==1)
			{
				cols = rows.get(0).findElements(By.tagName("td"));
				if(cols.size()>1)
				{
					String strValue1 = cols.get(1).getText();
					String strValue2 = cols.get(2).getText();
					
					String strActualValue = strValue1+"^"+strValue2;
					if(strExpectedValue.equals(strActualValue))
					{
						Log.info("Record Added");
						blnMatched = true;
					}
				}
			}
			else
			{
				for(int i=0;i<rows.size();i++)
				{
					cols = rows.get(i).findElements(By.tagName("td"));
					
					String strValue1 = cols.get(i+1).getText();
					String strValue2 = cols.get(i+2).getText();
					String strActualValue = strValue1+"^"+strValue2;
					if(strExpectedValue.equals(strActualValue))
					{
						Log.info("Record Added");
						blnMatched = true;
						break;
					}
					
				}
			}
		}
		return blnMatched;
	}
	
	public boolean verifyAndClickOnTheCheckBoxInReportingPanelTable(String strExistingRecord) throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(Reporting_Add_ReportingPanel_Table, strExistingRecord);
		}
		else
		{
			return false;
		}
	}
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}

}
