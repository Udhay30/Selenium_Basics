package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class DragDrop {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.get("https://jqueryui.com/droppable/");
	//	driver.get("http://www.google.com");

		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a = new Actions(driver);
		// a.dragAndDrop(drag, drop).release().build().perform();
		a.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		driver.get("https://jqueryui.com/droppable/");
		

	}

}
