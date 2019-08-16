package login_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginClass {
 WebDriver driver;

public LoginClass(WebDriver driver)
{
	this .driver=driver;
}

	public void logindata() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys("patil.vijay@exelaonline.com");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys("Pa$$w0rd");
		driver.findElement(By.xpath("")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@class='angle-arrow down-arrow fa fa-angle-down']")).click();
	    driver.findElement(By.xpath("//*[@class='login-user-dropdown ng-star-inserted']/ul/li[1]/a")).click();
			
	}
	
	@BeforeMethod
	  public void beforeClass() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   Thread.sleep(3000);
		  driver.get("https://shipping-qa.exela.global/");
	  }

	  @AfterMethod
	  public void afterClass() {
		  
	  }
}
