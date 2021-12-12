package com.project.actors;

import java.util.List;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.project.pages.UpdateReportingPage;
import com.psqframework.core.util.BaseStepListener;

public class ActorUpdateReportingPage 
{
	@Steps
	UpdateReportingPage updateReportingPage;
	
	@Step
	public void updatingDetailsInReportingScreen(DataTable reportingPanelData) throws Throwable
	{
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		
		List<List<String>>reportingPanelDataDetails = reportingPanelData.raw();
		
		for(int i=1;i<reportingPanelDataDetails.size();i++)
		{
			String strOperation = reportingPanelDataDetails.get(i).get(0);
			String strExistingRecordDetails = reportingPanelDataDetails.get(i).get(1);
			String strPackage = reportingPanelDataDetails.get(i).get(2);
			String strLevel = reportingPanelDataDetails.get(i).get(3);
			String strStartDate = reportingPanelDataDetails.get(i).get(4);
			String strEndDate = reportingPanelDataDetails.get(i).get(5);
			String strPackageNotes = reportingPanelDataDetails.get(i).get(6);
			String strLevelNotes = reportingPanelDataDetails.get(i).get(7);
			// =======================================		
			if(strStartDate.isEmpty())
			{
				strStartDate = updateReportingPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
			}		
			if(strEndDate.isEmpty())
			{
				strEndDate = updateReportingPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
			}						
			// =======================================
			String strFinalRecord = strExistingRecordDetails +"*" + strStartDate + "*" + strEndDate;
			switch(strOperation.toUpperCase())
			{
				case "ADD":
					updateReportingPage.selectValueFromPackageList(strPackage);
					updateReportingPage.selectValueFromLevelList(strLevel);
					updateReportingPage.setTextIntoStartDateEdit(strStartDate);
					updateReportingPage.setTextIntoEndDateEdit(strEndDate);
					updateReportingPage.setTextIntoPackageNotesEdit(strPackageNotes);
					updateReportingPage.setTextIntoLevelNotesEdit(strLevelNotes);				
					updateReportingPage.clickOnAddOrUpdateButton();
					break;
				case "UPDATE":
					updateReportingPage.clickOnUpdateButtonAtReportingPanel();
					updateReportingPage.verifyTheExistingRecordAndClickOnRequiredCheckBox(strFinalRecord);
					updateReportingPage.clickOnUpdateTableUpdateButton();
					
					updateReportingPage.selectValueFromPackageList(strPackage);
					updateReportingPage.selectValueFromLevelList(strLevel);
					updateReportingPage.setTextIntoStartDateEdit(strStartDate);
					updateReportingPage.setTextIntoEndDateEdit(strEndDate);
					updateReportingPage.setTextIntoPackageNotesEdit(strPackageNotes);
					updateReportingPage.setTextIntoLevelNotesEdit(strLevelNotes);
					updateReportingPage.clickOnAddOrUpdateButton();
					break;
				case "REMOVE":
					updateReportingPage.clickOnUpdateButtonAtReportingPanel();				
					updateReportingPage.verifyTheExistingRecordAndClickOnRequiredCheckBox(strFinalRecord);
					updateReportingPage.clickOnUpdateTableRemoveButton();
					break;
			}
		}
		updateReportingPage.clickOnSaveButton();
	}
	
}
