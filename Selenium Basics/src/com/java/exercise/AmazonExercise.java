package com.java.exercise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class AmazonExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		WebElement searchBox_xpath = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox_xpath.click();
		searchBox_xpath.sendKeys("mobiles");
		searchBox_xpath.sendKeys(Keys.ENTER);

		WebElement phone_xpath = driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']"));
		phone_xpath.click();

		List<String> window1 = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(window1.get(window1.size() - 1));

		WebElement addToCart_xpath = driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
		addToCart_xpath.click();

		WebElement addCartButton = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		addCartButton.click();

		WebElement deleteCart = driver.findElement(By.xpath("//input[@value='Delete']"));
		deleteCart.click();

		// div[@id='sc-item-C72ccb874-c373-4073-afae-f0769f591940']//div[1]//span[1]
		Thread.sleep(1500);
		List<String> window2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(window2.get(window2.size() - 2));
		WebElement returnPhone = driver.findElement(By.xpath("//span[@xpath='1']"));
		returnPhone.click();

		//WebElement homepage_Return = driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
		//  homepage_Return.click();
	}

}
