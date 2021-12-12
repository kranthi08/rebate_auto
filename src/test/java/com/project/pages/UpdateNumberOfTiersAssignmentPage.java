package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateNumberOfTiersAssignment;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UpdateNumberOfTiersAssignmentPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_AssignNumberOfTiersBy_List)
	private BaseElement AssignmentCriteria_Update_AssignNumberOfTiersBy_List;
	
	@FindBy(xpath=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_NumberOfTiers_Customer_Edit)
	private BaseElement AssignmentCriteria_Update_NumberOfTiers_Customer_Edit;
	
	@ByAngularModel.FindBy(model=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_NumberOfTiers_DrugList_Edit)
	private BaseElement AssignmentCriteria_Update_NumberOfTiers_DrugList_Edit;
	
	@ByAngularModel.FindBy(model=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_NumberOfTiers_Edit)
	private BaseElement AssignmentCriteria_Update_NumberOfTiers_Edit;
	
	@FindBy(xpath=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_NumberOfTiers_Add_Button)
	private BaseElement AssignmentCriteria_Update_NumberOfTiers_Add_Button;
	
	@FindBy(xpath=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_NumberOfTiersAssignment_Table)
	private BaseElement AssignmentCriteria_Update_NumberOfTiersAssignment_Table;
	
	@FindBy(xpath=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_NumberOfTiers_Remove_Button)
	private BaseElement AssignmentCriteria_Update_NumberOfTiers_Remove_Button;
	
	@FindBy(xpath=UpdateNumberOfTiersAssignment.AssignmentCriteria_Update_NumberOfTiers_Update_Button)
	private BaseElement AssignmentCriteria_Update_NumberOfTiers_Update_Button;
	
	public boolean verifyNumberOfTiersAssignmentIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Update_AssignNumberOfTiersBy_List.exists(5000))		
		{
			Log.info("Number of Tiers Assignment is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectAssignNumberOfTiersBy(String strAssignNumberOfTiersBy) throws Throwable
	{
		if(!strAssignNumberOfTiersBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Update_AssignNumberOfTiersBy_List, strAssignNumberOfTiersBy);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterCustomer(String strCustomer) throws Throwable
	{
		if(!strCustomer.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_NumberOfTiers_Customer_Edit, strCustomer);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterDrugList(String strDrugList) throws Throwable
	{
		if(!strDrugList.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_NumberOfTiers_DrugList_Edit, strDrugList);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterNumberOfTiers(String strNumberOfTiers) throws Throwable
	{
		if(!strNumberOfTiers.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_NumberOfTiers_Edit, strNumberOfTiers);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_NumberOfTiers_Add_Button);
	}
	
	public boolean updateNumberOfTiersAssignment(String strNumberOfTiersAssignment) throws Throwable
	{
		if(!strNumberOfTiersAssignment.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Update_NumberOfTiersAssignment_Table, strNumberOfTiersAssignment);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_NumberOfTiers_Remove_Button);
	}
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_NumberOfTiers_Update_Button);
	}
	
	public boolean verifyNumberOfTiersAssignmentDetails(String strNumberOfTiersAssignmentDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(AssignmentCriteria_Update_NumberOfTiersAssignment_Table, strNumberOfTiersAssignmentDetails);
	}
}
