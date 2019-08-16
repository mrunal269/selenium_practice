package Demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.*;
public class excel_hashmap {
WebDriver driver;
public excel_hashmap(WebDriver driver)
{
	this.driver=driver;
}
  @org.testng.annotations.Test(dataProvider = "test1")
  public void test(Map mapdata) {
	  
	   String username=mapdata.get("Username").toString();
	   String  password=mapdata.get("password").toString();
	  
	   System.out.println(username);
	   System.out.println(password);
	   driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys(username);
	   driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys(password);
	   driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[4]/div/div/button")).click();
  }
  


@DataProvider(name="test1")
  public Object[][] datapr() throws IOException
  {
	  String filepath="D:\\Book1.xlsx";
	  File file=new File(filepath);
	  FileInputStream filein = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(filein);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int cellcount=sheet.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[rowcount][1];
		for(int i=0;i<rowcount;i++)
		{
	
		
			Map<Object, Object> datamap=new HashMap<>();
			for(int j=0;j<cellcount;j++)
			{
		datamap.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i+1).getCell(j).toString());
			}
			obj[i][0]=datamap;
		
		}
		
		return obj;
  }

//@BeforeMethod
//public void beforeMethod() {
//	  System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
//	   driver=new ChromeDriver();
//	  // JavascriptExecutor js = (JavascriptExecutor) driver;
//	   //Thread.sleep(3000);
//	  driver.get("https://shipping-qa.exela.global/");
//	  driver.manage().window().maximize();
//}
//
//@AfterMethod
//public void afterMethod() {
//}
 
  
}
