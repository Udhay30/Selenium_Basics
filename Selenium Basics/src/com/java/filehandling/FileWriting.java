package com.java.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		String[] arr= {};
	
		String s = "";
		FileReader fr = new FileReader

		("C:\\Users\\lenovo pc\\eclipse-workspace\\Selenium Basics\\resource\\testfile.txt");
		int ch;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
			s = s + (char) ch;
		}
		fr.close();
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(
				"C:\\Users\\lenovo pc\\eclipse-workspace\\Selenium Basics\\resource\\testfile.txt");
		String str = "hello";
		/*
		 * for (int i = 0; i < str.length(); i++) {
		 * 
		 * //fw.write(str.charAt(i)); //fw.write(str.charAt(i));
		 * fw.append(str.charAt(i));
		 * 
		 * }
		 */
		fw.write(s);
		Scanner sc = new Scanner(System.in);

		while (!(str = sc.nextLine()).equalsIgnoreCase("$")) {

			fw.write(str);
			fw.write("\n");
		}
		fw.close();
	}

}
