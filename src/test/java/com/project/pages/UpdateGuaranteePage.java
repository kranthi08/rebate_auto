package com.project.pages;

import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateGuaranteePanel;

public class UpdateGuaranteePage extends BasePage 
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=UpdateGuaranteePanel.Guarantee_Update_GuaranteePanel_Update_Button)
	private BaseElement Guarantee_Update_GuaranteePanel_Update_Button;
	
	@FindBy(xpath=UpdateGuaranteePanel.Guarantee_Update_Table_Update_Button)
	private BaseElement Guarantee_Update_Table_Update_Button;
	
	@FindBy(xpath=UpdateGuaranteePanel.Guarantee_Update_Table_Remove_Button)
	private BaseElement Guarantee_Update_Table_Remove_Button;
	
	@FindBy(xpath=UpdateGuaranteePanel.Guarantee_Update_AddOrUpdateButton)
	private BaseElement Guarantee_Update_AddOrUpdateButton;
	
	@FindBy(xpath=UpdateGuaranteePanel.Guarantee_Update_Save_Button)
	private BaseElement Guarantee_Update_Save_Button;
	
	@FindBy(xpath=UpdateGuaranteePanel.Guarantee_Update_GuaranteePanel_Table)
	private BaseElement Guarantee_Update_GuaranteePanel_Table;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_StartDate_Edit)
	private BaseElement Guarantee_Update_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_EndDate_Edit)
	private BaseElement Guarantee_Update_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_VendorFormularyID_Edit)
	private BaseElement Guarantee_Update_VendorFormularyID_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_VendorFormularyType_List)
	private BaseElement Guarantee_Update_VendorFormularyType_List;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_DSTFormularyType_List)
	private BaseElement Guarantee_Update_DSTFormularyType_List;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_TierType_Edit)
	private BaseElement Guarantee_Update_TierType_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_Channel_List)
	private BaseElement Guarantee_Update_Channel_List;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_LineOfBusiness_List)
	private BaseElement Guarantee_Update_LineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_VendorBrandGuarantee_Edit)
	private BaseElement Guarantee_Update_VendorBrandGuarantee_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_CustomerBrandGuarantee_Edit)
	private BaseElement Guarantee_Update_CustomerBrandGuarantee_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_BenefitDesign_List)
	private BaseElement Guarantee_Update_BenefitDesign_List;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_UMOption_List)
	private BaseElement Guarantee_Update_UMOption_List;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_BenefitDesignDescriptionNotes_Edit)
	private BaseElement Guarantee_Update_BenefitDesignDescriptionNotes_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_PlanDesignNotes_Edit)
	private BaseElement Guarantee_Update_PlanDesignNotes_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_UMOptionNotes_Edit)
	private BaseElement Guarantee_Update_UMOptionNotes_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteePanel.Guarantee_Update_FormularyDesignNotes_Edit)
	private BaseElement Guarantee_Update_FormularyDesignNotes_Edit;
	
	// -- Methods
	public boolean clickOnUpdateGuaranteePanelUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Update_GuaranteePanel_Update_Button);
	}
	
	public boolean clickOnUpdateTableUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Update_Table_Update_Button);
	}
	
	public boolean clickOnGuaranteeUpdateTableRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Update_Table_Remove_Button);
	}
	
	public boolean clickOnUpdateAddOrUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Update_AddOrUpdateButton);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_Update_Save_Button);
	}
	
	public boolean setTextIntoStartDateEdit(String strStartDateEditValue)	 throws Throwable
	{
		if(!strStartDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(Guarantee_Update_StartDate_Edit, strStartDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(Guarantee_Update_EndDate_Edit, strEndDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(Guarantee_Update_VendorFormularyID_Edit, strVendorFormularyIDEditValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Update_VendorFormularyType_List,strVendorFormularyTypeListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Update_DSTFormularyType_List,strDSTFormularyTypeListValue);
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
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Update_TierType_Edit, strTierTypeEditValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Update_Channel_List,strChannelListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Update_LineOfBusiness_List,strLineOfBusinessListValue);
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
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Update_VendorBrandGuarantee_Edit, strVendorBrandGuaranteeEditValue);
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
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Update_CustomerBrandGuarantee_Edit, strCustomerBrandGuaranteeEditValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Update_BenefitDesign_List,strBenefitDesignListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(Guarantee_Update_UMOption_List,strUMOptionListValue);
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
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Update_BenefitDesignDescriptionNotes_Edit, strBenefitDesignDescriptionNotesEditValue);
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
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Update_PlanDesignNotes_Edit, strPlanDesignNotesEditValue);
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
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Update_UMOptionNotes_Edit, strUMOptionNotesEditValue);
		}
		else
		{
			return true;
		}
	}
	public boolean setTextIntoFormularyDesignNotesEdit(String strFormularyDesignNotesEditValue)	 throws Throwable
	{
		if(!strFormularyDesignNotesEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(Guarantee_Update_FormularyDesignNotes_Edit, strFormularyDesignNotesEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRequiredMatchingCheckBox(String strExistingRecord) throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(Guarantee_Update_GuaranteePanel_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
		
}
