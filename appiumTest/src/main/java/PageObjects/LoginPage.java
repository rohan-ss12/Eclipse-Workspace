package PageObjects;

import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	
	static AndroidDriver<MobileElement> driver;
	
	By UserID = By.xpath("//android.widget.EditText[@resource-id='mat-input-0']");
	By Password = By.xpath("//android.widget.EditText[@resource-id='mat-input-1']");
	By SignInButton = By.xpath("//android.widget.Button[contains(@text,'SIGN IN')]");
	
	public MobileElement getUserID(){
		
		return driver.findElement(UserID);
	}
	
	public MobileElement getPassword(){
		
		return driver.findElement(Password);
	}
	
	public MobileElement getSignInButton(){
		
		return driver.findElement(SignInButton);
	}
}
