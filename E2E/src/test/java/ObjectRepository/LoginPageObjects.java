package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	By signInLine = By.xpath("//span[contains(text(),'Sign in to continue')]");
	By username = By.xpath("//input[@placeholder='User ID']");
	By password = By.xpath("//input[@placeholder='Password']");
	By loginButton = By.xpath("//button[contains(text(),'Login')]");	
	
	public LoginPageObjects(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getSignInLine() {
		
		return driver.findElement(signInLine);
	}
	
	
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
