package com.java.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;

public class DisablingTestCase {
	WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = Utility.initBrowser();
		// driver.get("www.amazon.in");
		// driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(enabled = false) // to skip the test enabled=FALSE
	public void flipcart() {
		driver.get("https://www.flipkart.com/");
	}

	@Test
	public void amazon() {
		driver.get("https://www.amazon.com/");
	}

	@Test
	public void myntra() {
		driver.get("https://www.myndra.com/");
	}

	@Test
	public void waveinn() {
		driver.get("https://www.waveinn.com/");
	}

}
