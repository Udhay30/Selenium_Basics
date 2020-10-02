package com.java.webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement clickMe = driver.findElement(By.xpath("//button[@id='Click']"));
		clickMe.click();
		String str = clickMe.getText();
		System.out.println(str);

		driver.switchTo().defaultContent();
		//driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");

		WebElement nestedFrame = driver.findElement(By.xpath("//button[@id='Click1']"));
		nestedFrame.click();
		driver.switchTo().defaultContent();

		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
		int size = totalFrame.size();
		System.out.println(size);

	}

}
