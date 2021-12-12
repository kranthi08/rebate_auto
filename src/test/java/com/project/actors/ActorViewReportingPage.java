package com.project.actors;

import java.util.List;
import org.seleniumhq.jetty9.util.StringUtil;
import com.project.pages.ViewReportingPage;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewReportingPage 
{
	@Steps
	ViewReportingPage viewReportingPage;
	
	@Step
	public void expand_the_Panel(DataTable strPanelName) throws Throwable
	{
		List<List<String>>reportingPanelDataDetails = strPanelName.raw();
		
		String strPanel_Name = reportingPanelDataDetails.get(1).get(0);
		
		
		viewReportingPage.expand_reporting_panel(strPanel_Name);
	}
	
	
	@Step
	public void verify_Reporting_Details(DataTable reportingPanelData)	throws Throwable
	{
		String strFeatureFilePath = BaseStepListener.strFeatureFilePath;
		List<List<String>>reportingPanelDataDetails = reportingPanelData.raw();
		
		String strPackage = reportingPanelDataDetails.get(1).get(0);
		String strLevel = reportingPanelDataDetails.get(1).get(1);
		String strStartDate = reportingPanelDataDetails.get(1).get(2);
		String strEndDate = reportingPanelDataDetails.get(1).get(3);
		if(StringUtil.isBlank(strStartDate)) 
		{
			strStartDate = viewReportingPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"StartDate");
		}
		if(StringUtil.isBlank(strEndDate)) 
		{
			strEndDate = viewReportingPage.getDateUsingFeatureFileNameAndText(strFeatureFilePath,"EndDate");
		}
		String strPackageNotes = reportingPanelDataDetails.get(1).get(4);
		String strLevelNotes = reportingPanelDataDetails.get(1).get(5);
		
		String strPanelData = strPackage +"*" + strLevel + "*" + strStartDate + "*" + strEndDate + "*" + strPackageNotes + "*" + strLevelNotes;
		
		viewReportingPage.verifyReportingTableData(strPanelData);
		
	}
	
}
