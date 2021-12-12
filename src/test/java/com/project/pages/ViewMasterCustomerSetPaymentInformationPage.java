package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.MasterCustomerSetPaymentInformationPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewMasterCustomerSetPaymentInformationPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentFrequency_Table)
	private BaseElement MCSPI_PaymentFrequency_Table;
	
	@FindBy(xpath=MasterCustomerSetPaymentInformationPanel.MCSPI_PaymentHistory_Table)
	private BaseElement MCSPI_PaymentHistory_Table;
	
	public boolean verifyPaymentFrequencyDetails(String strPaymentFrequencyDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(MCSPI_PaymentFrequency_Table, strPaymentFrequencyDetails);
	}
	
	public boolean verifyPaymentHistoryDetails(String strPaymentHistoryDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(MCSPI_PaymentHistory_Table, strPaymentHistoryDetails);
	}
	
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText)
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	public String getSubmittedDate()
	{
		return rebateCommonUtil.rebate_ExternalFiles_GetSubmitDate();
	}
}
