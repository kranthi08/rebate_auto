package com.project.pages;

import com.paulhammant.ngwebdriver.ByAngularModel;
import com.project.common.util.RebateCommonUtil;
import com.project.common.util.RxNovaCommonUtil;
import com.project.locators.Rebate.AddExcludeClaims;
import com.psqframework.core.element.BaseElement;
import com.psqframework.core.page.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Steps;


public class UIAddExcludeClaimsPage extends BasePage
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
	
	public boolean verifyExcludeClaimsByListBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxPresence(AssignmentCriteria_Add_ExcludeClaimsBy_List);
	}
	
	public boolean verifyExcludeClaimsByListBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsEnabled(AssignmentCriteria_Add_ExcludeClaimsBy_List);
	}
	
	public boolean verifyExcludeClaimsByListBoxDefaultItem(String strDefaultItem) throws Throwable
	{
		return rxNovaCommonUtil.verifyDefaultItemInListBox(AssignmentCriteria_Add_ExcludeClaimsBy_List,strDefaultItem);
	}
	
	public boolean verifyExcludeClaimsByListBoxItems(String strListItems) throws Throwable
	{
		return rxNovaCommonUtil.verifyItemsInListBox(AssignmentCriteria_Add_ExcludeClaimsBy_List, strListItems);
	}
	
	public boolean verifyExcludeClaimsByListBoxIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyListBoxIsDisabled(AssignmentCriteria_Add_ExcludeClaimsBy_List);
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
	
	public boolean verifyClientEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_ExcludeClaims_Client_Edit);
	}
	
	public boolean verifyClientEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_ExcludeClaims_Client_Edit);
	}
	
	public boolean verifyClientEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_ExcludeClaims_Client_Edit, strLength);
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
	
	public boolean verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_ExcludeClaims_CoverageCode1_Edit);
	}
	
	public boolean verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_ExcludeClaims_CoverageCode1_Edit);
	}
	
	public boolean verifyCoverageCode1EditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_ExcludeClaims_CoverageCode1_Edit, strLength);
	}
	
	public boolean verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_ExcludeClaims_CoverageCode2_Edit);
	}
	
	public boolean verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_ExcludeClaims_CoverageCode2_Edit);
	}
	
	public boolean verifyCoverageCode2EditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_ExcludeClaims_CoverageCode2_Edit, strLength);
	}
	
	public boolean verifyGroupEditBoxPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxPresence(AssignmentCriteria_Add_ExcludeClaims_Group_Edit);
	}
	
	public boolean verifyGroupEditBoxIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyEditBoxIsEnabled(AssignmentCriteria_Add_ExcludeClaims_Group_Edit);
	}
	
	public boolean verifyGroupEditBoxMaxLength(String strLength) throws Throwable
	{
		return rxNovaCommonUtil.verifyLengthOfEditBox(AssignmentCriteria_Add_ExcludeClaims_Group_Edit, strLength);
	}
	
	public boolean verifyAddButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_ExcludeClaims_Add_Button);
	}
	
	public boolean verifyAddButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_ExcludeClaims_Add_Button);
	}
	
	public boolean verifyAddButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_ExcludeClaims_Add_Button);
	}
	
	public boolean clickOnAddButton() throws Throwable
	{
		return rxNovaCommonUtil.clickOnButton(AssignmentCriteria_Add_ExcludeClaims_Add_Button);
	}
	
	public boolean verifySelectedClaimsToExcludeTablePresence() throws Throwable 
	{
		return rxNovaCommonUtil.verifyTablePresence(AssignmentCriteria_Add_ExcludeClaims_Table);
	}
	
	public boolean verifyRemoveButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_ExcludeClaims_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_ExcludeClaims_Remove_Button);
	}
	
	public boolean verifyRemoveButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_ExcludeClaims_Remove_Button);
	}
	
	public boolean verifyUpdateButtonPresence() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonPresence(AssignmentCriteria_Add_ExcludeClaims_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsDisabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsDisabled(AssignmentCriteria_Add_ExcludeClaims_Update_Button);
	}
	
	public boolean verifyUpdateButtonIsEnabled() throws Throwable
	{
		return rxNovaCommonUtil.verifyButtonIsEnabled(AssignmentCriteria_Add_ExcludeClaims_Update_Button);
	}
	
	public boolean clickOnSelectedClaimsToExcludeCheckbox(String strOperation, String strExcludeClaimsDetails) throws Throwable
	{
		if(!strExcludeClaimsDetails.isEmpty())		
		{
			return rebateCommonUtil.rebate_UI_Webtable_ClickOnCheckBox(AssignmentCriteria_Add_ExcludeClaims_Table, strOperation, strExcludeClaimsDetails);
		}
		else
		{
			return true;
		}
	}
}
