package Selenium_Project.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TestingWatchlater {

    public static void main(String[] args) throws InterruptedException {
    	ChromeOptions options = new ChromeOptions(); 
        options.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "../SeleniumProject1/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
    	
    	
    	// open youtube website
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
        
        // wait for the page to load completely click sign in
        Thread.sleep(2000);
        WebElement signInButton = driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead']//a[@aria-label='Sign in']//div[@class='yt-spec-touch-feedback-shape__fill']"));
        signInButton.click();

        Thread.sleep(2000);
         
        //email id
        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("preetuniversityu@gmail.com");
        Thread.sleep(2000);
       
        //Click Next
        WebElement enext = driver.findElement(By.xpath("//span[normalize-space()='Next']"));
        enext.click();
        Thread.sleep(2000);
        
        
      //password
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passwordInput.sendKeys("White_star1");
        Thread.sleep(2000);
        
        //click next
        WebElement pnext = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        pnext.click();
        Thread.sleep(4000);

        // Locate the second video on the homepage and click on it
       // WebElement secondVideo = driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-browse[1]/ytd-two-column-browse-results-renderer[1]/div[1]/ytd-rich-grid-renderer[1]/div[6]/ytd-rich-grid-row[1]/div[1]/ytd-rich-item-renderer[2]/div[1]/ytd-rich-grid-media[1]/div[1]/ytd-thumbnail[1]/a[1]/yt-image[1]/img[1]"));
        WebElement secondVideo = driver.findElement(By.xpath("//div[@class='ytd-rich-grid-renderer']/div[6]//ytd-rich-item-renderer[2]//img"));
        Actions actions = new Actions(driver);
        actions.moveToElement(secondVideo).click().perform();

        // Wait for the video to start playing
        

        // Close the browser
        //driver.quit();
    }
}
