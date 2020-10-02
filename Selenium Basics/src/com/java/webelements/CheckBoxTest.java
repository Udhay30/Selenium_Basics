package com.java.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class CheckBoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		WebElement check_box = driver.findElement(By.id("isAgeSelected"));
		check_box.click();
		boolean box=check_box.isDisplayed();
		

		// WebElement
		// multiple_checkbox=driver.findElement(By.xpath("//input[@id='check1']"));
		// multiple_checkbox.click();
		// multiple_checkbox.click();

		List<WebElement> allList = driver.findElements(By.xpath("//input[@type='checkbox']"));
		allList.get(2).click();
		Actions a = new Actions(driver);
		a.keyDown(Keys.CONTROL);
		a.click(allList.get(3));
		a.click(allList.get(4));

		a.build().perform();

	}

}
