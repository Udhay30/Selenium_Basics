package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class UnderlineOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.google.com");

		WebElement gmail = driver.findElement(By.linkText("Gmail"));

		Actions a = new Actions(driver);
		a.moveToElement(gmail).build().perform();
		String underline = gmail.getCssValue("text-decoration");
		System.out.println(underline);
	}

}
