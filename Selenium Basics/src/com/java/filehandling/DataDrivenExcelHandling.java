package com.java.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDrivenExcelHandling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\lenovo pc\\Desktop\\udhay\\testdata1.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheetAt(0);
		DataFormatter df = new DataFormatter();
		Iterator<Row> rows = sheet.iterator();
		while (rows.hasNext()) {
			Row row = (Row) rows.next();

			Iterator<Cell> column = row.iterator();
			while (column.hasNext()) {
				Cell cell = (Cell) column.next();
			
				String s = df.formatCellValue(cell);
				System.out.println(s);

			}
		}

	}

}
