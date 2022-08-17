	package hdfcSecTesCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import globalPackage.hdfcBaseClass;
import objectRepository.TradeSectionObjects;
import objectRepository.homePageObjects;

public class TradeSection extends hdfcBaseClass {
	
	@Test (dataProvider = "TradeData")
	public void test4(String StockName,String StockQuantity,String StockPrice) throws InterruptedException {
		
		TradeSectionObjects TSO = new TradeSectionObjects(driver);
		
		homePageObjects hpo1 = new homePageObjects(driver);
		
		hpo1.getTrade().click();
		
		TSO.getSearchScriptText().click();
		//TSO.getSearchScriptEditText().sendKeys(prop.getProperty("StockName"));
		TSO.getSearchScriptEditText().sendKeys(StockName);
		TSO.getSelectScript().click();
		
		TSO.getSelectExchange().click();
		
		TSO.getProductExpandArrow().click();
		TSO.getProductType().click();
		
		TSO.getSelectOrderType().click();
		
		//TSO.getSelectQuantity().sendKeys(prop.getProperty("StockQuantity"));
		TSO.getSelectQuantity().sendKeys(StockQuantity);
		
		//TSO.getSetPrice().sendKeys(prop.getProperty("StockPrice"));
		TSO.getSetPrice().sendKeys(StockPrice);
		
		TSO.getPlaceBuyOrder().click();
		
		TSO.getConfirmOrder().click();
		
		Thread.sleep(7000);
		
		hpo1.getLogoHDFC().click();
		
		
	}
	
	
	@DataProvider(name = "TradeData")
	
	public Object[][] tradeDataMethod() throws IOException{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\rohan.sonawane\\workspace\\hdfcSec\\src\\main\\resources\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet1"); //XSSFSheet return
		int rows = sh.getLastRowNum(); 
		XSSFRow r = sh.getRow(0);
		int cells = r.getLastCellNum();
		
		Object[][] obj=new Object[rows][cells];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cells;j++) {
				Cell c = sh.getRow(i+1).getCell(j);
				DataFormatter dc = new DataFormatter();
				obj[i][j] = dc.formatCellValue(c);
		
			}
		}

		return obj;
		
		
	}

}


