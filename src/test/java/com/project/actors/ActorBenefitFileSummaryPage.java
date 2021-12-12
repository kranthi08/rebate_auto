package com.project.actors;

import java.util.List;

import com.project.pages.BenefitFileSummaryPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorBenefitFileSummaryPage 
{
	@Steps
	BenefitFileSummaryPage benefitFileSummaryTab;
	
	@Step
	public void benefitFileTabSelection() throws Throwable
	{
		benefitFileSummaryTab.clickOnBenefitFileSummaryTabLink();		
	}
	
	@Step
	public void benefitPageShouldBeDisplayed() throws Throwable
	{
		benefitFileSummaryTab.BenefitFileSummaryTabShouldBeDisplayed();
	}
	
	@Step
	public void verifyUserIsInBenefitFileSummaryTabOrNot() throws Throwable
	{		
		benefitFileSummaryTab.UserIsInBenefitFileSummaryTab();
	}
	
	@Step
	public void expandBenefitFileSummaryTab(DataTable panelName)throws Throwable
	{
		List<List<String>> panelDetails = panelName.raw();
		String strPanel_Name = panelDetails.get(1).get(0);
		
		benefitFileSummaryTab.verifyAndExpandThePanel(strPanel_Name);		
	}
	
	public void selectTheLineOfBusiness(DataTable LOB) throws Throwable
	{
		List<List<String>> lobValue = LOB.raw();
		
		String strLOBItem = lobValue.get(1).get(0);
		
		benefitFileSummaryTab.selectTheLineOfBusiness(strLOBItem);
	}
	
	@Step
	public void performRunPreliminaryExtractAndVerifyStatus() throws Throwable
	{
		benefitFileSummaryTab.clickOnRunPreliminaryExtractButton();
		benefitFileSummaryTab.verifyRunPreliminaryExtractStatus("Complete");
	}
	
	@Step
	public void verifyBenefitFileSummaryPreliminaryExtractionResults(DataTable preliminaryExtractionResults) throws Throwable
	{
		List<List<String>> preliminaryResultValues = preliminaryExtractionResults.raw();
		
		String Prelim_Results_As_of = preliminaryResultValues.get(1).get(0);
		String Prelim_Results_Process_Date = preliminaryResultValues.get(1).get(1); 
		String Prelim_Results_Vendor_Formulary_ID = preliminaryResultValues.get(1).get(2); 
		String Prelim_Results_Line_Of_Business = preliminaryResultValues.get(1).get(3); 
		String Prelim_Results_Tier_Selection = preliminaryResultValues.get(1).get(4); 
		String Prelim_Results_Hospice_Facility = preliminaryResultValues.get(1).get(5); 
		String Prelim_Results_Prior_Authorization_Program = preliminaryResultValues.get(1).get(6); 
		String Prelim_Results_Step_Therapy_Program = preliminaryResultValues.get(1).get(7);
		String Prelim_Results_UM_Bundle_Diabetes = preliminaryResultValues.get(1).get(8);
		String Prelim_Results_UM_Bundle_Respiratory = preliminaryResultValues.get(1).get(9);
		String Prelim_Results_UM_Bundle_Specialty = preliminaryResultValues.get(1).get(10);
		String Prelim_Results_UM_Bundle_Miscellaneous = preliminaryResultValues.get(1).get(11);
		String Prelim_Results_TNFRA_UM = preliminaryResultValues.get(1).get(12);
		String Prelim_Results_HCV_Harvoni_UM_with_ST = preliminaryResultValues.get(1).get(13);
		String Prelim_Results_HCV_Solvaldi_UM_without_ST = preliminaryResultValues.get(1).get(14);
		String Prelim_Results_HCV_Mavyret_Tiering = preliminaryResultValues.get(1).get(15);
		String Prelim_Results_HCV_Epclusa_UM = preliminaryResultValues.get(1).get(16);
		
		String strBenefitFileDateFormat = benefitFileSummaryTab.verifyPreliminaryBenefitFileSummaryTabDateFormat();
		String strProcessDate = benefitFileSummaryTab.getBenefitFileTabProcessDate();
		
		benefitFileSummaryTab.verifyBenefitFileSummaryTabPreliminaryResultDateFormat(Prelim_Results_As_of+strBenefitFileDateFormat);
		benefitFileSummaryTab.verifyBenefitFileSummaryTabPreliminaryResultDateFormat(Prelim_Results_Process_Date+strProcessDate);
		
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_Vendor_Formulary_ID);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_Line_Of_Business);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_Tier_Selection);		
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_Hospice_Facility);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_Prior_Authorization_Program);
		
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_Step_Therapy_Program);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_UM_Bundle_Diabetes);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_UM_Bundle_Respiratory);		
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_UM_Bundle_Specialty);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_UM_Bundle_Miscellaneous);
		
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_TNFRA_UM);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_HCV_Harvoni_UM_with_ST);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_HCV_Solvaldi_UM_without_ST);		
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_HCV_Mavyret_Tiering);
		benefitFileSummaryTab.verifyPreliminaryExtractionsResults(Prelim_Results_HCV_Epclusa_UM);
				
	}
	
	@Step
	public void verifyBenefitFileSummaryFinalExtractionResults(DataTable finalExtractionResults) throws Throwable
	{
		List<List<String>> finalResultValues = finalExtractionResults.raw();
		
		String Final_Results_As_of = finalResultValues.get(1).get(0);
		String Final_Results_Process_Date = finalResultValues.get(1).get(1); 
		String Final_Results_Vendor_Formulary_ID = finalResultValues.get(1).get(2); 
		String Final_Results_Line_Of_Business = finalResultValues.get(1).get(3); 
		String Final_Results_Tier_Selection = finalResultValues.get(1).get(4); 
		String Final_Results_Hospice_Facility = finalResultValues.get(1).get(5); 
		String Final_Results_Prior_Authorization_Program = finalResultValues.get(1).get(6); 
		String Final_Results_Step_Therapy_Program = finalResultValues.get(1).get(7);
		String Final_Results_UM_Bundle_Diabetes = finalResultValues.get(1).get(8);
		String Final_Results_UM_Bundle_Respiratory = finalResultValues.get(1).get(9);
		String Final_Results_UM_Bundle_Specialty = finalResultValues.get(1).get(10);
		String Final_Results_UM_Bundle_Miscellaneous = finalResultValues.get(1).get(11);
		String Final_Results_TNFRA_UM = finalResultValues.get(1).get(12);
		String Final_Results_HCV_Harvoni_UM_with_ST = finalResultValues.get(1).get(13);
		String Final_Results_HCV_Solvaldi_UM_without_ST = finalResultValues.get(1).get(14);
		String Final_Results_HCV_Mavyret_Tiering = finalResultValues.get(1).get(15);
		String Final_Results_HCV_Epclusa_UM = finalResultValues.get(1).get(16);
		
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_As_of);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_Process_Date);
		
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_Vendor_Formulary_ID);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_Line_Of_Business);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_Tier_Selection);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_Hospice_Facility);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_Prior_Authorization_Program);
		
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_Step_Therapy_Program);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_UM_Bundle_Diabetes);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_UM_Bundle_Respiratory);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_UM_Bundle_Specialty);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_UM_Bundle_Miscellaneous);
		
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_TNFRA_UM);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_HCV_Harvoni_UM_with_ST);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_HCV_Solvaldi_UM_without_ST);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_HCV_Mavyret_Tiering);
		benefitFileSummaryTab.verifyFinalExtractionsResults(Final_Results_HCV_Epclusa_UM);
				
	}
		
}
