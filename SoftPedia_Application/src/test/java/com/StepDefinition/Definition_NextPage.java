package com.StepDefinition;

import com.Pages.Page_NextPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_NextPage 
{
	// create object for next page to call all fields
	Page_NextPage next=new Page_NextPage();
	@Given("^The user Launch the application for nextpage$")
	public void the_user_Launch_the_application_for_nextpage() throws InterruptedException
	{
		next.browserLaunch("chrome", "https://linux.softpedia.com/");
		Thread.sleep(2000);
	}
	@Then("^Scroll Down and click next page$")
	public void scroll_Down_and_click_next_page() throws Exception
	{
		next.takeSnapShot("src\\test\\resources\\Screenshot\\nextpage.png");
		next.Scroll_clicknext();
		Thread.sleep(2000);
		next.Quit();
	}
}
