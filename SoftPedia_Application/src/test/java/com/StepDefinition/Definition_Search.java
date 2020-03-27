package com.StepDefinition;

import java.io.File;

import org.junit.Assert;

import com.Pages.Page_Search;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Search 
{
	//create object for search page to call all fields
	Page_Search ps=new Page_Search();
	
	@Given("^The user launch the softpedia application$")
	public void the_user_launch_the_softpedia_application() 
	{
		ps.browserLaunch("chrome", "https://www.softpedia.com/dyn-search.php?");
	}

	@Then("^The User enter the word for search$")
	public void the_User_enter_the_word_for_search() throws Throwable 
	{
		ps.Search();
	}

	@Then("^Click go button$")
	public void click_go_button() throws Throwable 
	{
		ps.gobutton();
	}

	@Then("^Download the application in the list$")
	public void download_the_application_in_the_list() throws Exception 
	{
		
		ps.download();
		ps.takeSnapShot("src\\test\\resources\\Screenshot\\search");
		Thread.sleep(5000);
		//ps.Quit();
	}
	@And("^Check file is exist or not$")
	public void Check_file_is_exist_or_not() throws InterruptedException
	{
		ps.check_file();
		Thread.sleep(3000);
		ps.Quit();
	}
	
}
