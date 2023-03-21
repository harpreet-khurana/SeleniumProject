package Selenium_Project.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException
	{
		 // set chrome driver path
        System.setProperty("webdriver.chrome.driver", "../SeleniumProject1/chromedriver.exe");
         // create an instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // navigate to Facebook page
        driver.get("https://www.facebook.com");

        // maximize browser window
        Options options = driver.manage();
        options.window().maximize();
        
        WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[text()='Allow essential and optional cookies']"));
        acceptCookiesButton.click();
        Thread.sleep(2000);
       
        //Non-modifier key
        Actions ac = new Actions(driver);
        for (int i=0;i<5;i++)
        {
        	ac.sendKeys(Keys.TAB).perform();
        	Thread.sleep(1000);
        }
        
        //Modifier key
        
	}
	
	
}
