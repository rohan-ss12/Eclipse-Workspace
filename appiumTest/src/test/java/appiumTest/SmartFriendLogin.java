package appiumTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SmartFriendLogin{
	
	static AndroidDriver<MobileElement> driver;
	
	public static void main(String args[]) throws Exception {
		
		setDesiredCaps();
	}
	
	
	public static void setDesiredCaps() throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid","emulator-5554");
		caps.setCapability("platformName","Android");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("noReset",false);
		caps.setCapability("fullReset",true);
		caps.setCapability("app", "D:\\QualitiaProjects\\Application Files\\Smart-Friend-Debug-V57.apk");
		caps.setCapability("appActivity","com.pmli.smartfriend.MainActivity");
		caps.setCapability("appPackage","com.pmli.smartfriend");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("autoAcceptAlerts", true);
		URL url = new URL("http://127.0.0.1:8201/wd/hub/");
		driver = new AndroidDriver<MobileElement>(url,caps);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		System.out.println("Application Started");
			
	}

}
