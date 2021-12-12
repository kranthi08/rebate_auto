package com.project.actors;

import java.util.List;

import org.seleniumhq.jetty9.util.StringUtil;

import com.project.common.util.RebateCommonUtil;
import com.project.pages.CustomerContractsPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;


public class ActorCustomerContractsPage 
{
	@Steps
	CustomerContractsPage customercontractsPage;
	
	
	@Step
	public void verifyUserIsInCustomerContractPage() throws Throwable
	{
		customercontractsPage.verifyCustomerContractPageIsDisplayed();
	}
	
	@Step
	public void clickOnNewButtonInCustomerContractsPage() throws Throwable
	{
		customercontractsPage.clickOnNewButton();
	}
	
	@Step
	public void performSearchInCustomerContractsPage(DataTable strSearchValues)	throws Throwable
	{
		List<List<String>> strSearchDetails = strSearchValues.raw();
		
		String strSearchBy = strSearchDetails.get(1).get(0);
		String strSearchByCustomerID = strSearchDetails.get(1).get(1);
		String strSearchByContractID = strSearchDetails.get(1).get(2);
		String strSearchByContractName = strSearchDetails.get(1).get(3);
		if(StringUtil.isBlank(strSearchByContractID))
		{
			strSearchByContractID = RebateCommonUtil.CONTRACT_ID;
		}
		else
		{
			RebateCommonUtil.CONTRACT_ID = strSearchByContractID;
		}
		
		if(StringUtil.isBlank(strSearchByContractName))
		{
			strSearchByContractName = RebateCommonUtil.CONTRACT_NAME;
		}
			
		switch(strSearchBy.toLowerCase())
		{
			case "customer id":
					customercontractsPage.searchByCustomerID_RadioButton_Selection();
					customercontractsPage.setTextIntoSearchEdit(strSearchByCustomerID);
					customercontractsPage.verifyAndClickOnNavigationLinkInSearchResultsTable(strSearchByContractID);
					break;
			case "contract id":
					customercontractsPage.searchByContractID_RadioButton_Selection();
					customercontractsPage.setTextIntoSearchEdit(strSearchByContractID);
					break;
			case "contract name":
					customercontractsPage.searchByContractName_RadioButton_Selection();
					customercontractsPage.setTextIntoSearchEdit(strSearchByContractName);
					break;
		}
	}		
	
	@Step
	public void clickOnFileAdminLink()	throws Throwable
	{
		customercontractsPage.clickOnFileAdmin_Link();
	}
	
	@Step
	public void clickOnMasterCustomerSetAbbreviationLink()throws Throwable
	{
		customercontractsPage.clickOnMCSAbbreviation_Link();
	}
		
		
		
		
		
		
		

}
