package com.project.actors;

import java.util.List;
import com.project.pages.ViewMasterCustomerSetPaymentInformationPage;
import com.psqframework.core.util.BaseStepListener;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewMasterCustomerSetPaymentInformationPage {
	
	@Steps
	ViewMasterCustomerSetPaymentInformationPage viewMasterCustomerSetPaymentInformationPage;
	
	public String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
	
	@Step
	public void verifyPaymentFrequencyDetails(DataTable viewPaymentFrequencyData) throws Throwable {
		
		//String strFeatureFilePath = CucumberWithSerenity.currentRuntimeOptions().getFeaturePaths().toString();
		
		List<List<String>> viewPaymentFrequencyDetails = viewPaymentFrequencyData.raw();
		
		for(int iteration=1;iteration<viewPaymentFrequencyDetails.size();iteration++)
		{
			String strFrequency = viewPaymentFrequencyDetails.get(iteration).get(0);
			String strStartDate  = viewPaymentFrequencyDetails.get(iteration).get(1);
			String strEndDate  = viewPaymentFrequencyDetails.get(iteration).get(2);
			String strNotes  = viewPaymentFrequencyDetails.get(iteration).get(3);
			
			if(strStartDate.isEmpty())
			{
				strStartDate = viewMasterCustomerSetPaymentInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
			}
			if(strEndDate.isEmpty())
			{
				strEndDate = viewMasterCustomerSetPaymentInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
			}
			
			String strPaymentFrequencyDetails = strFrequency+"*"+strStartDate+"*"+strEndDate+"*"+strNotes;
			
			viewMasterCustomerSetPaymentInformationPage.verifyPaymentFrequencyDetails(strPaymentFrequencyDetails);
		}
	}
	
	@Step
	public void verifyPaymentHistoryDetails(DataTable viewPaymentHistoryData) throws Throwable {
		
		List<List<String>> viewPaymentHistoryDetails = viewPaymentHistoryData.raw();
		
		for(int iteration=1;iteration<viewPaymentHistoryDetails.size();iteration++)
		{
			String strDate = viewPaymentHistoryDetails.get(iteration).get(0);
			String strAmount  = viewPaymentHistoryDetails.get(iteration).get(1);
			String strPayee  = viewPaymentHistoryDetails.get(iteration).get(2);
			String strPaymentType  = viewPaymentHistoryDetails.get(iteration).get(3);
			String strChannel  = viewPaymentHistoryDetails.get(iteration).get(4);
			String strSubmitDate  = viewPaymentHistoryDetails.get(iteration).get(5);
			String strPaymentIdentifier  = viewPaymentHistoryDetails.get(iteration).get(6);
			String strCustomerID  = viewPaymentHistoryDetails.get(iteration).get(7);
			String strNotes  = viewPaymentHistoryDetails.get(iteration).get(8);
			
			if(strDate.isEmpty())
			{
				strDate = viewMasterCustomerSetPaymentInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
			}
			if(strSubmitDate.isEmpty())
			{
				strSubmitDate = viewMasterCustomerSetPaymentInformationPage.getSubmittedDate();
			}
			
			String strPaymentHistoryDetails = strDate+"*"+strAmount+"*"+strPayee+"*"+strPaymentType+"*"+strChannel+"*"+strSubmitDate+"*"+strPaymentIdentifier+"*"+strCustomerID+"*"+strNotes;
			
			viewMasterCustomerSetPaymentInformationPage.verifyPaymentHistoryDetails(strPaymentHistoryDetails);
		}
	}
}