package com.java.webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.java.browsercommands.Utility;

public class RefreshAPageDifferentApproaches {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.google.com");

		driver.get(driver.getCurrentUrl());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// 2 ways to use refresh
		js.executeScript("location.reload()");

		js.executeScript("history.go(0)");

		// using robot class

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
	}

}
