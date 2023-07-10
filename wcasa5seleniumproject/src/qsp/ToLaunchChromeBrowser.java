package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		//upcast into webDriver()
		WebDriver driver=new ChromeDriver();
		//provide the daily of 2 sec
		Thread.sleep(2000);
		//To close browser
		driver.close();

	}

}
