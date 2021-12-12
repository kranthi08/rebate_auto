package com.project.pages;

import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;
import org.seleniumhq.jetty9.util.StringUtil;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.PaymentDetails_PaymentAdjustmentPanel;

public class PaymentDetails_PaymentAdjustmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_Link)
	private BaseElement PaymentDetails_Link;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_element)
	private BaseElement PaymentDetails_PaymentAdjustment_element;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Panel)
	private BaseElement PaymentDetails_PaymentAdjustment_Panel;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Panel_Update_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_Panel_Update_Button;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Name_Edit)
	private BaseElement PaymentDetails_PaymentAdjustment_Name_Edit;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_StartDate_Edit)
	private BaseElement PaymentDetails_PaymentAdjustment_StartDate_Edit;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_EndDate)
	private BaseElement PaymentDetails_PaymentAdjustment_EndDate;
	
	@FindBy(id=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Initial_Adjustment_Edit)
	private BaseElement PaymentDetails_PaymentAdjustment_Initial_Adjustment_Edit;
	
	@FindBy(id=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Adjustment_Type_List)
	private BaseElement PaymentDetails_PaymentAdjustment_Adjustment_Type_List;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Notes_Edit)
	private BaseElement PaymentDetails_PaymentAdjustment_Notes_Edit;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_AddOrUpdate_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_AddOrUpdate_Button;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Table)
	private BaseElement PaymentDetails_PaymentAdjustment_Table;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Table_Update_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_Table_Update_Button;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Table_Remove_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_Table_Remove_Button;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Table_ClaimDetail_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_Table_ClaimDetail_Button;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Table_ImportClaimDetail_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_Table_ImportClaimDetail_Button;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Save)
	private BaseElement PaymentDetails_PaymentAdjustment_Save;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Cancel)
	private BaseElement PaymentDetails_PaymentAdjustment_Cancel;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Choose)
	private BaseElement PaymentDetails_PaymentAdjustment_Choose;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_Upload)
	private BaseElement PaymentDetails_PaymentAdjustment_Upload;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetails_Adjustment_Claims_Label)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetails_Adjustment_Claims_Label;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetail_AdjustmentDetails)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetail_AdjustmentDetails;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_Table)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_Table;
	
	@FindBy(name=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_AllocationDate_Edit)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_AllocationDate_Edit;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_ReconcileSelectedClaims_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_ReconcileSelectedClaims_Button;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_Table)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_Table;
	
	@FindBy(name=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveAllocationDate_Edit)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveAllocationDate_Edit;
	
	@FindBy(xpath=PaymentDetails_PaymentAdjustmentPanel.PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveReconcileClaims_Button)
	private BaseElement PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveReconcileClaims_Button;
	

	// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Payment Adjustment Page methods ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public boolean clickOnPaymentDetailsLink() throws Throwable
	{
		return rxNovaCommonUtil.clickOnLink(PaymentDetails_Link);		
	}
	public boolean verifyPageNavigatedToPaymentDetailsTab()throws Throwable
	{
		return rxNovaCommonUtil.objectIsDisplayed(PaymentDetails_PaymentAdjustment_element);
	}
	
	public boolean verifyAndExpandThePaymentAdjustmentPanel(String strPanelName)throws Throwable
	{
		return rebateCommonUtil.rebate_expand_View_Panel(PaymentDetails_PaymentAdjustment_Panel, strPanelName);
	}
	
	public boolean clickOnUpdateButtonAtPaymentAdjustmentPanel() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_Panel_Update_Button);
	}
	
	public boolean setTextIntoNameEdit(String strNamesEditValue) throws Throwable
	{
		return rxNovaCommonUtil.setTextOnEdit(PaymentDetails_PaymentAdjustment_Name_Edit, strNamesEditValue);		
	}
	
	public boolean setTextIntoStartDateEdit(String strStartDateEditValue) throws Throwable
	{
		if(StringUtil.isNotBlank(strStartDateEditValue))
		{
			return rxNovaCommonUtil.setTextOnEdit(PaymentDetails_PaymentAdjustment_StartDate_Edit, strStartDateEditValue);
		}
		else
		{
			return true;
		}
	}

	public boolean setTextIntoEndDateEdit(String strEndDateEditValue) throws Throwable
	{
		if(StringUtil.isNotBlank(strEndDateEditValue))
		{
			return rxNovaCommonUtil.setTextOnEdit(PaymentDetails_PaymentAdjustment_EndDate, strEndDateEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoInitialAdjustmentEdit(String strInitialAdjustmentEditValue) throws Throwable
	{
		if(StringUtil.isNotBlank(strInitialAdjustmentEditValue)) 
		{
			return rxNovaCommonUtil.setTextOnEdit(PaymentDetails_PaymentAdjustment_Initial_Adjustment_Edit, strInitialAdjustmentEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectItemFromAdjustmentTypeList(String strAdjustmentTypeListValue) throws Throwable
	{
		if(StringUtil.isNotBlank(strAdjustmentTypeListValue))
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(PaymentDetails_PaymentAdjustment_Adjustment_Type_List, strAdjustmentTypeListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoNotesEdit(String strNotesEditValue) throws Throwable
	{
		if(StringUtil.isNotBlank(strNotesEditValue))
		{
			return rxNovaCommonUtil.setTextOnEdit(PaymentDetails_PaymentAdjustment_Notes_Edit, strNotesEditValue);
		}
		else
		{
			return true;
		}
	}
	
	
	public boolean clickOnPaymentAdjustmentAddOrUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_AddOrUpdate_Button);
	}
	
	public boolean verifyTheRecordAfterAdd(String strRecordToVerify) throws Throwable
	{
		if(StringUtil.isNotBlank(strRecordToVerify))
		{
			return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(PaymentDetails_PaymentAdjustment_Table, strRecordToVerify);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyTheAddedRecordInPaymentDetailsPaymentAdjustmentTable(String strRecordToVerify) throws Throwable
	{
		if(StringUtil.isNotBlank(strRecordToVerify))
		{
			return rebateCommonUtil.rebate_Webtable_VerifyRowData(PaymentDetails_PaymentAdjustment_Table, strRecordToVerify);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnPaymentAdjustmentTableUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_Table_Update_Button);
	}
	
	public boolean clickOnPaymentAdjustmentTableRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_Table_Remove_Button);
	}
	
	public boolean clickOnClaimDetailButton() throws Throwable
	{
		sleep(15000);
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_Table_ClaimDetail_Button);
//		FileUtils.copyFile(srcFile, destFile);
	}
	
	public boolean clickOnImportClaimDetailButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_Table_ImportClaimDetail_Button);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_Save);
	}
	
	public boolean clickOnCancelButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_Cancel);
	}
	
	public boolean clickOnMatchingCheckBox(String strExistingRecord)throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(PaymentDetails_PaymentAdjustment_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	
	public boolean waitUntilFileUploadDialogDisplay()throws Throwable
	{
		return rxNovaCommonUtil.objectIsDisplayed(PaymentDetails_PaymentAdjustment_Choose);		
	}
	
	public boolean uploadTheClaimDetailFileUsingImportClaimDetailFile(String strClaimDetailFilePath)throws Throwable
	{
		if(!strClaimDetailFilePath.isEmpty())
		{
			return rebateCommonUtil.rebate_ImportFile(PaymentDetails_PaymentAdjustment_Choose, PaymentDetails_PaymentAdjustment_Upload, strClaimDetailFilePath);
		}
		else
		{
			return true;
		}
	}
		
	public boolean verifyPageNavigatedToAdjustmentClaimsSection() throws Throwable
	{
		return rxNovaCommonUtil.objectIsDisplayed(PaymentDetails_PaymentAdjustment_ClaimDetails_Adjustment_Claims_Label);
	}
	
	// verify the adjustment claims labels data validation
	public boolean verifyAdjustmentSectionFieldLabelData(String strLabelData) throws Throwable
	{
		if(!strLabelData.isEmpty())
		{
			return rebateCommonUtil.rebate_adjustmentClaims_VerifyFieldData(PaymentDetails_PaymentAdjustment_ClaimDetail_AdjustmentDetails, strLabelData);
		}
		else
		{
			return true;
		}
	}
	
	// verify the added record in adjustment claims section
	public boolean verifyTheAddedRecordInAdjustmentClaimsTable(String strRecordToVerify) throws Throwable
	{
		if(StringUtil.isNotBlank(strRecordToVerify))
		{
			return rebateCommonUtil.rebate_Webtable_VerifyRowData(PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_Table, strRecordToVerify);
		}
		else
		{
			return true;
		}
	}
	
	// click on matching check box at adjustment claims section
	public boolean clickOnMatchingCheckBoxInAdjustmentClaimsTable(String strExistingRecord)throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	// input the date in allocation date edit box
	public boolean inpuTextIntoAdjustmentClaimsAllocationDateEdit(String strAllocationDateEditValue) throws Throwable
	{
		if(!strAllocationDateEditValue.isEmpty()) 
		{
			return rxNovaCommonUtil.setTextOnEdit(PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_AllocationDate_Edit, strAllocationDateEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAdjustmentClaimsReconcileClaimsButton()throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_ClaimDetail_Adjustment_Claims_ReconcileSelectedClaims_Button);
	}
	
	public boolean verifyTheAddedRecordInReconcileClaimsTable(String strRecordToVerify) throws Throwable
	{
		if(StringUtil.isNotBlank(strRecordToVerify))
		{
			return rebateCommonUtil.rebate_Webtable_VerifyRowData(PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_Table, strRecordToVerify);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnMatchingCheckBoxInReconcileClaimsTable(String strExistingRecord)throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	
	public boolean inpuTextIntoRemoveAllocationDateEdit(String strRemoveAllocationDateEditValue) throws Throwable
	{
		if(!strRemoveAllocationDateEditValue.isEmpty()) 
		{
			return rxNovaCommonUtil.setTextOnEdit(PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveAllocationDate_Edit, strRemoveAllocationDateEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveReconcileClaimsButton()throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_PaymentAdjustment_ClaimDetail_Reconciled_Claims_RemoveReconcileClaims_Button);
	}
	
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText)
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
	public String getSubmittedDate()
	{
		return rebateCommonUtil.rebate_ExternalFiles_GetSubmitDate();
	}
	public String getCurrentDate()
	{
		return rebateCommonUtil.rebate_getCurrentDate();
	}
	
	public String getFileName(String strLOB,String strTypeOfFile) 
	{
		return rebateCommonUtil.rebate_CopyAndRenameRebateFile(strLOB, strTypeOfFile);
	}
	
	public String getSubmitDate(String strLineOfBusiness)
	{
		return rebateCommonUtil.rebate_getSubmitDate(strLineOfBusiness);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
