package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Read data from IPL sheet
		//Implementation of read the data from excel
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);

	}

}
