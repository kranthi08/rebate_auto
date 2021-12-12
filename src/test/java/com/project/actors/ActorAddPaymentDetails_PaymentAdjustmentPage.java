package com.project.actors;

import java.util.List;
import org.seleniumhq.jetty9.util.StringUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.pages.PaymentDetails_PaymentAdjustmentPage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddPaymentDetails_PaymentAdjustmentPage 
{
	@Steps
	PaymentDetails_PaymentAdjustmentPage paymentAdjustmentPage;
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	public static String strRequestName= "";
	
	public static String START_DATE,END_DATE,SUBMIT_DATE;
	
	@Step
	public void paymentDetailsTabSelection()throws Throwable
	{
		paymentAdjustmentPage.clickOnPaymentDetailsLink();
		
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		
		START_DATE = paymentAdjustmentPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate"); 
		END_DATE = paymentAdjustmentPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
					
		if(strFeatureFilePath.contains("Non_PartD"))
		{
			SUBMIT_DATE = paymentAdjustmentPage.getSubmitDate("Non_PartD");
		}
		else if(strFeatureFilePath.contains("PartD"))
		{
			SUBMIT_DATE = paymentAdjustmentPage.getSubmitDate("PartD");
		}
	}
	
	@Step
	public void verifyPaymentDetailsTabIsDisplayedOrNot()throws Throwable
	{
		paymentAdjustmentPage.verifyPageNavigatedToPaymentDetailsTab();
	}
	
	@Step
	public void verifyUserIsInPaymentDetailsTab() throws Throwable
	{
		paymentAdjustmentPage.verifyPageNavigatedToPaymentDetailsTab();
	}
	
	@Step
	public void expandPaymentAdjustmentPanel(DataTable panelName) throws Throwable
	{
		List<List<String>> panelValue = panelName.raw();
		
		String strPanelName = panelValue.get(1).get(0);
		paymentAdjustmentPage.verifyAndExpandThePaymentAdjustmentPanel(strPanelName);
	}
	
	@Step
	public void inputBelowDetailsInPaymentAdjustmentPanel(DataTable paymentAdjustments)throws Throwable
	{
		List<List<String>> paymentAdjustmentValues = paymentAdjustments.raw();
		
		for(int i=1;i<paymentAdjustmentValues.size();i++)
		{
			String strOperation = paymentAdjustmentValues.get(i).get(0);
			String strExistingRecord = paymentAdjustmentValues.get(i).get(1);
			String strName = paymentAdjustmentValues.get(i).get(2);
			String strStartDate = paymentAdjustmentValues.get(i).get(3);
			String strEndDate = paymentAdjustmentValues.get(i).get(4);
			String strInitialAdjustment = paymentAdjustmentValues.get(i).get(5);
			String strAdjustmentType = paymentAdjustmentValues.get(i).get(6);
			String strNotes = paymentAdjustmentValues.get(i).get(7);
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
			paymentAdjustmentPage.clickOnUpdateButtonAtPaymentAdjustmentPanel();
			
			switch(strOperation.toLowerCase())
			{
				case "add":
					if(StringUtil.isBlank(strName))
					{							
						strName = rxNovaCommonUtil.generateRandomID("test", 8);
					}
					paymentAdjustmentPage.setTextIntoNameEdit(strName);
					paymentAdjustmentPage.setTextIntoStartDateEdit(strStartDate);
					paymentAdjustmentPage.setTextIntoEndDateEdit(strEndDate);
					paymentAdjustmentPage.setTextIntoInitialAdjustmentEdit(strInitialAdjustment);
					paymentAdjustmentPage.selectItemFromAdjustmentTypeList(strAdjustmentType);
					paymentAdjustmentPage.setTextIntoNotesEdit(strNotes);
					paymentAdjustmentPage.clickOnPaymentAdjustmentAddOrUpdateButton();
					
					String strRecordToVerify = strName+"*"+strStartDate+"*"+strEndDate+"*"+"$"+strInitialAdjustment+".00"+"*"+"$0.00"+"*"+"$0.00"+"*"+strAdjustmentType+"*"+strNotes;
					
					paymentAdjustmentPage.verifyTheAddedRecordInPaymentDetailsPaymentAdjustmentTable(strRecordToVerify);
					strRequestName = strName;
					break;
				case "update":
					String strRecord = strRequestName+"*"+strStartDate+"*"+strEndDate+"*"+strExistingRecord;
					paymentAdjustmentPage.clickOnMatchingCheckBox(strRecord);
					paymentAdjustmentPage.clickOnPaymentAdjustmentTableUpdateButton();
					
					paymentAdjustmentPage.setTextIntoNameEdit(strRequestName);
					paymentAdjustmentPage.setTextIntoStartDateEdit(strStartDate);
					paymentAdjustmentPage.setTextIntoEndDateEdit(strEndDate);
					paymentAdjustmentPage.setTextIntoInitialAdjustmentEdit(strInitialAdjustment);
					paymentAdjustmentPage.selectItemFromAdjustmentTypeList(strAdjustmentType);
					paymentAdjustmentPage.setTextIntoNotesEdit(strNotes);
					paymentAdjustmentPage.clickOnPaymentAdjustmentAddOrUpdateButton();
					
					String strRecordToVerify1 = strRequestName+"*"+strStartDate+"*"+strEndDate+"*"+"$"+strInitialAdjustment+".00"+"*"+"$0.00"+"*"+"$0.00"+"*"+strAdjustmentType+"*"+strNotes;
					
					paymentAdjustmentPage.verifyTheAddedRecordInPaymentDetailsPaymentAdjustmentTable(strRecordToVerify1);
					break;
				case "remove":
					String strRemoveRecord = strRequestName+"*"+strStartDate+"*"+strEndDate+"*"+strExistingRecord;
					paymentAdjustmentPage.clickOnMatchingCheckBox(strRemoveRecord);
					paymentAdjustmentPage.clickOnPaymentAdjustmentTableRemoveButton();
					break;	
			}
					paymentAdjustmentPage.clickOnSaveButton();
		}			
	}
	
	@Step
	public void verifyTheAddedRecordInPaymentAdjustmentPanel(DataTable viewPaymentAdjustmentData) throws Throwable
	{
		List<List<String>> viewPaymentDetails = viewPaymentAdjustmentData.raw();
		
		String strName = viewPaymentDetails.get(1).get(0); 
		String strStartDate = viewPaymentDetails.get(1).get(1); 
		String strEndDate  = viewPaymentDetails.get(1).get(2); 
		String strInitialAdjustment  = viewPaymentDetails.get(1).get(3); 
		String strSubsequentAdjustment  = viewPaymentDetails.get(1).get(4);
		String strAdjustmentReconciliation = viewPaymentDetails.get(1).get(5); 
		String strAdjustmentType = viewPaymentDetails.get(1).get(6);
		String strNotes = viewPaymentDetails.get(1).get(7);
		
		if(strName.isEmpty())
		{
			strName = strRequestName;
		}
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
		
		String strDetails = strName+"*"+strStartDate+"*"+strEndDate+"*"+strInitialAdjustment+"*"+strSubsequentAdjustment+"*"+strAdjustmentReconciliation+"*"+strAdjustmentType+"*"+strNotes;
		paymentAdjustmentPage.verifyTheRecordAfterAdd(strDetails);
	}
	
	@Step
	public void verifyRecordAndClickOnCheckBoxAndImportClaimDetailFile(DataTable recordToVerify) throws Throwable
	{
		List<List<String>> verifyRecordDetails = recordToVerify.raw();
		
		String strName = verifyRecordDetails.get(1).get(0);
		String strStartDate = verifyRecordDetails.get(1).get(1);   
		String strEndDate = verifyRecordDetails.get(1).get(2);   
		String strInitialAdjustment = verifyRecordDetails.get(1).get(3);   
		String strSubsequentAdjustment = verifyRecordDetails.get(1).get(4);   
		String strAdjustmentReconciliation = verifyRecordDetails.get(1).get(5);   
		String strAdjustmentType = verifyRecordDetails.get(1).get(6);   
		String strNotes = verifyRecordDetails.get(1).get(7);   
		String strImport_Claim_Detail_Flie = verifyRecordDetails.get(1).get(8);
		String strLOB = verifyRecordDetails.get(1).get(9);
		String strTypeOfFile = verifyRecordDetails.get(1).get(10);
		if(strImport_Claim_Detail_Flie.isEmpty())
		{
			strImport_Claim_Detail_Flie = paymentAdjustmentPage.getFileName(strLOB,strTypeOfFile);
			strImport_Claim_Detail_Flie = System.getProperty("user.dir")+"\\target\\"+strImport_Claim_Detail_Flie;
		}
		
		paymentAdjustmentPage.clickOnUpdateButtonAtPaymentAdjustmentPanel();
		
		if(strName.isEmpty())
		{
			strName = strRequestName;
		}
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
		String strDetails = strName+"*"+strStartDate+"*"+strEndDate+"*"+strInitialAdjustment+"*"+strSubsequentAdjustment+"*"+strAdjustmentReconciliation+"*"+strAdjustmentType+"*"+strNotes;
		paymentAdjustmentPage.clickOnMatchingCheckBox(strDetails);
		paymentAdjustmentPage.clickOnImportClaimDetailButton();
		paymentAdjustmentPage.uploadTheClaimDetailFileUsingImportClaimDetailFile(strImport_Claim_Detail_Flie);
	
	}
	
	@Step
	public void claimDetailButtonSelection() throws Throwable
	{
		paymentAdjustmentPage.clickOnClaimDetailButton();		
	}
	
	@Step
	public void verifyPageNavigatedToAdjustmentClaimsSection() throws Throwable
	{
		paymentAdjustmentPage.verifyPageNavigatedToAdjustmentClaimsSection();
	}
	
	@Step
	public void verifyUserIsInAdjustmentClaimsSection()  throws Throwable
	{
		paymentAdjustmentPage.verifyPageNavigatedToAdjustmentClaimsSection();
	}
	
	@Step
	public void verifyTheAdjustmentClaimsHeaderLabel(DataTable headerLabelDetails) throws Throwable
	{
		List<List<String>> labelData = headerLabelDetails.raw();
		
		String strAdjustmentName = labelData.get(1).get(0);
		String strInitialAdjustment = labelData.get(1).get(1);
		String strAdjustmentType = labelData.get(1).get(2);
		String strStartDate = labelData.get(1).get(3);
		String strEndDate = labelData.get(1).get(4);
		if(strAdjustmentName.isEmpty())
		{
			strAdjustmentName = strRequestName;
		}
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
		
		paymentAdjustmentPage.verifyAdjustmentSectionFieldLabelData("Adjustment name:^"+strRequestName);
		paymentAdjustmentPage.verifyAdjustmentSectionFieldLabelData("Initial adjustment:^"+strInitialAdjustment);
		paymentAdjustmentPage.verifyAdjustmentSectionFieldLabelData("Adjustment type:^"+strAdjustmentType);
		paymentAdjustmentPage.verifyAdjustmentSectionFieldLabelData("Start date:^"+strStartDate);
		paymentAdjustmentPage.verifyAdjustmentSectionFieldLabelData("End date:^"+strEndDate);
	}
	
	@Step
	public void verifyAdjustedClaimsAndSelectForReconcile(DataTable claimsForReconcile) throws Throwable
	{
		List<List<String>> selectedClaimsDetails = claimsForReconcile.raw();
		
		for(int i=1;i<selectedClaimsDetails.size();i++)
		{
			String strClaim_Number = selectedClaimsDetails.get(i).get(0); 
			String Submit_Date  = selectedClaimsDetails.get(i).get(1);
			String strLine_Of_Business = selectedClaimsDetails.get(i).get(2);
			String strChannel  = selectedClaimsDetails.get(i).get(3); 
			String strInitial_Adjustment  = selectedClaimsDetails.get(i).get(4); 
			String strSubsequent_Adjustments  = selectedClaimsDetails.get(i).get(5);
			
			if(Submit_Date.isEmpty())
			{
				Submit_Date = SUBMIT_DATE;
			}
			
			String strClaimDetail = strClaim_Number+"*"+Submit_Date+"*"+strLine_Of_Business+"*"+strChannel+"*"+strInitial_Adjustment+"*"+strSubsequent_Adjustments;
			
			paymentAdjustmentPage.verifyTheAddedRecordInAdjustmentClaimsTable(strClaimDetail);
			paymentAdjustmentPage.clickOnMatchingCheckBoxInAdjustmentClaimsTable(strClaimDetail);
		}
	}
	
	@Step
	public void inputAllocationDateAndClickOnReconcileButton(DataTable allocationDate) throws Throwable
	{
		List<List<String>> allocationDateDetails = allocationDate.raw();
		
		String strAllocationDate = allocationDateDetails.get(1).get(0);
		if(strAllocationDate.isEmpty())
		{
			strAllocationDate = paymentAdjustmentPage.getSubmittedDate();
		}
		
		paymentAdjustmentPage.inpuTextIntoAdjustmentClaimsAllocationDateEdit(strAllocationDate);
		paymentAdjustmentPage.clickOnAdjustmentClaimsReconcileClaimsButton();
	}
	
	@Step
	public void verifyAndClickOnReconcileClaimsForReconcile(DataTable reconcileClaimsForRemove) throws Throwable
	{
		List<List<String>> selectedClaimsDetails = reconcileClaimsForRemove.raw();
		for(int i=1;i<selectedClaimsDetails.size();i++)
		{
			String strClaimNumber = selectedClaimsDetails.get(i).get(0);     
			String strSubmitDate = selectedClaimsDetails.get(i).get(1);
			String strLineOfBusiness = selectedClaimsDetails.get(i).get(2);
			String strChannel = selectedClaimsDetails.get(i).get(3);
			String strInitialAdjustment = selectedClaimsDetails.get(i).get(4);
			String strSubsequentAdjustments = selectedClaimsDetails.get(i).get(5);
			String strReconciliationAdjustment = selectedClaimsDetails.get(i).get(6);
			String strReconciliationDate = selectedClaimsDetails.get(i).get(7);
			String strAllocationDate = selectedClaimsDetails.get(i).get(8);
			if(strSubmitDate.isEmpty())
			{
				strSubmitDate = SUBMIT_DATE;
			}
			if(strAllocationDate.isEmpty())
			{
				strAllocationDate = paymentAdjustmentPage.getSubmittedDate();
			}
			if(strReconciliationDate.isEmpty())
			{
				strReconciliationDate = paymentAdjustmentPage.getCurrentDate();
			}
			
			String strDetails = strClaimNumber+"*"+strSubmitDate+"*"+strLineOfBusiness+"*"+strChannel+"*"+strInitialAdjustment+"*"+strSubsequentAdjustments+"*"+strReconciliationAdjustment+"*"+strReconciliationDate+"*"+strAllocationDate;
			paymentAdjustmentPage.verifyTheAddedRecordInReconcileClaimsTable(strDetails);
			paymentAdjustmentPage.clickOnMatchingCheckBoxInReconcileClaimsTable(strDetails);
		}
	}
	
	@Step
	public void inputRemoveAllocationDateAndClickOnRemoveReconcileClaimsButton(DataTable removeAllocationDate) throws Throwable
	{
		List<List<String>> removeallocationDateDetails = removeAllocationDate.raw();
		
		String strRemoveAllocationDate = removeallocationDateDetails.get(1).get(0);
		if(strRemoveAllocationDate.isEmpty())
		{
			strRemoveAllocationDate = paymentAdjustmentPage.getSubmittedDate();
		} 
		
		paymentAdjustmentPage.inpuTextIntoRemoveAllocationDateEdit(strRemoveAllocationDate);
		paymentAdjustmentPage.clickOnRemoveReconcileClaimsButton();
		
	}
		
}
