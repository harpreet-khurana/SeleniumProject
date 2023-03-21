package Selenium_Project.SeleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class FettlePage {
	
	public static void main(String[] args) throws InterruptedException {
	
	// set chrome driver path
    System.setProperty("webdriver.chrome.driver", "../SeleniumProject1/chromedriver.exe");

    // create an instance of ChromeDriver
    ChromeDriver driver = new ChromeDriver();

    // navigate to Facebook page
    driver.get("https://whitehorse:pussycat-briny-footstep-warhorse@qa2.fettle.health");

    // Maximise browser window
    Options options = driver.manage();
    options.window().maximize();
   
    //Accept cookies banner
    WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[text()='Accept']"));
    acceptCookiesButton.click();
	Thread.sleep(2000);
	
	WebElement orderButton = driver.findElement(By.xpath("//a[contains(text(),'STI testing')]"));
    orderButton.click();
    Thread.sleep(1000);
    
  //Recommended STI order journey
    WebElement startOrdering = driver.findElement(By.cssSelector(".link.content-link"));
    startOrdering.click();
    Thread.sleep(2000);
    
    WebElement input = driver.findElement(By.id("termsOver16-agree"));
    input.click();
    Thread.sleep(2000);
    
    WebElement cStep1 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep1.click();
    Thread.sleep(1000);
    
    WebElement dob_day = driver.findElement(By.id("dd"));
    dob_day.sendKeys("10");
    
    WebElement dob_month = driver.findElement(By.id("mm"));
    dob_month.sendKeys("10");
    
    WebElement dob_year = driver.findElement(By.id("yyyy"));
    dob_year.sendKeys("1990");
    Thread.sleep(1000);
    
    WebElement cStep2 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep2.click();
    Thread.sleep(2000);
    
    WebElement gender_male = driver.findElement(By.cssSelector(".radio__Label-sc-1elmkpp-1.htvjqa"));
    gender_male.click();
    Thread.sleep(1000);
    
    WebElement cStep3 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep3.click();
	Thread.sleep(1000);
	
	WebElement gIdentity_yes = driver.findElement(By.cssSelector(".radio__Label-sc-1elmkpp-1.htvjqa"));
    gIdentity_yes.click();
    Thread.sleep(1000);
    
    WebElement cStep4 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep4.click();
	Thread.sleep(1000);
	

	WebElement sexPref = driver.findElement(By.cssSelector(".radio__Label-sc-1elmkpp-1.htvjqa"));
    sexPref.click();
    Thread.sleep(1000);
    
    WebElement cStep5 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep5.click();
	Thread.sleep(1000);
	
	//WebElement symptoms = driver.findElement(By.cssSelector(".radio__Input-sc-1elmkpp-2.jhElpY"));
    WebElement symptoms = driver.findElement(By.id("symptoms-no"));
	symptoms.click();
    Thread.sleep(1000);
    
    WebElement cStep6 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep6.click();
	Thread.sleep(1000);
	
	WebElement cStep7 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep7.click();
	Thread.sleep(1000);
	
	WebElement sti_unprotected = driver.findElement(By.id("stiUnprotected-no"));
	sti_unprotected.click();
    Thread.sleep(1000);
    
    WebElement cStep8 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep8.click();
	Thread.sleep(1000);
	
	
	WebElement hepB_vaccinated = driver.findElement(By.id("hepBVaccinated-yes"));
	hepB_vaccinated.click();
    Thread.sleep(1000);
    
    WebElement cStep9 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep9.click();
	Thread.sleep(1000);
	
	WebElement hepBDiagnosed_no = driver.findElement(By.id("hepBDiagnosed-no"));
	hepBDiagnosed_no.click();
    Thread.sleep(1000);
    
    WebElement cStep10 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep10.click();
	Thread.sleep(1000);
	
	WebElement hivDiagnosed_no = driver.findElement(By.id("hivDiagnosed-no"));
	hivDiagnosed_no.click();
    Thread.sleep(1000);
    
    WebElement cStep11 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep11.click();
	Thread.sleep(1000);
		
	WebElement assaulted_no = driver.findElement(By.id("assaulted-no"));
	assaulted_no.click();
    Thread.sleep(1000);
    
    WebElement cStep12 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep12.click();
	Thread.sleep(1000);
	
	WebElement first_name = driver.findElement(By.id("first_name"));
	first_name.sendKeys("Test firstName");
    //Thread.sleep(1000);
    

	WebElement last_name = driver.findElement(By.id("last_name"));
	last_name.sendKeys("Test lastName");
    Thread.sleep(1000);
    
    WebElement cStep13 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep13.click();
	Thread.sleep(1000);
	
	WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
	phoneNumber.sendKeys("07753446083");
    Thread.sleep(1000);
    
    WebElement cStep14 = driver.findElement(By.cssSelector(".button__StyledButton-f6dq78-0.jKsKhK"));
    cStep14.click();
	Thread.sleep(1000);
	}
}
	
	
