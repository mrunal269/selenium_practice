import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel_pract {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
//			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
		    FileInputStream file = new FileInputStream("D:\\Book1.xlsx");
			Workbook wb=new XSSFWorkbook(file);
		   Sheet sheet=wb.getSheet("Sheet1");
		  Row row=sheet.getRow(1);
		  Cell cell=row.getCell(0);
		  Cell cell2=row.getCell(1);
		  String username=cell.toString();
		  String password=cell2.toString();
		   System.out.println(username);
		   System.out.println(password);
		   System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://shipping-qa.exela.global/#/login");
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys(username);
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys(password);
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[4]/div/div/button")).click();
		   
	}

}
