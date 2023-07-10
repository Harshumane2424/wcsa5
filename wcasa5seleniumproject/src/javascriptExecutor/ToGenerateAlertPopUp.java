package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGenerateAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("file:///C:/Users/Shree/Desktop/WcsA5/Webelement/disabled.html");
	    driver.findElement(By.id("i1")).sendKeys("admin");
	    //driver.findElement(By.id("i2")).sendKeys("manager");
	    Thread.sleep(2000);
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("alert('Hello There!!');");
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    js.executeScript("document.getElementById('i2').value='manager'");

	    
	    
	    
	    

	}

}
