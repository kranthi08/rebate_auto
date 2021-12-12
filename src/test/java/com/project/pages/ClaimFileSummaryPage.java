package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;
import com.project.locators.Rebate.ClaimFileSummaryTab;

public class ClaimFileSummaryPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ClaimFileSummaryTab.ClaimFileSummary_Link)
	private BaseElement ClaimFileSummary_Link;
	
	@FindBy(xpath=ClaimFileSummaryTab.ClaimFileSummary_ClaimFileSummary_Element)
	private BaseElement ClaimFileSummary_ClaimFileSummary_Element;
	
	@FindBy(xpath=ClaimFileSummaryTab.ClaimFileSummary_ClaimFileSummary_Panel)
	private BaseElement ClaimFileSummary_ClaimFileSummary_Panel;
	
	@FindBy(xpath=ClaimFileSummaryTab.ClaimFileSummary_RunPreliminaryExtract_Button)
	private BaseElement ClaimFileSummary_RunPreliminaryExtract_Button;
	
	@FindBy(id=ClaimFileSummaryTab.ClaimFileSummary_Refresh_Button)
	private BaseElement ClaimFileSummary_Refresh_Button;
	
	@FindBy(xpath=ClaimFileSummaryTab.ClaimFileSummary_Preliminary_Results)
	private BaseElement ClaimFileSummary_Preliminary_Results;
	
	
	// Methods
	public boolean clickOnClaimFileSummaryTabLink() throws Throwable
	{
		return rxNovaCommonUtil.clickOnLink(ClaimFileSummary_Link);
	}
	
	public boolean verifyClaimFileSummaryTabDisplayedOrNot()throws Throwable
	{
		return rxNovaCommonUtil.objectIsDisplayed(ClaimFileSummary_ClaimFileSummary_Element);
	}
	public boolean verifyAndExpandThePanel(String strPanelName)throws Throwable
	{
		if(!strPanelName.isEmpty())
		{
			return rebateCommonUtil.rebate_expand_View_Panel(ClaimFileSummary_ClaimFileSummary_Panel, strPanelName);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnRunPreliminaryExtractButton()	throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ClaimFileSummary_RunPreliminaryExtract_Button);
	}
	
	public boolean verifyRunPreliminaryExtractStatus(String strStatus) throws Throwable
	{
		return rebateCommonUtil.rebate_ClaimFileSummary_PrilimExtractionStatusVerification(ClaimFileSummary_Refresh_Button, strStatus);
	}
	
	public boolean verifyPreliminaryExtractionsResults(String strExtractionResult) throws Throwable
	{
		return rebateCommonUtil.rebate_VerifyPreliminaryClaimFileDetails(ClaimFileSummary_Preliminary_Results, strExtractionResult);
	}
	
	public String getClaimFileSummaryTabDateFormat() throws Throwable
	{
		return rebateCommonUtil.rebateGenerateClaimFileSummaryDateFormat();
	}
	
	public boolean verifyClaimFileSummaryTabPreliminaryResultDateFormat(String strClaimFileSummaryDateFormat) throws Throwable
	{
		return rebateCommonUtil.rebate_VerifyPreliminaryClaimFileDateFormat(ClaimFileSummary_Preliminary_Results, strClaimFileSummaryDateFormat);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
