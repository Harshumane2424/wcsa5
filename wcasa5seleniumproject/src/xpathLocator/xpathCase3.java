package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9552226414");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("harshu@123");
		Thread.sleep(2000);
		
		

	}

}
