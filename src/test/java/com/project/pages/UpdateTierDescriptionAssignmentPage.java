package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateTierDescription;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UpdateTierDescriptionAssignmentPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=UpdateTierDescription.AssignmentCriteria_Update_AssignTierDescriptionBy_List)
	private BaseElement AssignmentCriteria_Update_AssignTierDescriptionBy_List;
	
	@ByAngularModel.FindBy(model=UpdateTierDescription.AssignmentCriteria_Update_TierDescription_Customer_Edit)
	private BaseElement AssignmentCriteria_Update_TierDescription_Customer_Edit;
	
	@ByAngularModel.FindBy(model=UpdateTierDescription.AssignmentCriteria_Update_TierDescription_DrugList_Edit)
	private BaseElement AssignmentCriteria_Update_TierDescription_DrugList_Edit;
	
	@ByAngularModel.FindBy(model=UpdateTierDescription.AssignmentCriteria_Update_TierDescription_Tier_List)
	private BaseElement AssignmentCriteria_Update_TierDescription_Tier_List;
	
	@ByAngularModel.FindBy(model=UpdateTierDescription.AssignmentCriteria_Update_TierDescription_Description_List)
	private BaseElement AssignmentCriteria_Update_TierDescription_Description_List;	
	
	@FindBy(xpath=UpdateTierDescription.AssignmentCriteria_Update_TierDescription_Add_Button)
	private BaseElement AssignmentCriteria_Update_TierDescription_Add_Button;
	
	@FindBy(xpath=UpdateTierDescription.AssignmentCriteria_Update_TierDescriptionAssignment_Table)
	private BaseElement AssignmentCriteria_Update_TierDescriptionAssignment_Table;
	
	@FindBy(xpath=UpdateTierDescription.AssignmentCriteria_Update_TierDescription_Remove_Button)
	private BaseElement AssignmentCriteria_Update_TierDescription_Remove_Button;
	
	@FindBy(xpath=UpdateTierDescription.AssignmentCriteria_Update_TierDescription_Update_Button)
	private BaseElement AssignmentCriteria_Update_TierDescription_Update_Button;
	
	public boolean verifyTierDescriptionAssignmentIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Update_AssignTierDescriptionBy_List.exists(5000))		
		{
			Log.info("Tier Description Assignment is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectAssignTierDescriptionBy(String strAssignTierDescriptionBy) throws Throwable
	{
		if(!strAssignTierDescriptionBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Update_AssignTierDescriptionBy_List, strAssignTierDescriptionBy);
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
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_TierDescription_Customer_Edit, strCustomer);
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
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_TierDescription_DrugList_Edit, strDrugList);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectTier(String strTier) throws Throwable
	{
		if(!strTier.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Update_TierDescription_Tier_List, strTier);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectDescription(String strDescription) throws Throwable
	{
		if(!strDescription.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Update_TierDescription_Description_List, strDescription);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_TierDescription_Add_Button);
	}
	
	public boolean updateTierDescriptionAssignment(String strTierDescriptionAssignment) throws Throwable
	{
		if(!strTierDescriptionAssignment.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Update_TierDescriptionAssignment_Table, strTierDescriptionAssignment);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_TierDescription_Remove_Button);
	}
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_TierDescription_Update_Button);
	}
	
	public boolean verifyTierDescriptionAssignmentDetails(String strTierDescriptionAssignmentDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(AssignmentCriteria_Update_TierDescriptionAssignment_Table, strTierDescriptionAssignmentDetails);
	}
}
