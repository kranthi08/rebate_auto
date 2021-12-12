package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.StringUtil;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.CustomerContracts;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class CustomerContractsPage  extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(id=CustomerContracts.CustomerContracts_New_Button)
	private BaseElement CustomerContracts_New_Button;
	
	@FindBy(xpath=CustomerContracts.CustomerContracts_Search_Form)
	private BaseElement CustomerContracts_Search_Form;
	
	@ByAngularModel.FindBy(model=CustomerContracts.CustomerContracts_Search_Edit)
	private BaseElement CustomerContracts_Search_Edit;
	
	@FindBy(linkText=CustomerContracts.CustomerContracts_MCSAbbreviation_Link)
	private BaseElement CustomerContracts_MCSAbbreviation_Link;
	
	@FindBy(linkText=CustomerContracts.CustomerContracts_FileAdmin_Link)
	private BaseElement CustomerContracts_FileAdmin_Link;
	
	@FindBy(linkText=CustomerContracts.CustomerContracts_ExternalFiles_Link)
	private BaseElement CustomerContracts_ExternalFiles_Link;
	
	@FindBy(linkText=CustomerContracts.CustomerContracts_AuthorizedBrandAlternatives_Link)
	private BaseElement CustomerContracts_AuthorizedBrandAlternatives_Link;
	
	@FindBy(xpath=CustomerContracts.CustomerContracts_SearchResultsTable)
	private BaseElement CustomerContracts_SearchResultsTable;
	
	public boolean verifyCustomerContractPageIsDisplayed() throws Throwable 
	{		
		boolean isPageDisplayed = false;
		//WebDriverWait wt = new WebDriverWait(getDriver(), 90);
		//wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("newBtn")));
		
		if(CustomerContracts_New_Button.exists(5000))		
		{
			Log.info("Customer Contract Page displayed");
			isPageDisplayed = true;
		}
		else
		{
			Log.info("Customer Contracts Page is not displaying - Hence script is going to refresh the page");
			getDriver().navigate().refresh();
			sleep(1000);
			try
			{
				getNgDriver().waitForAngularRequestsToFinish();
			}
			catch(Exception e)
			{
				sleep(2000);
			}
			int cnt = 0;
		    while (cnt < 600) 
		    {
				try 
				{
				    getDriver().switchTo().defaultContent();
				    getDriver().switchTo().frame(0);
				    break;
				} catch (NoSuchFrameException e) 
				{
				    cnt += 200;
				    Log.info("Exception was occured Hence waiting for page to load ...");
				    sleep(2000);
				    continue;
				}
		    }
		    if(CustomerContracts_New_Button.exists())
		    {
		    	Log.info("Customer Contracts New Button is Displaying");
		    	isPageDisplayed = true;
		    }
		}
		return isPageDisplayed;
	}
	
	public boolean clickOnNewButton() throws Throwable
	{			
		boolean blnResult = false;
		if(CustomerContracts_New_Button.exists(2000)) 
		{
			blnResult = rxNovaCommonUtil.clickOnButton(CustomerContracts_New_Button);
			sleep(3000);
		}
		return blnResult;
	}
	
	public boolean searchByCustomerID_RadioButton_Selection() throws Throwable
	{
		return rebateCommonUtil.rebate_ClickOnRadioButton(CustomerContracts_Search_Form,"Search by customer ID");
	}
	
	public boolean searchByContractID_RadioButton_Selection() throws Throwable
	{
		return rebateCommonUtil.rebate_ClickOnRadioButton(CustomerContracts_Search_Form,"Search by contract ID");
	}
	
	public boolean searchByContractName_RadioButton_Selection() throws Throwable
	{		
		return rebateCommonUtil.rebate_ClickOnRadioButton(CustomerContracts_Search_Form,"Search by contract name");
	}
	
	public boolean setTextIntoSearchEdit(String strSearchValue) throws Throwable
	{
		if(CustomerContracts_Search_Edit.exists(1000))
		{
			CustomerContracts_Search_Edit.type(strSearchValue);
			Log.info("Set Text :"+strSearchValue+" CustomerContracts_Search_Edit " );
			String strText = "//*[@class='ng-binding' and text()='"+strSearchValue+"']";			
			getDriver().findElement(By.xpath(strText)).click();
			sleep(1000);
			getNgDriver().waitForAngularRequestsToFinish();
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean clickOnMCSAbbreviation_Link() throws Throwable
	{
		return rxNovaCommonUtil.clickOnLink(CustomerContracts_MCSAbbreviation_Link);					
	}
	
	public boolean clickOnFileAdmin_Link() throws Throwable
	{		
		return rxNovaCommonUtil.clickOnLink(CustomerContracts_FileAdmin_Link);
	}
	
	public boolean clickOnExternalFiles_Link() throws Throwable
	{		
		return rxNovaCommonUtil.clickOnLink(CustomerContracts_ExternalFiles_Link);
	}
	
	public boolean clickOnAuthorizedBrandAlternatives_Link() throws Throwable
	{
		return rxNovaCommonUtil.clickOnLink(CustomerContracts_AuthorizedBrandAlternatives_Link);
	}
	
	public boolean verifyAndClickOnNavigationLinkInSearchResultsTable(String strSearchValue) throws Throwable
	{		
		boolean blnResult = false;	
		if(CustomerContracts_SearchResultsTable.exists(2000)&&StringUtil.isNotBlank(strSearchValue))
		{
			blnResult = rebateCommonUtil.rebate_clickOnLink_in_ContractSearchResultsTable(CustomerContracts_SearchResultsTable, strSearchValue);
		}
		return blnResult;
	}
}
