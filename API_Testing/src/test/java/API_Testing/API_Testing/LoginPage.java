package API_Testing.API_Testing;

import java.util.Set;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.CreateQuoteAndProceedObjects;
import ObjectRepository.LoginPageObjects;
import ObjectRepository.OpenURL;

public class LoginPage extends BaseClass {
	
	@Test
	public void Test1() throws Exception {
		
		driver = setCapabilities();
		
		OpenURL ou = new OpenURL(driver);
		
		ou.clickAcceptandContinue().click();
		
		ou.clickOnNoThanks().click();
		
		ou.chromeSetURL().sendKeys("https://uat-ebranchnxt.pnbmetlife.com/ebranch-nxt/");
		
		ou.chromeUrlSelect().click();
		
		Thread.sleep(20000);
	}
	
	@Test
	
	public void Test2() throws InterruptedException {
		
		Set<String> contexts = driver.getContextHandles();
		driver.context((String) contexts.toArray()[1]);
		
		LoginPageObjects LPO = new LoginPageObjects(driver);
		
		LPO.getUsername().sendKeys("1039997");
		LPO.getPassword().sendKeys("Metlife_1");
		LPO.getLoginButton().click();
		
		
		Thread.sleep(10000);
		
		driver.context("NATIVE_APP");
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		CreateQuoteAndProceedObjects CQPO = new CreateQuoteAndProceedObjects(driver);
		
		wait.until(ExpectedConditions.elementToBeClickable(CQPO.createQuoteButton()));
		
		CQPO.createQuoteButton().click();
		
//		Set<String> contexts2 = driver.getContextHandles();
//		driver.context((String) contexts2.toArray()[1]);
		
		CQPO.getLeadDOB().sendKeys("10/10/1990");
		
		CQPO.getleadMobileNumber().sendKeys("9099199109");
		
		CQPO.manualKYC_Button().click();
		
		
		
	}
	
//	@Test
//	public void Test3() throws InterruptedException {
//		
//		Thread.sleep(20000);
//		
//		WebDriverWait wait=new WebDriverWait(driver, 50);
//		
//		CreateQuoteAndProceedObjects CQPO = new CreateQuoteAndProceedObjects(driver);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(CQPO.createQuoteButton()));
//		
//		CQPO.createQuoteButton().click();
//		
//		Set<String> contexts = driver.getContextHandles();
//		driver.context((String) contexts.toArray()[1]);
//		
//		CQPO.getLeadDOB().sendKeys("10/10/1990");
//		
//		CQPO.getleadMobileNumber().sendKeys("9099199109");
//		
//		CQPO.manualKYC_Button().click();
//	
//		
//	}
	
	
	
	
}
