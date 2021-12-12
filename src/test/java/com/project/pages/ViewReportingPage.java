package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewReportingPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewReportingPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewReportingPanel.Reporting_View_Update_Button)
	private BaseElement Reporting_View_Update_Button;
	
	@FindBy(xpath=ViewReportingPanel.Reporting_View_ReportingPanel_Table)
	private BaseElement Reporting_View_ReportingPanel_Table;
	
	@FindBy(xpath=ViewReportingPanel.Reporting_View_ReportingPanel)
	private BaseElement Reporting_View_ReportingPanel;
	
	public boolean clickOnReportingViewUpdateButton()	throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Reporting_View_Update_Button);
	}
	
	public boolean expand_reporting_panel(String strPanelName) throws Throwable
	{
		if(!strPanelName.isEmpty())
		{
			return rebateCommonUtil.rebate_expand_View_Panel(Reporting_View_ReportingPanel,strPanelName);
		}
		else
		{
			return false;
		}
	}
	
	
	public boolean verifyReportingTableData(String strReportingTableData)	throws Throwable
	{
		//return rebateCommonUtil.rebate_Webtable_VerifyRowData(Reporting_View_ReportingPanel_Table, strReportingTableData);
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(Reporting_View_ReportingPanel_Table, strReportingTableData);
	}
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
	
}
