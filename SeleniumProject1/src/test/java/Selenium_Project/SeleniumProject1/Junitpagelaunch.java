package Selenium_Project.SeleniumProject1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Junitpagelaunch {
	
	ChromeDriver driver;
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Testing Before Class annotation");
	}
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Testing After Class annotation");
	}
	@Before
    public void launchPage() {
    	
    	
        // set chrome driver path
        System.setProperty("webdriver.chrome.driver", "../SeleniumProject1/chromedriver.exe");
         // create an instance of ChromeDriver
         driver = new ChromeDriver();
        // navigate to Facebook page
        driver.get("https://www.facebook.com");
        // maximize browser window
        Options options = driver.manage();
        options.window().maximize();
       
        System.out.println("Testing Before annotation");
	}
	@Test
	public void createNewAccount() throws InterruptedException{
		
        //Accept cookies banner
       WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']"));
       acceptCookiesButton.click();
       
       //locate the tags
        WebElement createAccountButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createAccountButton.click();
        Thread.sleep(2000);
        //Locate the form fields
       // WebElement firstname = driver.findElement(By.name("firstname"));
        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("harpreet");
        //System.out.println(firstname);
       // WebElement lastname = driver.findElement(By.name("lastname"));
        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("khurana");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("harpreet3@gmail.com");    
        
        WebElement reEnterEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        reEnterEmail.sendKeys("harpreet3@gmail.com");
        
        WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("pwd123456");
        
       
       // WebElement dob_day = driver.findElement(By.xpath("//input[@name='birthday_day']"));
        //dob_day.sendKeys("25");
        Thread.sleep(1000);
        WebElement dropdown_day = driver.findElement(By.xpath("//select[@id='day']"));
        Select day = new Select(dropdown_day);
        day.selectByVisibleText("25");
        Thread.sleep(1000);
        
        WebElement dropdown_month = driver.findElement(By.xpath("//select[@id='month']"));
        Select month = new Select(dropdown_month);
        month.selectByVisibleText("Jan");
        Thread.sleep(1000);
        
        WebElement dropdown_year = driver.findElement(By.xpath("//select[@id='year']"));
        Select year = new Select(dropdown_year);
        year.selectByVisibleText("1990");
        Thread.sleep(1000);
        
        WebElement radio_female = driver.findElement(By.xpath("//input[@value='1']"));
        radio_female.click();
        Thread.sleep(1000);
        WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUpButton.click();
        
        System.out.println("Testing Test annotation");
        
    }
	@After
	public void closePage()
	{
		 System.out.println("Testing After annotation");
		driver.quit();
	}
	
}
