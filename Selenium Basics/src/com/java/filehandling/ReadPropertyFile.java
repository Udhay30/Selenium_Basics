package com.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader(
				"C:\\Users\\lenovo pc\\eclipse-workspace\\Selenium Basics\\resource\\test.property");

		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("url"));
		String browser = p.getProperty("browser");
		WebDriver driver=null;

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(p.getProperty("url"));
	}

}
