package com.java.testNG;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;
import com.java.browsercommands.Utilitys;

public class WindowHandlingAmazon {
	WebDriver driver;

	@Test
	public void windowHandle() {
		driver=Utility.customBrowser("firefox");
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String oldWindow = driver.getWindowHandle();
		System.out.println(oldWindow);
		WebElement searchBox_xpath = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox_xpath.click();
		searchBox_xpath.sendKeys("mobiles");
		searchBox_xpath.sendKeys(Keys.ENTER);

		WebElement phone_xpath = driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal']"));
		phone_xpath.click();

		Set<String> handles = driver.getWindowHandles();
		// for (String newWindow : handles) {
		// driver.switchTo().window(newWindow);

		// }
		Iterator<String> itr = handles.iterator();
		while (itr.hasNext()) {
			String newwindow = (String) itr.next();
			driver.switchTo().window(newwindow);
		}
		WebElement addToCart_xpath = driver.findElement(By.xpath(" //input[@id='add-to-cart-button']"));
		addToCart_xpath.click();

		WebElement addCartButton = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		addCartButton.click();

		WebElement deleteCart = driver.findElement(By.xpath("//input[@value='Delete']"));
		deleteCart.click();
		// driver.close();
		// driver.quit();
		driver.switchTo().window(oldWindow);
		// WebElement todayDeals = driver.findElement(By.xpath("//a[@tabindex='27']"));
		// todayDeals.click();
	}
}