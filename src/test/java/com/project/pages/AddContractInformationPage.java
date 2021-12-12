package com.project.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.util.StringUtil;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddContractInformationPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class AddContractInformationPage  extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Vendor_List)
	private BaseElement ContractInformation_Add_Vendor_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorContractType_List)
	private BaseElement ContractInformation_Add_VendorContractType_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorClaimBasis_List)
	private BaseElement ContractInformation_Add_VendorClaimBasis_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorDaySupply_List)
	private BaseElement ContractInformation_Add_VendorDaySupply_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ClientType)
	private BaseElement ContractInformation_Add_ClientType;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_MasterCustomerSet_List)
	private BaseElement ContractInformation_Add_MasterCustomerSet_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_CustomerID_List)
	private BaseElement ContractInformation_Add_CustomerID_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractName_Edit)
	private BaseElement ContractInformation_Add_ContractName_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ReclassificationDrugVendor_List)
	private BaseElement ContractInformation_Add_ReclassificationDrugVendor_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Internal_External_List)
	private BaseElement ContractInformation_Add_Internal_External_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractLineOfBusiness_List)
	private BaseElement ContractInformation_Add_ContractLineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractType_List)
	private BaseElement ContractInformation_Add_ContractType_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ClaimBasis_List)
	private BaseElement ContractInformation_Add_ClaimBasis_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractStartDate_Edit)
	private BaseElement ContractInformation_Add_ContractStartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_ContractEndDate_Edit)
	private BaseElement ContractInformation_Add_ContractEndDate_Edit;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_CosmeticDrugs_CheckBox)
	private BaseElement ContractInformation_Add_CosmeticDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_CompoundDrugs_CheckBox)
	private BaseElement ContractInformation_Add_CompoundDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_MultisourceBrandDrugs_CheckBox)
	private BaseElement ContractInformation_Add_MultisourceBrandDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Vaccines_CheckBox)
	private BaseElement ContractInformation_Add_Vaccines_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_OverTheCounterDrugs_CheckBox)
	private BaseElement ContractInformation_Add_OverTheCounterDrugs_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ExceptInsulins_CheckBox)
	private BaseElement ContractInformation_Add_ExceptInsulins_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox)
	private BaseElement ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox)
	private BaseElement ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox)
	private BaseElement ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox)
	private BaseElement ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_MonthlyPenalty_Edit)
	private BaseElement ContractInformation_Add_MonthlyPenalty_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit)
	private BaseElement ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_PenaltyStartDate_Edit)
	private BaseElement ContractInformation_Add_PenaltyStartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_PenaltyEndDate_Edit)
	private BaseElement ContractInformation_Add_PenaltyEndDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_RateDetails_StartDate_Edit)
	private BaseElement ContractInformation_Add_RateDetails_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_RateDetails_EndDate_Edit)
	private BaseElement ContractInformation_Add_RateDetails_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_RateDetails_LineOfBusiness_List)
	private BaseElement ContractInformation_Add_RateDetails_LineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Transparency_List)
	private BaseElement ContractInformation_Add_Transparency_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_FeeMethod_List)
	private BaseElement ContractInformation_Add_FeeMethod_List;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorRebateShare_Edit)
	private BaseElement ContractInformation_Add_VendorRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_AdminFee_Edit)
	private BaseElement ContractInformation_Add_AdminFee_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_DSTRebateShare_Edit)
	private BaseElement ContractInformation_Add_DSTRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_CustomerRebateShare_Edit)
	private BaseElement ContractInformation_Add_CustomerRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_DSTRevenue_Edit)
	private BaseElement ContractInformation_Add_DSTRevenue_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_VendorAdjDaySupplyOption_Edit)
	private BaseElement ContractInformation_Add_VendorAdjDaySupplyOption_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_CustomerAdjDaySupplyOption_Edit)
	private BaseElement ContractInformation_Add_CustomerAdjDaySupplyOption_Edit;
	
	@ByAngularModel.FindBy(model=AddContractInformationPanel.ContractInformation_Add_Notes_Edit)
	private BaseElement ContractInformation_Add_Notes_Edit;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Button)
	private BaseElement ContractInformation_Add_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Next_Button)
	private BaseElement ContractInformation_Add_Next_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Remove_Button)
	private BaseElement ContractInformation_Add_Remove_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_Update_Button)
	private BaseElement ContractInformation_Add_Update_Button;
	
	@FindBy(xpath=AddContractInformationPanel.ContractInformation_Add_RateDetails_Table)
	private BaseElement ContractInformation_Add_RateDetails_Table;	
	
	public boolean verifyContractInformationPanelIsDisplayed() throws Throwable 
	{
		try
		{
			getNgDriver().waitForAngularRequestsToFinish();
		}
		catch(Exception e)
		{
			sleep(2000);
		}
		if(ContractInformation_Add_Vendor_List.exists(1000))		
		{
			Log.info("Contract Information Panel is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectValueFromVendorList(String strVendorListValue) throws Throwable
	{		
		if(!strVendorListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_Vendor_List,strVendorListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromVendorContractTypeList(String strVendorContractTypeValue) throws Throwable
	{
		if(!strVendorContractTypeValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_VendorContractType_List,strVendorContractTypeValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromVendorClaimBasisList(String strVendorClaimBasisListValue) throws Throwable
	{
		if(!strVendorClaimBasisListValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_VendorClaimBasis_List,strVendorClaimBasisListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromVendorDaySupplyList(String strVendorDaysSupplyListValue) throws Throwable
	{
		if(!strVendorDaysSupplyListValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_VendorDaySupply_List,strVendorDaysSupplyListValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean selectValueFromClientTypeList(String strClientTypeListValue) throws Throwable
	{
		if(!strClientTypeListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_ClientType,strClientTypeListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromMasterCustomerSetList(String strMasterCustomerSetListValue) throws Throwable
	{		
		if(!strMasterCustomerSetListValue.isEmpty()) 
		{
			if(ContractInformation_Add_MasterCustomerSet_List.exists(1000))
			{
				ContractInformation_Add_MasterCustomerSet_List.waitUntilClickable().click();			
				String strXpath1 = "//*[text()='";
				String strXpath2 = strMasterCustomerSetListValue+"']";
				String strXpath = strXpath1 + strXpath2;
				getDriver().findElement(By.xpath(strXpath)).click();
				getNgDriver().waitForAngularRequestsToFinish();
				sleep(1000);
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromCustomerIDList(String strCustomerIDListValue) throws Throwable
	{
		if(!strCustomerIDListValue.isEmpty()) 
		{
			if(ContractInformation_Add_CustomerID_List.exists(1000))
			{
				ContractInformation_Add_CustomerID_List.waitUntilClickable().click();			
				String strXpath1 = "//*[text()='";
				String strXpath2 = strCustomerIDListValue+"']";
				String strXpath = strXpath1 + strXpath2;
				getDriver().findElement(By.xpath(strXpath)).click();
				getNgDriver().waitForAngularRequestsToFinish();
				sleep(1000);
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoContractNameEdit(String strContractNameEditValue) throws Throwable
	{
		if(!strContractNameEditValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_ContractName_Edit, strContractNameEditValue);
		}
		else if(StringUtil.isBlank(strContractNameEditValue))
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_ContractName_Edit, rxNovaCommonUtil.generateRandomID("test", 8));
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromReClassificationDrugVendorList(String strReClassificationDrugVendorListValue) throws Throwable
	{
		if(!strReClassificationDrugVendorListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_ReclassificationDrugVendor_List,strReClassificationDrugVendorListValue);
		}
		else
		{
			return true;
		}
		
	}
	
	public boolean selectValueFromInternalOrExternalList(String strInternalOrExternalListValue) throws Throwable
	{
		if(!strInternalOrExternalListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_Internal_External_List,strInternalOrExternalListValue);
		}
		else
		{
			return true;
		}
		
	}
	
	public boolean selectValueFromContractLineOfBusinessList(String strContractLineOfBusinessValue) throws Throwable
	{
		if(!strContractLineOfBusinessValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_ContractLineOfBusiness_List,strContractLineOfBusinessValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromContractTypeList(String strContractTypeListValue) throws Throwable
	{
		if(!strContractTypeListValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_ContractType_List,strContractTypeListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectValueFromClaimBasisList(String strClaimBasisListValue) throws Throwable
	{
		if(!strClaimBasisListValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_ClaimBasis_List,strClaimBasisListValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoStartDateEdit(String strStartDateEditValue) throws Throwable
	{
		if(!strStartDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_ContractStartDate_Edit, strStartDateEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoEndDateEdit(String strEndDateEditValue) throws Throwable
	{
		if(!strEndDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_ContractEndDate_Edit, strEndDateEditValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnCosmeticDrugs_CheckBox(String strCosmeticDrugsValue) throws Throwable
	{
		if(!strCosmeticDrugsValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_CosmeticDrugs_CheckBox,strCosmeticDrugsValue);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnCompoundDrugs_CheckBox(String strCompoundDrugsValue) throws Throwable
	{
		if(!strCompoundDrugsValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_CompoundDrugs_CheckBox,strCompoundDrugsValue);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnMultisourceBrandDrugs_CheckBox(String strMultisourceBrandDrugsValue) throws Throwable
	{
		if(!strMultisourceBrandDrugsValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_MultisourceBrandDrugs_CheckBox,strMultisourceBrandDrugsValue);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnVaccines_CheckBox(String strVaccinesValue) throws Throwable
	{
		if(!strVaccinesValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_Vaccines_CheckBox,strVaccinesValue);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnOverTheCounterDrugs_CheckBox(String strOverTheCounterDrugsValue) throws Throwable
	{
		if(!strOverTheCounterDrugsValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_OverTheCounterDrugs_CheckBox,strOverTheCounterDrugsValue);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnExceptInsulins_CheckBox(String strExceptInsulinsValue) throws Throwable
	{
		if(!strExceptInsulinsValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_ExceptInsulins_CheckBox,strExceptInsulinsValue);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnExceptDiabeticSuppliesAndTestStrips_CheckBox(String strExceptDiabeticSuppliesAndTestStripsValue) throws Throwable
	{
		if(!strExceptDiabeticSuppliesAndTestStripsValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_ExceptDiabeticSuppliesAndTestStrips_CheckBox,strExceptDiabeticSuppliesAndTestStripsValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean clickOnReclassifySpecialtyClaimsToRetail_CheckBox(String strReclassifySpecialtyClaimsToRetailValue) throws Throwable
	{
		if(!strReclassifySpecialtyClaimsToRetailValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_ReclassifySpecialtyClaimsToRetail_CheckBox,strReclassifySpecialtyClaimsToRetailValue);
		}
		else
		{
			return true;
		}
	}
	public boolean clickOnReclassifyDaySupplyBreakAt34_CheckBox(String strReclassifyDaySupplyBreakAt34Value) throws Throwable
	{
		if(!strReclassifyDaySupplyBreakAt34Value.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_ReclassifyDaySupplyBreakAt34_CheckBox,strReclassifyDaySupplyBreakAt34Value);
		}
		else
		{
			return true;
		}		
	}
	public boolean clickOnReclassifyBrandClaimsToGeneric_CheckBox(String strReclassifyBrandClaimsToGenericValue) throws Throwable
	{
		if(!strReclassifyBrandClaimsToGenericValue.isEmpty())
		{
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Add_ReclassifyBrandClaimsToGeneric_CheckBox,strReclassifyBrandClaimsToGenericValue);
		}
		else
		{
			return true;
		}
	}
	
	public boolean setTextIntoMonthlyPenaltyEdit(String strMonthlyPenaltyEditValue) throws Throwable
	{
		if(!strMonthlyPenaltyEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(ContractInformation_Add_MonthlyPenalty_Edit, strMonthlyPenaltyEditValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoMinimumClaimsToAvoidPenaltyEdit(String strMinimumClaimsToAvoidPenaltyEditValue) throws Throwable
	{
		if(!strMinimumClaimsToAvoidPenaltyEditValue.isEmpty())
		{
			return rxNovaCommonUtil.setTextOnEdit(ContractInformation_Add_MinimumClaimsToAvoidPenalty_Edit, strMinimumClaimsToAvoidPenaltyEditValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoPenaltyStartDateEdit(String strPenaltyStartDateEditValue) throws Throwable
	{
		if(!strPenaltyStartDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_PenaltyStartDate_Edit, strPenaltyStartDateEditValue);
		}
		else
		{
			return true;
		}
	}
	public boolean setTextIntoPenaltyEndDateEdit(String strPenaltyEndDateEditValue) throws Throwable
	{
		if(!strPenaltyEndDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_PenaltyEndDate_Edit, strPenaltyEndDateEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean setTextIntoRateDetailsStartDateEdit(String strRateDetailsStartDateEditValue) throws Throwable
	{
		if(!strRateDetailsStartDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_RateDetails_StartDate_Edit, strRateDetailsStartDateEditValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoRateDetailsEndDateEdit(String strRateDetailsEndDateEditValue) throws Throwable
	{
		if(!strRateDetailsEndDateEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_RateDetails_EndDate_Edit, strRateDetailsEndDateEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean selectValueFromRateDetailsLineOfBusinessList(String strRateDetailsLineOfBusinessListValue) throws Throwable
	{
		if(!strRateDetailsLineOfBusinessListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_RateDetails_LineOfBusiness_List,strRateDetailsLineOfBusinessListValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean selectValueFromTransparencyList(String strTransparencyListValue) throws Throwable
	{
		if(!strTransparencyListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_Transparency_List,strTransparencyListValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean selectValueFromFeeMethodList(String strFeeMethodListValue) throws Throwable
	{
		if(!strFeeMethodListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_FeeMethod_List,strFeeMethodListValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoVendorRebateShareEdit(String strVendorRebateShareEditValue) throws Throwable
	{
		if(!strVendorRebateShareEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_VendorRebateShare_Edit, strVendorRebateShareEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean setTextIntoAdminFeeEdit(String strAdminFeeEditValue) throws Throwable
	{
		if(!strAdminFeeEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_AdminFee_Edit, strAdminFeeEditValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoDSTRebateShareEdit(String strDSTRebateShareEditValue) throws Throwable
	{
		if(!strDSTRebateShareEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_DSTRebateShare_Edit, strDSTRebateShareEditValue);
		}
		else
		{
			return true;
		}
		
	}
	public boolean setTextIntoCustomerRebateShareEdit(String strCustomerRebateShareEditValue) throws Throwable
	{
		//return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_CustomerRebateShare_Edit, strCustomerRebateShareEditValue);
		return true;
	}
	public boolean setTextIntoDSTRevenueEdit(String strDSTRevenueEditValue) throws Throwable
	{
		//return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_DSTRevenue_Edit, strDSTRevenueEditValue);
		return true;
	}
	
	public boolean selectValueFromVendorAdjDaySupplyOptionList(String strVendorAdjDaySupplyOptionListValue) throws Throwable
	{
		if(!strVendorAdjDaySupplyOptionListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_VendorAdjDaySupplyOption_Edit,strVendorAdjDaySupplyOptionListValue);
		}
		else
		{
			return true;
		}
	}
	public boolean selectValueFromCustomerAdjDaySupplyOptionList(String strCustomerAdjDaySupplyOptionListValue) throws Throwable
	{
		if(!strCustomerAdjDaySupplyOptionListValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Add_CustomerAdjDaySupplyOption_Edit,strCustomerAdjDaySupplyOptionListValue);
		}
		else
		{
			return true;
		}		
	}
	public boolean setTextIntoNotesEdit(String strNotesEditValue) throws Throwable
	{
		if(!strNotesEditValue.isEmpty())
		{
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Add_Notes_Edit, strNotesEditValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Add_Button);
	}
	
	public boolean clickOnNextButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Add_Next_Button);		
	}
	
	public boolean clickOnContractInformationTableRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Add_Remove_Button);		
	}
	
	public boolean clickOnContractInformationTableUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Add_Update_Button);		
	}
	
	public boolean clickOnRequiredMatchingCheckBox(String strExistingRecord) throws Throwable
	{
		if(!strExistingRecord.isEmpty())
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(ContractInformation_Add_RateDetails_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	
	public boolean veifyRateDetailsTableData(String strExpectedValue)
	{
		boolean blnMatched = false;
		if(ContractInformation_Add_RateDetails_Table.exists(3000))
		{
			List<WebElement> rows = null;
			List<WebElement> cols = null;
			
			WebElement objTblBody = ContractInformation_Add_RateDetails_Table.findElement(By.tagName("tbody"));
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
						Log.info("Record Added in ' ContractInformation_Add_RateDetails_Table '");
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
						Log.info("Record Added in ' ContractInformation_Add_RateDetails_Table '");
						blnMatched = true;
						break;
					}
					
				}
			}
		}
		return blnMatched;
	}
	// ===========================================
	
	public boolean getAndVerifyTheContractExistErrorMessage()
	{
		boolean isErrorMessageDisplayed = false;		
		String strExpContractExistErrorMessage = "A contract exists for the selected customer and date range. (AREB0018).";		
		try
		{
			if($(By.xpath("//*[@ng-controller='errorMsgCtrl']//*[@ng-repeat='msg in msgList.errorMsg']")).isDisplayed())
			{
				String strActContractExistErrorMessage = $(By.xpath("//*[@ng-controller='errorMsgCtrl']//*[@ng-repeat='msg in msgList.errorMsg']")).getTextValue().trim();
				if(strActContractExistErrorMessage.equalsIgnoreCase(strExpContractExistErrorMessage))
				{
				Log.info("Contract Exist error Message is displaying, try with the other contract start and end Dates");
				isErrorMessageDisplayed = true;
				}
				else
				{
					isErrorMessageDisplayed = false;
				}
			}													
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return isErrorMessageDisplayed;
	}
	
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
	
	
}
