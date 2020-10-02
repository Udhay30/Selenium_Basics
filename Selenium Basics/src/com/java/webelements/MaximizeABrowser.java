package com.java.webelements;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.java.browsercommands.Utility;

public class MaximizeABrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		
		driver.get("http://www.google.com");
		/*
		 * driver.manage().window().maximize();
		 * 
		 * Dimension d = new Dimension(1366, 768); driver.manage().window().setSize(d);
		 * 
		 */ }

}
