package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)

@CucumberOptions
(
		features = "src\\main\\resources\\feature\\test.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
		tags = {"@tc_01_Register, @tc_02_Login,"
				+ " @tc_03_Search, @tc_04_Contactus, "
				+ "@tc_05_Calender, @tc_6_NextPage"},
		glue = {"com.StepDefinition"},
		monochrome = true
		
) 
public class Runner_Testcases 
{
	@AfterClass
	  public static void extendReport()
	{
		Reporter.loadXMLConfig("src\\test\\resources\\extend-config.xml");
	    Reporter.setSystemInfo("user", System.getProperty("user.name"));
	    Reporter.setSystemInfo("os", "Windows");
	    Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}

