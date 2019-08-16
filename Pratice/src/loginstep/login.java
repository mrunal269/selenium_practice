package loginstep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class login {

	String USERNAME_XPATH="/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input";
	String PASSWORD_XPATH="/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input";
	String CLICK_XPATH="//*[@class='app-btn mat-button orange-button'";
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	WebDriver driver;
	public void User_name(String username)
	{
		driver.findElement(By.xpath(USERNAME_XPATH)).sendKeys(username);
	}
	
	public void Pass(String password)
	{
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys(password);
	}
	
	public void Click()
	{
		driver.findElement(By.xpath(CLICK_XPATH)).click();
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
