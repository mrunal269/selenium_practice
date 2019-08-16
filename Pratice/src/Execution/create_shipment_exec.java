package Execution;
import Stepsforall.createShipment_steps;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import Stepsforall.place_Order;
public class create_shipment_exec {
	 WebDriver driver = null;
  @Test
  public void create_shipment() throws InterruptedException {
	  createShipment_steps cs=new createShipment_steps(driver);
	  place_Order po=new place_Order(driver);
	  String mk;
	 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys("mrunal.kamble@exelaonline.com");
driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys("Pa$$w0rd");
driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[4]/div/div/button")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@class='fa fa-cog menu-icon']")).click();
Thread.sleep(5000);
      cs.nextbutton();
      cs.ship_to_section();
      cs.package_section();
      cs.package_details();
      cs.calender_section();
      cs.add_to_cart();
      String MainWindow=driver.getWindowHandle();						
      Set<String> s1=driver.getWindowHandles();		
  Iterator<String> i1=s1.iterator();		
  		
  while(i1.hasNext())			
  {		
      String ChildWindow=i1.next();		
      		
      if(!MainWindow.equalsIgnoreCase(ChildWindow))			
      {    		
           
              // Switching to Child window
              driver.switchTo().window(ChildWindow);
            
      }
  }
driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button mar-left5']")).click();
Thread.sleep(4000);
//po.add_to_cart();
//po.procced_payment();
//po.place_order();
//Thread.sleep(2000);
//po.label_click();
//mk="";
//String xyz=po.label_validation();
//Assert.assertEquals(xyz, mk, "Shipment is created sucessfully");
System.out.println("Shipment is not created successfully");
  }
  
  
  
  
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	  // JavascriptExecutor js = (JavascriptExecutor) driver;
	   //Thread.sleep(3000);
	  driver.get("https://shipping-qa.exela.global/");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }


 
  }

