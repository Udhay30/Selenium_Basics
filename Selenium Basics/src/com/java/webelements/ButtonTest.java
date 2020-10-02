package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.browsercommands.Utility;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		WebElement button = driver.findElement(By.name("btnI"));
		button.submit();
	}

}
