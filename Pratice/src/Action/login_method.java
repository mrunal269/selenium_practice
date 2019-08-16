package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login_method {
WebDriver driver;
public login_method(WebDriver driver)
{
	this.driver=driver;
}
	public void action() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[1]/div[2]/div/input")).sendKeys("ranjit.patil@exelaonline.com");	
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[2]/div[2]/div/input")).sendKeys("Pa$$w0rd");
	driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div[1]/div[2]/form/div[4]/div/div/button")).click();
	Thread.sleep(5000);
	}

}
