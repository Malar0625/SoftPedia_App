package com.Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ExcelUtility.Excel_data;

public class Page_Register 
{
	WebDriver driver;
	WebElement Register;
	Excel_data ed = new Excel_data();//create object for excel
	// Page for Registration
	public void registeration() throws IOException
	{
		for(int i=1;i<=3;i++)
		{
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.softpedia.com/");
			//Declaration of locators
			
			Register=driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[3]"));
			Register.click();
			System.out.println("click the user icon");
			Register=driver.findElement(By.xpath("//*[@id=\"spovl1\"]/div/div/div[1]/a[3]"));
			Register.click();
			System.out.println("click on register now button");
			
			//Call each fields with their reference variable and get data from excel
			driver.findElement(By.id("reguser")).sendKeys(ed.excel_username(i));//get username
			driver.findElement(By.id("regmail")).sendKeys(ed.Email(i));//get email
			driver.findElement(By.id("regpass1")).sendKeys(ed.excel_password(i));//get password
			driver.findElement(By.id("regpass2")).sendKeys(ed.excel_repassword(i));//get repassword
			driver.findElement(By.xpath("//*[@id=\"regbtn\"]")).click();
			
		}
	}
	//code for screenshot
	public  void takeSnapShot(String path) throws Exception
	{
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File(path);
	        FileUtils.copyFile(SrcFile, DestFile);
	}
	// Close method
	public void quit() 
	{
		
		driver.close();
	}
}
	
//	WebDriver driver;
//	By click_user_icon=By.xpath("//*[@id=\"navicos\"]/li[3]");
//	By click_regnow=By.xpath("//*[@id=\"spovl1\"]/div/div/div[1]/a[3]");
//	By username=By.id("reguser");
//	By email=By.id("regmail");
//	By password=By.id("regpass1");
//	By retype_password=By.id("regpass2");
//	By click_register=By.xpath("//*[@id=\"regbtn\"]");
//	public void LaunchBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SoftPedia_Application\\src\\test\\resources\\Driver\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		driver.get("https://www.softpedia.com/");
//	}
//	public void uicon_regnow()
//	{
//		driver.findElement(click_user_icon).click();
//		driver.findElement(click_regnow).click();
//	}
//	public void credential()
//	{
//		driver.findElement(username).sendKeys("malarvizhi");
//		driver.findElement(email).sendKeys("malarvizhimarie@gmail.com");
//		driver.findElement(password).sendKeys("123456789");
//		driver.findElement(retype_password).sendKeys("123456789");
//	}
//	public void Registerbutton()
//	{
//		driver.findElement(click_register).click();
//	}
//	public void Quit()
//	{
//		driver.close();
//	}
	
	

