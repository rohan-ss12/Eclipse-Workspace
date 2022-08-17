package globalPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;
import org.testng.annotations.Test;


public class Wonderlend {
	
	public static WebDriver driver;
	
	@Test
	public void test1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\E-BranchNext_JenkinsSetup\\Offline_Packages\\MGIP_AppForm_Offline\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo-ui.qa.wlh.rtb.services/RunTimePortal/");
		
		Thread.sleep(60000);
		
		WebElement one = driver.findElement(By.xpath("//input[contains(@name,'sourcing_entity_code')]"));
		
		one.sendKeys("CASAS MARAVILLOSAS");
		
		Thread.sleep(5000);
		
		System.out.println("One");
		
		WebElement source =  driver.findElement(By.xpath("(//input[contains(@name,'sourcing_entity_code')]/ancestor::div//span[text()='CASAS MARAVILLOSAS HFC-HFC2'])"));
		
		System.out.println(source.isDisplayed());
		
		source.click();
		
		System.out.println("Two");
		
		WebElement two = driver.findElement(By.xpath("//input[contains(@name,'hub_entity_code')]"));
		
		two.sendKeys("CASAS");
		
		System.out.println("Three");
		
		WebElement three =  driver.findElement(By.xpath("//input[contains(@name,'hub_entity_code')]/ancestor::div//span[contains(text(),'CASAS MARAVILLOSAS HFC-HFC2')]"));
		
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.elementToBeClickable(three));
		
		System.out.println(three.isDisplayed());
		
		three.click();
		
		System.out.println("Four");
		
		driver.close();

		
		
		
		
		
	}

}
