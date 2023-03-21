package org.testing.testscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC8_LoginLibrary extends Base
{
	
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
	public void TestCase() throws InterruptedException
	{
		System.out.println("Test Case annotation");
		LoginPage login = new LoginPage(driver,pr);
		login.signin("preetuniversityu@gmail.com", "White_star1");
		Thread.sleep(3000);
		
		HomePage home = new HomePage(driver,pr);
		//Click library
		home.Library();

//		WebElement signInButton = driver.findElement(By.xpath(pr.getProperty("signInButton")));
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
//        // Locate the Library button and click on it
//        WebElement library = driver.findElement(By.xpath(pr.getProperty("library")));
//        library.click();

             
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
