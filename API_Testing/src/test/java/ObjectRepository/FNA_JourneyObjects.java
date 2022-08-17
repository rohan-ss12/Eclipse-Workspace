package ObjectRepository;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FNA_JourneyObjects {
	
	AndroidDriver<MobileElement> driver;
	
	public FNA_JourneyObjects(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	By emailNextButton = By.xpath("//android.widget.Button[contains(@text,'NEXT')]");
	By fnaNextButton = By.xpath("//android.widget.Button[contains(@text,'NEXT')]");
	
	By lifeStage = By.xpath("(//android.view.View[contains(@text,'Single')])[1]");
	
	By financialProfile = By.xpath("//android.view.View[contains(@text,'Regular Income')]");
	
	By riskPrfile = By.xpath("//android.view.View[contains(@text,'Balanced')]");
	
	By productSelect = By.xpath("//android.view.View[contains(@text,'PNB MetLife Immediate Annuity Plan')]/following-sibling::android.view.View/android.widget.Button");
	
	By leadEducation = By.xpath("//android.view.View[contains(@text,'Post Graduate & Above')]");
	
	By leadOccupation = By.xpath("//android.view.View[contains(@text,'Professional')]");
	
	By leadProfile = By.xpath("//android.view.View[contains(@text,'Both')]");
	
	By leadStateField = By.xpath("//android.view.View[contains(@text,'State')]");
	
	By leadStateSearch = By.xpath("//android.view.View[contains(@text,'State')]/following-sibling::android.widget.EditText");
	
	By leadStateSelect = By.xpath("//android.view.View[contains(@text,'Maharashtra')]");
	
	By backDate = By.xpath("//android.view.View[contains(@text,'No')]");
	
	By PROCEED_Button = By.xpath("//android.widget.Button[contains(@text,'PROCEED')]");
	
	public MobileElement getfnaNextButton() {
		
		return driver.findElement(fnaNextButton);
	}
	
	public MobileElement getlifeStage() {
		
		return driver.findElement(lifeStage);
	}
	
	public MobileElement getriskPrfile() {
		
		return driver.findElement(riskPrfile);
	}
	
	public MobileElement getfinancialProfile() {
		
		return driver.findElement(financialProfile);
	}
	
	public MobileElement getproductSelect() {
		
		return driver.findElement(productSelect);
	}
	
	
	public MobileElement getleadEducation() {
		
		return driver.findElement(leadEducation);
	}
	
	public MobileElement getleadOccupation() {
		
		return driver.findElement(leadOccupation);
	}
	
	public MobileElement getleadProfile() {
		
		return driver.findElement(leadProfile);
	}
	
	public MobileElement getleadStateField() {
		
		return driver.findElement(leadStateField);
	}
	
	public MobileElement getleadStateSearch() {
		
		return driver.findElement(leadStateSearch);
	}
	
	public MobileElement getleadStateSelect() {
		
		return driver.findElement(leadStateSelect);
	}
	
	public MobileElement getbackDate() {
		
		return driver.findElement(backDate);
	}
	
	public MobileElement getPROCEED_Button() {
		
		return driver.findElement(PROCEED_Button);
	}
	
	public MobileElement getemailNextButton() {
		
		return driver.findElement(emailNextButton);
	}
	
	
	
}
