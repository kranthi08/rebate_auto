package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddTierDescription;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UIAddTierDescriptionAssignmentPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddTierDescription.AssignmentCriteria_Add_AssignTierDescriptionBy_List)
	private BaseElement AssignmentCriteria_Add_AssignTierDescriptionBy_List;
	
	@ByAngularModel.FindBy(model=AddTierDescription.AssignmentCriteria_Add_TierDescription_Customer_Edit)
	private BaseElement AssignmentCriteria_Add_TierDescription_Customer_Edit;
	
	@ByAngularModel.FindBy(model=AddTierDescription.AssignmentCriteria_Add_TierDescription_DrugList_Edit)
	private BaseElement AssignmentCriteria_Add_TierDescription_DrugList_Edit;
	
	@ByAngularModel.FindBy(model=AddTierDescription.AssignmentCriteria_Add_TierDescription_Tier_List)
	private BaseElement AssignmentCriteria_Add_TierDescription_Tier_List;
	
	@ByAngularModel.FindBy(model=AddTierDescription.AssignmentCriteria_Add_TierDescription_Description_List)
	private BaseElement AssignmentCriteria_Add_TierDescription_Description_List;	
	
	@FindBy(xpath=AddTierDescription.AssignmentCriteria_Add_TierDescription_Add_Button)
	private BaseElement AssignmentCriteria_Add_TierDescription_Add_Button;
	
	@FindBy(xpath=AddTierDescription.AssignmentCriteria_Add_TierDescriptionAssignment_Table)
	private BaseElement AssignmentCriteria_Add_TierDescriptionAssignment_Table;
	
	@FindBy(xpath=AddTierDescription.AssignmentCriteria_Add_TierDescription_Remove_Button)
	private BaseElement AssignmentCriteria_Add_TierDescription_Remove_Button;
	
	@FindBy(xpath=AddTierDescription.AssignmentCriteria_Add_TierDescription_Update_Button)
	private BaseElement AssignmentCriteria_Add_TierDescription_Update_Button;
	
	public boolean verifyTierDescriptionAssignmentIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Add_AssignTierDescriptionBy_List.exists(5000))		
		{
			Log.info("Tier Description Assignment is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean verifyAssignTierDescriptionByListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AssignmentCriteria_Add_AssignTierDescriptionBy_List);
	}
	
	public boolean verifyAssignTierDescriptionByListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AssignmentCriteria_Add_AssignTierDescriptionBy_List);
	}
	
	public boolean verifyAssignTierDescriptionByListBoxDefaultItem(String strDefaultItem) throws Throwable
	{
		return rxNovaCommonUtil.verifyDefaultItemInListBox(AssignmentCriteria_Add_AssignTierDescriptionBy_List,strDefaultItem);
	}
	
	public boolean verifyAssignTierDescriptionByListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AssignmentCriteria_Add_AssignTierDescriptionBy_List, strListItems);
	}
	
	public boolean verifyAssignTierDescriptionByListBoxIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsDisabled(AssignmentCriteria_Add_AssignTierDescriptionBy_List);
	}
	
	public boolean selectAssignTierDescriptionBy(String strAssignTierDescriptionBy) throws Throwable
	{
		if(!strAssignTierDescriptionBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_AssignTierDescriptionBy_List, strAssignTierDescriptionBy);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyCustomerEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_TierDescription_Customer_Edit);
	}
	
	public boolean verifyCustomerEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_TierDescription_Customer_Edit);
	}
	
	public boolean verifyCustomerEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_TierDescription_Customer_Edit, strLength);
	}
	
	public boolean enterCustomer(String strCustomer) throws Throwable
	{
		if(!strCustomer.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_TierDescription_Customer_Edit, strCustomer);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyDrugListEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_TierDescription_DrugList_Edit);
	}
	
	public boolean verifyDrugListEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_TierDescription_DrugList_Edit);
	}
	
	public boolean verifyDrugListEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_TierDescription_DrugList_Edit, strLength);
	}
	
	public boolean verifyTierListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AssignmentCriteria_Add_TierDescription_Tier_List);
	}
	
	public boolean verifyTierListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AssignmentCriteria_Add_TierDescription_Tier_List);
	}
	
	public boolean verifyTierListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AssignmentCriteria_Add_TierDescription_Tier_List, strListItems);
	}
	
	public boolean selectTier(String strTier) throws Throwable
	{
		if(!strTier.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_TierDescription_Tier_List, strTier);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyDescriptionListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AssignmentCriteria_Add_TierDescription_Description_List);
	}
	
	public boolean verifyDescriptionListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AssignmentCriteria_Add_TierDescription_Description_List);
	}
	
	public boolean verifyDescriptionListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AssignmentCriteria_Add_TierDescription_Description_List, strListItems);
	}
	
	public boolean selectDescription(String strDescription) throws Throwable
	{
		if(!strDescription.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_TierDescription_Description_List, strDescription);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyAddButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_TierDescription_Add_Button);
	}
	
	public boolean verifyAddButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_TierDescription_Add_Button);
	}
	
	public boolean verifyAddButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_TierDescription_Add_Button);
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_TierDescription_Add_Button);
	}
	
	public boolean verifyTierDescriptionAssignmentTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AssignmentCriteria_Add_TierDescriptionAssignment_Table);
	}
	
	public boolean verifyRemoveButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_TierDescription_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_TierDescription_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_TierDescription_Remove_Button);
	}
	
	public boolean verifyUpdateButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_TierDescription_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_TierDescription_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_TierDescription_Update_Button);
	}
	
	public boolean clickOnTierDescriptionAssignmentCheckbox(String strOperation, String strTierDescriptionAssignment) throws Throwable
	{
		if(!strTierDescriptionAssignment.isEmpty())		
		{
			return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_TierDescriptionAssignment_Table, strOperation, strTierDescriptionAssignment);
		}
		else
		{
			return true;
		}
	}
}
