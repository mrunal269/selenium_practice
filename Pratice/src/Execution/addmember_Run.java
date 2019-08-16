package Execution;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import Stepsforall.add_Member_address;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Action.loginclass;
import Demo.excel_hashmap;
import Action.login_method;
public class addmember_Run extends loginclass  {
	

	
@Test(dataProvider="test1")
public void Address_add_data(Map mapdata) throws InterruptedException
{
login_method lm=new login_method(driver);
lm.action();
driver.findElement(By.xpath("//*[@class='angle-arrow down-arrow fa fa-angle-down']")).click();
driver.findElement(By.xpath("//*[@class='login-user-dropdown ng-star-inserted']/ul/li[1]/a")).click();
driver.findElement(By.xpath("//*[@class='mat-tab-labels']/div[2]")).click();
add_Member_address ad=new add_Member_address(driver);
ad.addmember();
ad.address_click();
ad.address_type();
	String name=mapdata.get("name").toString();
	String  email=mapdata.get("email").toString();
	String number=mapdata.get("number").toString();
    String address=mapdata.get("address").toString();
	String country=mapdata.get("country").toString();
	String state=mapdata.get("state").toString();
	String city=mapdata.get("city").toString();
	String zipcode=mapdata.get("zipcode").toString();
//	   System.out.println(name);
//	   System.out.println(email);
//	   System.out.println(number);
//	   System.out.println(address);
//	   System.out.println(country);
//	   System.out.println(state);
//	   System.out.println(city);
//	   System.out.println(zipcode);
	   ad.name(name);
	   ad.email_id(email);
	   ad.number(number);
	   ad.address1(address);
	   ad.country();
	   ad.state(state);
	   ad.city(city);
	   
	   ad.zipcode(zipcode);
	   ad.add();
       //ad.validation();
      
	
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
//public void beforeClass() throws InterruptedException {
//	 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
//	   driver=new ChromeDriver();
//	   Thread.sleep(3000);
//	  driver.get("https://shipping-qa.exela.global/");
//}
//
//@AfterMethod
//public void afterClass() {
//	  
//}

}


