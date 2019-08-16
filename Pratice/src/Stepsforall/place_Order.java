package Stepsforall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class place_Order {

	WebDriver driver;
	public place_Order(WebDriver driver)
	{
		this.driver=driver;
	}
	
	String ADD_TO_CART_PACK_DETAILS_XPATH="//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']";
	String PROCCED_TO_PAYMENT_XPATH="//button[contains(text(),'Proceed to Payment')]";
	String PLACE_ORDER_XPATH="//button[contains(text(),'Place My Order')]";
	String LABEL_XPATH="//*[@ng-reflect-ng-class='fa fa-caret-down']";
	String LABEL_VALI_XPATH="//*[@class='label']";
	public void add_to_cart()
	
	{
		driver.findElement(By.xpath(ADD_TO_CART_PACK_DETAILS_XPATH)).click();
	}
	
	public void procced_payment() throws InterruptedException
	{
		driver.findElement(By.xpath(PROCCED_TO_PAYMENT_XPATH)).click();
		Thread.sleep(3000);
	}
	
	public void place_order()
	{
		driver.findElement(By.xpath(PLACE_ORDER_XPATH)).click();
	}
	
	public void label_click()
	{
		driver.findElement(By.xpath(LABEL_XPATH)).click();
	}
	
	public String label_validation()
	{
		driver.findElement(By.xpath(LABEL_VALI_XPATH)).getText();
		return null;
	
	}
}
