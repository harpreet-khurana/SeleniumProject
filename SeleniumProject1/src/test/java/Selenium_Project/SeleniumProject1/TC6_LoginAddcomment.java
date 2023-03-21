package Selenium_Project.SeleniumProject1;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC6_LoginAddcomment
{
	private WebDriver driver;
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
        Thread.sleep(1000);
        
        
        //password
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        passwordInput.sendKeys("White_star1");
        Thread.sleep(2000);
        
        //click next
        WebElement pnext = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        pnext.click();
        Thread.sleep(2000);
        
        //Play Video in new tab and click like
        WebElement videoLink = driver.findElement(By.cssSelector("#contents ytd-rich-item-renderer a#thumbnail"));
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

        // play the video
        //driver.findElement(By.cssSelector(".ytp-play-button")).click();
        Thread.sleep(3000);
        //Add comment

        JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(6000);
		WebElement Comment=driver.findElement(By.xpath("//*[@id='placeholder-area' and @class='style-scope ytd-comment-simplebox-renderer']"));
		Thread.sleep(2000);
		Comment.click();
		Thread.sleep(2000);
		WebElement SendKeys=driver.findElement(By.xpath("//*[@id='contenteditable-root' or @aria-label='Add a comment...']"));
		SendKeys.sendKeys("Nice Video");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit-button']"));
		submit.click();

             
	}
	
	@BeforeMethod
	public void mbeforemethod() throws InterruptedException
	{
		System.out.println("Before Method annotation");
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
	public void maftermethod()
	{
		//Close the browser
		System.out.println("After Method  annotation");
		driver.quit();
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
