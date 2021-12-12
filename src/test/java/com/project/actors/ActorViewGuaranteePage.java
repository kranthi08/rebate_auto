package com.project.actors;

import java.util.List;
import org.seleniumhq.jetty9.util.StringUtil;
import com.project.pages.ViewGuaranteePage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewGuaranteePage 
{
	@Steps
	ViewGuaranteePage viewGuaranteePage;
	
	@Step
	public void expand_guarantee_panel(DataTable PanelName) throws Throwable
	{
		List<List<String>> panelData = PanelName.raw();
		
		String strPanelName = panelData.get(1).get(0);
		viewGuaranteePage.expand_Guarantee_View_GuaranteePanel(strPanelName);
	}
	
	@Step
	public void verify_guarantee_details(DataTable guaranteeTableData) throws Throwable
	{
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		List<List<String>> guaranteeDetails = guaranteeTableData.raw();
		
		String strStartDate = guaranteeDetails.get(1).get(0);
		String strEndDate = guaranteeDetails.get(1).get(1);
		if(StringUtil.isBlank(strStartDate)) 
		{
			strStartDate = viewGuaranteePage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
		}
		if(StringUtil.isBlank(strEndDate)) 
		{
			strEndDate = viewGuaranteePage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
		}
		String VendorFormularyID = guaranteeDetails.get(1).get(2);
		String strVendorFormularyType = guaranteeDetails.get(1).get(3);
		String strDSTFormularyType = guaranteeDetails.get(1).get(4);
		String strTierType = guaranteeDetails.get(1).get(5);
		String strChannel = guaranteeDetails.get(1).get(6);
		String strLineOfBusiness = guaranteeDetails.get(1).get(7);
		String strVendorBrandGuarantee = guaranteeDetails.get(1).get(8);
		String strCustomerBrandGuarantee = guaranteeDetails.get(1).get(9);
		String strBenefitDesign = guaranteeDetails.get(1).get(10);
		String strUMOption = guaranteeDetails.get(1).get(11);
		
		String strguarantee_details = strStartDate+"*"+strEndDate+"*"+VendorFormularyID+"*"+strVendorFormularyType+"*"+strDSTFormularyType+"*"+strTierType+"*"+strChannel+"*"+strLineOfBusiness+"*"+strVendorBrandGuarantee+"*"+strCustomerBrandGuarantee+"*"+strBenefitDesign+"*"+strUMOption;
		
		viewGuaranteePage.verifyGuaranteeTableData(strguarantee_details);
		
		//String strBenefitDesignDescNotes = guaranteeDetails.get(1).get(12);   
		//String strPlanDesignNotes = guaranteeDetails.get(1).get(13);   
		//String strUMOptionNotes = guaranteeDetails.get(1).get(14);   
		//String strFormularyDesignNotes = guaranteeDetails.get(1).get(15);
		
		//String strSearchText = strStartDate+"*"+strEndDate+"*"+VendorFormularyID+"*"+strVendorFormularyType+"*"+strDSTFormularyType+"*"+strTierType+"*"+strChannel;
		//viewGuaranteePage.clickOnCheckBoxAtGuaranteePanelTable(strSearchText);
		//viewGuaranteePage.clickOnGuaranteeViewBrowseNotesButton();
		
		//viewGuaranteePage.compareTheTextFromBrowseNotesBenefitDesignDescriptionNotes_Edit(strBenefitDesignDescNotes);
		//viewGuaranteePage.compareTheTextFromBrowseNotesPlanDesignNotes_Edit(strPlanDesignNotes);
		//viewGuaranteePage.compareTheTextFromBrowseNotesUMOptionNotes_Edit(strUMOptionNotes);
		//viewGuaranteePage.compareTheTextFromBrowseNotesFormularyDesignNotes_Edit(strFormularyDesignNotes);
		//viewGuaranteePage.clickOnGuaranteeViewBrowseNotesCloseButton();
		
		//viewGuaranteePage.clickOnCheckBoxAtGuaranteePanelTable(strSearchText);
	}
	
}
