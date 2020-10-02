package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement active = driver.switchTo().activeElement();
		active.sendKeys("hi google \n");

	}

}
