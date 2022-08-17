package hdfcSecTesCases;


import org.testng.annotations.Test;

import globalPackage.hdfcBaseClass;

import objectRepository.loginPageObjects;

public class loginPage extends hdfcBaseClass {
	
	@Test
	public void test2() {
	
		loginPageObjects lpo = new loginPageObjects(driver);
		
		lpo.userIdSet().sendKeys(prop.getProperty("UserId"));
		lpo.passwordSet().sendKeys(prop.getProperty("Password"));
		lpo.dobSet().sendKeys(prop.getProperty("DOB"));
		lpo.loginButtonClick().click();
	}

}
