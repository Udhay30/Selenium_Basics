package com.java.advancedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		WebElement yourName=driver.findElement(By.xpath("//input[@id='age']"));
		yourName.click();
		Actions a=new Actions(driver);
		a.moveToElement(yourName).build().perform();
	}

}
