package Stepsforall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class add_Remove {

	
	String SELECT_XPATH="//*[@class='mat-dialog-container ng-tns-c36-47 ng-trigger ng-trigger-dialogContainer ng-star-inserted']/add-member/div/div[3]/div/ul/li[1]/div[4]/span";
	String SAVE_BUTTON_XPATH="//*[@class='app-btn mat-button orange-button']";
	WebDriver driver;
	
	public add_Remove(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void select_selected()
	{
	driver.findElement(By.xpath(SELECT_XPATH)).click();	
	}
	
	public void savebutton() throws InterruptedException
	{
		driver.findElement(By.xpath(SAVE_BUTTON_XPATH)).click();
		Thread.sleep(4000);
	}
}
