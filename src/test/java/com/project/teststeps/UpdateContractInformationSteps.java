package com.project.teststeps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import com.project.actors.ActorUpdateContractInformation;

public class UpdateContractInformationSteps 
{
	@Steps
	ActorUpdateContractInformation actorUpdateContractInformation;
	
	@And("^update the following Vendor details in Contract Information screen$")
	public void update_the_following_vendor_details_in_contract_information_screen(DataTable strVendorDetails) throws Throwable
	{
		actorUpdateContractInformation.updateContractVedorAndPenaltyDetails(strVendorDetails);
	}
	
	@And("^update the following Rate details in Contract Information screen$")
	public void update_the_following_rate_details_in_contract_information_screen(DataTable strRateDetailsTableData) throws Throwable
	{
		actorUpdateContractInformation.updateRateDetailsInContractInformation(strRateDetailsTableData);;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
