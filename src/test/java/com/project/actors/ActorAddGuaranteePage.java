package com.project.actors;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Step;
import java.util.List;
import com.project.pages.AddGuaranteePage;
import com.psqframework.core.util.BaseStepListener;

import cucumber.api.DataTable;

public class ActorAddGuaranteePage 
{
	@Steps
	AddGuaranteePage addGuaranteePage;
	
	public static String START_DATE,END_DATE;
	
	
	@Step
	public void verifyGuaranteeScreenDisplay() throws Throwable
	{
		addGuaranteePage.verifyGuaranteePanelIsDisplayed();
		
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		START_DATE = addGuaranteePage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
		END_DATE = addGuaranteePage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
	}
	@Step
	public void verifyUserIsOnGuranteeScreen()	throws Throwable
	{
		addGuaranteePage.verifyGuaranteePanelIsDisplayed();
	}
	
	@Step
	public void submitTheDetailsInGuaranteeScreen(DataTable guaranteePanelData) throws Throwable
	{		
		List<List<String>>guaranteeScreenDetails = guaranteePanelData.raw();
		for(int i = 1;i<guaranteeScreenDetails.size();i++)
		{
			String strOperation = guaranteeScreenDetails.get(i).get(0);
			String strExistingRecord = guaranteeScreenDetails.get(i).get(1);		
			String strStartDate = guaranteeScreenDetails.get(i).get(2);
			String strEndDate = guaranteeScreenDetails.get(i).get(3);
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
			String strVendorFormularyID = guaranteeScreenDetails.get(i).get(4);
			String strVendorFormularyType = guaranteeScreenDetails.get(i).get(5);
			String strDSTFormularyType = guaranteeScreenDetails.get(i).get(6);
			String strTierType = guaranteeScreenDetails.get(i).get(7);
			String strChannel = guaranteeScreenDetails.get(i).get(8); 
			String strLineOfBusiness = guaranteeScreenDetails.get(i).get(9);
			String strVendorBrandGuarantee = guaranteeScreenDetails.get(i).get(10);
			String strCustomerBrandGuarantee = guaranteeScreenDetails.get(i).get(11);
			String strBenefitDesign = guaranteeScreenDetails.get(i).get(12);
			String strUMOption = guaranteeScreenDetails.get(i).get(13);
			String strBenefitDesignDescriptionNotes = guaranteeScreenDetails.get(i).get(14);
			String strPlanDesignNotes = guaranteeScreenDetails.get(i).get(15);
			String strUMOptionNotes = guaranteeScreenDetails.get(i).get(16);
			String strFormularyDesignNotes = guaranteeScreenDetails.get(i).get(17);		
			switch(strOperation.toUpperCase())
			{
			case "ADD":
				addGuaranteePage.setTextIntoStartDateEdit(strStartDate);
				addGuaranteePage.setTextIntoEndDateEdit(strEndDate);
				addGuaranteePage.setTextIntoVendorFormularyIDEdit(strVendorFormularyID);
				addGuaranteePage.selectValueFromVendorFormularyTypeList(strVendorFormularyType);
				addGuaranteePage.selectValueFromDSTFormularyTypeList(strDSTFormularyType);
				addGuaranteePage.setTextIntoTierTypeEdit(strTierType);
				addGuaranteePage.selectValueFromChannelList(strChannel);
				addGuaranteePage.selectValueFromLineOfBusinessList(strLineOfBusiness);
				addGuaranteePage.setTextIntoVendorBrandGuaranteeEdit(strVendorBrandGuarantee);
				addGuaranteePage.setTextIntoCustomerBrandGuaranteeEdit(strCustomerBrandGuarantee);
				addGuaranteePage.selectValueFromBenefitDesignList(strBenefitDesign);
				addGuaranteePage.selectValueFromUMOptionList(strUMOption);
				addGuaranteePage.setTextIntoBenefitDesignDescriptionNotesEdit(strBenefitDesignDescriptionNotes);
				addGuaranteePage.setTextIntoPlanDesignNotesEdit(strPlanDesignNotes);
				addGuaranteePage.setTextIntoUMOptionNotesEdit(strUMOptionNotes);
				addGuaranteePage.setTextIntoFormularyDesignNotesEdit(strFormularyDesignNotes);
				addGuaranteePage.clickOnAddButton();
				break;
			case "UPDATE":			
				addGuaranteePage.clickOnRequiredMatchingCheckBox(strExistingRecord);
				addGuaranteePage.clickOnUpdateButtonInGuaranteePanelTable();			
				addGuaranteePage.setTextIntoStartDateEdit(strStartDate);
				addGuaranteePage.setTextIntoEndDateEdit(strEndDate);
				addGuaranteePage.setTextIntoVendorFormularyIDEdit(strVendorFormularyID);
				addGuaranteePage.selectValueFromVendorFormularyTypeList(strVendorFormularyType);
				addGuaranteePage.selectValueFromDSTFormularyTypeList(strDSTFormularyType);
				addGuaranteePage.setTextIntoTierTypeEdit(strTierType);
				addGuaranteePage.selectValueFromChannelList(strChannel);
				addGuaranteePage.selectValueFromLineOfBusinessList(strLineOfBusiness);
				addGuaranteePage.setTextIntoVendorBrandGuaranteeEdit(strVendorBrandGuarantee);
				addGuaranteePage.setTextIntoCustomerBrandGuaranteeEdit(strCustomerBrandGuarantee);
				addGuaranteePage.selectValueFromBenefitDesignList(strBenefitDesign);
				addGuaranteePage.selectValueFromUMOptionList(strUMOption);
				addGuaranteePage.setTextIntoBenefitDesignDescriptionNotesEdit(strBenefitDesignDescriptionNotes);
				addGuaranteePage.setTextIntoPlanDesignNotesEdit(strPlanDesignNotes);
				addGuaranteePage.setTextIntoUMOptionNotesEdit(strUMOptionNotes);
				addGuaranteePage.setTextIntoFormularyDesignNotesEdit(strFormularyDesignNotes);
				addGuaranteePage.clickOnAddButton();
				break;
			case "REMOVE":
				addGuaranteePage.clickOnRequiredMatchingCheckBox(strExistingRecord);
				addGuaranteePage.clickOnRemoveButtonInGuaranteePanelTable();
				break;
			}
			addGuaranteePage.veifyGuaranteeTableData(strStartDate+"^"+strEndDate);
		}		
	}
	
	@Step
	public void nextButtonClickInGuaranteeScreen()	throws Throwable
	{
		addGuaranteePage.clickOnNextButton();
	}
}
