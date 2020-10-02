package com.java.webelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class TableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement customerTable_xpath = driver.findElement(By.xpath("//table[@id='customers']"));
		//WebElement customerTable_xpath = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/"));

		List<WebElement> li = customerTable_xpath.findElements(By.tagName("td"));
		// //table[@id='customers']/tbody/tr/*  td th tr
		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement table_data = (WebElement) itr.next();
			System.out.println(table_data.getText());
			
		}
	

	}

}
 