package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.MasterCustomerSetPaymentInformationPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class UpdateMasterCustomerSetPaymentInformationPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.PaymentDetails_Tab)
	private BaseElement PaymentDetails_Tab;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_Update_Button)
	private BaseElement MCSPI_Update_Button;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_MasterCustomerSetPaymentInformationPanel)
	private BaseElement MCSPI_MasterCustomerSetPaymentInformationPanel;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_Frequency_List)
	private BaseElement MCSPI_PaymentFrequency_Frequency_List;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_StartDate_Edit)
	private BaseElement MCSPI_PaymentFrequency_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_EndDate_Edit)
	private BaseElement MCSPI_PaymentFrequency_EndDate_Edit;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_Notes_Edit)
	private BaseElement MCSPI_PaymentFrequency_Notes_Edit;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_Add_Button)
	private BaseElement MCSPI_PaymentFrequency_Add_Button;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_Table)
	private BaseElement MCSPI_PaymentFrequency_Table;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_Remove_Button)
	private BaseElement MCSPI_PaymentFrequency_Remove_Button;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_Update_Button)
	private BaseElement MCSPI_PaymentFrequency_Update_Button;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Date_Edit)
	private BaseElement MCSPI_PaymentHistory_Date_Edit;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Amount_Edit)
	private BaseElement MCSPI_PaymentHistory_Amount_Edit;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Payee_List)
	private BaseElement MCSPI_PaymentHistory_Payee_List;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_PaymentType_List)
	private BaseElement MCSPI_PaymentHistory_PaymentType_List;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Channel_List)
	private BaseElement MCSPI_PaymentHistory_Channel_List;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_SubmitDate_Edit)
	private BaseElement MCSPI_PaymentHistory_SubmitDate_Edit;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_PaymentIdentifier_Edit)
	private BaseElement MCSPI_PaymentHistory_PaymentIdentifier_Edit;
	
	@ByAngularModel.FindBy(model=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_CustomerID_List)
	private BaseElement MCSPI_PaymentHistory_CustomerID_List;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Notes_Edit)
	private BaseElement MCSPI_PaymentHistory_Notes_Edit;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Add_Button)
	private BaseElement MCSPI_PaymentHistory_Add_Button;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Table)
	private BaseElement MCSPI_PaymentHistory_Table;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Remove_Button)
	private BaseElement MCSPI_PaymentHistory_Remove_Button;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Update_Button)
	private BaseElement MCSPI_PaymentHistory_Update_Button;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_Save_Button)
	private BaseElement MCSPI_Save_Button;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_Cancel_Button)
	private BaseElement MCSPI_Cancel_Button;

	
	public boolean clickOnPaymentDetailsTab() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(PaymentDetails_Tab);
	}
	
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
	public String getTheSubmittedDate()throws Throwable
	{
		return rebateCommonUtil.rebate_ExternalFiles_GetSubmitDate();
	}
	
	public boolean verifyPaymentDetailsTabIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(MCSPI_Update_Button.exists(5000))		
		{
			Log.info("Payment Details Tab is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean expandMasterCustomerSetPaymentInformationPanel(String strPanelName) throws Throwable
	{
		if(!strPanelName.isEmpty())
		{
			return rebateCommonUtil.rebate_expand_View_Panel(MCSPI_MasterCustomerSetPaymentInformationPanel,strPanelName);
		}
		else
		{
			return false;
		}
	}
	
	public boolean clickOnMCSPIUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_Update_Button);
	}
	
	public boolean verifyMasterCustomerSetPaymentInformationIsDisplayed() throws Throwable
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(MCSPI_PaymentFrequency_Frequency_List.exists(5000))		
		{
			Log.info("Master Customer Set Payment Information is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectPaymentFrequency(String strPaymentFrequency) throws Throwable
	{
		if(!strPaymentFrequency.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MCSPI_PaymentFrequency_Frequency_List, strPaymentFrequency);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setPaymentFrequencyStartDate(String strPaymentFrequencyStartDate)	throws Throwable
	{
		if(!strPaymentFrequencyStartDate.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentFrequency_StartDate_Edit, strPaymentFrequencyStartDate);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setPaymentFrequencyEndDate(String strPaymentFrequencyEndDate)	throws Throwable
	{
		if(!strPaymentFrequencyEndDate.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentFrequency_EndDate_Edit, strPaymentFrequencyEndDate);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setPaymentFrequencyNotes(String strPaymentFrequencyNotes)	throws Throwable
	{
		if(!strPaymentFrequencyNotes.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentFrequency_Notes_Edit, strPaymentFrequencyNotes);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnPaymentFrequencyAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_PaymentFrequency_Add_Button);
	}
	
	public boolean updateSelectedPaymentFrequency(String strSelectedPaymentFrequency) throws Throwable
	{
		if(!strSelectedPaymentFrequency.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(MCSPI_PaymentFrequency_Table, strSelectedPaymentFrequency);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnPaymentFrequencyRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_PaymentFrequency_Remove_Button);
	}
	
	public boolean clickOnPaymentFrequencyUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_PaymentFrequency_Update_Button);
	}
	
	public boolean verifyPaymentFrequencyDetails(String strPaymentFrequencyDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(MCSPI_PaymentFrequency_Table, strPaymentFrequencyDetails);
	}
	
	public boolean setPaymentHistoryDate(String strPaymentHistoryDate)	throws Throwable
	{
		if(!strPaymentHistoryDate.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentHistory_Date_Edit, strPaymentHistoryDate);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setPaymentHistoryAmount(String strPaymentHistoryAmount)	throws Throwable
	{
		if(!strPaymentHistoryAmount.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentHistory_Amount_Edit, strPaymentHistoryAmount);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectPaymentHistoryPayee(String strPaymentHistoryPayee) throws Throwable
	{
		if(!strPaymentHistoryPayee.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MCSPI_PaymentHistory_Payee_List, strPaymentHistoryPayee);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectPaymentHistoryPaymentType(String strPaymentHistoryPaymentType) throws Throwable
	{
		if(!strPaymentHistoryPaymentType.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MCSPI_PaymentHistory_PaymentType_List, strPaymentHistoryPaymentType);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectPaymentHistoryChannel(String strPaymentHistoryChannel) throws Throwable
	{
		if(!strPaymentHistoryChannel.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MCSPI_PaymentHistory_Channel_List, strPaymentHistoryChannel);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setPaymentHistorySubmitDate(String strPaymentHistorySubmitDate)	throws Throwable
	{
		if(!strPaymentHistorySubmitDate.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentHistory_SubmitDate_Edit, strPaymentHistorySubmitDate);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setPaymentHistoryPaymentIdentifier(String strPaymentHistoryPaymentIdentifier)	throws Throwable
	{
		if(!strPaymentHistoryPaymentIdentifier.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentHistory_PaymentIdentifier_Edit, strPaymentHistoryPaymentIdentifier);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectPaymentHistoryCustomerID(String strPaymentHistoryCustomerID)	throws Throwable
	{
		if(!strPaymentHistoryCustomerID.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(MCSPI_PaymentHistory_CustomerID_List, strPaymentHistoryCustomerID);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setPaymentHistoryNotes(String strPaymentHistoryNotes)	throws Throwable
	{
		if(!strPaymentHistoryNotes.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(MCSPI_PaymentHistory_Notes_Edit, strPaymentHistoryNotes);
		}
		else
		{
			return true;
		}
	}
	

	public boolean clickOnPaymentHistoryAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_PaymentHistory_Add_Button);
	}
	
	public boolean updateSelectedPaymentHistory(String strSelectedPaymentHistory) throws Throwable
	{
		if(!strSelectedPaymentHistory.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(MCSPI_PaymentHistory_Table, strSelectedPaymentHistory);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnPaymentHistoryRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_PaymentHistory_Remove_Button);
	}
	
	public boolean clickOnPaymentHistoryUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_PaymentHistory_Update_Button);
	}
	
	public boolean verifyPaymentHistoryDetails(String strPaymentHistoryDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(MCSPI_PaymentHistory_Table, strPaymentHistoryDetails);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_Save_Button);
	}
	
	public boolean clickOnCancelButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MCSPI_Cancel_Button);
	}
}
