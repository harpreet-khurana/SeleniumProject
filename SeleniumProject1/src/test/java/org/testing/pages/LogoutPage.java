package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage
{
	ChromeDriver driver;
	Properties pr;
	
	public LogoutPage(ChromeDriver driver,Properties pr)
	{
		this.driver = driver;
		this.pr = pr;
		
	}
	public void signout()
	{
		driver.close();
		
	}
}
