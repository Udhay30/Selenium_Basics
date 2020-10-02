package com.java.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.java.browsercommands.Utility;

public class AlertHandling {

	public static void main(String[] args) {
	
		
		WebDriver driver1 = Utility.initBrowser();
		CustomLisnerTest ct = new CustomLisnerTest();
		EventFiringWebDriver driver = new EventFiringWebDriver(driver1);
		driver.register(ct);
		
					
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement clickMe_xpath = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		clickMe_xpath.click();
		driver.switchTo().alert();

		Alert a = driver.switchTo().alert();
		a.accept();

		WebElement clickMeJava_xpath = driver
				.findElement(By.xpath("//*[text()='Java Script Confirm Box']//parent::div//button"));
		clickMeJava_xpath.click();

		Alert a2 = driver.switchTo().alert();
		a2.dismiss();

		WebElement clickMeJavaScript_xpath = driver
				.findElement(By.xpath("//button[@class='btn btn-default btn-lg']/following::button"));
		clickMeJavaScript_xpath.click();
		Alert a3 = driver.switchTo().alert();
		// clickMeJavaScript_xpath.sendKeys(Keys.CLEAR);
		a3.sendKeys("ud");
		
		// String str=a3.getText();
		//System.out.println(str);
		a3.accept();
	
	}

}
