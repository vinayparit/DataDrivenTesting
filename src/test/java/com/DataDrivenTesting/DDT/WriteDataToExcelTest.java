package com.DataDrivenTesting.DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcelTest {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ExcelCommonData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		sheet.createRow(9).createCell(0).setCellValue("Sagar");
		
		FileOutputStream fout=new FileOutputStream(".\\src\\test\\resources\\ExcelCommonData.xlsx");
		
		wb.write(fout);
		wb.close();
		
	}
	
	
	
}
