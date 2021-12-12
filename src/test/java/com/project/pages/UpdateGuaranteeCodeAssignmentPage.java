package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.UpdateGuaranteeCodeAssignment;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UpdateGuaranteeCodeAssignmentPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_AssignGuaranteeCodeBy_List)
	private BaseElement AssignmentCriteria_Update_AssignGuaranteeCodeBy_List;
	
	@FindBy(xpath=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCode_Customer_Edit)
	private BaseElement AssignmentCriteria_Update_GuaranteeCode_Customer_Edit;
	
	@FindBy(xpath=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCode_DrugList_Edit)
	private BaseElement AssignmentCriteria_Update_GuaranteeCode_DrugList_Edit;
	
	@FindBy(xpath=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCode_Client_Edit)
	private BaseElement AssignmentCriteria_Update_GuaranteeCode_Client_Edit;
	
	@ByAngularModel.FindBy(model=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCode_GuaranteeCode_Edit)
	private BaseElement AssignmentCriteria_Update_GuaranteeCode_GuaranteeCode_Edit;
	
	@FindBy(xpath=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCode_Add_Button)
	private BaseElement AssignmentCriteria_Update_GuaranteeCode_Add_Button;
	
	@FindBy(xpath=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCodeAssignment_Table)
	private BaseElement AssignmentCriteria_Update_GuaranteeCodeAssignment_Table;
	
	@FindBy(xpath=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCode_Remove_Button)
	private BaseElement AssignmentCriteria_Update_GuaranteeCode_Remove_Button;
	
	@FindBy(xpath=UpdateGuaranteeCodeAssignment.AssignmentCriteria_Update_GuaranteeCode_Update_Button)
	private BaseElement AssignmentCriteria_Update_GuaranteeCode_Update_Button;
	
	public boolean verifyGuaranteeCodeAssignmentIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Update_AssignGuaranteeCodeBy_List.exists(5000))		
		{
			Log.info("Guarantee Code Assignment is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectAssignGuaranteeCodeBy(String strAssignGuaranteeCodeBy) throws Throwable
	{
		if(!strAssignGuaranteeCodeBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Update_AssignGuaranteeCodeBy_List, strAssignGuaranteeCodeBy);
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
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_GuaranteeCode_Customer_Edit, strCustomer);
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
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_GuaranteeCode_DrugList_Edit, strDrugList);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterClient(String strClient) throws Throwable
	{
		if(!strClient.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_GuaranteeCode_Client_Edit, strClient);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterGuaranteeCode(String strGuaranteeCode) throws Throwable
	{
		if(!strGuaranteeCode.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Update_GuaranteeCode_GuaranteeCode_Edit, strGuaranteeCode);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_GuaranteeCode_Add_Button);
	}
	
	public boolean updateGuaranteeCodeAssignment(String strGuaranteeCodeAssignment) throws Throwable
	{
		if(!strGuaranteeCodeAssignment.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Update_GuaranteeCodeAssignment_Table, strGuaranteeCodeAssignment);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_GuaranteeCode_Remove_Button);
	}
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Update_GuaranteeCode_Update_Button);
	}
	
	public boolean verifyGuaranteeCodeAssignmentDetails(String strGuaranteeCodeAssignmentDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(AssignmentCriteria_Update_GuaranteeCodeAssignment_Table, strGuaranteeCodeAssignmentDetails);
	}
}
