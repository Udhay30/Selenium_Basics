package com.java.exercise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.java.browsercommands.Utility;

public class SoftAssertUsingAmazon {
	WebDriver driver;
	SoftAssert sa;

	@BeforeMethod
	public void launch() {
		driver = Utility.initBrowser();
		sa = new SoftAssert();
		// driver.get("www.amazon.in");
		// driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void AmazonWindowHandle() {
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

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

			// Apple iPhone XR (64GB) - Blue: Amazon.in: Darshita Electronics
		}
		sa.assertEquals(driver.getTitle(), "Apple iPhone XR (64GB) - Black: Amazon.in: Appario Retail Private Ltd");

		WebElement addToCart_xpath = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
		addToCart_xpath.click();
		WebElement addCartButton = driver.findElement(By.xpath("//span[@id='nav-cart-count']"));
		addCartButton.click();

		WebElement cart1 = driver.findElement(By.xpath("//span[@class='a-size-medium sc-product-title']"));
		String s = cart1.getText();
		System.out.println(s);

		sa.assertEquals(s, "Apple iPhone XR (64GB) - Black");
		sa.assertAll();

	}
}
