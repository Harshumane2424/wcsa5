package PopUp;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("file:///C:/Users/Shree/Desktop/WcsA5/Webelement/Alert2.html");
	    //To gernerate Pop up click on Button
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    //handle alert popup
	    Alert al = driver.switchTo().alert();
	    //al.accept();
	    Thread.sleep(2000);
	    System.out.println(al.getText());
	    al.dismiss();
	    
	    

	}

}
