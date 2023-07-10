package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConformationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Shree/Desktop/WcsA5/Webelement/Alert3.html");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert al = driver.switchTo().alert();
		
		Thread.sleep(2000);
		al.accept();
        
		String text = al.getText();
		System.out.println(text);

	}

}
