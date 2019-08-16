package Stepsforall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class group_create {

	
	String GROUP_NAME_XPATH="//*[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-untouched ng-pristine ng-invalid' or @class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored ng-pristine ng-invalid ng-touched']";
	String SAVE_BUTTON_XPATH="//*[@class='app-btn mat-button orange-button ng-star-inserted']";
	String ADD_REMOVE_XPATH="//*[@class='link-txt']";
	
	WebDriver driver;
	
	public group_create(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void groupname()
	{
		driver.findElement(By.xpath(GROUP_NAME_XPATH)).click();
		driver.findElement(By.xpath(GROUP_NAME_XPATH)).sendKeys("Tetsing12345");
	}
	
	public void addremovelink()
	{
		driver.findElement(By.xpath(ADD_REMOVE_XPATH)).click();
	}
	
	public void savebut()
	{
		WebElement wb=driver.findElement(By.xpath(SAVE_BUTTON_XPATH));
		if(wb.isEnabled())
		{
			Assert.assertTrue(wb.isEnabled(), "click on save button");;
			driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button ng-star-inserted']")).click();
		}
		else
		{
			System.out.println("Save button is disable");
		}
	}
}
