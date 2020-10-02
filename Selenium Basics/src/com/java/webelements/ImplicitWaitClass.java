package com.java.webelements;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class ImplicitWaitClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement auto_id = driver.findElement(By.id("tags"));
		auto_id.click();
		auto_id.sendKeys("j");
		Thread.sleep(1500);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println("size:" + li.size());
		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement ele = (WebElement) itr.next();
			if (ele.getText().trim().equalsIgnoreCase("Java")) {
				ele.click();

			}
		}
	}

}
