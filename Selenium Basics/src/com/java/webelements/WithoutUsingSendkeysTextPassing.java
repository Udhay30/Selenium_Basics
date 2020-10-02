package com.java.webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.java.browsercommands.Utility;

public class WithoutUsingSendkeysTextPassing {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.click();

		// using java script
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// js.executeScript("document.getElementsByName('q')[0].value='chennai news'",
		// "");
		// js.executeScript("arguments[0].value='testing'", searchBox);

		// using robot class
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		// fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement profile = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.name("q"));
			}

		});
		profile.click();
		
	}

}
