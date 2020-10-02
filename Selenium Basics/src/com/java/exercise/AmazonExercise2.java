package com.java.exercise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.java.browsercommands.Utility;

public class AmazonExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		// IMPLICIT Wait
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/s?k=mobiles&ref=nb_sb_noss_2");
		driver.manage().window().maximize();
		String oldWindow = driver.getWindowHandle();

		WebElement phone_xpath = driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']"));
		phone_xpath.click();

		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}

		WebElement addToCart_xpath = driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
		addToCart_xpath.click();

		WebElement addCartButton = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		addCartButton.click();

		WebElement deleteCart = driver.findElement(By.xpath("//input[@value='Delete']"));
		deleteCart.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, 30); WebElement phoneReturn=
		 * wait.
		 * until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@xpath='1']"))
		 * );
		 * 
		 * phoneReturn.click();
		 */

		
	}

}
