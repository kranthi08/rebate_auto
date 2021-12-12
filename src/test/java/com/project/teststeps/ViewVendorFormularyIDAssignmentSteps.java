package com.project.teststeps;

import com.project.actors.ActorViewVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ViewVendorFormularyIDAssignmentSteps 
{
	
	@Steps
	ActorViewVendorFormularyIDAssignmentPage actorViewVendorFormularyIDAssignmentPage;
	
	@When("^verify and expand the Assignment Criteria panel$")
	public void verify_and_expand_the_assignment_criteria_panel(DataTable panelName) throws Throwable
	{
		actorViewVendorFormularyIDAssignmentPage.expandAssignmentCriteriaPanel(panelName);
	}
	
	@Then("^verify Vendor formulary ID details$")
	public void verify_vendor_formulary_id_details(DataTable viewVendorFormularyIDData)	throws Throwable
	{
		actorViewVendorFormularyIDAssignmentPage.verifyVendorFormularyIDDetails(viewVendorFormularyIDData);
	}
}
