package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.ViewStepTherapyProgram;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;

public class ViewStepTherapyProgramAssignmentPage extends BasePage
{
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(xpath=ViewStepTherapyProgram.AssignmentCriteria_View_StepTherapyProgram_Table)
	private BaseElement AssignmentCriteria_View_StepTherapyProgram_Table;
	
	public boolean verifyStepTherapyProgramDetails(String strStepTherapyProgramData) throws Throwable
	{
		return rebateCommonUtil.rebate_View_Webtable_VerifyRowData(AssignmentCriteria_View_StepTherapyProgram_Table, strStepTherapyProgramData);
	}	
}
