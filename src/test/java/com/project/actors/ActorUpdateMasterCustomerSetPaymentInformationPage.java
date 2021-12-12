package com.project.actors;

import java.util.List;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.project.pages.UpdateMasterCustomerSetPaymentInformationPage;
import com.psqframework.core.util.BaseStepListener;
public class ActorUpdateMasterCustomerSetPaymentInformationPage {
	
	@Steps
	
	UpdateMasterCustomerSetPaymentInformationPage updateMasterCustomerSetPaymentInformationPage;
	
	@Step
	public void clickOnPaymentDetailsTab() throws Throwable {		
		updateMasterCustomerSetPaymentInformationPage.clickOnPaymentDetailsTab();
	}
	
	@Step
	public void verifyPaymentDetailsTab() throws Throwable {
		updateMasterCustomerSetPaymentInformationPage.verifyPaymentDetailsTabIsDisplayed();
	}
	
	@Step
	public void expandMasterCustomerSetPaymentInformationPanel(DataTable panelName) throws Throwable
	{
		List<List<String>>panelDetails = panelName.raw();
		
		String strPanelName = panelDetails.get(1).get(0);		
		
		updateMasterCustomerSetPaymentInformationPage.expandMasterCustomerSetPaymentInformationPanel(strPanelName);
	}
	
	@Step
	
