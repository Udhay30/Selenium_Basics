package com.java.webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;
import com.java.exercise.SearchBox;

public class EnterAKey {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.google.com");

		WebElement serachBox = driver.findElement(By.name("q"));
		serachBox.sendKeys("chennai news \n");
		//serachBox.submit();

		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
*/
	}

}
