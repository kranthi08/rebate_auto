package com.project.actors;

import java.util.List;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import com.project.pages.UpdateMembershipClaimCountsPage;
public class ActorUpdateMembershipClaimCountsPage 
{
	@Steps
	UpdateMembershipClaimCountsPage updateClaimCountsPage;
	
	@Step
	public void updateMembershipClaimCountsPanelDetails(DataTable membershipClaimCountsData) throws Throwable
	{
		List<List<String>> membershipClaimCountDetails = membershipClaimCountsData.raw();
		for(int i=1;i<membershipClaimCountDetails.size();i++)
		{
			String strOperation = membershipClaimCountDetails.get(i).get(0);
			String strExistingMembershipRecord = membershipClaimCountDetails.get(i).get(1);
			String strEstablishContractualMembershipClaimCountsBy = membershipClaimCountDetails.get(i).get(2);
			String strCustomerVendorFormularyID = membershipClaimCountDetails.get(i).get(3);
			String strContractualMembershipCount = membershipClaimCountDetails.get(i).get(4);
			String strMembershipPercentThreshold = membershipClaimCountDetails.get(i).get(5);
			String strContractualClaimCount = membershipClaimCountDetails.get(i).get(6);
			String strClaimPercentThreshold = membershipClaimCountDetails.get(i).get(7);		
			switch(strOperation.toUpperCase())
			{
				case "REMOVE":
					updateClaimCountsPage.clickOnUpdateButtonAtMembershipClaimCountsPanel();
					updateClaimCountsPage.clickOnCheckBoxAtMatchingRowInMembershipClaimCountsPanelTable(strExistingMembershipRecord);
					updateClaimCountsPage.clickOnMembershipClaimCountsPanelTableRemoveButton();
					break;
				case "UPDATE":
					updateClaimCountsPage.clickOnUpdateButtonAtMembershipClaimCountsPanel();				
					updateClaimCountsPage.clickOnCheckBoxAtMatchingRowInMembershipClaimCountsPanelTable(strExistingMembershipRecord);
					updateClaimCountsPage.clickOnMembershipClaimCountsPanelTableUpdateButton();
					
					updateClaimCountsPage.setTextIntoContractualMembershipCountEdit(strContractualMembershipCount);
					updateClaimCountsPage.setTextIntoMembershipPercentThresholdEdit(strMembershipPercentThreshold);
					updateClaimCountsPage.setTextIntoContractualClaimCountEdit(strContractualClaimCount);
					updateClaimCountsPage.setTextIntoClaimPercentThresholdEdit(strClaimPercentThreshold);
					updateClaimCountsPage.clickOnAddOrUpdateButton();
					break;
				case "ADD":								
					updateClaimCountsPage.selectValueFromEstablishContractualMembershipClaimCountsByList(strEstablishContractualMembershipClaimCountsBy);				
					switch(strEstablishContractualMembershipClaimCountsBy.toUpperCase())
					{
					case "CUSTOR":
						updateClaimCountsPage.selectValueFromCustomerVendorFormularyID_By_Customer_List(strCustomerVendorFormularyID);
						break;
					case "VENDOR FORMULARY ID":
						updateClaimCountsPage.selectValueFromCustomerVendorFormularyID_By_VendorFormulary_List(strCustomerVendorFormularyID);
						break;
					}
					updateClaimCountsPage.setTextIntoContractualMembershipCountEdit(strContractualMembershipCount);
					updateClaimCountsPage.setTextIntoMembershipPercentThresholdEdit(strMembershipPercentThreshold);
					updateClaimCountsPage.setTextIntoContractualClaimCountEdit(strContractualClaimCount);
					updateClaimCountsPage.setTextIntoClaimPercentThresholdEdit(strClaimPercentThreshold);
					updateClaimCountsPage.clickOnAddOrUpdateButton();
			}
		}
		updateClaimCountsPage.clickOnSaveButton();
	}
		
}
