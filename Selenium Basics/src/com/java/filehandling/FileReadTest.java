package com.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		FileReader fr=new FileReader			
	("C:\\Users\\lenovo pc\\eclipse-workspace\\Selenium Basics\\resource\\testfile.txt");
		int ch;

		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
		fr.close();
	}

}
