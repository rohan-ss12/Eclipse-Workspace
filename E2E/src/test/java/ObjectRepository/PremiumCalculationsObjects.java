package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PremiumCalculationsObjects {

	
	WebDriver driver;
	
	public PremiumCalculationsObjects(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	By proceedButton = By.xpath("//span[contains(text(),'PROCEED')]");
	
}
