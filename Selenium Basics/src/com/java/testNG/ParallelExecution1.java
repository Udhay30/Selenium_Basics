package com.java.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;


public class ParallelExecution1 {
	WebDriver driver;

	/*@BeforeMethod
	public void launch() {
		driver = Utility.initBrowser();
	
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}*/
	@Test
	public void gotogoogle() {
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
	}
	/*@Test
	public void bing() {
		driver=Utility.initBrowser();
		driver.get("https://www.bing.com");
	}*/
	
}
