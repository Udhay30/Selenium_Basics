package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);

		WebElement scale = driver.findElement(By.xpath("//div[@id='slider']"));
		WebElement handle = driver.findElement(By.xpath("//span[@tabindex='0']"));

		int w = scale.getSize().width;
		int h = scale.getSize().height;
		System.out.println(w + " " + h);
		Actions a = new Actions(driver);
		// a.clickAndHold(handle).moveByOffset(w / 8,
		// 0).release(handle).build().perform();
		a.clickAndHold(handle).moveByOffset(30, 0).release(handle).build().perform();
	}

}
