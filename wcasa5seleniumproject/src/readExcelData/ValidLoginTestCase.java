package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=2pftopagemkpq");
		
		//read the data from excel file and test the login page
		FileInputStream fis = new FileInputStream("./Data/ActiTime.xlsx.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("validcreds");
        Row row = sheet.getRow(1);
        //create the cell by using Row
        Cell cell = row.getCell(0);
        String validUsername = cell.getStringCellValue();
        
        //write the data into cell
        FileInputStream fis2 = new FileInputStream("./Data/ActiTime.xlsx.xlsx");
        Workbook wb1 = WorkbookFactory.create(fis2);
        Sheet sheet1 = wb1.getSheet("validcreds");
        Row row1 = sheet1.getRow(1);
        Cell cell1 = row1.getCell(1);
        String validPassword = cell1.getStringCellValue();
        driver.findElement(By.name("username")).sendKeys(validUsername);
        driver.findElement(By.name("pwd")).sendKeys(validPassword);
        driver.findElement(By.id("loginButton")).click();
        
        
        
        

	}

}
