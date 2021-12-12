package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddFocusedUMBundleRespiratory;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UIAddFocusedUMBundleRespiratoryAssignmentPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(id=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List)
	private BaseElement AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List;
	
	@FindBy(id=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_AssignedFocusedUMBundleRespiratory_List)
	private BaseElement AssignmentCriteria_Add_AssignedFocusedUMBundleRespiratory_List;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode1_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode1_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode2_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode2_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_Description_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_Description_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCodeStatus_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCodeStatus_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table_Pagination)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table_Pagination;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCodes_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCodes_Label;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedCoverageCodes_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedCoverageCodes_Label;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListID_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListID_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_Name_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_Name_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_Type_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_Type_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListStatus_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListStatus_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table_Pagination)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table_Pagination;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Label;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedDrugList_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedDrugList_Label;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientNumber_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientNumber_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientName_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientName_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientStartDate_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientStartDate_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientEndDate_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientEndDate_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableClient_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableClient_Table;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableClient_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableClient_Label;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedClient_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedClient_Label;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_Add_Button)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_Add_Button;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedAssignment_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedAssignment_Table;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_Remove_Button)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_Remove_Button;
	
	@FindBy(xpath=AddFocusedUMBundleRespiratory.AssignmentCriteria_Add_FocusedUMBundleRespiratory_Update_Button)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleRespiratory_Update_Button;
	
	public boolean verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List.exists(5000))		
		{
			Log.info("Focused UM Bundle-Respiratory Assignment is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean verifyAssignFocusedUMBundleRespiratoryByListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List);
	}
	
	public boolean verifyAssignFocusedUMBundleRespiratoryByListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List);
	}
	
	public boolean verifyAssignFocusedUMBundleRespiratoryByListBoxDefaultItem(String strDefaultItem) throws Throwable
	{
		return rxNovaCommonUtil.verifyDefaultItemInListBox(AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List,strDefaultItem);
	}	
	
	public boolean verifyAssignFocusedUMBundleRespiratoryByListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List, strListItems);
	}
	
	public boolean verifyAssignFocusedUMBundleRespiratoryByListBoxIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsDisabled(AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List);
	}
	
	public boolean selectAssignFocusedUMBundleRespiratoryBy(String strAssignFocusedUMBundleRespiratoryBy) throws Throwable
	{
		if(!strAssignFocusedUMBundleRespiratoryBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_AssignFocusedUMBundleRespiratoryBy_List, strAssignFocusedUMBundleRespiratoryBy);
		}
		else
		{
			return true;
		}
	}
	
	// Available Coverage Code
	
	public boolean verifyAvailableCoverageCodeTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table);
	}
	
	public boolean verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode1_Edit);
	}
	
	public boolean verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode1_Edit);
	}
	
	public boolean verifyCoverageCode1EditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode1_Edit, strLength);
	}
	
	public boolean verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode2_Edit);
	}
	
	public boolean verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode2_Edit);
	}
	
	public boolean verifyCoverageCode2EditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCode2_Edit, strLength);
	}
	
	public boolean verifyCoverageCodeDescriptionEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Description_Edit);
	}
	
	public boolean verifyCoverageCodeDescriptionEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Description_Edit);
	}
	
	public boolean verifyCoverageCodeDescriptionEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Description_Edit, strLength);
	}
	
	public boolean verifyCoverageCodeStatusEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCodeStatus_Edit);
	}
	
	public boolean verifyCoverageCodeStatusEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCodeStatus_Edit);
	}
	
	public boolean verifyCoverageCodeStatusEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_CoverageCodeStatus_Edit, strLength);
	}
	
	public boolean verifyAvailableCoverageCodeTablePaginationPresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyPaginationPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableCoverageCode_Table_Pagination);
	}
	
	// Available Drug List
	
	public boolean verifyAvailableDrugListTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table);
	}
	
	public boolean verifyDrugListIDEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListID_Edit);
	}
	
	public boolean verifyDrugListIDEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListID_Edit);
	}
	
	public boolean verifyDrugListIDEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListID_Edit, strLength);
	}
	
	public boolean verifyDrugListNameEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Name_Edit);
	}
	
	public boolean verifyDrugListNameEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Name_Edit);
	}
	
	public boolean verifyDrugListNameEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Name_Edit, strLength);
	}
	
	public boolean verifyDrugListTypeEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Type_Edit);
	}
	
	public boolean verifyDrugListTypeEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Type_Edit);
	}
	
	public boolean verifyDrugListTypeEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Type_Edit, strLength);
	}
	
	public boolean verifyDrugListStatusEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListStatus_Edit);
	}
	
	public boolean verifyDrugListStatusEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListStatus_Edit);
	}
	
	public boolean verifyDrugListStatusEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_DrugListStatus_Edit, strLength);
	}
	
	public boolean verifyAvailableDrugListTablePaginationPresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyPaginationPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableDrugList_Table_Pagination);
	}
	
	// Available Client
	
	public boolean verifyAvailableClientTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_AvailableClient_Table);
	}
	
	public boolean verifyClientNumberEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientNumber_Edit);
	}
	
	public boolean verifyClientNumberEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientNumber_Edit);
	}
	
	public boolean verifyClientNumberEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientNumber_Edit, strLength);
	}
	
	public boolean verifyClientNameEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientName_Edit);
	}
	
	public boolean verifyClientNameEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientName_Edit);
	}
	
	public boolean verifyClientNameEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientName_Edit, strLength);
	}
	
	public boolean verifyClientStartDateEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientStartDate_Edit);
	}
	
	public boolean verifyClientStartDateEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientStartDate_Edit);
	}
	
	public boolean verifyClientStartDateEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientStartDate_Edit, strLength);
	}
	
	public boolean verifyClientEndDateEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientEndDate_Edit);
	}
	
	public boolean verifyClientEndDateEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientEndDate_Edit);
	}
	
	public boolean verifyClientEndDateEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_ClientEndDate_Edit, strLength);
	}	
	
	public boolean verifyAssignedFocusedUMBundleRespiratoryListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AssignmentCriteria_Add_AssignedFocusedUMBundleRespiratory_List);
	}
	
	public boolean verifyAssignedFocusedUMBundleRespiratoryListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AssignmentCriteria_Add_AssignedFocusedUMBundleRespiratory_List);
	}
	
	public boolean verifyAssignedFocusedUMBundleRespiratoryListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AssignmentCriteria_Add_AssignedFocusedUMBundleRespiratory_List, strListItems);
	}
	
	public boolean selectAssignedFocusedUMBundleRespiratory(String strAssignedFocusedUMBundleRespiratory) throws Throwable
	{
		if(!strAssignedFocusedUMBundleRespiratory.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_AssignedFocusedUMBundleRespiratory_List, strAssignedFocusedUMBundleRespiratory);
		}
		else
		{
			return true;
		}
	}
	
	public boolean verifyAddButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Add_Button);
	}
	
	public boolean verifyAddButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Add_Button);
	}
	
	public boolean verifyAddButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Add_Button);
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Add_Button);
	}
	
	public boolean verifySelectedAssignmentTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedAssignment_Table);
	}
	
	public boolean verifyRemoveButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Remove_Button);
	}
	
	public boolean verifyUpdateButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_FocusedUMBundleRespiratory_Update_Button);
	}
	
	public boolean clickOnSelectedFocusedUMBundleRespiratoryAssignmentCheckbox(String strOperation, String strSelectedFocusedUMBundleRespiratory) throws Throwable
	{
		if(!strSelectedFocusedUMBundleRespiratory.isEmpty())		
		{
			return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_FocusedUMBundleRespiratory_SelectedAssignment_Table, strOperation, strSelectedFocusedUMBundleRespiratory);
		}
		else
		{
			return true;
		}
	}
}
