package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCase7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("harshu@123gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("harsh@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
		
		

	}

}
