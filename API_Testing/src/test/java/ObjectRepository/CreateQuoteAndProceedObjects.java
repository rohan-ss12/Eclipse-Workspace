package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CreateQuoteAndProceedObjects {
	
	public AndroidDriver<MobileElement> driver;
	
	public CreateQuoteAndProceedObjects(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
	}
	
	By createQuote = By.xpath("//android.view.View[contains(@text,'Create Quote')]");
	By leadDOB = By.xpath("//android.widget.EditText[contains(@text,'DD/MM/YYYY')]");
	By leadMobileNumber = By.xpath("//android.widget.EditText[contains(@resource-id,'formly_2_input_newCusMobileNum_0')]");
	By manualKYC_Button = By.xpath("//android.widget.Button[@text='Manual KYC']");	
	
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
