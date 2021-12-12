package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateContractInformationPanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class UpdateContractInformationPage extends BasePage 
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_VendorContractType_List)
	private BaseElement ContractInformation_Update_VendorContractType_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_VendorClaimBasis_List)
	private BaseElement ContractInformation_Update_VendorClaimBasis_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_VendorDaySupply_List)
	private BaseElement ContractInformation_Update_VendorDaySupply_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_ClientType)
	private BaseElement ContractInformation_Update_ClientType;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_ContractName_Edit)
	private BaseElement ContractInformation_Update_ContractName_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_ReclassificationDrugVendor_List)
	private BaseElement ContractInformation_Update_ReclassificationDrugVendor_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_ContractType_List)
	private BaseElement ContractInformation_Update_ContractType_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_ClaimBasis_List)
	private BaseElement ContractInformation_Update_ClaimBasis_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_ContractStartDate_Edit)
	private BaseElement ContractInformation_Update_ContractStartDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_ContractEndDate_Edit)
	private BaseElement ContractInformation_Update_ContractEndDate_Edit;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_CosmeticDrugs_CheckBox)
	private BaseElement ContractInformation_Update_CosmeticDrugs_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_CompoundDrugs_CheckBox)
	private BaseElement ContractInformation_Update_CompoundDrugs_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_MultisourceBrandDrugs_CheckBox)
	private BaseElement ContractInformation_Update_MultisourceBrandDrugs_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_Vaccines_CheckBox)
	private BaseElement ContractInformation_Update_Vaccines_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_OverTheCounterDrugs_CheckBox)
	private BaseElement ContractInformation_Update_OverTheCounterDrugs_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_ExceptInsulins_CheckBox)
	private BaseElement ContractInformation_Update_ExceptInsulins_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_ExceptDiabeticSuppliesAndTestStrips_CheckBox)
	private BaseElement ContractInformation_Update_ExceptDiabeticSuppliesAndTestStrips_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_ReclassifySpecialtyClaimsToRetail_CheckBox)
	private BaseElement ContractInformation_Update_ReclassifySpecialtyClaimsToRetail_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_ReclassifyDaySupplyBreakAt34_CheckBox)
	private BaseElement ContractInformation_Update_ReclassifyDaySupplyBreakAt34_CheckBox;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_ReclassifyBrandClaimsToGeneric_CheckBox)
	private BaseElement ContractInformation_Update_ReclassifyBrandClaimsToGeneric_CheckBox;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_MonthlyPenalty_Edit)
	private BaseElement ContractInformation_Update_MonthlyPenalty_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_MinimumClaimsToAvoidPenalty_Edit)
	private BaseElement ContractInformation_Update_MinimumClaimsToAvoidPenalty_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_PenaltyStartDate_Edit)
	private BaseElement ContractInformation_Update_PenaltyStartDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_PenaltyEndDate_Edit)
	private BaseElement ContractInformation_Update_PenaltyEndDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_RateDetails_StartDate_Edit)
	private BaseElement ContractInformation_Update_RateDetails_StartDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_RateDetails_EndDate_Edit)
	private BaseElement ContractInformation_Update_RateDetails_EndDate_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_RateDetails_LineOfBusiness_List)
	private BaseElement ContractInformation_Update_RateDetails_LineOfBusiness_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_Transparency_List)
	private BaseElement ContractInformation_Update_Transparency_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_FeeMethod_List)
	private BaseElement ContractInformation_Update_FeeMethod_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_VendorRebateShare_Edit)
	private BaseElement ContractInformation_Update_VendorRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_AdminFee_Edit)
	private BaseElement ContractInformation_Update_AdminFee_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_DSTRebateShare_Edit)
	private BaseElement ContractInformation_Update_DSTRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_CustomerRebateShare_Edit)
	private BaseElement ContractInformation_Update_CustomerRebateShare_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_DSTRevenue_Edit)
	private BaseElement ContractInformation_Update_DSTRevenue_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_VendorAdjDaySupplyOption_List)
	private BaseElement ContractInformation_Update_VendorAdjDaySupplyOption_Edit;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_CustomerAdjDaySupplyOption_List)
	private BaseElement ContractInformation_Update_CustomerAdjDaySupplyOption_List;
	
	@ByAngularModel.FindBy(model=UpdateContractInformationPanel.ContractInformation_Update_Notes_Edit)
	private BaseElement ContractInformation_Update_Notes_Edit;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_ContractInformationPanel_Update_Button)
	private BaseElement ContractInformation_Update_ContractInformationPanel_Update_Button;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_AddOrUpdate_Button)
	private BaseElement ContractInformation_Update_AddOrUpdate_Button;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_RateDetails_Table_Remove_Button)
	private BaseElement ContractInformation_Update_RateDetails_Table_Remove_Button;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_RateDetails_Table_Update_Button)
	private BaseElement ContractInformation_Update_RateDetails_Table_Update_Button;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_RateDetails_Table)
	private BaseElement ContractInformation_Update_RateDetails_Table;
	
	@FindBy(xpath=UpdateContractInformationPanel.ContractInformation_Update_Save_Button)
	private BaseElement ContractInformation_Update_Save_Button;
	
	// -- Methods
	public boolean verifyContractInformationPanelIsDisplayed() throws Throwable 
	{		
		rxNovaCommonUtil.waitForAngularPageRefresh();
		if(ContractInformation_Update_VendorContractType_List.exists(1000))		
		{
			Log.info("Contract Information Panel is displayed in Updated Mode");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectValueFromVendorContractTypeList(String strVendorContractTypeValue) throws Throwable
	{
		if(!strVendorContractTypeValue.isEmpty()) 
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_VendorContractType_List,strVendorContractTypeValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_VendorClaimBasis_List,strVendorClaimBasisListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_VendorDaySupply_List,strVendorDaysSupplyListValue);
		}
		else
		{
			return true;
		}		
	}
	
	public boolean selectValueFormClientTypeList(String strClientTypeList) throws Throwable
	{
		if(!strClientTypeList.isEmpty())
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_ClientType,strClientTypeList);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_ContractName_Edit, strContractNameEditValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_ReclassificationDrugVendor_List,strReClassificationDrugVendorListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_ContractType_List,strContractTypeListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_ClaimBasis_List,strClaimBasisListValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_ContractStartDate_Edit, strStartDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_ContractEndDate_Edit, strEndDateEditValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_CosmeticDrugs_CheckBox,strCosmeticDrugsValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_CompoundDrugs_CheckBox,strCompoundDrugsValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_MultisourceBrandDrugs_CheckBox,strMultisourceBrandDrugsValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_Vaccines_CheckBox,strVaccinesValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_OverTheCounterDrugs_CheckBox,strOverTheCounterDrugsValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_ExceptInsulins_CheckBox,strExceptInsulinsValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_ExceptDiabeticSuppliesAndTestStrips_CheckBox,strExceptDiabeticSuppliesAndTestStripsValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_ReclassifySpecialtyClaimsToRetail_CheckBox,strReclassifySpecialtyClaimsToRetailValue);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_ReclassifyDaySupplyBreakAt34_CheckBox,strReclassifyDaySupplyBreakAt34Value);
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
			return rebateCommonUtil.rebate_clickOnCheckBox(ContractInformation_Update_ReclassifyBrandClaimsToGeneric_CheckBox,strReclassifyBrandClaimsToGenericValue);
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
			return rxNovaCommonUtil.setTextOnEdit(ContractInformation_Update_MonthlyPenalty_Edit, strMonthlyPenaltyEditValue);
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
			return rxNovaCommonUtil.setTextOnEdit(ContractInformation_Update_MinimumClaimsToAvoidPenalty_Edit, strMinimumClaimsToAvoidPenaltyEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_PenaltyStartDate_Edit, strPenaltyStartDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_PenaltyEndDate_Edit, strPenaltyEndDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_RateDetails_StartDate_Edit, strRateDetailsStartDateEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_RateDetails_EndDate_Edit, strRateDetailsEndDateEditValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_RateDetails_LineOfBusiness_List,strRateDetailsLineOfBusinessListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_Transparency_List,strTransparencyListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_FeeMethod_List,strFeeMethodListValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_VendorRebateShare_Edit, strVendorRebateShareEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_AdminFee_Edit, strAdminFeeEditValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_DSTRebateShare_Edit, strDSTRebateShareEditValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_VendorAdjDaySupplyOption_Edit,strVendorAdjDaySupplyOptionListValue);
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
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(ContractInformation_Update_CustomerAdjDaySupplyOption_List,strCustomerAdjDaySupplyOptionListValue);
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
			return rebateCommonUtil.rebate_SetTextOnEdit(ContractInformation_Update_Notes_Edit, strNotesEditValue);
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
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(ContractInformation_Update_RateDetails_Table, strExistingRecord);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnContractInformationUpdateAddOrUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Update_AddOrUpdate_Button);
	}
	
	public boolean clickOnContractInformationPanelUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Update_ContractInformationPanel_Update_Button);
	}
	
	public boolean clickOnContractInformationUpdateRateDetailsTableUpdateButton()throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Update_RateDetails_Table_Update_Button);
	}
	
	public boolean ContractInformationUpdateRateDetailsTableRemoveButton()throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Update_RateDetails_Table_Remove_Button);
	}
	
	public boolean clickOnSaveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(ContractInformation_Update_Save_Button);
	}
	public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
	{
		return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
	}
	
	
	
	
	
	
}
