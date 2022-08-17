package ObjectRepository;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class OpenURL {

	public AndroidDriver<MobileElement> driver;
	
	By setURL = By.xpath("//android.widget.EditText[contains(@text,'Search')]");
	By Accept_Continue = By.xpath("//android.widget.Button[contains(@text,'Accept & continue')]");
	By noThanksButton = By.xpath("//android.widget.Button[contains(@text,'No Thanks')]");
	By URLSelect = By.xpath("(//android.widget.TextView[contains(@text,'https://uat-ebranchnxt.pnbmetlife.com/ebranch-nxt/')])[1]");

	
	
	
	public OpenURL(AndroidDriver<MobileElement> driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}


	public MobileElement clickAcceptandContinue() {
		
		return driver.findElement(Accept_Continue);
	}
	
	public MobileElement clickOnNoThanks() {
		
		return driver.findElement(noThanksButton);
	}
	
	public MobileElement chromeSetURL() {
		
		return driver.findElement(setURL);
	}
	
	public MobileElement chromeUrlSelect() {
		
		return driver.findElement(URLSelect);
	}
	
	


	
	
}
