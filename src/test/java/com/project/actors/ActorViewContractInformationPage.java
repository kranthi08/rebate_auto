package com.project.actors;

import java.util.List;
import org.seleniumhq.jetty9.util.StringUtil;
import com.project.common.util.RebateCommonUtil;
import com.project.pages.ViewContractInformationPage;
import com.psqframework.core.page.BasePage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewContractInformationPage extends BasePage 
{
	@Steps
	ViewContractInformationPage viewContractInformationPage;
	
	public static String START_DATE,END_DATE;
	
	@Step
	public void verifyTheContractTabDisplay() throws Throwable
	{
		viewContractInformationPage.verifyContactTabIsDisplayedOrNot();
		
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		
		START_DATE = viewContractInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
		END_DATE = viewContractInformationPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
	}
	
	@Step
	public void viewAndVerifyTheVendorContractDetails(DataTable strVendorAndContractTableData)	throws Throwable
	{
		List<List<String>> strvendorContractDetails = strVendorAndContractTableData.raw();
		
		String strVendor = strvendorContractDetails.get(1).get(0);
		String strVendorContractType = strvendorContractDetails.get(1).get(1);
		String strVendorClaimBasis = strvendorContractDetails.get(1).get(2);
		String strVendorDaySupply = strvendorContractDetails.get(1).get(3);
		String strClientType = strvendorContractDetails.get(1).get(4);		
		String strMasterCustomerSet = strvendorContractDetails.get(1).get(5);
		String strCustomerID = strvendorContractDetails.get(1).get(6);
		String strContractName = strvendorContractDetails.get(1).get(7);
		String strReclassificationDrugVendor = strvendorContractDetails.get(1).get(8);
		String strContractID = strvendorContractDetails.get(1).get(9);	
		String strInternalExternal = strvendorContractDetails.get(1).get(10);
		String strContractLineOfBusiness = strvendorContractDetails.get(1).get(11);
		String strContractType = strvendorContractDetails.get(1).get(12);
		String strClaimBasis = strvendorContractDetails.get(1).get(13);
		String strStartDate = strvendorContractDetails.get(1).get(14);
		String strEndDate = strvendorContractDetails.get(1).get(15);
		String strReclassifyClaimsFromAcceptedToReject = strvendorContractDetails.get(1).get(16);
		String strReclassifyOnly = strvendorContractDetails.get(1).get(17);
		String strMonthlyPenalty = strvendorContractDetails.get(1).get(18);
		String strMinimumClaimsToAvoidPenalty = strvendorContractDetails.get(1).get(19);
		String strPenaltyStartDate = strvendorContractDetails.get(1).get(20);
		String strPenaltyEndDate = strvendorContractDetails.get(1).get(21);
		
		if(StringUtil.isBlank(strContractName))  {	strContractName = RebateCommonUtil.CONTRACT_NAME; }
		
		if(StringUtil.isBlank(strContractID)) {	strContractID = RebateCommonUtil.CONTRACT_ID;	}
		
		if(StringUtil.isBlank(strStartDate)) {	strStartDate = START_DATE;	}
		
		if(StringUtil.isBlank(strEndDate)) {	strEndDate = END_DATE;	}
		
		if(StringUtil.isBlank(strPenaltyStartDate)) {	strPenaltyStartDate = START_DATE;	}
		if(StringUtil.isBlank(strPenaltyEndDate)) {	strPenaltyEndDate = END_DATE;}
		
		String strVendorDetails = strVendor + "*" + strVendorContractType + "*" + strVendorClaimBasis +"*"+ strVendorDaySupply +"*"+ strClientType;
		String strCustomerDetails  = strMasterCustomerSet +"*"+ strCustomerID +"*"+ strContractName+"*"+ strReclassificationDrugVendor +"*"+ strContractID;
		String strContractDetails = strInternalExternal + "*" + strContractLineOfBusiness + "*" + strContractType + "*" + strClaimBasis;
		String strDateDetails = strStartDate + "*" + strEndDate;		
		String strVendorContractDetails = strVendorDetails + "*" + strCustomerDetails + "*" + strContractDetails + "*" + strDateDetails;
		
		String strPenaltyTableDetails = strMonthlyPenalty + "*"+strMinimumClaimsToAvoidPenalty+"*"+strPenaltyStartDate+"*"+strPenaltyEndDate;
		
		viewContractInformationPage.verifyContractAndVendorInformation(strVendorContractDetails);
		
		viewContractInformationPage.verifyReclassifyClaimsFromAcceptedToRejectedFor(strReclassifyClaimsFromAcceptedToReject);
		
		viewContractInformationPage.VerifyReclassifyClaimsOnlyValues(strReclassifyOnly);
		
		viewContractInformationPage.VerifyPenaltyTableValues(strPenaltyTableDetails);
	}
	
	@Step
	public void verifyRateDetailsInContractInformationScreen(DataTable rateDetailsTableData) throws Throwable
	{
		
		List<List<String>> rateDetails = rateDetailsTableData.raw();
		
		String strStartDate = rateDetails.get(1).get(0); 
		String strEndDate = rateDetails.get(1).get(1);;   
		String strLineOfBusiness = rateDetails.get(1).get(2);   
		String strTransparency = rateDetails.get(1).get(3);  
		String strFeeMethod = rateDetails.get(1).get(4);   
		String strVendorRebateShare = rateDetails.get(1).get(5);   
		String strAdminFee =  rateDetails.get(1).get(6);  
		String strDSTRebateShare =  rateDetails.get(1).get(7);  
		String strCustomerRebateShare = rateDetails.get(1).get(8);   
		String strDSTRevenue = rateDetails.get(1).get(9);   
		String strVendorAdjDaySupplyOption= rateDetails.get(1).get(10);   
		String strCustomerAdjDaySupplyOption = rateDetails.get(1).get(11);   
		String strNotes = rateDetails.get(1).get(12);
		
		if(StringUtil.isBlank(strStartDate)) 
		{
			strStartDate = START_DATE;
		}
		if(StringUtil.isBlank(strEndDate)) 
		{
			strEndDate = END_DATE;
		}
		
		String strVal = strStartDate+"*"+strEndDate+"*"+strLineOfBusiness+"*"+strTransparency+"*"+strFeeMethod+"*"+strVendorRebateShare+"*"+strAdminFee+"*"+strDSTRebateShare+"*"+strCustomerRebateShare+"*"+strDSTRevenue+"*"+strVendorAdjDaySupplyOption+"*"+strCustomerAdjDaySupplyOption+"*"+strNotes;
		viewContractInformationPage.verifyContractInformationRateDetailsTableData(strVal);
		
	}

}
