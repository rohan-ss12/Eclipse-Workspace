package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import E2E.E2E.CutomerDetails;

public class CustomerDetailsObjects extends CutomerDetails{
	
	WebDriver driver;
	
	public CustomerDetailsObjects(WebDriver driver){
		
		this.driver=driver;
	}
	
	
	
	
	By salutationArrow = By.xpath("//mat-label[contains(text(),'Salutation')]/ancestor::span/preceding-sibling::formly-field-mat-select//div[contains(@class,'arrow ng')]");
	By selectSalution = By.xpath("//span[contains(text(),'Mr.')]");
	By firstName = By.xpath("//mat-label[contains(text(),'First Name')]/ancestor::div[contains(@class,'infix')]//input");
	By lastName = By.xpath("//mat-label[contains(text(),'Last Name')]/ancestor::div[contains(@class,'infix')]//input");
	By genderArrow = By.xpath("//mat-label[contains(text(),'Gender')]/ancestor::div[contains(@class,'infix')]//div[contains(@class,'arrow ng')]");
	By genderSelect = By.xpath("//span[contains(text(),'Male')]");
	By annualIncome = By.xpath("//input[contains(@id,'Annual Income')]");
	By sourcingTypeArrow = By.xpath("//mat-label[contains(text(),'Sourcing Type')]/ancestor::div[contains(@class,'infix')]//div[contains(@class,'arrow ng')]");
	By sourcingTypeSelect = By.xpath("//span[contains(text(),'Face to face')]");
	By email = By.xpath("//input[contains(@id,'email')]");
	By nextButton = By.xpath("//span[contains(text(),'Next')]");
	
	public WebElement salutaionArrowClick() {
		
		return driver.findElement(salutationArrow);
		
	}
	
	public WebElement salutaionSelectClick() {
		
		return driver.findElement(selectSalution);
		
	}
	public WebElement firstNameSet() {
	
		return driver.findElement(firstName);
	
	}
	public WebElement lastNameSet() {
	
		return driver.findElement(lastName);
	
	}
	public WebElement genderArrowClick() {
	
		return driver.findElement(genderArrow);
	
	}
	public WebElement genderSelectClick() {
	
		return driver.findElement(genderSelect);
	
	}
	public WebElement annualIncomeSet() {
	
		return driver.findElement(annualIncome);
	
	}
	public WebElement sourcingTypeArrowClick() {
	
		return driver.findElement(sourcingTypeArrow);
	
	}
	public WebElement sourcingSelectClick() {
	
		return driver.findElement(sourcingTypeSelect);
	
	}
	public WebElement emailSet() {
		
		return driver.findElement(email);
	
	}
	public WebElement customerDetailsNextButton() {
		
		return driver.findElement(nextButton);
	
	}
}
