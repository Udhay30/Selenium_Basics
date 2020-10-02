package com.java.advancedselenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.browsercommands.Utility;

public class AutoComplete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
	//	WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement courseName = driver.findElement(By.xpath("//input[@id='tags']"));
		courseName.click();
		courseName.sendKeys("s");

		List<WebElement> allList = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		/*
		 * Iterator<WebElement> itr = allList.iterator(); while (itr.hasNext()) {
		 * WebElement element = (WebElement) itr.next(); if
		 * (element.getText().trim().equalsIgnoreCase("selenium")) { element.click();
		 * break;
		 * 
		 * } }
		 */

		for (WebElement element : allList) {
			System.out.println(element.getText());
			if (element.getText().equalsIgnoreCase("Selenium")) {
				element.click();
				
				
				System.out.println(allList.size());
		
				break;
			}
		}

	}

}
