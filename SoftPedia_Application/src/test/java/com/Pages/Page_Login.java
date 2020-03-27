package com.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Page_Login 
{
	WebDriver driver;
	//Declare reference variable and locators
	By click_user_icon=By.xpath("//*[@id=\"navicos\"]/li[3]");
	By email=By.id("_lu");
	By password=By.id("_lp");
	By login=By.xpath("//*[@id=\"spovl1\"]/div/div/form/input[3]");
	// Launch Browser
	public void browserLaunch(String browser,String url)
	{
		try {
					//To launch firefox Browser
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","src//test//resources//Driver//geckodriver.exe");
				driver = new FirefoxDriver();
			}
					// To launch chrome Browser
			else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
					// To launch InternetExplorer
			else if (browser.equalsIgnoreCase("Internet Explore")) {
					System.setProperty("webdriver.ie.driver","src//test//resources//Driver//IEDriverServer.exe");
				driver=new InternetExplorerDriver();  
			}
					//to maximize the window
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		
		} catch (WebDriverException e) {
			System.out.println("Browser could not be launched");
		}
	}	
	//Code for user icon and passing value for email and password
	public void icon_credential()
	{
		driver.findElement(click_user_icon).click();
		driver.findElement(email).sendKeys("malarvizhimarie@gmail.com");
		driver.findElement(password).sendKeys("123456789");
		
	}
	//code for click login
	public void login_button()
	{
		driver.findElement(login).click();
	}
	//code for screenshot
	public  void takeSnapShot(String path) throws Exception
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path);
        FileUtils.copyFile(SrcFile, DestFile);
	}
	//close the browser
	public void Quit()
	{
		driver.close();
	}
}
