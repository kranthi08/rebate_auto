package com.project.pages;

import com.psqframework.core.page.BasePage;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddGuaranteePanel;
import com.psqframework.core.element.BaseElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngularModel;

public class AddGuaranteePage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_StartDate_Edit)
	private BaseElement Guarantee_Add_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_EndDate_Edit)
	private BaseElement Guarantee_Add_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_VendorFormularyID_Edit)
	private BaseElement Guarantee_Add_VendorFormularyID_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_VendorFormularyType_List)
	private BaseElement Guarantee_Add_VendorFormularyType_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_DSTFormularyType_List)
	private BaseElement Guarantee_Add_DSTFormularyType_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_TierType_Edit)
	private BaseElement Guarantee_Add_TierType_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_Channel_List)
	private BaseElement Guarantee_Add_Channel_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_LineOfBusiness_List)
	private BaseElement Guarantee_Add_LineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_VendorBrandGuarantee_Edit)
	private BaseElement Guarantee_Add_VendorBrandGuarantee_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_CustomerBrandGuarantee_Edit)
	private BaseElement Guarantee_Add_CustomerBrandGuarantee_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_BenefitDesign_List)
	private BaseElement Guarantee_Add_BenefitDesign_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_UMOption_List)
	private BaseElement Guarantee_Add_UMOption_List;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_BenefitDesignDescriptionNotes_Edit)
	private BaseElement Guarantee_Add_BenefitDesignDescriptionNotes_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_PlanDesignNotes_Edit)
	private BaseElement Guarantee_Add_PlanDesignNotes_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_UMOptionNotes_Edit)
	private BaseElement Guarantee_Add_UMOptionNotes_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteePanel.Guarantee_Add_FormularyDesignNotes_Edit)
	private BaseElement Guarantee_Add_FormularyDesignNotes_Edit;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Add_Button)
	private BaseElement Guarantee_Add_Add_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Next_Button)
	private BaseElement Guarantee_Add_Next_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Previous_Button)
	private BaseElement Guarantee_Add_Previous_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_BrowseNotes_Button)
	private BaseElement Guarantee_Add_BrowseNotes_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_GuaranteePanel_Table)
	private BaseElement Guarantee_Add_GuaranteePanel_Table;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Update_Button)
	private BaseElement Guarantee_Add_Update_Button;
	
	@FindBy(xpath=AddGuaranteePanel.Guarantee_Add_Remove_Button)
	private BaseElement Guarantee_Add_Remove_Button;
	
	public boolean verifyGuaranteePanelIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(Guarantee_Add_VendorFormularyID_Edit.exists(1000))		
		{
			Log.info("Guarantee Panel is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}

	public boolean setTextIntoStartDateEdit(String strStartDateEditValue)	 throws Throwable
	{
		if(!strStartDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Guarantee_Add_StartDate_Edit, strStartDateEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoEndDateEdit(String strEndDateEditValue)	throws Throwable
	{
		if(!strEndDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Guarantee_Add_EndDate_Edit, strEndDateEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoVendorFormularyIDEdit(String strVendorFormularyIDEditValue)	throws Throwable
	{
		if(!strVendorFormularyIDEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Guarantee_Add_VendorFormularyID_Edit, strVendorFormularyIDEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromVendorFormularyTypeList(String strVendorFormularyTypeListValue) throws Throwable
	{
		if(!strVendorFormularyTypeListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Add_VendorFormularyType_List,strVendorFormularyTypeListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromDSTFormularyTypeList(String strDSTFormularyTypeListValue) throws Throwable
	{
		if(!strDSTFormularyTypeListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Add_DSTFormularyType_List,strDSTFormularyTypeListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoTierTypeEdit(String strTierTypeEditValue)	throws Throwable
	{
		if(!strTierTypeEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Add_TierType_Edit, strTierTypeEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromChannelList(String strChannelListValue) throws Throwable
	{
		if(!strChannelListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Add_Channel_List,strChannelListValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean selectValueFromLineOfBusinessList(String strLineOfBusinessListValue) throws Throwable
	{
		if(!strLineOfBusinessListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Add_LineOfBusiness_List,strLineOfBusinessListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoVendorBrandGuaranteeEdit(String strVendorBrandGuaranteeEditValue)	throws Throwable
	{
		if(!strVendorBrandGuaranteeEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Add_VendorBrandGuarantee_Edit, strVendorBrandGuaranteeEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoCustomerBrandGuaranteeEdit(String strCustomerBrandGuaranteeEditValue)	throws Throwable
	{
		if(!strCustomerBrandGuaranteeEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Add_CustomerBrandGuarantee_Edit, strCustomerBrandGuaranteeEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromBenefitDesignList(String strBenefitDesignListValue) throws Throwable
	{
		if(!strBenefitDesignListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Add_BenefitDesign_List,strBenefitDesignListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromUMOptionList(String strUMOptionListValue) throws Throwable
	{
		if(!strUMOptionListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Add_UMOption_List,strUMOptionListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoBenefitDesignDescriptionNotesEdit(String strBenefitDesignDescriptionNotesEditValue)	throws Throwable
	{
		if(!strBenefitDesignDescriptionNotesEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Add_BenefitDesignDescriptionNotes_Edit, strBenefitDesignDescriptionNotesEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoPlanDesignNotesEdit(String strPlanDesignNotesEditValue)	throws Throwable
	{
		if(!strPlanDesignNotesEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Add_PlanDesignNotes_Edit, strPlanDesignNotesEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoUMOptionNotesEdit(String strUMOptionNotesEditValue)	throws Throwable
	{
		if(!strUMOptionNotesEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Add_UMOptionNotes_Edit, strUMOptionNotesEditValue);
		}
		else
		{
			return true;
		}
	}
	public boolean setTextIntoFormularyDesignNotesEdit(String strFormularyDesignNotesEditValue)	throws Throwable
	{
		if(!strFormularyDesignNotesEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Add_FormularyDesignNotes_Edit, strFormularyDesignNotesEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Add_Add_Button);
	}
	
	public boolean clickOnNextButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Add_Next_Button);
	}
	public boolean clickOnBrowseNotesButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Add_BrowseNotes_Button);
	}
	
	public boolean clickOnRequiredMatchingCheckBox(String strExistingRecord) throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(Guarantee_Add_GuaranteePanel_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnUpdateButtonInGuaranteePanelTable() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Add_Update_Button);
	}
	
	public boolean clickOnRemoveButtonInGuaranteePanelTable() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Add_Remove_Button);
	}
	
	public boolean veifyGuaranteeTableData(String strExpectedValue)
	{
		boolean blnMatched = false;
		if(Guarantee_Add_GuaranteePanel_Table.exists(3000))
		{
			List<WebElement> rows = null;
			List<WebElement> cols = null;
			
			WebElement objTblBody = Guarantee_Add_GuaranteePanel_Table.findElement(By.tagName("tbody"));
			rows = objTblBody.findElements(By.tagName("tr"));
			if(rows.size()==1)
			{
				cols = rows.get(0).findElements(By.tagName("td"));
				if(cols.size()>1)
				{
					String strValue1 = cols.get(1).getText();
					String strValue2 = cols.get(2).getText();
					
					String strActualValue = strValue1+"^"+strValue2;
					if(strExpectedValue.equals(strActualValue))
					{
						Log.info("Record Added in ' Guarantee_Add_GuaranteePanel_Table '");
						blnMatched = true;
					}
				}
			}
			else
			{
				for(int i=0;i<rows.size();i++)
				{
					cols = rows.get(i).findElements(By.tagName("td"));
					
					String strValue1 = cols.get(i+1).getText();
					String strValue2 = cols.get(i+2).getText();
					String strActualValue = strValue1+"^"+strValue2;
					if(strExpectedValue.equals(strActualValue))
					{
						Log.info("Record Added in ' Guarantee_Add_GuaranteePanel_Table '");
						blnMatched = true;
						break;
					}
				}
			}
		}
		return blnMatched;
	}
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
		
}
