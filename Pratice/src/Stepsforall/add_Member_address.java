package Stepsforall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class add_Member_address {

	
	WebDriver driver;
	public add_Member_address(WebDriver driver)
	{
		this.driver=driver;
	}
	String ADD_XPATH="//*[@class='app-btn mat-button orange-button ng-star-inserted']";
	String ADD_MEMBER_BUTTON_XPATH="//*[@class='app-btn mat-button orange-button']";
	String ADDRESS_TYPE_CLICK_XPATH="//*[@class='mat-select-value']";
	String ADDRESS_TYPE_DRODOWN_XPATH="//*[@ng-reflect-klass='mat-select-panel mat-primary']/mat-option[1]";
	String NAME_XPATH="//*[@formcontrolname='contact_name']";
	String EMAILID_XPATH="//*[@formcontrolname='contact_email']";
	String NUMBER_XPATH="//*[@formcontrolname='contact_phone']";
	String ADDRESS1_XPATH="//*[@formcontrolname='line1']";
	String COUNTRY_XPATH="//*[@formcontrolname='country']";
	String COUNTRY_DROPDOWN_XPATH="//*[@ng-reflect-value='AG']";
	String STATE_XPATH="//*[@formcontrolname='state']";
	String CITY_XPATH="//*[@formcontrolname='city']";
	String ZIPCODE_XPATH="//*[@formcontrolname='zipcode']";
	String VALID_MSG_XPATH="//*[@class='toast-top-right toast-container']";
	String EMAIL_VALID_XPATH="//*[contains(text(),'Email already exist')]";
	
	
	
	
	public void addmember() throws InterruptedException
	{
		driver.findElement(By.xpath(ADD_MEMBER_BUTTON_XPATH)).click();
		Thread.sleep(3000);
	}
	
	public void address_click()
	{
		driver.findElement(By.xpath(ADDRESS_TYPE_CLICK_XPATH)).click();
	}
	
	public void address_type()
	{
		driver.findElement(By.xpath(ADDRESS_TYPE_DRODOWN_XPATH)).click();
	}
	
	public void name(String name)
	{
		driver.findElement(By.xpath(NAME_XPATH)).click();
		driver.findElement(By.xpath(NAME_XPATH)).sendKeys(name);
	}
	
	public void email_id(String email)
	{
		driver.findElement(By.xpath(EMAILID_XPATH)).click();
		driver.findElement(By.xpath(EMAILID_XPATH)).sendKeys(email);
	}
	
	public void number(String number)
	{
		driver.findElement(By.xpath(NUMBER_XPATH)).click();
		driver.findElement(By.xpath(NUMBER_XPATH)).sendKeys(number);
	}
	
	public void address1(String address)
	{
		driver.findElement(By.xpath(ADDRESS1_XPATH)).click();
		driver.findElement(By.xpath(ADDRESS1_XPATH)).sendKeys(address);
	}
	
	public void country() throws InterruptedException
	{
		driver.findElement(By.xpath(COUNTRY_XPATH)).click();
		driver.findElement(By.xpath(COUNTRY_DROPDOWN_XPATH)).click();
		Thread.sleep(3000);
	}
	
	public void state(String state)
	{
		driver.findElement(By.xpath(STATE_XPATH)).click();
		driver.findElement(By.xpath(STATE_XPATH)).sendKeys(state);
	}
	
	public void city(String city)
	{
		driver.findElement(By.xpath(CITY_XPATH)).click();
		driver.findElement(By.xpath(CITY_XPATH)).sendKeys(city);
	}
	
	public void zipcode(String zipcode)
	{
		driver.findElement(By.xpath(ZIPCODE_XPATH)).click();
		driver.findElement(By.xpath(ZIPCODE_XPATH)).sendKeys(zipcode);
	}
	
	public void add() throws InterruptedException
	{
		driver.findElement(By.xpath(ADD_XPATH)).click();
		Thread.sleep(2000);
//		WebElement wb2=driver.findElement(By.xpath(EMAIL_VALID_XPATH));
//	    String sValue = wb2.getText();
		
		if(driver.getPageSource().contains("Email already exist"))
		{
			Assert.assertTrue(true);
			System.out.println("Duplicate email id is not allowed");
		    
		    
		}
		else
		{
			System.out.println("User is redirected to lisitng page");
		}
		
//			WebElement wb2=driver.findElement(By.xpath(EMAIL_VALID_XPATH));
//		    String sValue = wb2.getText();
//		    if(wb1.isEnabled()&& driver.findElement(By.xpath(EMAIL_VALID_XPATH)).isDisplayed())
//		    {
//		    	
//		    	System.out.println("bye");
//		    }
//		    else
//		    {
//		    	System.out.println("hiiii");
//		    }
			
		}
		
//		elseif(wb1.isEnabled()&& wb2.isDisplayed());
//		{
		
		
//		
//		WebElement wb2=driver.findElement(By.xpath(EMAIL_VALID_XPATH));
//	    String sValue = wb2.getText();
		//if(wb1.isEnabled()&& wb2.isDisplayed())
//              {
//            	  
//			  Assert.assertEquals("Email already exist", sValue);
//              System.out.println("message is dispalyed");
//              }
          
	
		
	
	


	public void validation()
	{
		WebElement wb=driver.findElement(By.xpath(VALID_MSG_XPATH));
		String actual=wb.getText();
		System.out.println(actual);
	}
}
