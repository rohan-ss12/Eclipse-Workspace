package ObjectRepository;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CustomerDetailsObjects {
	
	public AndroidDriver<MobileElement> driver;
	
	public CustomerDetailsObjects(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
	}
	
	By salutionArrow = By.xpath("//android.widget.ListView[contains(@text,'Salutation')]");
	By salutionSelect = By.xpath("//android.view.View[contains(@text,'Mr.')]");
	
	By leadFirstName = By.xpath("//android.widget.EditText[contains(@resource-id,'firstName')]");
	By leadLastName = By.xpath("//android.widget.EditText[contains(@resource-id,'lastName')]");
	
	By leadGenderList = By.xpath("//android.widget.ListView[contains(@text,'Gender')]");
	By leadGenderSelect = By.xpath("//android.view.View[contains(@text,'Male')]");
	
	By annualIncome = By.xpath("//android.widget.EditText[contains(@resource-id,'Annual Income')]");
	
	By sourcingTypeList = By.xpath("//android.widget.ListView[contains(@text,'Sourcing Type')]");
	By sourcingTypeSelect = By.xpath("//android.view.View[contains(@text,'Face to face')]");
	
	By leadEmialId = By.xpath("//android.widget.EditText[contains(@resource-id,'email')]");
	
	By customerDetailsNextButton = By.xpath("//android.widget.Button[contains(@text,'Next')]");
	
	public MobileElement getSalutationArrow() {
		
		return driver.findElement(salutionArrow);
	}
	
	public MobileElement getsalutionSelect() {
		
		return driver.findElement(salutionSelect);
	}
	
	public MobileElement getleadFirstName() {
	
	return driver.findElement(leadFirstName);
	
	}
	
	public MobileElement getleadLastName() {
		
		return driver.findElement(leadLastName);
	}
	
	public MobileElement getleadGenderList() {
		
		return driver.findElement(leadGenderList);
	}
	
	public MobileElement getleadGenderSelect() {
		
		return driver.findElement(leadGenderSelect);
	}
	
	public MobileElement getannualIncome() {
		
		return driver.findElement(annualIncome);
	}
	
	public MobileElement getsourcingTypeList() {
		
		return driver.findElement(sourcingTypeList);
	}
	
	public MobileElement getsourcingTypeSelect() {
		
		return driver.findElement(sourcingTypeSelect);
	}
	
	public MobileElement getleadEmialId() {
		
		return driver.findElement(leadEmialId);
	}

	public MobileElement getfnaNextButton() {
		
		return driver.findElement(customerDetailsNextButton);
	}
	

}
