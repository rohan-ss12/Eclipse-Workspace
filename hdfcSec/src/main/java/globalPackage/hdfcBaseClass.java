package globalPackage;


import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class hdfcBaseClass {
	
	public static AndroidDriver<MobileElement> driver;
	public static Properties prop;
	
public static AndroidDriver<MobileElement> setCapabilities()throws Exception{
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("udid","2b12156c481d7ece");
		caps.setCapability("platformName","Android");
		caps.setCapability("automationName","UiAutomator2");
		caps.setCapability("noReset",false);
		caps.setCapability("fullReset",true);
		caps.setCapability("app", "D:\\AndroidAPK\\HSL_Debug_UAT.apk");
		caps.setCapability("appActivity",".HDFCActivity");
		caps.setCapability("appPackage","com.snapwork.hdfcsec");
		caps.setCapability("autoGrantPermissions", true);
		caps.setCapability("autoAcceptAlerts", true);
		URL url = new URL("http://127.0.0.1:8201/wd/hub/");
		
		driver = new AndroidDriver<MobileElement>(url,caps);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rohan.sonawane\\workspace\\hdfcSec\\src\\main\\resources\\data.properties");
		prop.load(fis);
		
		return driver;
	}
}
