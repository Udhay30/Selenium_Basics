package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class HighLightExample {
	static WebDriver driver;

	public static void highlight(WebElement element) throws InterruptedException {
		// JavascriptExecutor js = ((JavascriptExecutor) driver);
		// js.executeScript("arguments[0].setAttribute('style','background-color:red;');",
		// ele);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		for (int i = 0; i < 3; i++) {
			js.executeScript("arguments[0].setAttribute('style','border-color:yellow;');", element);
			Thread.sleep(500);
			js.executeScript("arguments[0].setAttribute('style','border-color:red;');", element);
			Thread.sleep(600);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = Utility.initBrowser();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement First_name = driver.findElement(By.xpath("//input[@id='u_0_m']"));
		highlight(First_name);
	}

}
