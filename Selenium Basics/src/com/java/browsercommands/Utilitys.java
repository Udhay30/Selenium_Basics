package com.java.browsercommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Utilitys {
	WebDriver driver;

	@Test
	@Parameters({"browser"})
	public void verifyTitle(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
	}
	
}