package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenrateException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Shree/Desktop/WcsA5/Webelement/dropdown1.html");
		
	
	     WebElement dropDownElement = driver.findElement(By.id("menu"));
		

		 Select sel=new Select(dropDownElement);
		 
		
		 Thread.sleep(2000);
		 sel.selectByIndex(2); 
		 
		 Thread.sleep(2000);
	
		 sel.deselectByIndex(2);

	}

}
