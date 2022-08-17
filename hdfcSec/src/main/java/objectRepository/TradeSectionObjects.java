	package objectRepository;

import org.openqa.selenium.By;

import globalPackage.hdfcBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TradeSectionObjects extends hdfcBaseClass{
	
	AndroidDriver<MobileElement> driver;
	
	public TradeSectionObjects(AndroidDriver<MobileElement> driver) {
		
		this.driver = driver;
	}
	
	By searchScriptText = By.xpath("//android.widget.TextView[@resource-id='com.snapwork.hdfcsec:id/txt_search']");
	By searchScriptEditText = By.xpath("//android.widget.EditText[@resource-id='com.snapwork.hdfcsec:id/input_search']");
	//By selectScript = By.xpath("//android.widget.TextView[contains(@text,'"+prop.getProperty("StockName")+"')]");
	By selectScript = By.xpath("(//android.widget.TextView)[last()]");
	By selectExchange = By.xpath("//android.widget.RadioButton[contains(@text,'"+prop.getProperty("ExchangeName")+"')]");
	By productExpandArrow = By.xpath("//android.widget.TextView[@resource-id='com.snapwork.hdfcsec:id/trade_product_value']");
	By productType = By.xpath("//android.widget.TextView[@text='"+prop.getProperty("ProductType")+"']");
	By selectOrderType = By.xpath("//android.widget.RadioButton[contains(@text,'"+prop.getProperty("OrderType")+"')]");
	By selectQuantity = By.xpath("//android.widget.EditText[@resource-id='com.snapwork.hdfcsec:id/edt_quantity']");
	By setPrice = By.xpath("//android.widget.EditText[@resource-id='com.snapwork.hdfcsec:id/edt_pricevalue']");
	By placeBuyOrder = By.xpath("//android.widget.TextView[contains(@text,'Place Buy Order')]");
	By confirmOrder = By.xpath("(//android.widget.TextView[contains(@text,'Confirm Order')])[2]");
	
	
	
	public MobileElement getSearchScriptText() {
		
		return driver.findElement(searchScriptText);
	}
	
	public MobileElement getSearchScriptEditText() {
		
		return driver.findElement(searchScriptEditText);
	}
	
	public MobileElement getSelectScript() {
		
		return driver.findElement(selectScript);
	}
	
	public MobileElement getSelectExchange() {
		
		return driver.findElement(selectExchange);
	}
	
	public MobileElement getProductExpandArrow() {
		
		return driver.findElement(productExpandArrow);
	}
	
	public MobileElement getProductType() {
		
		return driver.findElement(productType);
	}
	
	public MobileElement getSelectOrderType() {
		
		return driver.findElement(selectOrderType);
	}
	
	public MobileElement getSelectQuantity() {
		
		return driver.findElement(selectQuantity);
	}
	
	public MobileElement getSetPrice() {
		
		return driver.findElement(setPrice);
	}
	
	public MobileElement getPlaceBuyOrder() {
		
		return driver.findElement(placeBuyOrder);
	}
	
	public MobileElement getConfirmOrder() {
		
		return driver.findElement(confirmOrder);
	}

}
