package E2E.E2E;

import java.io.IOException;


import org.testng.annotations.Test;

import ObjectRepository.CustomerDetailsObjects;

public class CutomerDetails extends BaseClass {
	
	@Test
	public void getCustomerDetails() throws IOException, InterruptedException {
		
		CustomerDetailsObjects CDO = new CustomerDetailsObjects(driver);
		
		CDO.salutaionArrowClick().click();
		CDO.salutaionSelectClick().click();
		CDO.firstNameSet().sendKeys("LeadFname");
		CDO.lastNameSet().sendKeys("LeadLName");
		CDO.genderArrowClick().click();
		Thread.sleep(3000);
		CDO.genderSelectClick().click();
		CDO.annualIncomeSet().sendKeys("10000000");
		CDO.sourcingTypeArrowClick().click();
		CDO.sourcingSelectClick().click();
		CDO.emailSet().sendKeys("rr.rr@rr.rr");
		CDO.customerDetailsNextButton().click();
		
	}
	
	

}