package com.StepDefinition;

import com.Pages.Page_ContactUs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_ContactUs 
{
	//create object for contactus page to call all fields
	Page_ContactUs pc=new Page_ContactUs();
	
	@Given("^The user launch the browser$")
	public void the_user_launch_the_browser()
	{
		pc.browserLaunch("chrome", "https://www.softpedia.com/");
	}

	@Then("^click on i named icon and contact us$")
	public void click_on_i_named_icon_and_contact_us() 
	{
		pc.contactus();
	}

	@Then("^click radio button from the list$")
	public void click_radio_button_from_the_list() throws InterruptedException 
	{
		pc.radiobutton();
		Thread.sleep(3000);
	}

	@Then("^The user enter \"([^\"]*)\" and \"([^\"]*)\" for contactus page$")
	public void The_user_enter_and_for_contactus_page(String msg, String emailid) throws Exception
	{
		pc.message_email(msg, emailid);
		Thread.sleep(3000);
	
		
	}

	@Then("^clicking on send button$")
	public void clicking_on_send_button() throws Exception 
	{
		
		pc.send_button();
		pc.takeSnapShot("src\\test\\resources\\Screenshot\\contactus.png");
		Thread.sleep(3000);
		pc.Quit();
	}
}
