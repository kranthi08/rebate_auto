package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddGuaranteeCodeAssignment;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UIAddGuaranteeCodeAssignmentPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_AssignGuaranteeCodeBy_List)
	private BaseElement AssignmentCriteria_Add_AssignGuaranteeCodeBy_List;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_Customer_Edit)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_Customer_Edit;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_DrugList_Edit)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_DrugList_Edit;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_Client_Edit)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_Client_Edit;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_CoverageCode1_Edit)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_CoverageCode1_Edit;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_CoverageCode2_Edit)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_CoverageCode2_Edit;
	
	@ByAngularModel.FindBy(model=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_GuaranteeCode_Edit)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_GuaranteeCode_Edit;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_Add_Button)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_Add_Button;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCodeAssignment_Table)
	private BaseElement AssignmentCriteria_Add_GuaranteeCodeAssignment_Table;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_Remove_Button)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_Remove_Button;
	
	@FindBy(xpath=AddGuaranteeCodeAssignment.AssignmentCriteria_Add_GuaranteeCode_Update_Button)
	private BaseElement AssignmentCriteria_Add_GuaranteeCode_Update_Button;
	
	public boolean verifyGuaranteeCodeAssignmentIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Add_AssignGuaranteeCodeBy_List.exists(5000))		
		{
			Log.info("Guarantee Code Assignment is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean verifyAssignGuaranteeCodeByListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AssignmentCriteria_Add_AssignGuaranteeCodeBy_List);
	}
	
	public boolean verifyAssignGuaranteeCodeByListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AssignmentCriteria_Add_AssignGuaranteeCodeBy_List);
	}
	
	public boolean verifyAssignGuaranteeCodeByListBoxDefaultItem(String strDefaultItem) throws Throwable
	{
		return rxNovaCommonUtil.verifyDefaultItemInListBox(AssignmentCriteria_Add_AssignGuaranteeCodeBy_List,strDefaultItem);
	}
	
	public boolean verifyAssignGuaranteeCodeByListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AssignmentCriteria_Add_AssignGuaranteeCodeBy_List, strListItems);
	}
	
	public boolean verifyAssignGuaranteeCodeByListBoxIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsDisabled(AssignmentCriteria_Add_AssignGuaranteeCodeBy_List);
	}
	
	public boolean selectAssignGuaranteeCodeBy(String strAssignGuaranteeCodeBy) throws Throwable
	{
		if(!strAssignGuaranteeCodeBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_AssignGuaranteeCodeBy_List, strAssignGuaranteeCodeBy);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyCustomerEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_GuaranteeCode_Customer_Edit);
	}
	
	public boolean verifyCustomerEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_GuaranteeCode_Customer_Edit);
	}
	
	public boolean verifyCustomerEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_GuaranteeCode_Customer_Edit, strLength);
	}
	
	public boolean enterCustomer(String strCustomer) throws Throwable
	{
		if(!strCustomer.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_GuaranteeCode_Customer_Edit, strCustomer);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyClientEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_GuaranteeCode_Client_Edit);
	}
	
	public boolean verifyClientEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_GuaranteeCode_Client_Edit);
	}
	
	public boolean verifyClientEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_GuaranteeCode_Client_Edit, strLength);
	}
	
	public boolean verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_GuaranteeCode_CoverageCode1_Edit);
	}
	
	public boolean verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_GuaranteeCode_CoverageCode1_Edit);
	}
	
	public boolean verifyCoverageCode1EditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_GuaranteeCode_CoverageCode1_Edit, strLength);
	}
	
	public boolean verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_GuaranteeCode_CoverageCode2_Edit);
	}
	
	public boolean verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_GuaranteeCode_CoverageCode2_Edit);
	}
	
	public boolean verifyCoverageCode2EditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_GuaranteeCode_CoverageCode2_Edit, strLength);
	}
	
	public boolean verifyDrugListEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_GuaranteeCode_DrugList_Edit);
	}
	
	public boolean verifyDrugListEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_GuaranteeCode_DrugList_Edit);
	}
	
	public boolean verifyDrugListEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_GuaranteeCode_DrugList_Edit, strLength);
	}
	
	public boolean verifyGuaranteeCodeEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_GuaranteeCode_GuaranteeCode_Edit);
	}
	
	public boolean verifyGuaranteeCodeEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_GuaranteeCode_GuaranteeCode_Edit);
	}
	
	public boolean verifyGuaranteeCodeEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_GuaranteeCode_GuaranteeCode_Edit, strLength);
	}
	
	public boolean enterGuaranteeCode(String strGuaranteeCode) throws Throwable
	{
		if(!strGuaranteeCode.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_GuaranteeCode_GuaranteeCode_Edit, strGuaranteeCode);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyAddButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_GuaranteeCode_Add_Button);
	}
	
	public boolean verifyAddButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_GuaranteeCode_Add_Button);
	}
	
	public boolean verifyAddButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_GuaranteeCode_Add_Button);
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_GuaranteeCode_Add_Button);
	}
	
	public boolean verifyGuaranteeCodeAssignmentTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AssignmentCriteria_Add_GuaranteeCodeAssignment_Table);
	}
	
	public boolean verifyRemoveButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_GuaranteeCode_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_GuaranteeCode_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_GuaranteeCode_Remove_Button);
	}
	
	public boolean verifyUpdateButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_GuaranteeCode_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_GuaranteeCode_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_GuaranteeCode_Update_Button);
	}
	
	public boolean clickOnGuaranteeCodeAssignmentCheckbox(String strOperation, String strGuaranteeCodeAssignment) throws Throwable
	{
		if(!strGuaranteeCodeAssignment.isEmpty())		
		{
			return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_GuaranteeCodeAssignment_Table, strOperation, strGuaranteeCodeAssignment);
		}
		else
		{
			return true;
		}
	}
}
