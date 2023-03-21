package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{
	ChromeDriver driver;
	Properties pr;
	//Constructor for creating object with driver&properties
	public HomePage(ChromeDriver driver, Properties pr)
	{
		this.driver = driver;
		this.pr = pr; 
	}
	//Trending 
	public void Trending() throws InterruptedException
	{
		 //Click Trending//*[@id="endpoint"]/tp-yt-paper-item/yt-formatted-string
     WebElement trending = driver.findElement(By.xpath(pr.getProperty("trending")));
     Thread.sleep(2000);;
     trending.click();
	}
	//History
	public void History() throws InterruptedException
	{
     WebElement history = driver.findElement(By.xpath(pr.getProperty("history")));
     Thread.sleep(2000);;
     history.click();
	}
	//Subscriptions
		public void Subscriptions() throws InterruptedException
		{
	     WebElement subscriptions = driver.findElement(By.xpath(pr.getProperty("subscriptions")));
	     Thread.sleep(2000);;
	     subscriptions.click();
		}
			//Play video in new tab
		public void PlayVideo()
		{
		
			WebElement videoLink = driver.findElement(By.cssSelector(pr.getProperty("videoLink")));
	        String videoUrl = videoLink.getAttribute("href");
	        driver.findElement(By.cssSelector("#contents ytd-rich-item-renderer a#thumbnail")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));

	        // switch to the new tab
	        String currentTab = driver.getWindowHandle();
	        for (String tab : driver.getWindowHandles()) {
	            if (!tab.equals(currentTab)) {
	                driver.switchTo().window(tab);
	                break;
	            }
	        }

		}
		//Likevideo
		public void Likevideo() throws InterruptedException
		{
		    Thread.sleep(3000);
			WebElement likebutton = driver.findElement(By.xpath(pr.getProperty("likebutton")));
			likebutton.click();
		 
		}
		//Subscribe Channel
		public void SubscribeChannel() throws InterruptedException 
		{
			 Thread.sleep(3000);
		     WebElement subscribechannel = driver.findElement(By.xpath(pr.getProperty("subscribechannel")));
		     subscribechannel.click();
		             
		}
		//Add comment to a video
		public void AddComment() throws InterruptedException
		{
		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(6000);
		WebElement Comment=driver.findElement(By.xpath(pr.getProperty("Comment")));
		Thread.sleep(2000);
		Comment.click();
		Thread.sleep(2000);
		WebElement commentSendKeys=driver.findElement(By.xpath(pr.getProperty("CommentSendKeys")));
		commentSendKeys.sendKeys("Nice Video");
		Thread.sleep(3000);
		WebElement submitComment=driver.findElement(By.xpath(pr.getProperty("submitComment")));
		submitComment.click();
		}
		
		//Add comment to a video
		public void WatchLater() throws InterruptedException
		{
		// Locate the "watch later" button and click on it
        WebElement watchLater = driver.findElement(By.xpath(pr.getProperty("watchLater")));
        watchLater.click();
		}
		public void Library() throws InterruptedException
		{
		// Locate the Library button and click on it
        WebElement library = driver.findElement(By.xpath(pr.getProperty("library")));
        library.click();
		}

}
