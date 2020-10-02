package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class ResizingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// div[@style='z-index: 90;']/following::div[2]
		WebDriver driver = Utility.initBrowser();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
	
		
		
		WebElement reSize_xpath = driver.findElement(By.xpath("//div[@style='z-index: 90;']/following::div[2]"));

		Actions a = new Actions(driver);
		int h = reSize_xpath.getSize().height;
		int w = reSize_xpath.getSize().width;
		a.clickAndHold(reSize_xpath).moveByOffset(h,w).release(reSize_xpath).build().perform();
		System.out.println(h);
		System.out.println(w);
		a.build().perform();
		

	}

}
