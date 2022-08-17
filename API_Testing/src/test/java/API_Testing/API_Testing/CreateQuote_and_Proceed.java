package API_Testing.API_Testing;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ObjectRepository.CreateQuoteAndProceedObjects;

public class CreateQuote_and_Proceed extends BaseClass {
	
	@Test
	public void Test3() {
		
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

}
