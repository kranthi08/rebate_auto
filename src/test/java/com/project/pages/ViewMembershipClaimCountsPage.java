package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewMembershipClaimCountsPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewMembershipClaimCountsPage extends BasePage 
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewMembershipClaimCountsPanel.MembershipClaimCounts_View_Update_Button)
	private BaseElement MembershipClaimCounts_View_Update_Button;
	
	@FindBy(xpath=ViewMembershipClaimCountsPanel.MembershipClaimCounts_View_MembershipClaimCountsPanel_Table)
	private BaseElement MembershipClaimCounts_View_MembershipClaimCountsPanel_Table;
	
	@FindBy(xpath=ViewMembershipClaimCountsPanel.MembershipClaimCounts_View_MembershipClaimCountsPanel)
	private BaseElement MembershipClaimCounts_View_MembershipClaimCountsPanel;
	
	public boolean clickOnMembershipClaimCountsViewUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(MembershipClaimCounts_View_Update_Button);
	}
	
	public boolean expand_MembershipClaimCounts_panel(String strPanelName) throws Throwable
	{
		if(!strPanelName.isEmpty())
		{
			return rebateCommonUtil.rebate_expand_View_Panel(MembershipClaimCounts_View_MembershipClaimCountsPanel,strPanelName);
		}
		else
		{
			return false;
		}
	}
	
	public boolean verifyMembershipClaimCountsTableData(String strReportingTableData)	throws Throwable
	{
		//return rebateCommonUtil.rebate_Webtable_VerifyRowData(MembershipClaimCounts_View_MembershipClaimCountsPanel, strReportingTableData);
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(MembershipClaimCounts_View_MembershipClaimCountsPanel_Table, strReportingTableData);
	}
	
	
}
