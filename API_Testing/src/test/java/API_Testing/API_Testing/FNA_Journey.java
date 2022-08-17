package API_Testing.API_Testing;

import org.testng.annotations.Test;

import ObjectRepository.FNA_JourneyObjects;

public class FNA_Journey extends BaseClass{
	
	
	@Test
	public void test5() {
		
		FNA_JourneyObjects fna = new FNA_JourneyObjects(driver);
		
		fna.getlifeStage().click();
		fna.getfnaNextButton().click();
		
		System.out.println();
		
		fna.getfinancialProfile().click();
		fna.getfnaNextButton();
		
		fna.getriskPrfile().click();
		fna.getfnaNextButton();
		
		fna.getproductSelect().click();
		fna.getfnaNextButton().click();
		fna.getproductSelect().click();
		fna.getfnaNextButton().click();
		
		fna.getleadEducation().click();
		fna.getfnaNextButton().click();
		
		fna.getleadOccupation().click();
		fna.getfnaNextButton().click();
		
		fna.getleadProfile().click();
		fna.getfnaNextButton().click();
		
		fna.getleadStateField().click();
		fna.getleadStateSearch().sendKeys("Maharashtra");
		fna.getleadStateSelect().click();
		
		fna.getfnaNextButton().click();
		
		fna.getbackDate().click();
		fna.getfnaNextButton().click();
		
		fna.getemailNextButton().click();
		
		fna.getfnaNextButton().click();
		
		driver.quit();
	}
	
		

}
