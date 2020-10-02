package com.java.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class FlipkartExample {

	public static void main(String[] args) {
		
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.flipkart.com");

		WebElement cancel_xpath = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cancel_xpath.click();

		WebElement searchBoxClick_xpath = driver.findElement(By.xpath("//input[@name='q']"));
		searchBoxClick_xpath.sendKeys("mobiles");
		searchBoxClick_xpath.sendKeys(Keys.ENTER);

		WebElement selectMobile_xpath = driver.findElement(By.xpath("//div[contains(text(),'Realme 5i (Aqua Blue, 64 GB)')]"));
		selectMobile_xpath.click();
	}

}
