package com.java.webelements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://omayo.blogspot.com");
		System.out.println(driver.getCurrentUrl());

		WebElement seleniumTuto = driver.findElement(By.xpath("//a[text()='SeleniumTutorial']"));
		seleniumTuto.click();
		List<String> window = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(window.size());
		driver.switchTo().window(driver.getCurrentUrl());
		driver.quit();

	}

}
