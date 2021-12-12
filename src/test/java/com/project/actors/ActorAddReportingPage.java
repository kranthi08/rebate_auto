package com.project.actors;

import java.util.List;

import com.project.pages.AddReportingPage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddReportingPage 
{
	@Steps
	AddReportingPage addReportingPage;
	
	public static String START_DATE,END_DATE;
	
	
	@Step
	public void verifyReportingScreenDisplay() throws Throwable
	{
		addReportingPage.verifyReportingPanelIsDisplayed();
		
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		START_DATE = addReportingPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
		END_DATE = addReportingPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
	}
	@Step
	public void verifyUserIsOnReportingScreen() throws Throwable
	{
		addReportingPage.verifyReportingPanelIsDisplayed();
	}
	
	@Step
	public void detailsSubmitionInReportingScreen(DataTable reportingPanelData) throws Throwable
	{
		
		List<List<String>>reportingPanelDataDetails = reportingPanelData.raw();
		
		String strOperation = reportingPanelDataDetails.get(1).get(0);
		String strExistingRecordDetails = reportingPanelDataDetails.get(1).get(1);
		String strPackage = reportingPanelDataDetails.get(1).get(2);
		String strLevel = reportingPanelDataDetails.get(1).get(3);
		String strStartDate = reportingPanelDataDetails.get(1).get(4);
		String strEndDate = reportingPanelDataDetails.get(1).get(5);
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
		String strPackageNotes = reportingPanelDataDetails.get(1).get(6);
		String strLevelNotes = reportingPanelDataDetails.get(1).get(7);
		
		switch(strOperation.toUpperCase())
		{
			case "ADD":
				addReportingPage.selectValueFromPackageList(strPackage);
				addReportingPage.selectValueFromLevelList(strLevel);
				addReportingPage.setTextIntoStartDateEdit(strStartDate);
				addReportingPage.setTextIntoEndDateEdit(strEndDate);
				addReportingPage.setTextIntoPackageNotesEdit(strPackageNotes);
				addReportingPage.setTextIntoLevelNotesEdit(strLevelNotes);				
				addReportingPage.clickOnAddButton();
				break;
			case "UPDATE":				
				addReportingPage.verifyAndClickOnTheCheckBoxInReportingPanelTable(strExistingRecordDetails);
				addReportingPage.clickOnUpdateButton();
				addReportingPage.selectValueFromPackageList(strPackage);
				addReportingPage.selectValueFromLevelList(strLevel);
				addReportingPage.setTextIntoStartDateEdit(strStartDate);
				addReportingPage.setTextIntoEndDateEdit(strEndDate);
				addReportingPage.setTextIntoPackageNotesEdit(strPackageNotes);
				addReportingPage.setTextIntoLevelNotesEdit(strLevelNotes);
				addReportingPage.clickOnAddButton();
				break;
			case "REMOVE":								
				addReportingPage.verifyAndClickOnTheCheckBoxInReportingPanelTable(strExistingRecordDetails);
				addReportingPage.clickOnRemoveButton();
				break;
		}
		addReportingPage.veifyReportingTableData(strPackage+"^"+strLevel);
	}
	
	@Step
	public void nextButtonInReportingScreen()		throws Throwable
	{
		addReportingPage.clickOnNextButton();
	}
}
