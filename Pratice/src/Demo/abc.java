package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
public  WebDriver driver;
//public abc(WebDriver driver)
//{
//	this.driver=driver;
//}
	
	
	String  INDUSTRIES_XPATH="//*[@class='block block-we-megamenu block-we-megamenu-blockmain clearfix']/div/nav/div/ul/li[1]/a";	
	String BANKING_XPATH="//*[@class='block block-we-megamenu block-we-megamenu-blockmain clearfix']/div/nav/div/ul/li[1]//*[@class='we-mega-menu-submenu mega-width']/div[1]/div[1]/div[1]/ul[1]/li[1]";
	String CONSUMER_XPATH="//*[@class='block block-we-megamenu block-we-megamenu-blockmain clearfix']/div/nav/div/ul/li[1]//*[@class='we-mega-menu-submenu mega-width']/div[1]/div[1]/div[1]/ul[1]/li[2]";
	String EDUCATION_XPATH="//*[@class='block block-we-megamenu block-we-megamenu-blockmain clearfix']/div/nav/div/ul/li[1]//*[@class='we-mega-menu-submenu mega-width']/div[1]/div[1]/div[1]/ul[1]/li[3]";
	String ENERGY_XPATH="//*[@class='block block-we-megamenu block-we-megamenu-blockmain clearfix']/div/nav/div/ul/li[1]//*[@class='we-mega-menu-submenu mega-width']/div[1]/div[1]/div[1]/ul[1]/li[4]";
	String HEALTHCARE_XPATH="//*[@class='block block-we-megamenu block-we-megamenu-blockmain clearfix']/div/nav/div/ul/li[1]//*[@class='we-mega-menu-submenu mega-width']/div[1]/div[1]/div[1]/ul[1]/li[5]";

	public void openbrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver",
	"driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.exelatech.com");
	Thread.sleep(3000);
//		System.out.println("Site opens");
	}

	public  void Industries()
	{
	driver.findElement(By.xpath(INDUSTRIES_XPATH)).click();
	}
	public void banking()
	{
	driver.findElement(By.xpath(BANKING_XPATH)).click();
	}
	public void Consumer()
	{
	driver.findElement(By.xpath(CONSUMER_XPATH)).click();
	System.out.println("Target is achieved");
	}
}
