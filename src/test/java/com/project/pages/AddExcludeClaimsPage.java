package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddExcludeClaims;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class AddExcludeClaimsPage extends BasePage
{
	
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	RebateCommonUtil rebateCommonUtil;
	
	@ByAngularModel.FindBy(model=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaimsBy_List)
	private BaseElement AssignmentCriteria_Add_ExcludeClaimsBy_List;
	
	@ByAngularModel.FindBy(model=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_Client_Edit)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_Client_Edit;
	
	@ByAngularModel.FindBy(model=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_CoverageCode1_Edit)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_CoverageCode1_Edit;
	
	@ByAngularModel.FindBy(model=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_CoverageCode2_Edit)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_CoverageCode2_Edit;
	
	@ByAngularModel.FindBy(model=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_Group_Edit)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_Group_Edit;	
	
	@FindBy(xpath=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_Add_Button)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_Add_Button;
	
	@FindBy(xpath=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_Table)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_Table;
	
	@FindBy(xpath=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_Remove_Button)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_Remove_Button;
	
	@FindBy(xpath=AddExcludeClaims.AssignmentCriteria_Add_ExcludeClaims_Update_Button)
	private BaseElement AssignmentCriteria_Add_ExcludeClaims_Update_Button;
	
	public boolean verifyExcludeClaimsIsDisplayed() throws Throwable 
	{
		getNgDriver().waitForAngularRequestsToFinish();
		if(AssignmentCriteria_Add_ExcludeClaimsBy_List.exists(5000))		
		{
			Log.info("Exclude Claims is displayed");
			return true;
		}
		else
		{
		   return false;
		}
	}
	
	public boolean selectExcludeClaimsBy(String strExcludeClaimsBy) throws Throwable
	{
		if(!strExcludeClaimsBy.isEmpty())		
		{
			return rebateCommonUtil.rebate_SelectFromDropdownUsingText(AssignmentCriteria_Add_ExcludeClaimsBy_List, strExcludeClaimsBy);
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
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_ExcludeClaims_Client_Edit, strClient);
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
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_ExcludeClaims_CoverageCode1_Edit, strCoverageCode1);
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
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_ExcludeClaims_CoverageCode2_Edit, strCoverageCode2);
		}
		else
		{
			return true;
		}
	}
	
	public boolean enterGroup(String strGroup) throws Throwable
	{
		if(!strGroup.isEmpty())		
		{
			return rxNovaCommonUtil.setTextOnEdit(AssignmentCriteria_Add_ExcludeClaims_Group_Edit, strGroup);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_ExcludeClaims_Add_Button);
	}
	
	public boolean updateSelectedClaimsToExclude(String strSelectedClaimsToExclude) throws Throwable
	{
		if(!strSelectedClaimsToExclude.isEmpty())		
		{
			return rebateCommonUtil.rebate_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_ExcludeClaims_Table, strSelectedClaimsToExclude);
		}
		else
		{
			return true;
		}
	}
	
	public boolean clickOnRemoveButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_ExcludeClaims_Remove_Button);		
	}
	
	public boolean clickOnUpdateButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_ExcludeClaims_Update_Button);
	}	
	
	public boolean verifySelectedClaimsToExcludeDetails(String strSelectedClaimsDetails) throws Throwable
	{
		return rebateCommonUtil.rebate_Webtable_VerifyRowData(AssignmentCriteria_Add_ExcludeClaims_Table, strSelectedClaimsDetails);
	}
}
