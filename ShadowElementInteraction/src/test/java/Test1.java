import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static WebElement getShadowRoot(WebElement host,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		  WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot.children", host);
		  return shadowRoot;
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\E-BranchNext_JenkinsSetup\\Offline_Packages\\MGFP_AppForm_Offline\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://vayana-ui.client-sb.wlh.rtb.services/login/RunTimePortal/");
		
		Thread.sleep(10000);
//		WebElement host1 = driver.findElement(By.cssSelector("amplify-authenticator[class='hydrated']"));
//		WebElement root1 = getShadowRoot(host1,driver);
		
		WebElement host2 = driver.findElement(By.cssSelector("amplify-sign-in[class='hydrated']"));
		WebElement root2 = getShadowRoot(host2,driver);
		
		WebElement Username = root2.findElement(By.id("username"));
		Username.sendKeys("Rohan");
				

	}
	

}
