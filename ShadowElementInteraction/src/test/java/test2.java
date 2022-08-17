import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\E-BranchNext_JenkinsSetup\\Offline_Packages\\MGFP_AppForm_Offline\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://vayana-ui.client-sb.wlh.rtb.services/login/RunTimePortal/");
		
		Shadow s = new Shadow(driver);
		
		WebElement username = s.findElementByXPath("//amplify-sign-in[@class='hydrated']");
		username.sendKeys("Test");
		
		
		
		String cssSelectorForHost1 = "amplify-sign-in[class='hydrated']";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector(cssSelectorForHost1));
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#username"));
		
	}	
		

}
	
