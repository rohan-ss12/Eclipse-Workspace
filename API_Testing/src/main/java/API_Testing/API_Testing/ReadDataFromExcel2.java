package API_Testing.API_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\E-BranchNext_JenkinsSetup\\Offline_Packages\\MGIP_AppForm_Offline\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo-ui.qa.wlh.rtb.services/login/RunTimePortal");
		
		Thread.sleep(60000);
		
		FileInputStream fs = new FileInputStream("D:\\AndroidAPK\\Test data\\Book1.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		
		XSSFRow r0 = sheet.getRow(0);
		
		XSSFRow r1 = sheet.getRow(1);
		
		int cells = r0.getLastCellNum();
		
		wb.close();
		
		System.out.println(rows);
		System.out.println(cells);
		
		String input = "9";
		
		DataFormatter dc = new DataFormatter();
		
		for(int i = 0; i<cells;i++) {
			
			Cell cell0 = r0.getCell(i);
			
			String cellData0 = dc.formatCellValue(cell0);
			
			
			if(cellData0.startsWith("-"+input+"")) {
				
				Cell cell1 = r1.getCell(i);
				String cellData1 = dc.formatCellValue(cell1);
				Float cellData2 = Float.parseFloat(cellData1);
				int cellData3 = Math.round(cellData2);
				
				System.out.println("This is data extracted from Excel for month "+input+" is "+cellData3);
				
				
				String uiData = driver.findElement(By.xpath("//div[contains(text(),'M"+input+"')]/../following-sibling::div//*[contains(text(),'')]")).getText();
				Float uiData1 = Float.parseFloat(uiData);
				int uiData2 = Math.round(uiData1);
				
				System.out.println("This is data extracted from UI for month "+input+" is "+uiData2);
				
				driver.quit();
				if(cellData3==uiData2) {
					
					System.out.println("Excel Data is as per UI Data");
					
				}
				else {
					
					System.out.println("Excel Data is not as per UI Data");
				}
			}
				
			
		}
		

	}
	
	

}
