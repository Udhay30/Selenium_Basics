package com.java.webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class ScrollingTest {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.spicinemas.in/");

		WebElement button = driver.findElement(By.id("selectCity"));
		button.click();
		WebElement link = driver.findElement(By.partialLinkText("MOVIES"));
		link.click();
		WebElement privacy = driver.findElement(By.linkText("Privacy"));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// js.executeScript("window.scrollBy(0,100)");
		// js.executeScript("arguments[0].scrollIntoView()", privacy);
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		/*
		 * js.executeScript("window.scrollBy(100,0)");
		 * js.executeScript("arguments[0],scrollIntoView", privacy);
		 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * 
		 * 
		 */
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