	public void updatePaymentFrequencyDetails(DataTable paymentFrequencyData) throws Throwable {
		
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
				
		List<List<String>> paymentFrequencyDetails = paymentFrequencyData.raw();

		updateMasterCustomerSetPaymentInformationPage.clickOnMCSPIUpdateButton();
		updateMasterCustomerSetPaymentInformationPage.verifyMasterCustomerSetPaymentInformationIsDisplayed();
		
		for(int iteration=1;iteration<paymentFrequencyDetails.size();iteration++)
		{
			String strOperation = paymentFrequencyDetails.get(iteration).get(0);
			String strSelectedPaymentFrequency = paymentFrequencyDetails.get(iteration).get(1);
			String strFrequency = paymentFrequencyDetails.get(iteration).get(2);
			String strStartDate  = paymentFrequencyDetails.get(iteration).get(3);
			String strEndDate  = paymentFrequencyDetails.get(iteration).get(4);
			String strNotes  = paymentFrequencyDetails.get(iteration).get(5);
			
			if(strStartDate.isEmpty())
			{
				strStartDate = updateMasterCustomerSetPaymentInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
			}
			
			if(strEndDate.isEmpty())
			{
				strEndDate = updateMasterCustomerSetPaymentInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
			}
			
 			String strPaymentFrequencyDetails = "";
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateMasterCustomerSetPaymentInformationPage.selectPaymentFrequency(strFrequency);
					updateMasterCustomerSetPaymentInformationPage.setPaymentFrequencyStartDate(strStartDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentFrequencyEndDate(strEndDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentFrequencyNotes(strNotes);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentFrequencyAddButton();
					
					strPaymentFrequencyDetails = strFrequency+"*"+strStartDate+"*"+strEndDate+"*"+strNotes;
										
					updateMasterCustomerSetPaymentInformationPage.verifyPaymentFrequencyDetails(strPaymentFrequencyDetails);
					break;
				case "UPDATE":
					String strRecord = strStartDate+"*"+strEndDate+"*"+strSelectedPaymentFrequency;
					updateMasterCustomerSetPaymentInformationPage.updateSelectedPaymentFrequency(strRecord);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentFrequencyUpdateButton();
					updateMasterCustomerSetPaymentInformationPage.selectPaymentFrequency(strFrequency);
					updateMasterCustomerSetPaymentInformationPage.setPaymentFrequencyStartDate(strStartDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentFrequencyEndDate(strEndDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentFrequencyNotes(strNotes);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentFrequencyAddButton();
					if(strFrequency.isEmpty())
					{
						strFrequency = "Monthly";						
					}
					strPaymentFrequencyDetails = strFrequency+"*"+strStartDate+"*"+strEndDate+"*"+strNotes;
										
					updateMasterCustomerSetPaymentInformationPage.verifyPaymentFrequencyDetails(strPaymentFrequencyDetails);
					break;
				case "REMOVE":
					String strRecord1 = strStartDate+"*"+strEndDate+"*"+strSelectedPaymentFrequency;
					updateMasterCustomerSetPaymentInformationPage.updateSelectedPaymentFrequency(strRecord1);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentFrequencyRemoveButton();
					break;
			}
		}		
		updateMasterCustomerSetPaymentInformationPage.clickOnSaveButton();		
	}
	
	@Step
	public void updatePaymentHistoryDetails(DataTable paymentHistoryData) throws Throwable {
		
		List<List<String>> paymentHistoryDetails = paymentHistoryData.raw();
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		
		updateMasterCustomerSetPaymentInformationPage.clickOnMCSPIUpdateButton();
		updateMasterCustomerSetPaymentInformationPage.verifyMasterCustomerSetPaymentInformationIsDisplayed();
		
		for(int iteration=1;iteration<paymentHistoryDetails.size();iteration++)
		{
			String strOperation = paymentHistoryDetails.get(iteration).get(0);
			String strSelectedPaymentHistory = paymentHistoryDetails.get(iteration).get(1);
			String strDate = paymentHistoryDetails.get(iteration).get(2);
			String strAmount  = paymentHistoryDetails.get(iteration).get(3);
			String strPayee  = paymentHistoryDetails.get(iteration).get(4);
			String strPaymentType  = paymentHistoryDetails.get(iteration).get(5);
			String strChannel  = paymentHistoryDetails.get(iteration).get(6);
			String strSubmitDate  = paymentHistoryDetails.get(iteration).get(7);
			String strPaymentIdentifier  = paymentHistoryDetails.get(iteration).get(8);
			String strCustomerID  = paymentHistoryDetails.get(iteration).get(9);
			String strNotes  = paymentHistoryDetails.get(iteration).get(10);	
			
			if(strDate.isEmpty())
			{
				strDate = updateMasterCustomerSetPaymentInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
			}
			if(strSubmitDate.isEmpty())
			{
				strSubmitDate = updateMasterCustomerSetPaymentInformationPage.getTheSubmittedDate();
			}
			
			String strPaymentHistoryDetails = "";
			
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryDate(strDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryAmount(strAmount);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryPayee(strPayee);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryPaymentType(strPaymentType);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryChannel(strChannel);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistorySubmitDate(strSubmitDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryPaymentIdentifier(strPaymentIdentifier);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryCustomerID(strCustomerID);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryNotes(strNotes);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentHistoryAddButton();
					if(strCustomerID.startsWith("0"))
					{
						strCustomerID = strCustomerID.substring(1);						
					}
					strPaymentHistoryDetails = strDate+"*"+strAmount+"*"+strPayee+"*"+strPaymentType+"*"+strChannel+"*"+strSubmitDate+"*"+strPaymentIdentifier+"*"+strCustomerID+"*"+strNotes;
					
					updateMasterCustomerSetPaymentInformationPage.verifyPaymentHistoryDetails(strPaymentHistoryDetails);
					break;
				case "UPDATE":
					String strRecordToUpdate = null;
					if(strSelectedPaymentHistory.contains("!"))
					{
						String[] arrPaymentHistory = strSelectedPaymentHistory.split("!");
						strRecordToUpdate = strDate+"*"+arrPaymentHistory[0]+"*"+strSubmitDate+"*"+arrPaymentHistory[1];
					}
					updateMasterCustomerSetPaymentInformationPage.updateSelectedPaymentHistory(strRecordToUpdate);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentHistoryUpdateButton();
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryDate(strDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryAmount(strAmount);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryPayee(strPayee);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryPaymentType(strPaymentType);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryChannel(strChannel);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistorySubmitDate(strSubmitDate);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryPaymentIdentifier(strPaymentIdentifier);
					updateMasterCustomerSetPaymentInformationPage.selectPaymentHistoryCustomerID(strCustomerID);
					updateMasterCustomerSetPaymentInformationPage.setPaymentHistoryNotes(strNotes);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentHistoryAddButton();
					if(strCustomerID.startsWith("0"))
					{
						strCustomerID = strCustomerID.substring(1);						
					}
					strPaymentHistoryDetails = strDate+"*"+strAmount+"*"+strPayee+"*"+strPaymentType+"*"+strChannel+"*"+strSubmitDate+"*"+strPaymentIdentifier+"*"+strCustomerID+"*"+strNotes;					
					
					updateMasterCustomerSetPaymentInformationPage.verifyPaymentHistoryDetails(strPaymentHistoryDetails);
					break;
				case "REMOVE":
					String strRemoveRecord = null;
					if(strSelectedPaymentHistory.contains("!"))
					{
						String[] arrPaymentHistory = strSelectedPaymentHistory.split("!");
						strRemoveRecord = strDate+"*"+arrPaymentHistory[0]+"*"+strSubmitDate+"*"+arrPaymentHistory[1];
					}
					updateMasterCustomerSetPaymentInformationPage.updateSelectedPaymentHistory(strRemoveRecord);
					updateMasterCustomerSetPaymentInformationPage.clickOnPaymentHistoryRemoveButton();
			}
		}
		updateMasterCustomerSetPaymentInformationPage.clickOnSaveButton();				
	}
}	
