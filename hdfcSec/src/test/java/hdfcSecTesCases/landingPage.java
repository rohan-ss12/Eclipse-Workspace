package hdfcSecTesCases;

import globalPackage.hdfcBaseClass;
import objectRepository.landingPageObjects;

import org.testng.annotations.Test;

public class landingPage extends hdfcBaseClass{
	
	@Test
	public void test1() throws Exception {
		
		driver = setCapabilities();
		
		landingPageObjects lpo = new landingPageObjects(driver);
		
		Thread.sleep(10000);
		
		lpo.loginButtonclick().click();
		
		Thread.sleep(10000);
		
	}
}