package com.project.actors;

import java.util.List;
import com.project.pages.AddContractInformationPage;
import com.project.pages.CustomerContractsPage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddContractInformationPage 
{
	@Steps
	AddContractInformationPage addContractInformationPage;
	
	@Steps
	CustomerContractsPage customerContractsPage;
	
	public static String START_DATE,END_DATE;
	
	@Step
	public void VerifyCustomerContractCreationPagedisplay()	throws Throwable
	{
		addContractInformationPage.verifyContractInformationPanelIsDisplayed();
		
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		
		START_DATE = addContractInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
		END_DATE = addContractInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
	}

	@Step
	public void vendorDetailsInputInContractInformationScreen(DataTable contractInformation)	throws Throwable
	{
		
		List<List<String>>  contactInfoValues = contractInformation.raw();
		
		String strVendorListValue = contactInfoValues.get(1).get(0);
		String strVendorContractType = contactInfoValues.get(1).get(1);
		String strVendorClaimBasis = contactInfoValues.get(1).get(2);
		String strVendorDaySupply = contactInfoValues.get(1).get(3);
		String strClientType = contactInfoValues.get(1).get(4);
		String strMasterCustomerSet = contactInfoValues.get(1).get(5);
		String strCustomerID = contactInfoValues.get(1).get(6);
		String strContractName = contactInfoValues.get(1).get(7);				
		String strReclassificationDrugVendor = contactInfoValues.get(1).get(8);
		String strInternalExternal = contactInfoValues.get(1).get(9);
		String strContractLineOfBusiness = contactInfoValues.get(1).get(10);
		String strContractType = contactInfoValues.get(1).get(11);
		String strClaimBasis = contactInfoValues.get(1).get(12);
		String strStartDate = contactInfoValues.get(1).get(13);
		String strEndDate = contactInfoValues.get(1).get(14);		
				
		String strCosmeticDrugs = contactInfoValues.get(1).get(15);
		String strCompoundDrugs = contactInfoValues.get(1).get(16);
		String strMultisourceBrandDrugs = contactInfoValues.get(1).get(17);
		String strVaccines = contactInfoValues.get(1).get(18);
		String strOverTheCounterDrugs = contactInfoValues.get(1).get(19);
		String strExceptInsulins = contactInfoValues.get(1).get(20);
		String strExceptDiabeticSuppliesAndTestStrips = contactInfoValues.get(1).get(21);
		String strReclassifySpecialtyClaimsToRetail = contactInfoValues.get(1).get(22);
		String strReclassifyDaySupplyBreakAt34 = contactInfoValues.get(1).get(23);
		String strReclassifyBrandClaimsToGeneric = contactInfoValues.get(1).get(24);
		
		String strMonthlyPenality = contactInfoValues.get(1).get(25);
		String strMinimumClaimsToAvoidPenalty = contactInfoValues.get(1).get(26);
		String strPenalityStartDate = contactInfoValues.get(1).get(27);
		String strPenalityEndDate = contactInfoValues.get(1).get(28);
		
		// =======================================		
		if(strStartDate.isEmpty())
		{
			strStartDate = START_DATE;
		}		
		if(strEndDate.isEmpty())
		{
			strEndDate = END_DATE;
		}								
		// =======================================		
				
		addContractInformationPage.selectValueFromVendorList(strVendorListValue);
		addContractInformationPage.selectValueFromVendorContractTypeList(strVendorContractType);
		addContractInformationPage.selectValueFromVendorClaimBasisList(strVendorClaimBasis);
		addContractInformationPage.selectValueFromVendorDaySupplyList(strVendorDaySupply);
		addContractInformationPage.selectValueFromClientTypeList(strClientType);
		addContractInformationPage.selectValueFromMasterCustomerSetList(strMasterCustomerSet);
		addContractInformationPage.selectValueFromCustomerIDList(strCustomerID);
		addContractInformationPage.setTextIntoContractNameEdit(strContractName);
		addContractInformationPage.selectValueFromReClassificationDrugVendorList(strReclassificationDrugVendor);
		addContractInformationPage.selectValueFromInternalOrExternalList(strInternalExternal);
		addContractInformationPage.selectValueFromContractLineOfBusinessList(strContractLineOfBusiness);
		addContractInformationPage.selectValueFromContractTypeList(strContractType);
		addContractInformationPage.selectValueFromClaimBasisList(strClaimBasis);
		addContractInformationPage.setTextIntoStartDateEdit(strStartDate);
		addContractInformationPage.setTextIntoEndDateEdit(strEndDate);
		
		if(addContractInformationPage.getAndVerifyTheContractExistErrorMessage())
		{
			/*
			for(int i=1;i<15;i++)
			{				
				strStartDate = START_DATE;
				strEndDate = END_DATE;
				customerContractsPage.verifyCustomerContractPageIsDisplayed();
				customerContractsPage.clickOnNewButton();
				
				addContractInformationPage.selectValueFromVendorList(strVendorListValue);
				addContractInformationPage.selectValueFromVendorContractTypeList(strVendorContractType);
				addContractInformationPage.selectValueFromVendorClaimBasisList(strVendorClaimBasis);
				addContractInformationPage.selectValueFromVendorDaySupplyList(strVendorDaySupply);
				addContractInformationPage.selectValueFromClientTypeList(strClientType);
				addContractInformationPage.selectValueFromMasterCustomerSetList(strMasterCustomerSet);
				addContractInformationPage.selectValueFromCustomerIDList(strCustomerID);
				addContractInformationPage.setTextIntoContractNameEdit(strContractName);
				addContractInformationPage.selectValueFromReClassificationDrugVendorList(strReclassificationDrugVendor);
				addContractInformationPage.selectValueFromInternalOrExternalList(strInternalExternal);
				addContractInformationPage.selectValueFromContractLineOfBusinessList(strContractLineOfBusiness);
				addContractInformationPage.selectValueFromContractTypeList(strContractType);
				addContractInformationPage.selectValueFromClaimBasisList(strClaimBasis);
				addContractInformationPage.setTextIntoStartDateEdit(strStartDate);
				addContractInformationPage.setTextIntoEndDateEdit(strEndDate);
				if(!addContractInformationPage.getAndVerifyTheContractExistErrorMessage())
				{
					break;
				}
			}
			*/			
		}
		
		addContractInformationPage.clickOnCosmeticDrugs_CheckBox(strCosmeticDrugs);
		addContractInformationPage.clickOnCompoundDrugs_CheckBox(strCompoundDrugs);
		addContractInformationPage.clickOnMultisourceBrandDrugs_CheckBox(strMultisourceBrandDrugs);
		addContractInformationPage.clickOnVaccines_CheckBox(strVaccines);
		addContractInformationPage.clickOnOverTheCounterDrugs_CheckBox(strOverTheCounterDrugs);
		addContractInformationPage.clickOnExceptInsulins_CheckBox(strExceptInsulins);
		addContractInformationPage.clickOnExceptDiabeticSuppliesAndTestStrips_CheckBox(strExceptDiabeticSuppliesAndTestStrips);
		addContractInformationPage.clickOnReclassifySpecialtyClaimsToRetail_CheckBox(strReclassifySpecialtyClaimsToRetail);
		addContractInformationPage.clickOnReclassifyDaySupplyBreakAt34_CheckBox(strReclassifyDaySupplyBreakAt34);
		addContractInformationPage.clickOnReclassifyBrandClaimsToGeneric_CheckBox(strReclassifyBrandClaimsToGeneric);
		
		addContractInformationPage.setTextIntoMonthlyPenaltyEdit(strMonthlyPenality);
		addContractInformationPage.setTextIntoMinimumClaimsToAvoidPenaltyEdit(strMinimumClaimsToAvoidPenalty);
		// =======================================		
		if(strPenalityStartDate.isEmpty())
		{
			strPenalityStartDate = START_DATE;
		}		
		if(strPenalityEndDate.isEmpty())
		{
			strPenalityEndDate = END_DATE;
		}						
		// =======================================
		addContractInformationPage.setTextIntoPenaltyStartDateEdit(strPenalityStartDate);
		addContractInformationPage.setTextIntoPenaltyEndDateEdit(strPenalityEndDate);
			
	}
	
	@Step
	public void rateDetailsSubmitInContractIinformationScreen(DataTable rateDetails)	throws Throwable
	{
		
		List<List<String>>  rateDetailsValues = rateDetails.raw();
		for(int i=1;i<rateDetailsValues.size();i++)
		{
			String strOperation = rateDetailsValues.get(i).get(0);
			String strExistingRecord = rateDetailsValues.get(i).get(1);
			String strRateDetailsStartDate = rateDetailsValues.get(i).get(2);
			String strRateDetailsEndDate = rateDetailsValues.get(i).get(3);
			// =======================================		
			if(strRateDetailsStartDate.isEmpty())
			{
				strRateDetailsStartDate = START_DATE;
			}		
			if(strRateDetailsEndDate.isEmpty())
			{
				strRateDetailsEndDate = END_DATE;
			}						
			// =======================================
	        String strRateDetailsLineOfBusiness = rateDetailsValues.get(i).get(4);
	        String strTransparency = rateDetailsValues.get(i).get(5);
	        String strFeeMethod = rateDetailsValues.get(i).get(6);
	        String strVendorRebateShare = rateDetailsValues.get(i).get(7);
	        String strAdminFee = rateDetailsValues.get(i).get(8);
	        String strDSTRebateShare = rateDetailsValues.get(i).get(9);
	        String strCustomerRebateShare = rateDetailsValues.get(i).get(10);
	        String strDSTRevenue = rateDetailsValues.get(i).get(11);
	        String strVendorAdjDaySupplyOption = rateDetailsValues.get(i).get(12);
	        String strCustomerAdjDaySupplyOption = rateDetailsValues.get(i).get(13);
	        String strNotes = rateDetailsValues.get(i).get(14);
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					addContractInformationPage.setTextIntoRateDetailsStartDateEdit(strRateDetailsStartDate);
			        addContractInformationPage.setTextIntoRateDetailsEndDateEdit(strRateDetailsEndDate);
			        addContractInformationPage.selectValueFromRateDetailsLineOfBusinessList(strRateDetailsLineOfBusiness);
			        addContractInformationPage.selectValueFromTransparencyList(strTransparency);
			        addContractInformationPage.selectValueFromFeeMethodList(strFeeMethod);
			        addContractInformationPage.setTextIntoVendorRebateShareEdit(strVendorRebateShare);
			        addContractInformationPage.setTextIntoAdminFeeEdit(strAdminFee);
			        addContractInformationPage.setTextIntoDSTRebateShareEdit(strDSTRebateShare);
			        addContractInformationPage.setTextIntoCustomerRebateShareEdit(strCustomerRebateShare);
			        addContractInformationPage.setTextIntoDSTRevenueEdit(strDSTRevenue);
			        addContractInformationPage.selectValueFromVendorAdjDaySupplyOptionList(strVendorAdjDaySupplyOption);
			        addContractInformationPage.selectValueFromCustomerAdjDaySupplyOptionList(strCustomerAdjDaySupplyOption);        
			        addContractInformationPage.setTextIntoNotesEdit(strNotes);
			        addContractInformationPage.clickOnAddButton();			        
			        addContractInformationPage.veifyRateDetailsTableData(strRateDetailsStartDate+"^"+strRateDetailsEndDate);
			        break;
				case "UPDATE":
					addContractInformationPage.clickOnRequiredMatchingCheckBox(strExistingRecord);
					addContractInformationPage.clickOnContractInformationTableUpdateButton();
					addContractInformationPage.setTextIntoRateDetailsStartDateEdit(strRateDetailsStartDate);
			        addContractInformationPage.setTextIntoRateDetailsEndDateEdit(strRateDetailsEndDate);
			        addContractInformationPage.selectValueFromRateDetailsLineOfBusinessList(strRateDetailsLineOfBusiness);
			        addContractInformationPage.selectValueFromTransparencyList(strTransparency);
			        addContractInformationPage.selectValueFromFeeMethodList(strFeeMethod);
			        addContractInformationPage.setTextIntoVendorRebateShareEdit(strVendorRebateShare);
			        addContractInformationPage.setTextIntoAdminFeeEdit(strAdminFee);
			        addContractInformationPage.setTextIntoDSTRebateShareEdit(strDSTRebateShare);
			        addContractInformationPage.setTextIntoCustomerRebateShareEdit(strCustomerRebateShare);
			        addContractInformationPage.setTextIntoDSTRevenueEdit(strDSTRevenue);
			        addContractInformationPage.selectValueFromVendorAdjDaySupplyOptionList(strVendorAdjDaySupplyOption);
			        addContractInformationPage.selectValueFromCustomerAdjDaySupplyOptionList(strCustomerAdjDaySupplyOption);        
			        addContractInformationPage.setTextIntoNotesEdit(strNotes);
			        addContractInformationPage.clickOnAddButton();			        
			        addContractInformationPage.veifyRateDetailsTableData(strRateDetailsStartDate+"^"+strRateDetailsEndDate);
			        break;
				case "REMOVE":  
					addContractInformationPage.clickOnRequiredMatchingCheckBox(strExistingRecord);
					addContractInformationPage.clickOnContractInformationTableRemoveButton();	
			}	
		}				
	}
	
	@Step
	public void nextButtonClickInContractInformationScreen()	throws Throwable
	{
		addContractInformationPage.clickOnNextButton();
	}
}
