package com.java.advancedselenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class FilesDowloadingAndVerify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/download.html");

		WebElement downloadClick = driver.findElement(By.linkText("Download Excel"));
		downloadClick.click();
		
		Thread.sleep(1500);
		File file = new File("C:\\Users\\lenovo pc\\Downloads");
		File[] totalFiles = file.listFiles();
		for (File downloadFile :totalFiles) {
			if (downloadFile.getName().equalsIgnoreCase("testleaf.xlsx")) {
				System.out.println("file is downloaded");
				break;
			}
			else {
				System.out.println("file is not downloaded");
				break;
			}
		}
	}

}

