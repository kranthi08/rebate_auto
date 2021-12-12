package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewAuthorizedBrandAlternativesPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewAuthorizedBrandAlternativesPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_View_Update_Button)
	private BaseElement AuthorizedBrandAlternatives_View_Update_Button;
	
	@FindBy(xpath=ViewAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_View_AuthorizedBrandAlternativesPanel)
	private BaseElement AuthorizedBrandAlternatives_View_AuthorizedBrandAlternativesPanel;
	
	@FindBy(xpath=ViewAuthorizedBrandAlternativesPanel.AuthorizedBrandAlternatives_View_ReportingDetails_Table)
	private BaseElement AuthorizedBrandAlternatives_View_ReportingDetails_Table;
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AuthorizedBrandAlternatives_View_Update_Button);
	}
	
	public boolean expandAuthorizedBrandAlternativesPanel(String strPanelName) throws Throwable
	{
		if(!strPanelName.isEmpty())
		{
			return rebateCommonUtil.rebate_expand_View_Panel(AuthorizedBrandAlternatives_View_AuthorizedBrandAlternativesPanel,strPanelName);
		}
		else
		{
			return false;
		}
	}	
	
	public boolean verifyReportingDetails(String strReportingData)	throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AuthorizedBrandAlternatives_View_ReportingDetails_Table, strReportingData);
	}	
}
