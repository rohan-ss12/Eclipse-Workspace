
package E2E.E2E;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.CreateQuote_and_CutomerOnboarding;
import ObjectRepository.LoginPageObjects;

public class LoginPage extends BaseClass{
	
	
	
	@Test
	public void test1() throws IOException, InterruptedException {
		
		driver = initializeDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		
		//Login to the channel
		LoginPageObjects lpo = new LoginPageObjects(driver);
				
		lpo.getUsername().sendKeys(prop.getProperty("PNB_UserID"));
		lpo.getPassword().sendKeys(prop.getProperty("PNB_Password"));
		Assert.assertEquals(lpo.getSignInLine().getText(),"Sign in to continue");
		lpo.getLoginButton().click();
		
	}
	
	@Test
	
	public void test2() {
		
		//Create Quote and Customer Onboarding
		CreateQuote_and_CutomerOnboarding cq = new CreateQuote_and_CutomerOnboarding(driver);
		
		Assert.assertTrue(cq.createQuoteButton().isDisplayed()); 
		System.out.println("Create Quote Button displayed");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(cq.createQuoteButton()));
		
		cq.createQuoteButton().click();
		
		wait.until(ExpectedConditions.elementToBeClickable(cq.getLeadDOB()));
		cq.getLeadDOB().sendKeys("10/10/1990");
		cq.getleadMobileNumber().sendKeys(prop.getProperty("leadMobileNumber"));
		cq.manualKYC_Button().click();
		
	}	
	
	
	
	
	
}
