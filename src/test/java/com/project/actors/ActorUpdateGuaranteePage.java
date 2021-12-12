package com.project.actors;

import java.util.List;
import com.project.pages.UpdateGuaranteePage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUpdateGuaranteePage 
{
	@Steps
	UpdateGuaranteePage updateGuaranteePage;
	
	@Step
	public void updateDetailsInGuaranteeScreen(DataTable guaranteeScreenData) throws Throwable	
	{
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		
		List<List<String>> guaranteeScreenDetails = guaranteeScreenData.raw();
		
		for(int i = 1;i<guaranteeScreenDetails.size();i++)
		{
			String strOperation = guaranteeScreenDetails.get(i).get(0);
			String strExistingRecord = guaranteeScreenDetails.get(i).get(1);
		
			String strStartDate = guaranteeScreenDetails.get(i).get(2);
			String strEndDate = guaranteeScreenDetails.get(i).get(3);
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
			
			// =======================================		
			if(strStartDate.isEmpty())
			{
				strStartDate = updateGuaranteePage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
			}		
			if(strEndDate.isEmpty())
			{
				strEndDate = updateGuaranteePage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
			}						
			// =======================================
			String strFinalMatchingRecord = strStartDate+"*"+strEndDate+"*"+strExistingRecord;			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateGuaranteePage.setTextIntoStartDateEdit(strStartDate);
					updateGuaranteePage.setTextIntoEndDateEdit(strEndDate);
					updateGuaranteePage.setTextIntoVendorFormularyIDEdit(strVendorFormularyID);
					updateGuaranteePage.selectValueFromVendorFormularyTypeList(strVendorFormularyType);
					updateGuaranteePage.selectValueFromDSTFormularyTypeList(strDSTFormularyType);
					updateGuaranteePage.setTextIntoTierTypeEdit(strTierType);
					updateGuaranteePage.selectValueFromChannelList(strChannel);
					updateGuaranteePage.selectValueFromLineOfBusinessList(strLineOfBusiness);
					updateGuaranteePage.setTextIntoVendorBrandGuaranteeEdit(strVendorBrandGuarantee);
					updateGuaranteePage.setTextIntoCustomerBrandGuaranteeEdit(strCustomerBrandGuarantee);
					updateGuaranteePage.selectValueFromBenefitDesignList(strBenefitDesign);
					updateGuaranteePage.selectValueFromUMOptionList(strUMOption);
					updateGuaranteePage.setTextIntoBenefitDesignDescriptionNotesEdit(strBenefitDesignDescriptionNotes);
					updateGuaranteePage.setTextIntoPlanDesignNotesEdit(strPlanDesignNotes);
					updateGuaranteePage.setTextIntoUMOptionNotesEdit(strUMOptionNotes);
					updateGuaranteePage.setTextIntoFormularyDesignNotesEdit(strFormularyDesignNotes);
					updateGuaranteePage.clickOnUpdateAddOrUpdateButton();
					break;
				case "UPDATE":
					updateGuaranteePage.clickOnUpdateGuaranteePanelUpdateButton();
					updateGuaranteePage.clickOnRequiredMatchingCheckBox(strFinalMatchingRecord);
					updateGuaranteePage.clickOnUpdateTableUpdateButton();
			
					updateGuaranteePage.setTextIntoStartDateEdit(strStartDate);
					updateGuaranteePage.setTextIntoEndDateEdit(strEndDate);
					updateGuaranteePage.setTextIntoVendorFormularyIDEdit(strVendorFormularyID);
					updateGuaranteePage.selectValueFromVendorFormularyTypeList(strVendorFormularyType);
					updateGuaranteePage.selectValueFromDSTFormularyTypeList(strDSTFormularyType);
					updateGuaranteePage.setTextIntoTierTypeEdit(strTierType);
					updateGuaranteePage.selectValueFromChannelList(strChannel);
					updateGuaranteePage.selectValueFromLineOfBusinessList(strLineOfBusiness);
					updateGuaranteePage.setTextIntoVendorBrandGuaranteeEdit(strVendorBrandGuarantee);
					updateGuaranteePage.setTextIntoCustomerBrandGuaranteeEdit(strCustomerBrandGuarantee);
					updateGuaranteePage.selectValueFromBenefitDesignList(strBenefitDesign);
					updateGuaranteePage.selectValueFromUMOptionList(strUMOption);
					updateGuaranteePage.setTextIntoBenefitDesignDescriptionNotesEdit(strBenefitDesignDescriptionNotes);
					updateGuaranteePage.setTextIntoPlanDesignNotesEdit(strPlanDesignNotes);
					updateGuaranteePage.setTextIntoUMOptionNotesEdit(strUMOptionNotes);
					updateGuaranteePage.setTextIntoFormularyDesignNotesEdit(strFormularyDesignNotes);
					updateGuaranteePage.clickOnUpdateAddOrUpdateButton();
					break;
				case "REMOVE":
					updateGuaranteePage.clickOnRequiredMatchingCheckBox(strFinalMatchingRecord);
					updateGuaranteePage.clickOnGuaranteeUpdateTableRemoveButton();
					break;
			}
		}
		updateGuaranteePage.clickOnSaveButton();
	}
}
