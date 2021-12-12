package com.psqframework.core.util;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.thucydides.core.model.DataTable;
import net.thucydides.core.model.Story;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.steps.ExecutedStepDescription;
import net.thucydides.core.steps.StepFailure;
import net.thucydides.core.steps.StepListener;

public class BaseStepListener implements StepListener 
{
	private static final Logger Log = LoggerFactory.getLogger(BaseStepListener.class);

	 public static boolean isLaunched=false;
	 public static boolean isLoggedIn=false;
	 public static boolean isNavigationToAppDone=false;
	 
	 public static String strFeatureFilePath = null;

	 private Map<String, String> storyDetails = new HashMap<String,String>();

	
	 
	public BaseStepListener() {
		Log.info("BaseStepListener()");
		isLaunched=false;
		isLoggedIn=false;
		isNavigationToAppDone=false;
	}

	public void testSuiteStarted(final Class<?> testCase) {
		Log.info("test suite started");
//		//custom driver implementation
//				if(System.getProperty("MavenChromeDriverVersion")==null)
//				{					
//					WebDriverManager.chromedriver().setup();	
//				}else{				
//					String driverVersion = System.getProperty("MavenChromeDriverVersion");
//					WebDriverManager.chromedriver().setup();
//					WebDriverManager.chromedriver().version(driverVersion);
//					System.out.println("Downloading specified Chrome Version " + driverVersion);
//				}
	}

	public void testSuiteStarted(final Story story) {
		
		//storyDesc.add(story.getPath());
		storyDetails.put(story.getName(), story.getPath());
		Log.info("test suite started");
		
		//storyPath = getFeatureFilePath(story);
		isLaunched=false;
		isLoggedIn=false;
		isNavigationToAppDone=false;
		 
		/*
		 * //custom driver implementation
		 * if(System.getProperty("MavenChromeDriverVersion")==null) {
		 * WebDriverManager.chromedriver().setup(); }else{ String driverVersion =
		 * System.getProperty("MavenChromeDriverVersion");
		 * WebDriverManager.chromedriver().setup();
		 * WebDriverManager.chromedriver().version(driverVersion);
		 * System.out.println("Downloading specified Chrome Version " + driverVersion);
		 * }
		 */
	}

	public void testStarted(final String testName) {
		Log.info("test started " + testName );
		Project.beforeStep();
	}

	public void testStarted(String description, String id) {
		String[] arrID = id.split(";");
		String strFeatureDescription = arrID[0].replaceAll("-", " ");
		for (Map.Entry<String, String> pair : storyDetails.entrySet()) {
		     String strKey = pair.getKey().replace("-", " ").trim();
		     if(strKey.toLowerCase().equalsIgnoreCase(strFeatureDescription.toLowerCase()))
		     {
		    	 strFeatureFilePath = storyDetails.get(pair.getKey());
		    	 break;
		     }
		}
		
		Log.info("#################################test started " + description + "#################################");
	}

	public void testFinished(TestOutcome result) {
		Log.info("TEST FINISHED");
		Project.afterTest();
	}

	public void testSuiteFinished() {
	}

	public void testRetried() {
	}

	public void skippedStepStarted(ExecutedStepDescription description) {
	}

	public void lastStepFailed(StepFailure stepFailure) {
	}

	public void stepIgnored() {
	}

	public void stepIgnored(String s) {
	}

	public void stepPending() {
	}

	public void stepPending(String s) {
	}

	public void assumptionViolated(String s) {
	}

	public void testRunFinished() {
		Log.info("test run finished");
	}

	public void stepStarted(ExecutedStepDescription executedStepDescription) {
		Log.info("STEP STARTED " + executedStepDescription.getName());
		Project.beforeStep();
	}
	public void stepFinished() {
		Log.info("STEP FINISHED");
		Project.afterStep();
	}

	public void stepFailed(StepFailure stepFailure) {
		Log.info("STEP FAILED");
		Project.afterStep();
	}

	public void testFailed(TestOutcome testOutcome, Throwable cause) {
		Log.info("TEST FINISHED (FAILED)");
		Project.afterTest();
	}

	public void testIgnored() {
	}

	//@Override
	public void testSkipped() {
	}

	//@Override
	public void testPending() {
	}

	//@Override
	public void testIsManual() {
	}

	public void notifyScreenChange() {
	}

	public void useExamplesFrom(DataTable dataTable) {
	}

//	@Override
	public void addNewExamplesFrom(DataTable dataTable) {
	}

	public void exampleStarted(Map<String, String> stringStringMap) {
	}

	public void exampleStarted() {
	}

	public void exampleFinished() {
	}
	public static String getFeatureFilePath(final Story story) {
        return story.getPath();
  }


}
