package com.project.actors;

import java.util.List;
import com.project.pages.MCSAbbreviationUpdateAndRemovePage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorMCSAbbreviationUpdateAndRemovePage 
{
	@Steps
	MCSAbbreviationUpdateAndRemovePage mcsAbbreviationPage;
	
	@Step
	public void verifyAndAddTheRequiredMCS(DataTable mcsValues)throws Throwable
	{
		List<List<String>> mcsDetails = mcsValues.raw();
		
		String strMasterCustomerSet = mcsDetails.get(1).get(0);
		String strMasterAbbrivation = mcsDetails.get(1).get(1);
		
		mcsAbbreviationPage.verifyMCSAbbreviationPageDisplay();
		boolean finalResult = mcsAbbreviationPage.verifyTheRequiredMCSAvailableInTable(strMasterCustomerSet+"*"+strMasterAbbrivation);
		if(finalResult==false)
		{
			mcsAbbreviationPage.clickOnMCSAbbreviationHomeUpdateButton();
			mcsAbbreviationPage.selectItemFromMCSAbbreviation_MasterCustomerSet_List(strMasterCustomerSet);
			mcsAbbreviationPage.setTextIntoMCSAbbriviation(strMasterAbbrivation);
			mcsAbbreviationPage.clickOnMCSAbbreviationAddorUpdateButton();
			mcsAbbreviationPage.clickOnMCSAbbreviationSaveButton();
			mcsAbbreviationPage.verifyTheRequiredMCSAvailableInTable(strMasterCustomerSet+"*"+strMasterAbbrivation);
		}	  	
	}
	
	@Step
	public void verifyTheNewlyAddedMCS(DataTable strNewMCSValues)throws Throwable
	{
		List<List<String>> mcsDetails = strNewMCSValues.raw(); 
		
		String strMasterCustomerSet = mcsDetails.get(1).get(0);
		String strMasterAbbrivation = mcsDetails.get(1).get(1);
		
		mcsAbbreviationPage.verifyTheRequiredMCSAvailableInTable(strMasterCustomerSet+"*"+strMasterAbbrivation);
	}
	@Step
	public void verifyAndUpdateMasterAbbreviation(DataTable upDatedValues)throws Throwable
	{
		List<List<String>> mcsDetails = upDatedValues.raw();
		
		String strMasterCustomerSet = mcsDetails.get(1).get(0);
		String strOldMasterAbbrivation = mcsDetails.get(1).get(1);
		String strNewMasterAbbrivation = mcsDetails.get(1).get(2);
		
		mcsAbbreviationPage.verifyMCSAbbreviationPageDisplay();
		boolean finalResult = mcsAbbreviationPage.verifyTheRequiredMCSAvailableInTable(strMasterCustomerSet+"*"+strOldMasterAbbrivation);
		if(finalResult)
		{
			mcsAbbreviationPage.clickOnMCSAbbreviationHomeUpdateButton();
			mcsAbbreviationPage.clickOnRequiredMatchingCheckBox(strMasterCustomerSet+"*"+strOldMasterAbbrivation);
			mcsAbbreviationPage.clickOnMCSAbbreviationUpdateButton();
			mcsAbbreviationPage.selectItemFromMCSAbbreviation_MasterCustomerSet_List(strMasterCustomerSet);
			mcsAbbreviationPage.setTextIntoMCSAbbriviation(strNewMasterAbbrivation);
			mcsAbbreviationPage.clickOnMCSAbbreviationAddorUpdateButton();
			mcsAbbreviationPage.clickOnMCSAbbreviationSaveButton();
		}
	}
	
	@Step
	public void verifyTheUpdatedMasterAbbreviation(DataTable strNewMCSValues)throws Throwable
	{
		List<List<String>> mcsDetails = strNewMCSValues.raw(); 
		
		String strMasterCustomerSet = mcsDetails.get(1).get(0);
		String strMasterAbbrivation = mcsDetails.get(1).get(1);
		
		mcsAbbreviationPage.verifyTheRequiredMCSAvailableInTable(strMasterCustomerSet+"*"+strMasterAbbrivation);
	}
	@Step
	public void verifyAndRemoveMasterCustomerSetAbbreviation(DataTable mcsValues) throws Throwable	
	{
		List<List<String>> mcsDetails = mcsValues.raw();
		
		String strMasterCustomerSet = mcsDetails.get(1).get(0);
		String strMasterAbbrivation = mcsDetails.get(1).get(1);
		
		mcsAbbreviationPage.verifyMCSAbbreviationPageDisplay();
		boolean finalResult = mcsAbbreviationPage.verifyTheRequiredMCSAvailableInTable(strMasterCustomerSet+"*"+strMasterAbbrivation);
		if(finalResult)
		{
			mcsAbbreviationPage.clickOnMCSAbbreviationHomeUpdateButton();
			mcsAbbreviationPage.clickOnRequiredMatchingCheckBox(strMasterCustomerSet+"*"+strMasterAbbrivation);
			mcsAbbreviationPage.clickOnMCSAbbreviationRemoveButton();
			mcsAbbreviationPage.clickOnMCSAbbreviationSaveButton();			
		}
	}
	
	@Step
	public void verifyTheMasterAbbreviationIsRemoved(DataTable strNewMCSValues)throws Throwable
	{
		List<List<String>> mcsDetails = strNewMCSValues.raw(); 
		
		String strMasterCustomerSet = mcsDetails.get(1).get(0);
		String strMasterAbbrivation = mcsDetails.get(1).get(1);
		
		mcsAbbreviationPage.verifyTheRequiredMCSAvailableInTable(strMasterCustomerSet+"*"+strMasterAbbrivation);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
