package create_shipment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class create_shipment_non_identical {
	WebDriver driver;
  @Test(dataProvider = "dp")
  //this is create shipment
  public void non_identical(String recipient_name,String name1_or_groupname,String weight) throws InterruptedException {
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
		//No radio button
		driver.findElement(By.xpath("//*[@class='ng-star-inserted']/div[1]/mat-radio-group/mat-radio-button[2]//div[1]/div[1]")).click();
		//package selection
		driver.findElement(By.xpath("//*[@class='box-wrapper ng-star-inserted']//li[2]//*[@class='ng-star-inserted']")).click();
	    driver.findElement(By.xpath("//*[@class='box-wrapper ng-star-inserted']//li[3]//*[@class='ng-star-inserted']")).click();
		Thread.sleep(5000);
		//Package button click
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
	    //recipient selection
	    driver.findElement(By.xpath("//*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/package-details-no/form/div/div/div[1]/div[2]/div[1]/div/div[2]/ul/li[1]")).click();
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
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	new Object[] { "Chick Corea","Joe Mailer","112" },
//      new Object[] { 2, "b" },
    };
  }
}
