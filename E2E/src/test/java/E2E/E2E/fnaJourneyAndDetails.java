package E2E.E2E;


import org.testng.annotations.Test;

import ObjectRepository.fnaJourney;

public class fnaJourneyAndDetails extends BaseClass{
	
	@Test
	public void fnaJourneyAndProceed() throws InterruptedException {
		
		fnaJourney fna = new fnaJourney(driver);
		
		fna.lifeStageClick().click();
		fna.fnaNextClick().click();
		
		fna.financialGoalClick().click();
		fna.fnaNextClick().click();
		
		fna.riskProfileClick().click();
		fna.fnaNextClick().click();
		
		fna.productSelectClick().click();
		fna.fnaNextClick().click();
		fna.productSelectClick().click();
		fna.fnaNextClick().click();
		
		Thread.sleep(10000);
		
		fna.educationSelectClick().click();
		fna.biNextButtonClick().click();
		
		Thread.sleep(1000);
		fna.occupationSelectClick().click();
		fna.biNextButtonClick().click();
		
		Thread.sleep(1000);
		fna.customerProfileClick().click();
		fna.biNextButtonClick().click();
		
		Thread.sleep(1000);
		fna.stateInputFieldClick().sendKeys("Maharashtra");
		fna.biNextButtonClick().click();
		
		//Annul Income
		Thread.sleep(1000);
		fna.biNextButtonClick().click();
		
		//Back Date selection
		Thread.sleep(1000);
		fna.backdateSelectionClick().click();
		fna.biNextButtonClick().click();
		
		//Email Address
		Thread.sleep(1000);
		fna.biNextButtonClick().click();
		
		//Mobile Number
		Thread.sleep(1000);
		fna.biNextButtonClick().click();
		
		driver.quit();
		
	}
	
	
	

}
