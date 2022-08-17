package API_Testing.API_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\E-BranchNext_JenkinsSetup\\Offline_Packages\\MGIP_AppForm_Offline\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo-ui.qa.wlh.rtb.services/login/RunTimePortal");
		
//		Thread.sleep(60000);
		
		FileInputStream fs = new FileInputStream("D:\\AndroidAPK\\Test data\\Book1.xlsx");
	
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		
		XSSFRow r = sheet.getRow(0);
		
		int cells = r.getLastCellNum();
		
		wb.close();
		
		System.out.println(rows);
		System.out.println(cells);
		
		driver.findElement(By.xpath("//div[contains(text(),'M1')]/../following-sibling::div//*[contains(text(),'')]"));
		
		DataFormatter dc = new DataFormatter();
		
		driver.quit();
		
		int i = 1,j = 12;
		int array[] = {1,2,3,4,5,6,7,8,9,1,1,1,1};
		int array2[] = {1,2,3,4,5,6,7,8,9,1,1,1,1};
		
		for(;i<=12 && j > 0;i++,j--) {
			
			String MonthsData = driver.findElement(By.xpath("//div[contains(text(),'M"+j+"')]/../following-sibling::div//*[contains(text(),'')]")).getText();
			
			Float f = Float.parseFloat(MonthsData);
			
			int integer = Math.round(f);
			array2[j] = integer;
			
			
			Cell cell = r.getCell(i);
			
			String value = dc.formatCellValue(cell);
			
			array[i] = Integer.parseInt(value);
			
			
			
			if(array[i] == array2[j]) {
				
				System.out.println("Input is reflecting as expected");
			}
			
			
			
			
		}
		
		
		
		driver.quit();
		
		
		
	}
		
//	 public void test() {
//		Object[][] obj=new Object[rows][cells];
//		
//		int array[]= null;
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<12;j++) {
//				Cell c = sheet.getRow(i+1).getCell(j+1);
//				DataFormatter dc = new DataFormatter();
//				obj[i][j] = dc.formatCellValue(c);
//				
//				System.out.println(obj[i][j]);
//				array[j] = (Integer) obj[i][j];
//				
//			}
//		}
//		
//		for(int j = 0; j<12; j++) {
//			
//			System.out.println(array[j]);
//		}
	}

