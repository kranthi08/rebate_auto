package com.project.teststeps;

import com.project.actors.ActorMCSAbbreviationUpdateAndRemovePage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MCSAbbreviationUpdateAndRemoveSteps 
{
	@Steps
	ActorMCSAbbreviationUpdateAndRemovePage actorMCsAbbreviationPage;
	
	@Then("^Verify and add the required MCS if not available$")
	public void verify_and_add_the_required_mcs_if_not_available(DataTable mcsDetails) throws Throwable
	{
		actorMCsAbbreviationPage.verifyAndAddTheRequiredMCS(mcsDetails);
	}
	@And("^verify the newly added Master Customer Set$")
	public void verify_the_newly_added_master_customer_set(DataTable newMCSDetails) throws Throwable
	{
		actorMCsAbbreviationPage.verifyTheNewlyAddedMCS(newMCSDetails);
	}
	
	@Then("^Verify and update the Master Abbreviation$")
	public void verify_and_update_the_master_abbreviation(DataTable updatedAbbreviationValues) throws Throwable
	{
		actorMCsAbbreviationPage.verifyAndUpdateMasterAbbreviation(updatedAbbreviationValues);;
	}
	
	@And("verify the updated Master Abbreviation$")
	public void verify_the_updated_master_abbreviation(DataTable verifyAbbreviationValues) throws Throwable
	{
		actorMCsAbbreviationPage.verifyTheUpdatedMasterAbbreviation(verifyAbbreviationValues);;
	}
	
	@Then("^Verify and Remove the Master Customer Set Abbreviation$")
	public void verify_and_remove_the_master_customer_set_abbreviation(DataTable removeValues) throws Throwable
	{
		actorMCsAbbreviationPage.verifyAndRemoveMasterCustomerSetAbbreviation(removeValues);
	}
	@And("^verify MCS is removed or not$")
	public void verify_mcs_is_removed_or_not(DataTable verifyValues)throws Throwable
	{
		actorMCsAbbreviationPage.verifyTheMasterAbbreviationIsRemoved(verifyValues);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
