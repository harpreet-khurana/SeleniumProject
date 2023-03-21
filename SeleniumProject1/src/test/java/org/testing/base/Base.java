package org.testing.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	
	
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void init() throws InterruptedException, IOException 
	{
		File f = new File("../SeleniumProject1/Object.properties");
		FileReader fr = new FileReader(f);
		pr = new Properties();
		pr.load(fr);
		
		System.setProperty("webdriver.chrome.driver", "../SeleniumProject1/chromedriver.exe");
    
	try {
		driver.get("https://www.youtube.com/");
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    // maximize the browser window
    driver.manage().window().maximize();
    
    Thread.sleep(2000);
    //Accept cookies banner
    WebElement acceptCookiesButton = driver.findElement(By.xpath("/html/body/ytd-app/ytd-consent-bump-v2-lightbox/tp-yt-paper-dialog/div[4]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
    acceptCookiesButton.click();
    
    // wait for the page to load completely
    Thread.sleep(2000);
	}

	@AfterMethod
	public void closure()
	{
		//Close the browser
		System.out.println("After Method  annotation");
		driver.quit();
	}
	
}
