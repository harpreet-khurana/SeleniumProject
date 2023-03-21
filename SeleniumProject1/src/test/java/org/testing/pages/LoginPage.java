package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	ChromeDriver driver;
	Properties pr;
	
	public LoginPage(ChromeDriver driver,Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
		
	}
	public void signin(String userid, String pwd) throws InterruptedException
	{
		//Sigin button on youtube page
		WebElement loginButton = driver.findElement(By.xpath(pr.getProperty("signInButton")));
		loginButton.click();
		
		 //email id
      WebElement emailInput = driver.findElement(By.id(pr.getProperty("emailInput")));
      emailInput.sendKeys(userid);
      Thread.sleep(2000);
     
      //Click Next
      WebElement enext = driver.findElement(By.xpath(pr.getProperty("enext")));
      enext.click();
      Thread.sleep(2000);
           
      //password
      WebElement passwordInput = driver.findElement(By.xpath(pr.getProperty("passwordInput")));
      passwordInput.sendKeys(pwd);
      Thread.sleep(2000);
      
      //click next
      WebElement pnext = driver.findElement(By.xpath(pr.getProperty("pnext")));
      pnext.click();
      Thread.sleep(4000);
      
	}
}
