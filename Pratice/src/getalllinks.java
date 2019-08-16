import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class getalllinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
		driver.get("https://demo.exelatech.com/");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
//		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("h1"));
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("class"));
//			
//			
		}
		
		
}

}

