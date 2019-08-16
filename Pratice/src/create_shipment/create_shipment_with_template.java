package create_shipment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class create_shipment_with_template {
	WebDriver driver;
  @Test
  public void create_shipment() throws InterruptedException {
      driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
      //First three lines are cred script
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys("mrunal.kamble@exelaonline.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys("Pa$$w0rd");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[4]/div/div/button")).click();
		Thread.sleep(4000);
		//Create shipment menu
		driver.findElement(By.xpath("//*[@class='fa fa-cog menu-icon']")).click();
		Thread.sleep(5000);
		//Next button of ship from
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button enabled']")).click();
		//Search recipient ship to
		driver.findElement(By.xpath("//*[@name='search']")).sendKeys("Chick Corea");
		Thread.sleep(5000);
	    //Address check
	    driver.findElement(By.xpath("//*[@class='mat-checkbox mat-accent']//*[@class='mat-checkbox-inner-container']")).click();
	    //Click on done button of ship to 
		driver.findElement(By.xpath("//*[@class='searched-data ng-star-inserted']/div[2]//*[@class='app-btn mat-button orange-button']")).click();
		Thread.sleep(8000);
		//Click on next button of ship to
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button martop10 float-right']")).click();
		//next two lines for package selection
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
		//pick up drop down
	    driver.findElement(By.xpath("//span[contains(text(),' Pick up from desk ')]")).click();
	    //package selection
      driver.findElement(By.xpath("//*[@ng-reflect-name='packagingTypeCode']")).click();
      //Package drop down
	    driver.findElement(By.xpath("//*[@ng-reflect-klass='mat-select-panel mat-primary']/mat-option[3]/span[1]/span")).click();
	    //Enter weight code
		driver.findElement(By.xpath("//*[@ng-reflect-name='weight']")).sendKeys("123");
		Thread.sleep(5000);
		//Next button of weight selection
		driver.findElement(By.xpath("//*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/package-details-yes/form/div[1]/div[1]/div[5]/input")).click();
		Thread.sleep(8000);
		//Calender rates
		driver.findElement(By.xpath("//*[@class='fc-scroller fc-day-grid-container']//*[@class='fc-row fc-week ui-widget-content']//*[@class='fc-content-skeleton']/table/tbody/tr/td[2]//a[1]/div[1]/span")).click();
		//next button of calender rates
		WebElement wbd=driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button martop10 float-right enabled']"));
	    JavascriptExecutor jss = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);"+ "window.scrollBy(0,-1250);", wbd);
		driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button martop10 float-right enabled']")).click();
		Thread.sleep(4000);
		//template check
		driver.findElement(By.xpath("//*[@ng-reflect-name='saveThisAsTemplate']/label/div")).click();
		Thread.sleep(4000);
		String MainWindows=driver.getWindowHandle();						
        Set<String> s11=driver.getWindowHandles();		
    Iterator<String> i11=s11.iterator();		
    		
    while(i11.hasNext())			
    {		
        String ChildWindow=i11.next();		
        		
        if(!MainWindows.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
              
        }
    }
   
    driver.findElement(By.xpath("//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid']")).click();
    driver.findElement(By.xpath("//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid']")).sendKeys("aaaa1");
    driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button mar-left5']")).click();
    Thread.sleep(5000);
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
//@DataProvider
//public Object[][] dp() {
//  return new Object[][] {
//    new Object[] { "Chick Corea", "112","" },
//    new Object[] { "Chick Corea", "41","" },
//    new Object[] { "Chick Corea", "81","" },
//    
//  };
//}

}
