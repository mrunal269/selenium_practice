package Demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("http://www.freepdfconvert.com/pdf-word");
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//*[@class='text']")).click();
		    Thread.sleep(2000);
		    StringSelection stringSelection = new StringSelection("D:\\dummy.pdf");
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   Robot robot = new Robot();
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		   robot.keyPress(KeyEvent.VK_CONTROL);
		   robot.keyPress(KeyEvent.VK_V);
		   robot.keyRelease(KeyEvent.VK_V);
		   robot.keyRelease(KeyEvent.VK_CONTROL);
		   Thread.sleep(2000);
		   robot.keyPress(KeyEvent.VK_ENTER);
		   robot.keyRelease(KeyEvent.VK_ENTER);
	

}
}
