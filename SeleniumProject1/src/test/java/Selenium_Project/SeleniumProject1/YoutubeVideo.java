package Selenium_Project.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeVideo {
	
	public static void main(String[] args) throws InterruptedException
	{
		 // set chrome driver path
        System.setProperty("webdriver.chrome.driver", "../SeleniumProject1/chromedriver.exe");
         // create an instance of ChromeDriver
        ChromeDriver driver = new ChromeDriver();

        // navigate to youtube page
        driver.get("https://www.youtube.com");

        // maximize browser window
        Options options = driver.manage();
        options.window().maximize();
        Thread.sleep(2000);
        //Accept cookies banner
        WebElement acceptCookiesButton = driver.findElement(By.xpath("/html/body/ytd-app/ytd-consent-bump-v2-lightbox/tp-yt-paper-dialog/div[4]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button/yt-touch-feedback-shape/div/div[2]"));
        acceptCookiesButton.click();
        
        Thread.sleep(2000);
                // Play without login in the same tab
        driver.findElement(By.cssSelector("#contents ytd-rich-item-renderer")).click();
      
        
        // switch to the new tab
//        WebElement videoLink = driver.findElement(By.cssSelector("#contents ytd-rich-item-renderer a#thumbnail"));
//        String videoUrl = videoLink.getAttribute("href");
//        driver.findElement(By.cssSelector("#contents ytd-rich-item-renderer a#thumbnail")).sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));

        // switch to the new tab
//        String currentTab = driver.getWindowHandle();
//        for (String tab : driver.getWindowHandles()) {
//            if (!tab.equals(currentTab)) {
//                driver.switchTo().window(tab);
//                break;
//            }
//        }

        // play the video
       // driver.findElement(By.cssSelector(".ytp-play-button")).click();

        //driver.close();
	}
	
	
}