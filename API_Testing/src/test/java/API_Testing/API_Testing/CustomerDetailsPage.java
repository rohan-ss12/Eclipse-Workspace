package API_Testing.API_Testing;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ObjectRepository.CustomerDetailsObjects;


public class CustomerDetailsPage extends BaseClass{
	
	@Test
	public void test4() throws InterruptedException {
		
		CustomerDetailsObjects CDO = new CustomerDetailsObjects(driver);
		
		CDO.getSalutationArrow().click();
		CDO.getsalutionSelect().click();
		
		CDO.getleadFirstName().sendKeys("LeadFaname");
		
		
		Actions act = new Actions(driver);
				
		act.moveToElement(CDO.getleadLastName());
		act.perform();
		
		CDO.getleadLastName().sendKeys("LeadLName");
		
		CDO.getleadGenderList().click();
		CDO.getleadGenderSelect().click();
		
		CDO.getannualIncome().sendKeys("2000000");
		 
		Thread.sleep(5000);
//		CDO.getsourcingTypeList().click();
		CDO.getsourcingTypeSelect().click();
		
		CDO.getleadEmialId().sendKeys("rr.rr@rr.rr");
		
		CDO.getfnaNextButton().click();
		
		
		
		
	}

	

}
