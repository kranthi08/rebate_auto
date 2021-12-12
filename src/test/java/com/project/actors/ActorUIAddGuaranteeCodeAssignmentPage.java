package com.project.actors;

import java.util.List;
import com.project.pages.UIAddGuaranteeCodeAssignmentPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddGuaranteeCodeAssignmentPage {
	
	@Steps
	UIAddGuaranteeCodeAssignmentPage uiAddGuaranteeCodeAssignmentPage;
	
	@Step
	public void verifyAssignGuaranteeCodeByListBoxPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxPresence();
	}
	
	@Step
	public void verifyAssignGuaranteeCodeByListBoxIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxIsEnabled();
	}
	
	@Step
	public void verifyAssignGuaranteeCodeByListBoxDefaultItem(DataTable assignGuaranteeCodeByListDefaultItem) throws Throwable
	{
		List<List<String>> strGuaranteeCodeByListDefaultItem = assignGuaranteeCodeByListDefaultItem.raw();
		
		String strDefaultItem = strGuaranteeCodeByListDefaultItem.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyAssignGuaranteeCodeByListBoxItems(DataTable assignGuaranteeCodeByListItems) throws Throwable
	{
		List<List<String>> strGuaranteeCodeByListItems = assignGuaranteeCodeByListItems.raw();
		
		String strAssignGuaranteeCodeBy = strGuaranteeCodeByListItems.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxItems(strAssignGuaranteeCodeBy);
	}
	
	@Step
	public void verifyAssignGuaranteeCodeByListBoxIsDisabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyAssignGuaranteeCodeByListBoxIsDisabled();
	}	
	
	@Step
	public void selectAssignGuaranteeCodeByListBoxItem(DataTable assignGuaranteeCodeByListItem) throws Throwable
	{
		List<List<String>> strAssignGuaranteeCodeByListItem = assignGuaranteeCodeByListItem.raw();
		
		String strAssignGuaranteeCodeBy = strAssignGuaranteeCodeByListItem.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.selectAssignGuaranteeCodeBy(strAssignGuaranteeCodeBy);
	}
	
	@Step
	public void verifyCustomerEditBoxPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyCustomerEditBoxPresence();
	}
	
	@Step
	public void verifyCustomerEditBoxIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyCustomerEditBoxIsEnabled();
	}
	
	@Step
	public void verifyCustomerEditBoxMaxLength(DataTable customerMaxLength) throws Throwable
	{
		List<List<String>> strCustomerMaxLength = customerMaxLength.raw();
		
		String strCustomerLength = strCustomerMaxLength.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyCustomerEditBoxMaxLength(strCustomerLength);
	}
	
	@Step
	public void verifyClientEditBoxPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyClientEditBoxPresence();
	}
	
	@Step
	public void verifyClientEditBoxIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyClientEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEditBoxMaxLength(DataTable clientMaxLength) throws Throwable
	{
		List<List<String>> strClientMaxLength = clientMaxLength.raw();
		
		String strClientLength = strClientMaxLength.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyClientEditBoxMaxLength(strClientLength);
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxMaxLength(DataTable coverageCode1MaxLength) throws Throwable
	{
		List<List<String>> strCoverageCode1MaxLength = coverageCode1MaxLength.raw();
		
		String strCoverageCode1Length = strCoverageCode1MaxLength.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyCoverageCode1EditBoxMaxLength(strCoverageCode1Length);
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxMaxLength(DataTable coverageCode2MaxLength) throws Throwable
	{
		List<List<String>> strCoverageCode2MaxLength = coverageCode2MaxLength.raw();
		
		String strCoverageCode2Length = strCoverageCode2MaxLength.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyCoverageCode2EditBoxMaxLength(strCoverageCode2Length);
	}
	
	@Step
	public void verifyDrugListEditBoxPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyDrugListEditBoxPresence();
	}
	
	@Step
	public void verifyDrugListEditBoxIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyDrugListEditBoxIsEnabled();
	}
	
	@Step
	public void verifyDrugListEditBoxMaxLength(DataTable drugListMaxLength) throws Throwable
	{
		List<List<String>> strDrugListMaxLength = drugListMaxLength.raw();
		
		String strDrugListLength = strDrugListMaxLength.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyDrugListEditBoxMaxLength(strDrugListLength);
	}
	
	@Step
	public void verifyGuaranteeCodeEditBoxPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeEditBoxPresence();
	}
	
	@Step
	public void verifyGuaranteeCodeEditBoxIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeEditBoxIsEnabled();
	}
	
	@Step
	public void verifyGuaranteeCodeEditBoxMaxLength(DataTable guaranteeCodeMaxLength) throws Throwable
	{
		List<List<String>> strGuaranteeCodeMaxLength = guaranteeCodeMaxLength.raw();
		
		String strGuaranteeCodeLength = strGuaranteeCodeMaxLength.get(1).get(0);
		
		uiAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeEditBoxMaxLength(strGuaranteeCodeLength);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputGuaranteeCodeAssignmentDetails(DataTable guaranteeCodeAssignmentData) throws Throwable
	{
		List<List<String>> assignmentDetails = guaranteeCodeAssignmentData.raw();
		
		String strAssignGuaranteeCodeBy  = assignmentDetails.get(1).get(0);
		String strCustomer = assignmentDetails.get(1).get(1);
		String strGuaranteeCode = assignmentDetails.get(1).get(2);
		
		uiAddGuaranteeCodeAssignmentPage.selectAssignGuaranteeCodeBy(strAssignGuaranteeCodeBy);
		uiAddGuaranteeCodeAssignmentPage.enterCustomer(strCustomer);
		uiAddGuaranteeCodeAssignmentPage.enterGuaranteeCode(strGuaranteeCode);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.clickOnAddButton();
	}
	
	@Step
	public void verifyGuaranteeCodeAssignmentTablePresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyGuaranteeCodeAssignmentTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnGuaranteeCodeAssignmentCheckbox(DataTable guaranteeCodeAssignmentDetails) throws Throwable
	{
		List<List<String>>  guaranteeCodeAssignment = guaranteeCodeAssignmentDetails.raw();
		
		String strOperation = guaranteeCodeAssignment.get(1).get(0);
		String strGuaranteeCodeAssignment = guaranteeCodeAssignment.get(1).get(1);
		
		uiAddGuaranteeCodeAssignmentPage.clickOnGuaranteeCodeAssignmentCheckbox(strOperation, strGuaranteeCodeAssignment);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddGuaranteeCodeAssignmentPage.verifyUpdateButtonIsEnabled();
	}
}