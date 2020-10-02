package com.java.testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;

public class GroupingTestCases {
	WebDriver driver;
	@BeforeMethod(groups= {"all"})
	public void launch() {
		driver=Utility.initBrowser();
	}
	@AfterMethod(groups= {"all"})
	public void teardown() {
		driver.close();
	}
	@Test(groups= {"regression","smoke"})
	public void google() {
		driver.get("https://www.google.com");
	}
	@Test(groups= {"regression","sanitary"})
	public void bing() {
		driver.get("https://www.bing.com");
	}
	@Test(groups= {"regression"})
	public void ask() {
		driver.get("https://www.ask.com");
		
	}
	@Test(groups= {"smoke"})
	public void msn() {
		driver.get("https://www.msn.com");
		
	}
	@Test(groups= {"sanitary"})
	public void baidu() {
		driver.get("https://www.baidu.com");
		
	}
	@Test(groups= {"regression","smoke","sanitary"})
	public void yahoo() {
		driver.get("https://in.yahoo.com");
		
	}


}
