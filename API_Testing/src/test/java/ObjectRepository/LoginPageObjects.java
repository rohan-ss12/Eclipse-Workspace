package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPageObjects {
	
	public AndroidDriver<MobileElement> driver;
	
	public LoginPageObjects(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@placeholder='User ID']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[contains(text(),'Login')]");
	
	public WebElement getUsername() {
		
		return driver.findElement(username);
	}
	
	public WebElement getPassword() {
		
		return driver.findElement(password);
	} 
	
	public WebElement getLoginButton() {
		
		return driver.findElement(loginButton);
	}

}
