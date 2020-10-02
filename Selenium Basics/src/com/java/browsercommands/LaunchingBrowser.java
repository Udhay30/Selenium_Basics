package com.java.browsercommands;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		// driver.findElement(By.name("q")).sendKeys("testing" + Keys.ENTER);
		driver.manage().window().maximize();
		Dimension d = new Dimension(1000, 800);
	
		driver.manage().window().setSize(d);
		//driver.close();
		// driver.quit();
	}

}
