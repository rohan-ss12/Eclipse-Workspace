package objectRepository;

import org.openqa.selenium.By;

import globalPackage.hdfcBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class landingPageObjects extends hdfcBaseClass{
	
	public AndroidDriver<MobileElement> driver;
	
	public landingPageObjects(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
	}
	
	By loginButton = By.xpath("//android.widget.TextView[contains(@text,'Login')]");
	
	public MobileElement loginButtonclick() {
		
		return driver.findElement(loginButton);
	}

}
