package group;

import org.testng.annotations.Test;
import Stepsforall.group_create;
import org.testng.annotations.BeforeMethod;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import Stepsforall.group_create;
import Stepsforall.add_Remove;
import login_package.LoginClass;
public class Group_creation {
	  WebDriver driver;
	  
	  
@Test
  
  public void create_group() throws InterruptedException {
	
	  group_create gc=new group_create(driver);
	  add_Remove ar=new add_Remove(driver);
	  
	  driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	 
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys("ranjit.patil@exelaonline.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys("Pa$$w0rd");
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button']")).click();
//		Thread.sleep(10000);
       driver.findElement(By.xpath("//*[@class='angle-arrow down-arrow fa fa-angle-down']")).click();
	    driver.findElement(By.xpath("//*[@class='login-user-dropdown ng-star-inserted']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@class='mat-tab-labels']/div[3]")).click();
       driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button']")).click();
      // Thread.sleep(3000);
	    gc.groupname();
        gc.addremovelink();
	    String MainWindow=driver.getWindowHandle();		
		
	      // To handle all new opened window.				
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
	      //Thread.sleep(4000);
	    ar.select_selected();
	    ar.savebutton();
	    gc.savebut();
//
 }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   Thread.sleep(3000);
	  driver.get("https://shipping-qa.exela.global/");
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
  }

}
