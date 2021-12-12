package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.MasterCustomerSetAbbreviationPage;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class MCSAbbreviationUpdateAndRemovePage extends BasePage 
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_MCSAbbreviation_Label)
	private BaseElement MasterCustomerSetAbbreviation_MCSAbbreviation_Label;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_Home_MCS_Search_Table)
	private BaseElement MasterCustomerSetAbbreviation_Home_MCS_Search_Table;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_Home_Update_Button)
	private BaseElement MasterCustomerSetAbbreviation_Home_Update_Button;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_AddorUpdate_Button)
	private BaseElement MasterCustomerSetAbbreviation_AddorUpdate_Button;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_Save_Button)
	private BaseElement MasterCustomerSetAbbreviation_Save_Button;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_Cancel_Button)
	private BaseElement MasterCustomerSetAbbreviation_Cancel_Button;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_Update_Button)
	private BaseElement MasterCustomerSetAbbreviation_Update_Button;
	
	@FindBy(xpath=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_Remove_Button)
	private BaseElement MasterCustomerSetAbbreviation_Remove_Button;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_MasterCustomerSet_List)
	private BaseElement MasterCustomerSetAbbreviation_MasterCustomerSet_List;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetAbbreviationPage.MasterCustomerSetAbbreviation_Master_Abbreviation_Edit)
	private BaseElement MasterCustomerSetAbbreviation_Master_Abbreviation_Edit;
	
	public boolean verifyMCSAbbreviationPageDisplay()
	{
		boolean isPageDisplayed = false;
		int attempts = 0;
		while(attempts < 3)
		{
			try
			{
				if(MasterCustomerSetAbbreviation_MCSAbbreviation_Label.exists(1000))
				{
					isPageDisplayed = true;
					Log.info("Master Customer Set Abbreviation Page is displaying" );
					break;
				}
			}
			catch(Exception e)
			{
				Log.info("Exception Occured - Required Page is not displaying");
			}
			attempts++;
		}
		if(isPageDisplayed==false)
		{
			Log.info(" MasterCustomerSetAbbreviation_MCSAbbreviation_Label is not displaying ");
		}
		return isPageDisplayed;
	}
	
	public boolean verifyTheRequiredMCSAvailableInTable(String strMatchingVales) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(MasterCustomerSetAbbreviation_Home_MCS_Search_Table, strMatchingVales);
	}
	
	public boolean clickOnMCSAbbreviationHomeUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MasterCustomerSetAbbreviation_Home_Update_Button);
	}
	
	public boolean clickOnMCSAbbreviationAddorUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MasterCustomerSetAbbreviation_AddorUpdate_Button);
	}
	
	public boolean clickOnMCSAbbreviationSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MasterCustomerSetAbbreviation_Save_Button);
	}
	
	public boolean clickOnMCSAbbreviationCancelButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MasterCustomerSetAbbreviation_Cancel_Button);
	}
	
	public boolean clickOnMCSAbbreviationRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MasterCustomerSetAbbreviation_Remove_Button);
	}
	
	public boolean clickOnMCSAbbreviationUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MasterCustomerSetAbbreviation_Update_Button);
	}
	
	public boolean selectItemFromMCSAbbreviation_MasterCustomerSet_List(String strmcsListValue)throws Throwable 
	{
		return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MasterCustomerSetAbbreviation_MasterCustomerSet_List, strmcsListValue);
	}
	
	public boolean setTextIntoMCSAbbriviation(String mcsAbbriviationEditValue) throws Throwable
	{
		return rxNovaCommonUtil.setTextOnEdit(MasterCustomerSetAbbreviation_Master_Abbreviation_Edit, mcsAbbriviationEditValue);
	}
	
	public boolean clickOnRequiredMatchingCheckBox(String strExistingRecord) throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(MasterCustomerSetAbbreviation_Home_MCS_Search_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
