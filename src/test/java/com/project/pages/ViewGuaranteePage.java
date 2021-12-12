package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewGuaranteePanel;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewGuaranteePage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Steps
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_Update_Button)
	private BaseElement Guarantee_View_Update_Button;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_GuaranteePanel_Table)
	private BaseElement Guarantee_View_GuaranteePanel_Table;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_GuaranteePanel)
	private BaseElement Guarantee_View_GuaranteePanel;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_BrowseNotes_Button)
	private BaseElement Guarantee_View_BrowseNotes_Button;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_BrowseNotes_BenefitDesignDescriptionNotes_Edit)
	private BaseElement Guarantee_View_BrowseNotes_BenefitDesignDescriptionNotes_Edit;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_BrowseNotes_PlanDesignNotes_Edit)
	private BaseElement Guarantee_View_BrowseNotes_PlanDesignNotes_Edit;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_BrowseNotes_UMOptionNotes_Edit)
	private BaseElement Guarantee_View_BrowseNotes_UMOptionNotes_Edit;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_BrowseNotes_FormularyDesignNotes_Edit)
	private BaseElement Guarantee_View_BrowseNotes_FormularyDesignNotes_Edit;
	
	@FindBy(xpath=ViewGuaranteePanel.Guarantee_View_BrowseNotes_Close_Button)
	private BaseElement Guarantee_View_BrowseNotes_Close_Button;
	
	
	public boolean clickOnGuaranteeViewUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_View_Update_Button);
	}
	
	public boolean expand_Guarantee_View_GuaranteePanel(String strPanel_Name) throws Throwable
	{
		return rebateCommonUtil.rebate_expand_View_Panel(Guarantee_View_GuaranteePanel, strPanel_Name);
	}
	
	public boolean verifyGuaranteeTableData(String strGuaranteeTableData) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(Guarantee_View_GuaranteePanel_Table, strGuaranteeTableData);
	}
	public boolean clickOnGuaranteeViewBrowseNotesButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(Guarantee_View_BrowseNotes_Button);
	}
	
	public boolean compareTheTextFromBrowseNotesBenefitDesignDescriptionNotes_Edit(String strBenefitDesignDescriptionNotes) throws Throwable
	{
		boolean boolStatus = false;
		if(!strBenefitDesignDescriptionNotes.isEmpty())
		{
			String strExpectedText = strBenefitDesignDescriptionNotes;
			String strActualText = rebateCommonUtil.rebate_GetTextFromEdit(Guarantee_View_BrowseNotes_BenefitDesignDescriptionNotes_Edit);		
			if(strExpectedText.equalsIgnoreCase(strActualText))
			{
				Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + "Matched");
				boolStatus = true;
			}
			else
			{
				Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + " not Matched");
				boolStatus =  false;
			}
		}
		return boolStatus;
	}
	public boolean compareTheTextFromBrowseNotesPlanDesignNotes_Edit(String strPlanDesignNotes) throws Throwable
	{
		boolean boolStatus = false;
		if(!strPlanDesignNotes.isEmpty())
		{
			String strExpectedText = strPlanDesignNotes;
			String strActualText = rebateCommonUtil.rebate_GetTextFromEdit(Guarantee_View_BrowseNotes_PlanDesignNotes_Edit);		
			if(strExpectedText.equalsIgnoreCase(strActualText))
			{
				Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + "Matched");
				boolStatus = true;
			}
			else
			{
				Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + " not Matched");
				boolStatus =  false;
			}
		}
		return boolStatus;
	}

public boolean compareTheTextFromBrowseNotesUMOptionNotes_Edit(String strUMOptionNotes) throws Throwable
{
	boolean boolStatus = false;
	if(!strUMOptionNotes.isEmpty())
	{
		String strExpectedText = strUMOptionNotes;
		String strActualText = rebateCommonUtil.rebate_GetTextFromEdit(Guarantee_View_BrowseNotes_UMOptionNotes_Edit);
		if(strExpectedText.equalsIgnoreCase(strActualText))
		{
			Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + "Matched");
			boolStatus = true;
		}
		else
		{
			Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + " not Matched");
			boolStatus =  false;
		}
	}
	return boolStatus;
}
public boolean compareTheTextFromBrowseNotesFormularyDesignNotes_Edit(String strFormularyDesignNotes)
{
	boolean boolStatus = false;
	if(!strFormularyDesignNotes.isEmpty())
	{
		String strExpectedText = strFormularyDesignNotes;
		String strActualText = rebateCommonUtil.rebate_GetTextFromEdit(Guarantee_View_BrowseNotes_FormularyDesignNotes_Edit);
		if(strExpectedText.equalsIgnoreCase(strActualText))
		{
			Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + "Matched");
			boolStatus = true;
		}
		else
		{
			Log.info("Both Expected Text = "+ strExpectedText + " and Actual Text = "+strActualText + " not Matched");
			boolStatus =  false;
		}
	}
	return boolStatus;
}
public boolean clickOnGuaranteeViewBrowseNotesCloseButton() throws Throwable
{
	return rxNovaCommonUtil.clickOnButton(Guarantee_View_BrowseNotes_Close_Button);
}

public boolean clickOnCheckBoxAtGuaranteePanelTable(String strSearchText) throws Throwable
{
	return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(Guarantee_View_GuaranteePanel_Table, strSearchText);
}
public String getDateUsingFeatureFileNameAndText(String strFeatureFilePath, String strDateTypeText) throws Throwable
{
	return rebateCommonUtil.getTheStartAndEndDates(strFeatureFilePath, strDateTypeText);
}

	
}
