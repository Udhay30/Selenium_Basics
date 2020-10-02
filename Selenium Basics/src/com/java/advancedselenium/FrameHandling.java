package com.java.advancedselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement ClickMe=driver.findElement(By.xpath("//button[@id='Click']"));
		ClickMe.click();
		System.out.println(ClickMe.getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		//driver.switchTo().frame(2);
		
		WebElement clickMe2=driver.findElement(By.xpath("//button[@id='Click1']"));
		clickMe2.click();
		driver.switchTo().defaultContent();
		List<WebElement> totalFrame=driver.findElements(By.tagName("iframe"));
		totalFrame.size();
		System.out.println(totalFrame.size());
		
	}

}
