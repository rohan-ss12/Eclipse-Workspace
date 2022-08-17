package objectRepository;

import org.openqa.selenium.By;

import globalPackage.hdfcBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class WatchlistObjects extends hdfcBaseClass{
	
	
	AndroidDriver<MobileElement> driver;
	
	public WatchlistObjects(AndroidDriver<MobileElement> driver){
		
		this.driver = driver;
		
	}
	
	By addStockButton = By.xpath("//android.widget.TextView[contains(@text,'Add Stock')]");
	By searchStock = By.xpath("//android.widget.EditText[contains(@text,'Search stock')]");
	By selectStock = By.xpath("(//android.widget.TextView[contains(@text,'"+prop.getProperty("StockName")+"')])[1]");
	
	By deleteStockButton = By.xpath("//android.widget.ImageView[@resource-id='com.snapwork.hdfcsec:id/btDelete']");
	By okButton = By.xpath("//android.widget.Button[@text='OK']");
	
	public MobileElement addStockButtonGet(){
		
		return driver.findElement(addStockButton);
	}
	
	public MobileElement searchStockGet(){
		
		return driver.findElement(searchStock);
	}
	
	public MobileElement selectStockGet() {
		
		return driver.findElement(selectStock);
		
	}
	
	public MobileElement deleteStockButtonGet(){
		
		return driver.findElement(deleteStockButton);
	}
	
	public MobileElement okButtonGet(){
		
		return driver.findElement(addStockButton);
	}

}
