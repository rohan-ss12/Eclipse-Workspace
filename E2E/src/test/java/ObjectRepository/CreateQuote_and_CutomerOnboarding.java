package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateQuote_and_CutomerOnboarding {
	
	WebDriver driver;
	
	public CreateQuote_and_CutomerOnboarding(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By createQuote = By.xpath("//div[contains(text(),'Create Quote')]");
	By leadDOB = By.xpath("//input[contains(@placeholder,'Date of Birth')]");
	By leadMobileNumber = By.xpath("//input[contains(@type,'tel')]");
	By manualKYC_Button = By.xpath("//button/span[contains(text(),'Manual KYC')]");	
	
	public WebElement createQuoteButton() {
		
		return driver.findElement(createQuote);
	}
	
	public WebElement getLeadDOB() {
		
		return driver.findElement(leadDOB);
	}
	
	public WebElement getleadMobileNumber() {
		
		return driver.findElement(leadMobileNumber);
	}
	
	public WebElement manualKYC_Button() {
		
		return driver.findElement(manualKYC_Button);
	}
	
}
