package com.project.actors;

import java.util.List;

import com.project.pages.ViewMembershipClaimCountsPage;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class ActorViewMembershipClaimCountsPage 
{
	@Steps
	ViewMembershipClaimCountsPage viewMembershipClaimCountsPage;
	
	@Step
	public void expand_Membership_Claim_Counts_Panel(DataTable panelName) throws Throwable
	{
		List<List<String>> panelDetails = panelName.raw();
		
		String strPanelName = panelDetails.get(1).get(0);
		
		viewMembershipClaimCountsPage.expand_MembershipClaimCounts_panel(strPanelName);
	}
	
	@Step
	public void verify_Membership_Claim_Counts_details(DataTable membershipClaimCountData) throws Throwable
	{
		List<List<String>> membershipClaimCount = membershipClaimCountData.raw();
		
		String strCustomerOrVendorFormularyID = membershipClaimCount.get(1).get(0);
		String strCustomerVendorFormularyID =  null;
		
		switch(strCustomerOrVendorFormularyID.toUpperCase())
		{
		case "CUSTOMER":
			strCustomerVendorFormularyID = membershipClaimCount.get(1).get(1);
			break;
		case "VENDOR FORMULARY ID":
			strCustomerVendorFormularyID = membershipClaimCount.get(1).get(2);
			break;
		}
		
		String strContractualMembershipCount = membershipClaimCount.get(1).get(3);
		String strMembershipPercentThreshold = membershipClaimCount.get(1).get(4);
		String strContractualClaimCount = membershipClaimCount.get(1).get(5);
		String ClaimPercentThreshold = membershipClaimCount.get(1).get(6);
		
		String membershipClaimCountValue = strCustomerVendorFormularyID+"*"+strContractualMembershipCount+"*"+strMembershipPercentThreshold+"*"+strContractualClaimCount+"*"+ClaimPercentThreshold;
		viewMembershipClaimCountsPage.verifyMembershipClaimCountsTableData(membershipClaimCountValue);
	}
}
