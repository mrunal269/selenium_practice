package Demo;

import org.openqa.selenium.WebDriver;

public class callclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		// TODO Auto-generated method stub
		abc ab=new abc();
		ab.openbrowser();
		ab.Industries();
		ab.banking();
		ab.Industries();
		ab.Consumer();
	}

}
