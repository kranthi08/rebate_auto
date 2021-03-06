package com.project.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = {"src/test/resources/features/Rebate_Non_PartD_Customer_Pref_Generics_Both.feature"},
		tags = {"@Regression"},
		glue = { "com.project.teststeps"},
		plugin =  {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json"},
		strict=true,
		monochrome=true)
public class Rebate_Non_PartD_Customer_Pref_Generics_Both
{

}