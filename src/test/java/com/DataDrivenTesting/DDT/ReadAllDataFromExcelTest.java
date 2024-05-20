package com.DataDrivenTesting.DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDataFromExcelTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\ExcelCommonData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < cellCount; j++) {
				String cellValues = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(cellValues+" ");
			}
			System.out.println();
		}

	}

}
