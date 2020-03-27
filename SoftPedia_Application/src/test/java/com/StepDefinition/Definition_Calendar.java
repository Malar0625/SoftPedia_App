package com.StepDefinition;

import com.Pages.Page_Calendar;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Calendar 
{
	// create object for calendar page to call all fields
	Page_Calendar pcal=new Page_Calendar();
	
	@Given("^Launch the browser for calendar$")
	public void launch_the_browser_for_calendar() 
	{
		pcal.browserLaunch("chrome", "https://news.softpedia.com/newsArchive/");
	}

	@Then("^Select month and year$")
	public void select_month_and_year() 
	{
		pcal.select_mon_year();
	}

	@Then("^Select the date$")
	public void select_the_date() throws Exception 
	{
		pcal.select_date();
		Thread.sleep(1000);
		pcal.takeSnapShot("src\\test\\resources\\Screenshot\\calendar.png");
	}

	@And("^Scroll and click any news$")
	public void scroll_and_click_any_news() throws InterruptedException 
	{
		pcal.Scroll_click();
		Thread.sleep(2000);
		pcal.quit();
		
	}
}
