package com.java.advancedselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class Sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		WebElement from = elements.get(5);
		WebElement to = elements.get(0);
		Actions action=new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();
	}

}
