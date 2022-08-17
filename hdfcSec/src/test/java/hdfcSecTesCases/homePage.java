package hdfcSecTesCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import globalPackage.hdfcBaseClass;
import objectRepository.homePageObjects;

public class homePage extends hdfcBaseClass{
	
	@Test
	public void test3() {
		
		homePageObjects hpo = new homePageObjects(driver);
		
		Assert.assertTrue(hpo.getNiftyIndex().isDisplayed());
		Assert.assertTrue(hpo.getHamburgerMenu().isDisplayed());
		Assert.assertTrue(hpo.getHomeButton().isDisplayed());
		Assert.assertTrue(hpo.getLogoHDFC().isDisplayed());
		Assert.assertTrue(hpo.getPortfolio().isDisplayed());
		Assert.assertTrue(hpo.getResearch().isDisplayed());
		Assert.assertTrue(hpo.getSensexIndex().isDisplayed());
		Assert.assertTrue(hpo.getTrade().isDisplayed());
		Assert.assertTrue(hpo.getWatchlist().isDisplayed());
		
	}

}
