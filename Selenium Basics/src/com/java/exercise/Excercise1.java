package com.java.exercise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> li = driver.findElements(By.xpath("//a"));
		System.out.println("size is:" + li.size());

		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement element = (WebElement) itr.next();
			// System.out.println(element.getText());

			if (element.getText().length() > 0) {
				System.out.println(element.getText());

			}

		}
	}
}