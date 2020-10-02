package com.java.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XcelHandling {
	static List<String> rowlist=new ArrayList<String>();
	static List<String> columnlist=new ArrayList<String>();
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\Resume\\Book1.xlsx");
		
		
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet=workbook.getSheetAt(0);
		DataFormatter df=new DataFormatter();
		//Row rows=sheet.getRow(arg0);
		
		Iterator<Row> itr=sheet.iterator();
		while (itr.hasNext()) {
			Row row = (Row) itr.next();
			
			Iterator<Cell> itr1=row.iterator();
			while (itr1.hasNext()) {
				int i=2;
			if(i%2==0) {
				rowlist.add(itr1.next().toString());
				
			}
			else {
				columnlist.add(itr1.next().toString());
			}
			i++;
				//Cell cell = (Cell) itr1.next();
				//System.out.println(df.formatCellValue(cell));
			
				
			}
			System.out.println(rowlist);
			System.out.println(columnlist);
		}
	}

}
