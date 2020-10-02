package com.java.browsercommands;

import org.openqa.selenium.WebDriver;

public class NavigateTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
	
		driver.get("http:\\www.google.com");
		Thread.sleep(1500);
		driver.get("http:\\www.bing.com");
		driver.navigate().to("http:\\www.google.com");
		Thread.sleep(1500);
		driver.navigate().back();
		Thread.sleep(1500);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("http://www.amazon.in");
	}

}
