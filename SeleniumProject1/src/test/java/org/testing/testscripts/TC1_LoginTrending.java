package org.testing.testscripts;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.assertions.Assertion1;
import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.junit.Assert;


public class TC1_LoginTrending extends Base
{
	//private WebDriver driver;
	@BeforeClass
	public void mbeforeclass()
	{
		System.out.println("Before Class annotation");
		ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--disable-notifications");
         driver = new ChromeDriver(options);
	}
	
	@BeforeSuite
	public void mbeforesuite()
	{
		System.out.println("Before Suite annotation");
	}
	
	@BeforeTest
	public void mbeforetest()
	{
		System.out.println("Before Test annotation");
	}
	
	@Test
	public void TestCase() throws InterruptedException, IOException
	{
		System.out.println("Test Case annotation");
		
		LoginPage login = new LoginPage(driver,pr);
		login.signin("preetuniversityu@gmail.com", "White_star1");
		Thread.sleep(3000);
		
		
		String expectedurl = "https://www.youtube.com/";
		String actualurl = driver.getCurrentUrl();
		
		//Hard assertion
		//Assert.assertEquals(expectedurl, driver.getCurrentUrl());
		
		//Soft assertion
		Assertion1.assertion1(expectedurl,actualurl, "TC1_LoginTrending");
		LogsCapture.takelogs("TC1_LoginTrending", "Login successful");
		 
		//Find the current date and time
		Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        String currentDateAndTime = formatter.format(calendar.getTime());
      
        //Make the filepath
		String folder = "D:\\Drive-Harpreet\\Courses\\Automation Testing\\Java\\SeleniumWorking files\\Screenshots\\";
		String fileName = "loginscreenshot_"+currentDateAndTime+".png";
		String filePath = folder + fileName;
		
		//take screenshot
		ScreenshotCapture.takeScreenshot(driver,filePath);
		
		//Click Trending
		HomePage home=new HomePage(driver,pr);
		home.Trending();
		
		
//		//WebElement signInButton = driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead']//a[@aria-label='Sign in']//div[@class='yt-spec-touch-feedback-shape__fill']"));
//        WebElement signInButton = driver.findElement(By.xpath(pr.getProperty("signInButton")));
//        Thread.sleep(1000);
//        signInButton.click();
//        Thread.sleep(2000);
//         
//        //email id
//        WebElement emailInput = driver.findElement(By.id(pr.getProperty("emailInput")));
//        emailInput.sendKeys("preetuniversityu@gmail.com");
//        Thread.sleep(2000);
//       
//        //Click Next
//        WebElement enext = driver.findElement(By.xpath(pr.getProperty("enext")));
//        enext.click();
//        Thread.sleep(1000);
//        
//        
//        //password
//        WebElement passwordInput = driver.findElement(By.xpath(pr.getProperty("passwordInput")));
//        passwordInput.sendKeys("White_star1");
//        Thread.sleep(2000);
//        
//        //click next
//        WebElement pnext = driver.findElement(By.xpath(pr.getProperty("pnext")));
//        pnext.click();
//        Thread.sleep(4000);
//        
//        //Click Trending//*[@id="endpoint"]/tp-yt-paper-item/yt-formatted-string
//        WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
//        trending.click();
//             
	}
	
	@AfterTest
	public void maftertest()
	{
		System.out.println("After Test annotation");
	}
	
	@AfterSuite
	public void maftersuite()
	{
		System.out.println("After Suite annotation");
	}
	@AfterClass
	public void mafterclass()
	{
		System.out.println("After Class annotation");
	}
}
