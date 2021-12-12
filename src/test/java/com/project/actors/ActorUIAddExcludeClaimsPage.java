package com.project.actors;

import java.util.List;
import com.project.pages.UIAddExcludeClaimsPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorUIAddExcludeClaimsPage {
	
	@Steps
	UIAddExcludeClaimsPage uiAddExcludeClaimsPage;
	
	@Step
	public void verifyExcludeClaimsByListBoxPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyExcludeClaimsByListBoxPresence();
	}
	
	@Step
	public void verifyExcludeClaimsByListBoxIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyExcludeClaimsByListBoxIsEnabled();
	}
	
	@Step
	public void verifyExcludeClaimsByListBoxDefaultItem(DataTable excludeClaimsByListDefaultItem) throws Throwable
	{
		List<List<String>> strGuaranteeCodeByListDefaultItem = excludeClaimsByListDefaultItem.raw();
		
		String strDefaultItem = strGuaranteeCodeByListDefaultItem.get(1).get(0);
		
		uiAddExcludeClaimsPage.verifyExcludeClaimsByListBoxDefaultItem(strDefaultItem);
	}
	
	@Step
	public void verifyExcludeClaimsByListBoxItems(DataTable excludeClaimsByListItems) throws Throwable
	{
		List<List<String>> strGuaranteeCodeByListItems = excludeClaimsByListItems.raw();
		
		String strExcludeClaimsBy = strGuaranteeCodeByListItems.get(1).get(0);
		
		uiAddExcludeClaimsPage.verifyExcludeClaimsByListBoxItems(strExcludeClaimsBy);
	}
	
	@Step
	public void verifyExcludeClaimsByListBoxIsDisabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyExcludeClaimsByListBoxIsDisabled();
	}	
	
	@Step
	public void selectExcludeClaimsByListBoxItem(DataTable excludeClaimsByListItem) throws Throwable
	{
		List<List<String>> strExcludeClaimsByListItem = excludeClaimsByListItem.raw();
		
		String strExcludeClaimsBy = strExcludeClaimsByListItem.get(1).get(0);
		
		uiAddExcludeClaimsPage.selectExcludeClaimsBy(strExcludeClaimsBy);
	}
	
	@Step
	public void verifyClientEditBoxPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyClientEditBoxPresence();
	}
	
	@Step
	public void verifyClientEditBoxIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyClientEditBoxIsEnabled();
	}
	
	@Step
	public void verifyClientEditBoxMaxLength(DataTable clientMaxLength) throws Throwable
	{
		List<List<String>> strClientMaxLength = clientMaxLength.raw();
		
		String strClientLength = strClientMaxLength.get(1).get(0);
		
		uiAddExcludeClaimsPage.verifyClientEditBoxMaxLength(strClientLength);
	}
	
	@Step
	public void verifyCoverageCode1EditBoxPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyCoverageCode1EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyCoverageCode1EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode1EditBoxMaxLength(DataTable coverageCode1MaxLength) throws Throwable
	{
		List<List<String>> strCoverageCode1MaxLength = coverageCode1MaxLength.raw();
		
		String strCoverageCode1Length = strCoverageCode1MaxLength.get(1).get(0);
		
		uiAddExcludeClaimsPage.verifyCoverageCode1EditBoxMaxLength(strCoverageCode1Length);
	}
	
	@Step
	public void verifyCoverageCode2EditBoxPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyCoverageCode2EditBoxPresence();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyCoverageCode2EditBoxIsEnabled();
	}
	
	@Step
	public void verifyCoverageCode2EditBoxMaxLength(DataTable coverageCode2MaxLength) throws Throwable
	{
		List<List<String>> strCoverageCode2MaxLength = coverageCode2MaxLength.raw();
		
		String strCoverageCode2Length = strCoverageCode2MaxLength.get(1).get(0);
		
		uiAddExcludeClaimsPage.verifyCoverageCode2EditBoxMaxLength(strCoverageCode2Length);
	}
	
	@Step
	public void verifyGroupEditBoxPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyGroupEditBoxPresence();
	}
	
	@Step
	public void verifyGroupEditBoxIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyGroupEditBoxIsEnabled();
	}
	
	@Step
	public void verifyGroupEditBoxMaxLength(DataTable groupMaxLength) throws Throwable
	{
		List<List<String>> strGroupMaxLength = groupMaxLength.raw();
		
		String strGroupLength = strGroupMaxLength.get(1).get(0);
		
		uiAddExcludeClaimsPage.verifyGroupEditBoxMaxLength(strGroupLength);
	}
	
	@Step
	public void verifyAddButtonPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyAddButtonPresence();
	}
	
	@Step
	public void verifyAddButtonIsDisabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyAddButtonIsDisabled();
	}
	
	@Step
	public void inputExcludeClaimsDetails(DataTable excludeClaimsData) throws Throwable
	{
		List<List<String>> excludeClaimsDetails = excludeClaimsData.raw();
		
		String strExcludeClaimsBy  = excludeClaimsDetails.get(1).get(0);
		String strClient = excludeClaimsDetails.get(1).get(1);
		
		uiAddExcludeClaimsPage.selectExcludeClaimsBy(strExcludeClaimsBy);
		uiAddExcludeClaimsPage.enterClient(strClient);
	}
	
	@Step
	public void verifyAddButtonIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyAddButtonIsEnabled();
	}
	
	@Step
	public void clickOnAddButton() throws Throwable
	{
		uiAddExcludeClaimsPage.clickOnAddButton();
	}
	
	@Step
	public void verifySelectedClaimsToExcludeTablePresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifySelectedClaimsToExcludeTablePresence();
	}
	
	@Step
	public void verifyRemoveButtonPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyRemoveButtonPresence();
	}
	
	@Step
	public void verifyRemoveButtonIsDisabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyRemoveButtonIsDisabled();
	}
	
	@Step
	public void verifyUpdateButtonPresence() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyUpdateButtonPresence();
	}
	
	@Step
	public void verifyUpdateButtonIsDisabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyUpdateButtonIsDisabled();
	}
	
	@Step
	public void clickOnSelectedClaimsToExcludeCheckbox(DataTable excludeClaimsDetails) throws Throwable
	{
		List<List<String>>  excludeClaims = excludeClaimsDetails.raw();
		
		String strOperation = excludeClaims.get(1).get(0);
		String strExcludeClaimsDetails = excludeClaims.get(1).get(1);
		
		uiAddExcludeClaimsPage.clickOnSelectedClaimsToExcludeCheckbox(strOperation, strExcludeClaimsDetails);
	}
	
	@Step
	public void verifyRemoveButtonIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyRemoveButtonIsEnabled();
	}
	
	@Step
	public void verifyUpdateButtonIsEnabled() throws Throwable
	{
		uiAddExcludeClaimsPage.verifyUpdateButtonIsEnabled();
	}
}