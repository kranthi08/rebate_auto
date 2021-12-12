package com.project.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/features/Rebate_Non_PartD_UI_Validation.feature"},
		tags = {"@Regression"},
		glue = { "com.project.teststeps"},
		plugin =  {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json"},
		strict=true,
		monochrome=true)
public class Rebate_Non_PartD_UI_Validation 
{
	
}