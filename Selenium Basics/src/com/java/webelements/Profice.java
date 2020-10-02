package com.java.webelements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.PageFactory;

public class Profice {
	static WebElement q;

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(false);
		System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\Firefox\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.switchTo().activeElement().sendKeys("testing /n");
		PageFactory.initElements(driver, Profice.class);

		q.sendKeys("hi /n");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);

	}
}
