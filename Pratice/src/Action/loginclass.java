package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginclass {
public WebDriver driver;
	

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
