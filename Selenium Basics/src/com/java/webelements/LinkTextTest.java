package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class LinkTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Partial Link Test
		WebDriver driver = Utility.initBrowser();
		driver.get("https://jqueryui.com/");
		// WebElement link = driver.findElement(By.linkText("Draggable"));
		// link.click();
		WebElement plink = driver.findElement(By.partialLinkText("Drag"));
		plink.click();
	}

}
