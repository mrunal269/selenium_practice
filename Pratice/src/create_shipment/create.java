package create_shipment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

import net.bytebuddy.implementation.bind.annotation.Argument;
public class create {
	
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void create_shipment(String recipient_name,String name1_or_groupname,String weight) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //First three lines are cred script
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys("ranjit.patil@exelaonline.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys("Pa$$w0rd");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[4]/div/div/button")).click();
		Thread.sleep(4000);
		//Create shipment menu
		driver.findElement(By.xpath("//*[@class='fa fa-cog menu-icon']")).click();
		Thread.sleep(5000);
		//Next button of ship from
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button enabled']")).click();
		//Search recipient ship to
		driver.findElement(By.xpath("//*[@name='search']")).sendKeys(recipient_name);
		Thread.sleep(3000);
	    //Address check
	    driver.findElement(By.xpath("//*[@class='mat-checkbox mat-accent']//*[@class='mat-checkbox-inner-container']")).click();
	    //Click on done button of ship to 
		driver.findElement(By.xpath("//*[@class='searched-data ng-star-inserted']/div[2]//*[@class='app-btn mat-button orange-button']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@name='search']")).sendKeys(name1_or_groupname);
		Thread.sleep(3000);
			    //Address check
	    driver.findElement(By.xpath("//*[@class='mat-checkbox mat-accent']//*[@class='mat-checkbox-inner-container']")).click();
	    //Click on done button of ship to 
	    driver.findElement(By.xpath("//*[@class='searched-data ng-star-inserted']/div[2]//*[@class='app-btn mat-button orange-button']")).click();
		Thread.sleep(6000);		
		//Click on next button of ship to
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button martop10 float-right']")).click();
		Thread.sleep(2000);
		//yes radio identical
		driver.findElement(By.xpath("//*[@class='ng-star-inserted']/div[1]/mat-radio-group/mat-radio-button[1]//div[1]/div[1]")).click();
//		//next two lines for package selection
	    driver.findElement(By.xpath("//*[@class='box-wrapper ng-star-inserted']//li[2]//*[@class='ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//*[@class='box-wrapper ng-star-inserted']//li[3]//*[@class='ng-star-inserted']")).click();
		Thread.sleep(5000);
		//Next button of package selection
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button float-right enabled']")).click();;
		Thread.sleep(4000);
		WebElement wb=driver.findElement(By.xpath("//*[@ng-reflect-name='pickupMethod']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);"+ "window.scrollBy(0,-1250);", wb);
		Thread.sleep(2000);
		//pickup method
		driver.findElement(By.xpath("//*[@ng-reflect-name='pickupMethod']")).click();
//		//pick up drop down
	    driver.findElement(By.xpath("//span[contains(text(),' Pick up from desk ')]")).click();
	    //package selection
        driver.findElement(By.xpath("//*[@ng-reflect-name='packagingTypeCode']")).click();
        //Package drop down
	    driver.findElement(By.xpath("//*[@ng-reflect-klass='mat-select-panel mat-primary']/mat-option[3]/span[1]/span")).click();
	    //Enter weight code
		driver.findElement(By.xpath("//*[@ng-reflect-name='weight']")).sendKeys(weight);
		Thread.sleep(5000);
		//Next button of weight selection
		driver.findElement(By.xpath("//*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/package-details-yes/form/div[1]/div[1]/div[5]/input")).click();
		Thread.sleep(5000);
		//Calender rates
		//For 1st row
		//*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/div/div/calendar-view/div[1]/div[2]/p-schedule/div/div[2]/div/table/tbody/tr/td/div/div/div[2]/div[2]/table/tbody/tr[1]/td/a
		//For 2nd row
		//*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/div/div/calendar-view/div[1]/div[2]/p-schedule/div/div[2]/div/table/tbody/tr/td/div/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/a
		driver.findElement(By.xpath("//*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/div/div/calendar-view/div[1]/div[2]/p-schedule/div/div[2]/div/table/tbody/tr/td/div/div/div[2]/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		//next button of calender rates
		WebElement wbd=driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button martop10 float-right enabled']"));
	    JavascriptExecutor jss = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);"+ "window.scrollBy(0,-1250);", wbd);
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button martop10 float-right enabled']")).click();
		Thread.sleep(3000);
		//terms check box select
		driver.findElement(By.xpath("//*[@ng-reflect-name='termAndConditions']/label/div")).click();
		driver.findElement(By.xpath("//button[contains(text(),' Add To Cart')]")).click();
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
		////*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/package-details-no/form/div/div/div[1]/div[2]/div[1]/div/div[2]/ul/li[1]
			 
  }
  
  
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	  // JavascriptExecutor js = (JavascriptExecutor) driver;
	   Thread.sleep(3000);
	  driver.get("https://shipping-qa.exela.global/");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  

	  //driver.close();
	  
  }
  //group or multiple recipient
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Chick Corea","Joe Mailer","112" },
      //new Object[] { "Chick Corea", "41" },
//     new Object[] { "Chick Corea", "81" },
      
    };
    //Single recipient
//    @DataProvider
//    public Object[][] dp() {
//      return new Object[][] {
//        new Object[] { "sharad","112" },
//        //new Object[] { "Chick Corea", "41" },
////        new Object[] { "Chick Corea", "81" },
//        
//      };
  }

}
