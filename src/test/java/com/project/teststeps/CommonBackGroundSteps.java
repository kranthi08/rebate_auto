package com.project.teststeps;

import com.project.actors.ActorLaunchPage;
import com.project.actors.ActorRegionSelectionPage;
import com.project.common.util.RxNovaCommonUtil;
import com.psqframework.core.util.BaseStepListener;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;


public class CommonBackGroundSteps {

	@Steps
	ActorLaunchPage actorOnLaunchPage;
	@Steps
	ActorRegionSelectionPage actorOnRegionSelectionPage;
	@Steps
	RxNovaCommonUtil rxNovaCommonUtil;
	
	@Given("^User opens the browser and goes to RxNova URL$")	
	public void navigateToRxNovaApplication() throws InterruptedException {
		actorOnLaunchPage.launch_application();
	}
	
	@When("^enter valid username, valid password and click on Login button$")	
	public void login() throws InterruptedException	{
		actorOnLaunchPage.perform_login();
	}
		
	@Then("^They check whether the application displays the Environment selection screen$")
	public void verifyUserLogin() throws Throwable {
		actorOnRegionSelectionPage.verify_landing_page_details();	 	
	}
	
	@And("^They select Region and check whether the Landing Page is displayed$")
	public void regionSelection() throws Throwable {		
		actorOnRegionSelectionPage.select_application_region();	
	}
	
	@Then("^navigates from Landing page to \"(.*)\" application$")
	public void navigateToApplication(String strApplication) throws Throwable{
	    if(BaseStepListener.isNavigationToAppDone==true) {
		return;
	    }
		rxNovaCommonUtil.navigateApplication(strApplication);
	}	
}
