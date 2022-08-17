package objectRepository;

import org.openqa.selenium.By;


import globalPackage.hdfcBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class loginPageObjects extends hdfcBaseClass{
	
	AndroidDriver<MobileElement> driver;
	
	public loginPageObjects(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
	}
	
	By userId = By.xpath("//android.widget.EditText[contains(@text,'User')]");
	By password = By.xpath("//android.widget.EditText[contains(@text,'Password')]");
	By dateOfBirth = By.xpath("//android.widget.EditText[contains(@text,'birth')]");
	By loginButton = By.xpath("(//android.widget.TextView[contains(@text,'Login')])[2]");
	
	public MobileElement userIdSet(){
		
		return driver.findElement(userId);
		
	}
	
	public MobileElement passwordSet(){
		
		return driver.findElement(password);
		
	}
	
	public MobileElement dobSet(){
		
		return driver.findElement(dateOfBirth);
		
	}
	
	public MobileElement loginButtonClick(){
		
		return driver.findElement(loginButton);
		
	}
	
	

}
