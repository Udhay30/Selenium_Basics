package com.java.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.session.ProxyTransform;

import com.java.browsercommands.Utility;

public class SearchBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http:\\www.google.com");

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("testing");
		String s = searchbox.getAttribute("value");
		System.out.println(s);

		//searchbox.sendKeys(Keys.chord(Keys.CONTROL + "a"));
		//searchbox.sendKeys(Keys.BACK_SPACE);
		Actions a = new Actions(driver);
		a.doubleClick(searchbox);
		a.sendKeys(Keys.BACK_SPACE).build().perform();
		//delete using
		

	}

}
