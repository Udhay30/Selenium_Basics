package com.java.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;
import com.java.browsercommands.Utilitys;

public class Parametrization {
	WebDriver driver;

	@BeforeSuite
	public void launch() {
		driver = Utility.initBrowser();

	}

	@AfterSuite
	public void teardown() {
		driver.close();
	}

	@Test(priority = 1)
	public void goToGoogle() {

		driver.get("https://www.google.com");
		Assert.assertEquals(driver.getTitle(), "Google");
	}

	@Test(priority = 2, dependsOnMethods = { "goToGoogle" })

	@Parameters("Skey")
	public void url(String key) {
		WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys(key);
		ele.sendKeys(Keys.ENTER);
	}
}
