package hdfcSec1.hdfcSec1;

import org.testng.annotations.DataProvider;

public class StaticProviderClass1 {
	
	
	public String getData() {
		
		String s = "Done";
		return s;
	}
	
	@DataProvider
	public Object[][] loginDetails() {
		
		return new Object[][] {{"Done"}};
	}

}
