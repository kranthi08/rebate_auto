package com.project.pages;

import org.openqa.selenium.By;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import com.project.locators.Rebate.FileAdminPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class FileAdminSearchAndViewPage extends BasePage 
{	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=FileAdminPage.FileAdmin_Home_MasterCustomerSet_List)
	private BaseElement FileAdmin_Home_MasterCustomerSet_List;
	
	@ByAngularModel.FindBy(model=FileAdminPage.FileAdmin_Home_FileType_List)
	private BaseElement FileAdmin_Home_FileType_List;
	
	@ByAngularModel.FindBy(model=FileAdminPage.FileAdmin_Home_Status_List)
	private BaseElement FileAdmin_Home_Status_List;
	
	@ByAngularModel.FindBy(model=FileAdminPage.FileAdmin_Home_FromDate_Edit)
	private BaseElement FileAdmin_Home_FromDate_Edit;
	
	@ByAngularModel.FindBy(model=FileAdminPage.FileAdmin_Home_ToDate_Edit)
	private BaseElement FileAdmin_Home_ToDate_Edit;
	
	@FindBy(xpath=FileAdminPage.FileAdmin_Home_Search_Button)
	private BaseElement FileAdmin_Home_Search_Button;
	
	@FindBy(xpath=FileAdminPage.FileAdmin_Home_Search_Results_Table)
	private BaseElement FileAdmin_Home_Search_Results_Table;
	
	@FindBy(xpath=FileAdminPage.FileAdmin_Home_Search_Results_Table_NoRecords)
	private BaseElement FileAdmin_Home_Search_Results_Table_NoRecords;
	
	@FindBy(xpath=FileAdminPage.FileAdmin_Browse_Error_Details_Title)
	private BaseElement FileAdmin_Browse_Error_Details_Title;
	
	@FindBy(xpath=FileAdminPage.FileAdmin_Browse_Error_Details_Dialog_Body)
	private BaseElement FileAdmin_Browse_Error_Details_Dialog_Body;
	
	@FindBy(xpath=FileAdminPage.FileAdmin_Browse_Error_Details_Dialog)
	private BaseElement FileAdmin_Browse_Error_Details_Dialog;
	
	@FindBy(xpath=FileAdminPage.FileAdmin_Browse_Error_Details_Dialog_Close_Button)
	private BaseElement FileAdmin_Browse_Error_Details_Dialog_Close_Button;
	
	public boolean verifyPageNavigatedToFileAdminTab()	throws Throwable
	{				
		if(FileAdmin_Home_FileType_List.exists(1000))
		{
			Log.info(" Page Navigated to File Admin Tab");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean selectValueFromMasterCustomerSetList(String strMasterCustomerSetListValue) throws Throwable
	{				
		boolean isItemSelected = false;
		if(!strMasterCustomerSetListValue.isEmpty()) 
		{
			try
			{
				if(FileAdmin_Home_MasterCustomerSet_List.exists(2000))
				{
					FileAdmin_Home_MasterCustomerSet_List.waitUntilClickable().click();						
					String strXpath1 = "//*[@id='ui-select-choices-0']//child::*/span[text()='";
					String strXpath2 = strMasterCustomerSetListValue+"']";
					String strXpath = strXpath1 + strXpath2;					
					getDriver().findElement(By.xpath(strXpath)).click();
					getNgDriver().waitForAngularRequestsToFinish();
					sleep(1000);
					isItemSelected = true;
				}
				else
				{
					isItemSelected =  false;
				}
			}
			catch(Exception e)
			{
				sleep(1000);
			}
		}
		else
		{
			return true;
		}
		return isItemSelected;
	}
	
	public boolean selectValueFromFileTypeList(String strFileTypeListValue) throws Throwable
	{
		boolean result = false;
		if(!strFileTypeListValue.isEmpty()) 		
		{
			String actFileType = FileAdmin_Home_FileType_List.getSelectedVisibleTextValue().trim();
			if(!actFileType.equalsIgnoreCase(strFileTypeListValue)) 
			{
				result = rebateCommonUtil.rebate_SelectFromDropdownUsingText(FileAdmin_Home_FileType_List,strFileTypeListValue);
			}
		}
		else
		{
			return true;
		}
		return result;
	}
	
	public boolean selectValueFromStatusList(String strStatusListValue) throws Throwable
	{
		boolean result = false;
		if(!strStatusListValue.isEmpty())
		{
			String actStatus = FileAdmin_Home_FileType_List.getSelectedVisibleTextValue().trim();
			if(!actStatus.equalsIgnoreCase(strStatusListValue)) 
			{
				result = rebateCommonUtil.rebate_SelectFromDropdownUsingText(FileAdmin_Home_Status_List,strStatusListValue);
			}
		}
		else
		{
			return true;
		}
		return result;
	}
	
	public boolean setTextIntoFromDateEdit(String strFromDateEditValue) throws Throwable
	{
		boolean result = false;
		if(!strFromDateEditValue.isEmpty()) 
		{
			String strValue = FileAdmin_Home_FromDate_Edit.getTextValue();
			if(!strFromDateEditValue.equalsIgnoreCase(strValue))
			{
				result =  rxNovaCommonUtil.setTextOnEdit(FileAdmin_Home_FromDate_Edit, strFromDateEditValue);
			}
		}
		else
		{
			return true;
		}
		return result;
	}
	
	public boolean setTextIntoToDateEdit(String strToDateEditValue) throws Throwable
	{
		boolean result = false;
		if(!strToDateEditValue.isEmpty()) 
		{
			String strValue = FileAdmin_Home_ToDate_Edit.getTextValue();
			if(!strToDateEditValue.equalsIgnoreCase(strValue))
			{
				result = rebateCommonUtil.rebate_SetTextOnEdit(FileAdmin_Home_ToDate_Edit, strToDateEditValue);
			}
		}
		else
		{
			return true;
		}
		return result;
	}
	
	public boolean clickOnSearchButton() throws Throwable
	{			
			return rxNovaCommonUtil.clickOnButton(FileAdmin_Home_Search_Button);	
	}
	
	public boolean verifyFileAdminSearchResultsTableData(String fileAdminSearchResultsTableData) throws Throwable	
	{
		if(!fileAdminSearchResultsTableData.isEmpty())
		{
			//return rebateCommonUtil.rebate_Webtable_VerifyRowData(FileAdmin_Home_Search_Results_Table, fileAdminSearchResultsTableData);
			return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(FileAdmin_Home_Search_Results_Table, fileAdminSearchResultsTableData);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyAndClickOnFailedAndErrorDetailsLink(String strFailedAndErrorDetails)	throws Throwable
	{
		if(!strFailedAndErrorDetails.isEmpty())
		{
			//return rebateCommonUtil.rebate_Webtable_ClickOnLink(FileAdmin_Home_Search_Results_Table, strFailedAndErrorDetails);
			return rebateCommonUtil.rebate_fileAdmin_Webtable_ClickOnLink(FileAdmin_Home_Search_Results_Table, strFailedAndErrorDetails);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyFileAdminBrowseErrorDetailsDialogMCSData(String strMCSData) throws Throwable
	{
		if(!strMCSData.isEmpty()) 
		{
			return rebateCommonUtil.rebate_Error_Details_VerifyMCSDetails(FileAdmin_Browse_Error_Details_Dialog_Body, strMCSData);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyFileAdminBrowseErrorDetailsDialogClaimsTableData(String strErrorDetailsTableData)	throws Throwable 
	{
		if(!strErrorDetailsTableData.isEmpty())
		{
			return rebateCommonUtil.rebate_Error_Details_Webtable_VerifyRowData(FileAdmin_Browse_Error_Details_Dialog,strErrorDetailsTableData);
		}
		else
		{
			return false;
		}
	}
	
	public boolean clickOn_FileAdmin_BrowseErrorDetails_Dialog_CloseButton()	throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(FileAdmin_Browse_Error_Details_Dialog_Close_Button);
	}
	
	public boolean uploadFileStatusVerification(String strMatchingRecord,String strStatus) throws Throwable
	{
		return rebateCommonUtil.rebate_fileAdmin_Webtable_UploadedFileStatusVerification(FileAdmin_Home_Search_Results_Table,FileAdmin_Home_Search_Button,strMatchingRecord,strStatus);
	}

}
