package objectRepository;

import org.openqa.selenium.By;

import globalPackage.hdfcBaseClass;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class homePageObjects extends hdfcBaseClass{
	
	AndroidDriver<MobileElement> driver;
	
	public homePageObjects(AndroidDriver<MobileElement>driver) {
		
		this.driver = driver;
	}
	
	By niftyIndex = By.xpath("(//android.widget.TextView[contains(@text,'NIFTY')])[1]");
	By sensexIndex = By.xpath("(//android.widget.TextView[contains(@text,'SENSEX')])[1]");
	By homeButton = By.xpath("(//android.widget.Button[contains(@text,'Home')])");
	By watchlist = By.xpath("(//android.widget.Button[contains(@text,'Watchlist')])");
	By portfolio = By.xpath("(//android.widget.Button[contains(@text,'Portfolio')])");
	By trade = By.xpath("(//android.widget.Button[contains(@text,'Trade')])");
	By research = By.xpath("(//android.widget.Button[contains(@text,'Research')])");
	By logoHDFC = By.xpath("//android.widget.ImageView[contains(@resource-id,'logo')]");
	By hamburgerMenu = By.xpath("//android.widget.ImageView[contains(@resource-id,'NewMenu')]");
	
	public MobileElement getNiftyIndex() {
		
		return driver.findElement(niftyIndex);
	}
	
	public MobileElement getSensexIndex() {
		
		return driver.findElement(sensexIndex);
	}
	
	public MobileElement getHomeButton() {
		
		return driver.findElement(homeButton);
	}
	
	public MobileElement getWatchlist() {
		
		return driver.findElement(watchlist);
	}
	
	public MobileElement getPortfolio() {
		
		return driver.findElement(portfolio);
	}
	
	public MobileElement getTrade() {
		
		return driver.findElement(trade);
	}
	
	public MobileElement getResearch() {
		
		return driver.findElement(research);
	}
	
	public MobileElement getLogoHDFC() {
		
		return driver.findElement(logoHDFC);
	}
	
	public MobileElement getHamburgerMenu() {
		
		return driver.findElement(hamburgerMenu);
	}

}
