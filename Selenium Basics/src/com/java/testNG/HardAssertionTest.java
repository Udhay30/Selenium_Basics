package com.java.testNG;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;

public class HardAssertionTest {
	WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = Utility.initBrowser();
		// driver.get("www.amazon.in");
		// driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void AutoCompleteExample() throws InterruptedException {

		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		// AutoComplete | jQuery UI
		Assert.assertEquals(driver.getTitle(), "Autocomplete | jQuery U");
		driver.switchTo().frame(0);

		WebElement auto_id = driver.findElement(By.id("tags"));
		auto_id.click();
		auto_id.sendKeys("j");
		Thread.sleep(1500);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println("size:" + li.size());
		Iterator<WebElement> itr = li.iterator();
		String s = "java";
		while (itr.hasNext()) {
			WebElement ele = (WebElement) itr.next();
			if (ele.getText().trim().equalsIgnoreCase(s)) {
				ele.click();

			}
		}
		System.out.println(auto_id.getAttribute("value"));
		Assert.assertEquals(auto_id.getAttribute("value").trim().toUpperCase(),s.trim().toUpperCase());
	}
	@Test
	public void ebay() {
		driver.get("https://www.ebay.com");
	}
}