package com.project.pages;

import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddFocusedUMBundleDiabetes;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class AddFocusedUMBundleDiabetesAssignmentPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@FindBy(id=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_AssignFocusedUMBundleDiabetesBy_List)
	private BaseElement AssignmentCriteria_Add_AssignFocusedUMBundleDiabetesBy_List;
	
	@FindBy(id=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_AssignedFocusedUMBundleDiabetes_List)
	private BaseElement AssignmentCriteria_Add_AssignedFocusedUMBundleDiabetes_List;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode1_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode1_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode2_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode2_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_Description_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_Description_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCodeStatus_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCodeStatus_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCode_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCode_Table;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCodes_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCodes_Label;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedCoverageCodes_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedCoverageCodes_Label;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListID_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListID_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_Name_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_Name_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_Type_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_Type_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListStatus_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListStatus_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Table;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Label;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedDrugList_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedDrugList_Label;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientNumber_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientNumber_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientName_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientName_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientStartDate_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientStartDate_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientEndDate_Edit)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientEndDate_Edit;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableClient_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableClient_Table;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableClient_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableClient_Label;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedClient_Label)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedClient_Label;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_Add_Button)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_Add_Button;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedAssignment_Table)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedAssignment_Table;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_Remove_Button)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_Remove_Button;
	
	@FindBy(xpath=AddFocusedUMBundleDiabetes.AssignmentCriteria_Add_FocusedUMBundleDiabetes_Update_Button)
	private BaseElement AssignmentCriteria_Add_FocusedUMBundleDiabetes_Update_Button;
	
	public boolean verifyFocusedUMBundleSpecialtyAssignmentIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Add_AssignFocusedUMBundleDiabetesBy_List.exists(5000))		
		{
			Log.info("Focused UM Bundle-Diabetes Assignment is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectAssignFocusedUMBundleDiabetesBy(String strAssignFocusedUMBundleDiabetesBy) throws Throwable
	{
		if(!strAssignFocusedUMBundleDiabetesBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_AssignFocusedUMBundleDiabetesBy_List, strAssignFocusedUMBundleDiabetesBy);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterCoverageCode1(String strCoverageCode1) throws Throwable
	{
		if(!strCoverageCode1.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode1_Edit, strCoverageCode1);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterCoverageCode2(String strCoverageCode2) throws Throwable
	{
		if(!strCoverageCode2.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCode2_Edit, strCoverageCode2);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterCoverageCodeDescription(String strCoverageCodeDescription) throws Throwable
	{
		if(!strCoverageCodeDescription.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_Description_Edit, strCoverageCodeDescription);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterCoverageCodeStatus(String strCoverageCodeStatus) throws Throwable
	{
		if(!strCoverageCodeStatus.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_CoverageCodeStatus_Edit, strCoverageCodeStatus);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectAvailableCoverageCodes(String strAvailableCoverageCodes) throws Throwable
	{
		if(!strAvailableCoverageCodes.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableCoverageCode_Table, strAvailableCoverageCodes);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterDrugListID(String strDrugListID) throws Throwable
	{
		if(!strDrugListID.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListID_Edit, strDrugListID);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterDrugListName(String strDrugListName) throws Throwable
	{
		if(!strDrugListName.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_Name_Edit, strDrugListName);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterDrugListType(String strDrugListType) throws Throwable
	{
		if(!strDrugListType.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_Type_Edit, strDrugListType);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterDrugListStatus(String strDrugListStatus) throws Throwable
	{
		if(!strDrugListStatus.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_DrugListStatus_Edit, strDrugListStatus);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectAvailableDrugLists(String strAvailableDrugLists) throws Throwable
	{
		if(!strAvailableDrugLists.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableDrugList_Table, strAvailableDrugLists);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterClientNumber(String strClientNumber) throws Throwable
	{
		if(!strClientNumber.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientNumber_Edit, strClientNumber);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterClientName(String strClientName) throws Throwable
	{
		if(!strClientName.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientName_Edit, strClientName);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterClientStartDate(String strClientStartDate) throws Throwable
	{
		if(!strClientStartDate.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientStartDate_Edit, strClientStartDate);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterClientEndDate(String strClientEndDate) throws Throwable
	{
		if(!strClientEndDate.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_FocusedUMBundleDiabetes_ClientEndDate_Edit, strClientEndDate);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectAvailableClients(String strAvailableClients) throws Throwable
	{
		if(!strAvailableClients.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_FocusedUMBundleDiabetes_AvailableClient_Table, strAvailableClients);
		}
		else
		{
			return true;
		}
	}
	
	public boolean selectAssignedFocusedUMBundleDiabetes(String strAssignedFocusedUMBundleDiabetes) throws Throwable
	{
		if(!strAssignedFocusedUMBundleDiabetes.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_AssignedFocusedUMBundleDiabetes_List, strAssignedFocusedUMBundleDiabetes);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_FocusedUMBundleDiabetes_Add_Button);
	}
	
	public boolean updateSelectedFocusedUMBundleDiabetes(String strSelectedFocusedUMBundleDiabetes) throws Throwable
	{
		if(!strSelectedFocusedUMBundleDiabetes.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedAssignment_Table, strSelectedFocusedUMBundleDiabetes);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_FocusedUMBundleDiabetes_Remove_Button);	
	}
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_FocusedUMBundleDiabetes_Update_Button);	
	}
	
	public boolean verifySelectedAssignmentDetails(String strSelectedAssignmentDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(AssignmentCriteria_Add_FocusedUMBundleDiabetes_SelectedAssignment_Table, strSelectedAssignmentDetails);
	}
}
