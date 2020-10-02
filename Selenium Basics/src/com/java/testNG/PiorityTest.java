package com.java.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;

public class PiorityTest {
	WebDriver driver;

	@BeforeSuite
	public void launch() {
		driver = Utility.initBrowser();
		//driver.get("www.amazon.in");
		//driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	@Test(priority=2)
	public void Bing() {
		System.out.println("open bing");
		driver.get("http://www.bing.com");
	}

	@Test(priority=1)
	public void google() {
		System.out.println("open google");
		driver.get("http://www.google.com");
	}
}
