package com.DataDrivenTesting.DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ReadDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver=null;
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ExcelCommonData.xlsx") ;
		Workbook wb=WorkbookFactory.create(fis);
		String cellValue=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellValue);
	}
	
	
	
	
}
