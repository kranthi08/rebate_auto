package com.project.teststeps;

import com.project.actors.ActorUpdateVendorFormularyIDAssignmentPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UpdateVendorFormularyIDAssignmentSteps 
{	
	@Steps
	ActorUpdateVendorFormularyIDAssignmentPage actorUpdateVendorFormularyIDAssignmentPage;
	
	@When("^update the following Vendor Formulary ID Assignment details$")
	public void update_the_following_vendor_formulary_id_assignment_details(DataTable vendorFormularyIDAssignmentData)	throws Throwable
	{
		actorUpdateVendorFormularyIDAssignmentPage.updateVendorFormularyIDAssignmentDetails(vendorFormularyIDAssignmentData);
	}
}
