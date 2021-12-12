package com.project.actors;

import java.util.List;

import com.project.pages.AddMembershipClaimCountsPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorAddMembershipClaimCountsPage 
{
	@Steps
	AddMembershipClaimCountsPage addMembershipClaimCountsPage;
	
	@Step
	public void verifyMembershipClaimScreenDisplay() throws Throwable
	{
		addMembershipClaimCountsPage.verifyMembershipClaimCountsPanelIsDisplayed();
	}
	
	@Step
	public void verifyUserIsOnMembershipClaimCountsScreen() throws Throwable
	{
		addMembershipClaimCountsPage.verifyMembershipClaimCountsPanelIsDisplayed();
	}
	
	@Step
	public void detailsSubmitionInMembershipClaimCountsScreen(DataTable membershipClaimCountsPanelData) throws Throwable
	{
		List<List<String>>membershipClaimCountDetails = membershipClaimCountsPanelData.raw();
		
		String strOperation = membershipClaimCountDetails.get(1).get(0);
		String strExistingMembershipRecord = membershipClaimCountDetails.get(1).get(1);
		String strEstablishContractualMembershipClaimCountsBy = membershipClaimCountDetails.get(1).get(2);
		String strCustomerVendorFormularyID = membershipClaimCountDetails.get(1).get(3);
		String strContractualMembershipCount = membershipClaimCountDetails.get(1).get(4);
		String strMembershipPercentThreshold = membershipClaimCountDetails.get(1).get(5);
		String strContractualClaimCount = membershipClaimCountDetails.get(1).get(6);
		String strClaimPercentThreshold = membershipClaimCountDetails.get(1).get(7);
		
		switch(strOperation.toUpperCase())
		{
			case "REMOVE":				
				addMembershipClaimCountsPage.clickOnCheckBoxAtMatchingRowInMembershipClaimCountsPanelTable(strExistingMembershipRecord);
				addMembershipClaimCountsPage.clickOnRemoveButton();
				    break;
			case "UPDATE":								
				addMembershipClaimCountsPage.clickOnCheckBoxAtMatchingRowInMembershipClaimCountsPanelTable(strExistingMembershipRecord);
				addMembershipClaimCountsPage.clickOnUpdateButton();
				
				addMembershipClaimCountsPage.setTextIntoContractualMembershipCountEdit(strContractualMembershipCount);
				addMembershipClaimCountsPage.setTextIntoMembershipPercentThresholdEdit(strMembershipPercentThreshold);
				addMembershipClaimCountsPage.setTextIntoContractualClaimCountEdit(strContractualClaimCount);
				addMembershipClaimCountsPage.setTextIntoClaimPercentThresholdEdit(strClaimPercentThreshold);
				addMembershipClaimCountsPage.clickOnAddButton();
				break;
			case "ADD":								
				addMembershipClaimCountsPage.selectValueFromEstablishContractualMembershipClaimCountsByList(strEstablishContractualMembershipClaimCountsBy);				
				switch(strEstablishContractualMembershipClaimCountsBy.toUpperCase())
				{
				case "CUSTOR":
					addMembershipClaimCountsPage.selectValueFromCustomerVendorFormularyID_By_Customer_List(strCustomerVendorFormularyID);
					break;
				case "VENDOR FORMULARY ID":
					addMembershipClaimCountsPage.selectValueFromCustomerVendorFormularyID_By_VendorFormulary_List(strCustomerVendorFormularyID);
					break;
				}
				addMembershipClaimCountsPage.setTextIntoContractualMembershipCountEdit(strContractualMembershipCount);
				addMembershipClaimCountsPage.setTextIntoMembershipPercentThresholdEdit(strMembershipPercentThreshold);
				addMembershipClaimCountsPage.setTextIntoContractualClaimCountEdit(strContractualClaimCount);
				addMembershipClaimCountsPage.setTextIntoClaimPercentThresholdEdit(strClaimPercentThreshold);
				addMembershipClaimCountsPage.clickOnAddButton();
		}		
		addMembershipClaimCountsPage.veifyMembershipClaimCountsTableData(strCustomerVendorFormularyID+"^"+strContractualMembershipCount);
		
	}
	
	@Step
	public void nextButtonClickinMembershipClaimCountsScreen()	throws Throwable
	{
		addMembershipClaimCountsPage.clickOnNextButton();
	}
}
