package com.java.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Resume\\Book1.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheetAt(0);
		DataFormatter df = new DataFormatter();

		Iterator<Row> row = sheet.iterator();
		while (row.hasNext()) {
			Row rowWise = (Row) row.next();
			Iterator<Cell> column = rowWise.iterator();
			while (column.hasNext()) {
				Cell cell = (Cell) column.next();
				System.out.println(df.formatCellValue(cell));
			}

		}

	}

}
