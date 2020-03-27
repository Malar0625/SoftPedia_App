package com.StepDefinition;

import java.io.IOException;

import com.Pages.Page_Register;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Register 
{
	//create object for registration page to access each field
	Page_Register pr=new Page_Register();
	
	@Given("^The user launch and register the application with valid and invalid details$")
	public void the_user_launch_and_register_the_application_with_valid_and_invalid_details() throws Exception 
	{
		pr.registeration();
		Thread.sleep(3000);
		
	}
	@And("^close the browser$")
	public void close_the_browser() throws Exception 
	{
		
		Thread.sleep(3000);
		pr.quit();
	}
	

	
}
