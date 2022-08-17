import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Sheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\E-BranchNext_JenkinsSetup\\Offline_Packages\\MGIP_AppForm_Offline\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get(null);
		
		FileInputStream fs = new FileInputStream("D:\\AndroidAPK\\Test data\\Trade.xlsx");
	
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rows = sheet.getLastRowNum();
		
		XSSFRow r = sheet.getRow(0);
		
		int cells = r.getLastCellNum();
		
		Object[][] obj=new Object[rows][cells];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cells;j++) {
				Cell c = sheet.getRow(i+1).getCell(j+1);
				DataFormatter dc = new DataFormatter();
				obj[i][j] = dc.formatCellValue(c);
				
				System.out.println(obj[i][j]);
			}
		}
	}
}

	


