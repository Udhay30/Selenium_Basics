package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.java.browsercommands.Utility;

public class ExplicitWaitTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.get("https://jqueryui.com/droppable/");

		// driver.switchTo().frame(0);
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='draggable']")));
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='draggable']")));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).release().build().perform();
	}

}
