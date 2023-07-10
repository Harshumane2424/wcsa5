package dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiselectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Shree/Desktop/WcsA5/Webelement/dropdown2.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		Thread.sleep(2000);
		sel.selectByIndex(1);	
		Thread.sleep(2000);
		sel.selectByVisibleText("Paani Puri ");
		Thread.sleep(2000);
		
		sel.selectByValue("v5");

		sel.deselectByIndex(3);
		Thread.sleep(2000);
	
		sel.deselectByVisibleText("Misal Pav");
		Thread.sleep(2000);
		sel.deselectByValue("v5");
		Thread.sleep(2000);
		
		for(int i=0 ; i<5; i++) 
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
		Thread.sleep(3000);
		
		
		sel.deselectAll();

	}

}
