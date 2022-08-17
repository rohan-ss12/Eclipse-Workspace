package hdfcSecTesCases;


import org.testng.annotations.Test;

import globalPackage.hdfcBaseClass;


import objectRepository.WatchlistObjects;
import objectRepository.homePageObjects;

public class WatchlistSC1 extends hdfcBaseClass{
	
	@Test
	public void test4() throws InterruptedException {
		
		homePageObjects hpo = new homePageObjects(driver);
		
		hpo.getWatchlist().click();
		
		WatchlistObjects wo = new WatchlistObjects(driver);
		
		wo.addStockButtonGet().click();
		wo.searchStockGet().sendKeys(prop.getProperty("StockName"));
		wo.selectStockGet().click();
		
		Thread.sleep(5000);
				
		
		
	}
	

}
