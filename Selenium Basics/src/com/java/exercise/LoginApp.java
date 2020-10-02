package com.java.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;

public class LoginApp {

	WebDriver driver;
	Object [][] data= {
			{"admin","dummy"},
			{"admin","admin12"},
			{"Admin","admin12"},
			{"Admin","admin123"}	
	};
	@BeforeSuite
	public void launch() {
	
		driver = Utility.initBrowser();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		//driver.get("www.amazon.in");
		//driver.manage().window().maximize();
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	@DataProvider(name="loginData")
	public Object[][] loginDataProvider() {
		return data;
	}
	
	@Test(dataProvider="loginData")
	public void loginTest(String uname,String pword) {
		

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys(uname);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys(pword);

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
	
	}
}