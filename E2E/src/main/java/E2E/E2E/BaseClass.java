package E2E.E2E;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriver initializeDriver() throws IOException {
	
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\rohan.sonawane\\workspace\\E2E\\src\\main\\java\\E2E\\E2E\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohan.sonawane\\AppData\\Local\\QualitiaWDClient\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		return driver;
	
	
	
	}
	

}
