package Stepsforall;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createShipment_steps {

	WebDriver driver;
	public createShipment_steps(WebDriver driver)
	{
		this.driver=driver;
	}
	
	String NEXT_BUTTON_SHIP_FROM_XPATH="//*[@class='app-btn mat-button orange-button enabled']";
	String SEARCH_USER_XPATH="//*[@name='search']";
	String ADDRESS_CHECK_XPATH="//*[@class='mat-checkbox mat-accent']//*[@class='mat-checkbox-inner-container']";
	String ADDRESS_DONE_XPATH="//*[@class='searched-data ng-star-inserted']/div[2]//*[@class='app-btn mat-button orange-button']";
	String NEXT_BUTTON_SHIP_TO_XPATH="//*[@class='app-btn mat-button orange-button martop10 float-right']";
	String PACKAGE_SELECTION_XPATH="//*[@class='box-wrapper ng-star-inserted']//li[2]//*[@class='ng-star-inserted']";
	String PACKAGE_SELECTIONS_XPATH="//*[@class='box-wrapper ng-star-inserted']//li[3]//*[@class='ng-star-inserted']";
	String NEXT_PACKAGE_BUTTON_XPATH="//*[@class='app-btn mat-button orange-button float-right enabled']";
	String PICKUP_METHOD_XPATH="//*[@ng-reflect-name='pickupMethod']";
	String PICKUP_DROPDOWN_XPATH="//span[contains(text(),' Pick up from desk ')]";
	String PACKAGE_SELECT_XPATH="//*[@ng-reflect-name='packagingTypeCode']";
	String PACKAGE_DROPDOWN_XPATH="//*[@ng-reflect-klass='mat-select-panel mat-primary']/mat-option[3]/span[1]/span";
	String WEIGHT_XPATH="//*[@ng-reflect-name='weight']";
	String NEXT_BUTTON_SELECTION_XPATH="//*[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']/div/package-details-yes/form/div[1]/div[1]/div[5]/input";
	String CALENDER_RATES_XPATH="//*[@class='fc-scroller fc-day-grid-container']//*[@class='fc-row fc-week ui-widget-content']//*[@class='fc-content-skeleton']/table/tbody/tr/td[2]//a[1]/div[1]/span";
	String CALENDER_NEXT_BUTTON_XPATH="//*[@class='app-btn mat-button orange-button martop10 float-right enabled']";
	String TERMS_XPATH="//*[@ng-reflect-name='termAndConditions']/label/div";
	String ADD_TO_CART_XPATH="//button[contains(text(),' Add To Cart')]";
	
	
	public void nextbutton() throws InterruptedException{
		driver.findElement(By.xpath(NEXT_BUTTON_SHIP_FROM_XPATH)).click();
		   Thread.sleep(3000);
	}
	
	public void ship_to_section() throws InterruptedException
	{
		driver.findElement(By.xpath(SEARCH_USER_XPATH)).sendKeys("Chick corea");
		Thread.sleep(5000);
		driver.findElement(By.xpath(ADDRESS_CHECK_XPATH)).click();
		driver.findElement(By.xpath(ADDRESS_DONE_XPATH)).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath(NEXT_BUTTON_SHIP_TO_XPATH)).click();
		Thread.sleep(4000);
	}
	
	public void package_section() throws InterruptedException
	{
		driver.findElement(By.xpath(PACKAGE_SELECTION_XPATH)).click();
		driver.findElement(By.xpath(PACKAGE_SELECTIONS_XPATH)).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(NEXT_PACKAGE_BUTTON_XPATH)).click();
		Thread.sleep(4000);
		WebElement wb=driver.findElement(By.xpath("//*[@ng-reflect-name='pickupMethod']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);"+ "window.scrollBy(0,-1250);", wb);
		Thread.sleep(2000);
	}
	
	public void package_details() throws InterruptedException
	{
		driver.findElement(By.xpath(PICKUP_METHOD_XPATH)).click();
		driver.findElement(By.xpath(PICKUP_DROPDOWN_XPATH)).click();
		driver.findElement(By.xpath(PACKAGE_SELECT_XPATH)).click();
		driver.findElement(By.xpath(PACKAGE_DROPDOWN_XPATH)).click();
		driver.findElement(By.xpath(WEIGHT_XPATH)).sendKeys("123");
		Thread.sleep(4000);
		driver.findElement(By.xpath(NEXT_BUTTON_SELECTION_XPATH)).click();
		Thread.sleep(3000);
	}
	
	public void calender_section() throws InterruptedException
	{
		driver.findElement(By.xpath(CALENDER_RATES_XPATH)).click();
		WebElement wbd=driver.findElement(By.xpath("//*[@class='app-btn mat-button orange-button martop10 float-right enabled']"));
	    JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView(true);"+ "window.scrollBy(0,-1250);", wbd);
		driver.findElement(By.xpath(CALENDER_NEXT_BUTTON_XPATH)).click();
		Thread.sleep(3000);
	}
	
	public void add_to_cart()
	{
		driver.findElement(By.xpath(TERMS_XPATH)).click();
		driver.findElement(By.xpath(ADD_TO_CART_XPATH)).click();
		
	}
}
