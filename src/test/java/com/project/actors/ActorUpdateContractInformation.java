package com.project.actors;

import java.util.List;
import com.project.pages.UpdateContractInformationPage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateContractInformation 
{
	@Steps
	UpdateContractInformationPage updateContractInformation;
	
	
	@Step
	public void updateContractVedorAndPenaltyDetails(DataTable strContractVendorAndPenaltyInformation) throws Throwable
	{
		List<List<String>> strVendorDetails = strContractVendorAndPenaltyInformation.raw();
		
		String strVendorContractType = strVendorDetails.get(1).get(0);
		String strVendorClaimBasis = strVendorDetails.get(1).get(1);
		String strVendorDaySupply = strVendorDetails.get(1).get(2);
		String strClientType = strVendorDetails.get(1).get(3);
		String strContractName = strVendorDetails.get(1).get(4);
		String strReclassificationDrugVendor = strVendorDetails.get(1).get(5);
		String strContractType = strVendorDetails.get(1).get(6);
		String strClaimBasis = strVendorDetails.get(1).get(7);
		String strStartDate = strVendorDetails.get(1).get(8);
		String strEndDate = strVendorDetails.get(1).get(9);
		String strCosmeticDrugs = strVendorDetails.get(1).get(10);
		String strCompoundDrugs = strVendorDetails.get(1).get(11);
		String strMultisourceBrandDrugs = strVendorDetails.get(1).get(12);
		String strVaccines = strVendorDetails.get(1).get(13);
		String strOverTheCounterDrugs = strVendorDetails.get(1).get(14);
		String strExceptInsulins = strVendorDetails.get(1).get(15);
		String strExceptDiabeticSuppliesAndTestStrips = strVendorDetails.get(1).get(16);
		String strReclassifySpecialtyClaimsToRetail = strVendorDetails.get(1).get(17);
		String strReclassifyDaySupplyBreakAt34 = strVendorDetails.get(1).get(18);
		String strReclassifyBrandClaimsToGeneric = strVendorDetails.get(1).get(19);
		String strMonthlyPenalty = strVendorDetails.get(1).get(20);
		String strMinimumClaimsToAvoidPenalty = strVendorDetails.get(1).get(21);
		String strPenaltyStartDate = strVendorDetails.get(1).get(22);
		String strPenaltyEndDate = strVendorDetails.get(1).get(23);
				
		updateContractInformation.clickOnContractInformationPanelUpdateButton();
		updateContractInformation.selectValueFromVendorContractTypeList(strVendorContractType);
		updateContractInformation.selectValueFromVendorClaimBasisList(strVendorClaimBasis);
		updateContractInformation.selectValueFromVendorDaySupplyList(strVendorDaySupply);
		updateContractInformation.selectValueFormClientTypeList(strClientType);
		updateContractInformation.setTextIntoContractNameEdit(strContractName);
		updateContractInformation.selectValueFromReClassificationDrugVendorList(strReclassificationDrugVendor);
		updateContractInformation.selectValueFromContractTypeList(strContractType);
		updateContractInformation.selectValueFromClaimBasisList(strClaimBasis);
		updateContractInformation.setTextIntoStartDateEdit(strStartDate);
		updateContractInformation.setTextIntoEndDateEdit(strEndDate);
		updateContractInformation.clickOnCosmeticDrugs_CheckBox(strCosmeticDrugs);
		updateContractInformation.clickOnCompoundDrugs_CheckBox(strCompoundDrugs);
		updateContractInformation.clickOnMultisourceBrandDrugs_CheckBox(strMultisourceBrandDrugs);
		updateContractInformation.clickOnVaccines_CheckBox(strVaccines);
		updateContractInformation.clickOnOverTheCounterDrugs_CheckBox(strOverTheCounterDrugs);
		updateContractInformation.clickOnExceptInsulins_CheckBox(strExceptInsulins);
		updateContractInformation.clickOnExceptDiabeticSuppliesAndTestStrips_CheckBox(strExceptDiabeticSuppliesAndTestStrips);
		updateContractInformation.clickOnReclassifySpecialtyClaimsToRetail_CheckBox(strReclassifySpecialtyClaimsToRetail);
		updateContractInformation.clickOnReclassifyDaySupplyBreakAt34_CheckBox(strReclassifyDaySupplyBreakAt34);
		updateContractInformation.clickOnReclassifyBrandClaimsToGeneric_CheckBox(strReclassifyBrandClaimsToGeneric);
		updateContractInformation.setTextIntoMonthlyPenaltyEdit(strMonthlyPenalty);
		updateContractInformation.setTextIntoMinimumClaimsToAvoidPenaltyEdit(strMinimumClaimsToAvoidPenalty);
		updateContractInformation.setTextIntoPenaltyStartDateEdit(strPenaltyStartDate);
		updateContractInformation.setTextIntoPenaltyEndDateEdit(strPenaltyEndDate);
	}
	
	@Step
	public void updateRateDetailsInContractInformation(DataTable strRateDetailsData) throws Throwable
	{
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		
		List<List<String>> rateDetailsTableData = strRateDetailsData.raw();
		
		for(int i=1;i<rateDetailsTableData.size();i++)
		{
			String strOperation = rateDetailsTableData.get(i).get(0);
			String strExistingRecord = rateDetailsTableData.get(i).get(1);			
			String strRateDetailsStartDate = rateDetailsTableData.get(i).get(2);
			String strRateDetailsEndDate = rateDetailsTableData.get(i).get(3);
			String strLineOfBusiness = rateDetailsTableData.get(i).get(4);
			String strTransparency = rateDetailsTableData.get(i).get(5);
			String strFeemethod = rateDetailsTableData.get(i).get(6);
			String strVendorRebateShare = rateDetailsTableData.get(i).get(7);
			String strAdminFee = rateDetailsTableData.get(i).get(8);
			String strDSTRebateShare = rateDetailsTableData.get(i).get(9);
			String strCustomerRebateShare = rateDetailsTableData.get(i).get(10);
			String strDSTRevenue = rateDetailsTableData.get(i).get(11);
			String strVendorAdjDaySupplyOption = rateDetailsTableData.get(i).get(12);
			String strCustomerAdjDaySupplyOption = rateDetailsTableData.get(i).get(13);
			String strNotes = rateDetailsTableData.get(i).get(14);
			
			// =======================================		
			if(strRateDetailsStartDate.isEmpty())
			{
				strRateDetailsStartDate = updateContractInformation.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
			}		
			if(strRateDetailsEndDate.isEmpty())
			{
				strRateDetailsEndDate = updateContractInformation.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
			}						
			// =======================================
			
			String strFinalMatchingRecord = strRateDetailsStartDate+"*"+strRateDetailsEndDate+"*"+strExistingRecord;
			switch(strOperation.toUpperCase())
			{
				case "REMOVE":					
					updateContractInformation.clickOnRequiredMatchingCheckBox(strFinalMatchingRecord);
					updateContractInformation.ContractInformationUpdateRateDetailsTableRemoveButton();
					break;
				case "UPDATE":
					updateContractInformation.clickOnRequiredMatchingCheckBox(strFinalMatchingRecord);
					updateContractInformation.clickOnContractInformationUpdateRateDetailsTableUpdateButton();
					
					updateContractInformation.setTextIntoRateDetailsStartDateEdit(strRateDetailsStartDate);
					updateContractInformation.setTextIntoRateDetailsEndDateEdit(strRateDetailsEndDate);
					updateContractInformation.selectValueFromRateDetailsLineOfBusinessList(strLineOfBusiness);
					updateContractInformation.selectValueFromTransparencyList(strTransparency);
					updateContractInformation.selectValueFromVendorAdjDaySupplyOptionList(strVendorAdjDaySupplyOption);
					updateContractInformation.selectValueFromCustomerAdjDaySupplyOptionList(strCustomerAdjDaySupplyOption);
					updateContractInformation.setTextIntoNotesEdit(strNotes);
					updateContractInformation.clickOnContractInformationUpdateAddOrUpdateButton();
					break;
				case "ADD":
					updateContractInformation.setTextIntoRateDetailsStartDateEdit(strRateDetailsStartDate);
					updateContractInformation.setTextIntoRateDetailsEndDateEdit(strRateDetailsEndDate);
					updateContractInformation.selectValueFromRateDetailsLineOfBusinessList(strLineOfBusiness);
					updateContractInformation.selectValueFromTransparencyList(strTransparency);
					updateContractInformation.selectValueFromFeeMethodList(strFeemethod);
					updateContractInformation.setTextIntoVendorRebateShareEdit(strVendorRebateShare);
					updateContractInformation.setTextIntoAdminFeeEdit(strAdminFee);
					updateContractInformation.setTextIntoDSTRebateShareEdit(strDSTRebateShare);
					updateContractInformation.setTextIntoCustomerRebateShareEdit(strCustomerRebateShare);
					updateContractInformation.setTextIntoDSTRevenueEdit(strDSTRevenue);
					updateContractInformation.selectValueFromVendorAdjDaySupplyOptionList(strVendorAdjDaySupplyOption);
					updateContractInformation.selectValueFromCustomerAdjDaySupplyOptionList(strCustomerAdjDaySupplyOption);
					updateContractInformation.setTextIntoNotesEdit(strNotes);
					updateContractInformation.clickOnContractInformationUpdateAddOrUpdateButton();
			}
		}
		updateContractInformation.clickOnSaveButton();
	}	
}
