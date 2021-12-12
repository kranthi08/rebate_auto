package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;
import com.project.locators.Rebate.BenefitFileSummaryTab;

public class BenefitFileSummaryPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=BenefitFileSummaryTab.BenefitFileSummary_Link)
	private BaseElement BenefitFileSummary_Link;
	
	@FindBy(xpath=BenefitFileSummaryTab.BenefitFileSummary_Preliminary_Benefit_File_Element)
	private BaseElement BenefitFileSummary_Preliminary_Benefit_File_Element;
	
	@FindBy(xpath=BenefitFileSummaryTab.BenefitFileSummary_Preliminary_Benefit_File_Panel)
	private BaseElement BenefitFileSummary_Preliminary_Benefit_File_Panel;
	
	@FindBy(id=BenefitFileSummaryTab.BenefitFileSummary_Contract_Line_Of_Business_List)
	private BaseElement BenefitFileSummary_Contract_Line_Of_Business_List;
	
	@FindBy(xpath=BenefitFileSummaryTab.BenefitFileSummary_RunPreliminaryExtract_Button)
	private BaseElement BenefitFileSummary_RunPreliminaryExtract_Button;
	
	@FindBy(xpath=BenefitFileSummaryTab.BenefitFileSummary_Refresh_Button)
	private BaseElement BenefitFileSummary_Refresh_Button;
	
	@FindBy(xpath=BenefitFileSummaryTab.BenefitFileSummary_Preliminary_Results)
	private BaseElement BenefitFileSummary_Preliminary_Results;
	
	@FindBy(xpath=BenefitFileSummaryTab.BenefitFileSummary_Final_Results)
	private BaseElement BenefitFileSummary_Final_Results;
	
	public boolean clickOnBenefitFileSummaryTabLink() throws Throwable
	{
		return rxNovaCommonUtil.clickOnLink(BenefitFileSummary_Link);
	}
	
	public boolean BenefitFileSummaryTabShouldBeDisplayed() throws Throwable
	{
		return rxNovaCommonUtil.objectIsDisplayed(BenefitFileSummary_Preliminary_Benefit_File_Element);
	}
	
	public boolean UserIsInBenefitFileSummaryTab() throws Throwable
	{
		return rxNovaCommonUtil.objectIsDisplayed(BenefitFileSummary_Preliminary_Benefit_File_Element);
	}
	
	public boolean verifyAndExpandThePanel(String strPanelName) throws Throwable
	{
		if(!strPanelName.isEmpty())
		{
			return rebateCommonUtil.rebate_expand_View_Panel(BenefitFileSummary_Preliminary_Benefit_File_Panel, strPanelName);
		}
		else
		{
			return true;
		}
	}
		
	public boolean selectTheLineOfBusiness(String strLineOfBusiness) throws Throwable
	{		
		if(!strLineOfBusiness.isEmpty())
		{			
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(BenefitFileSummary_Contract_Line_Of_Business_List, strLineOfBusiness);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRunPreliminaryExtractButton()	throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(BenefitFileSummary_RunPreliminaryExtract_Button);
	}
	
	public boolean verifyRunPreliminaryExtractStatus(String strStatus) throws Throwable
	{
		return rebateCommonUtil.rebate_BenefitFileSummary_PrilimExtractionStatusVerification(BenefitFileSummary_Refresh_Button, strStatus);
	}
	
	public boolean verifyPreliminaryExtractionsResults(String strpreliminaryExtractionResult) throws Throwable
	{
		return rebateCommonUtil.rebate_VerifyPreliminaryFileDetails(BenefitFileSummary_Preliminary_Results, strpreliminaryExtractionResult);
	}
	
	public boolean verifyFinalExtractionsResults(String strFinalExtractionResult) throws Throwable
	{
		return rebateCommonUtil.rebate_VerifyPreliminaryFileDetails(BenefitFileSummary_Preliminary_Results, strFinalExtractionResult);
	}
	
	public String verifyPreliminaryBenefitFileSummaryTabDateFormat() throws Throwable
	{
		return rebateCommonUtil.rebate_GenerateBenefitFileSummaryTabDateFormat();
	}
	
	public String getBenefitFileTabProcessDate()
	{
		return rebateCommonUtil.rebate_getCurrentDate();
	}
	
	public boolean verifyBenefitFileSummaryTabPreliminaryResultDateFormat(String strBenefitFileSummaryDateFormat) throws Throwable
	{
		return rebateCommonUtil.rebate_VerifyPreliminaryClaimFileDateFormat(BenefitFileSummary_Preliminary_Results, strBenefitFileSummaryDateFormat);
	}
	
		
}
