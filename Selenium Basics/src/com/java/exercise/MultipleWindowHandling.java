package com.java.exercise;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = Utility.initBrowser();
		WebDriver driver=Utility.customBrowser("firefox");
		driver.get("http://omayo.blogspot.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement seleniumTutorial = driver.findElement(By.xpath("//a[contains(text(),'SeleniumTutorial')]"));

		for (int i = 1; i <= 3; i++) {
			seleniumTutorial.click();
		}
		String oldWindow = driver.getWindowHandle();

		Set<String> handles1 = driver.getWindowHandles();

		for (String newWindow : handles1) {
			Thread.sleep(1500);
			driver.switchTo().window(newWindow);
			Thread.sleep(1500);

		}
		Thread.sleep(1500);
		driver.close();
		driver.switchTo().window(oldWindow);
		
		Set<String> handles2 = driver.getWindowHandles();

		for (String newWindow : handles2) {
			Thread.sleep(1500);
			driver.switchTo().window(newWindow);
			Thread.sleep(1500);

		}
		Thread.sleep(1500);
		driver.close();
		driver.switchTo().window(oldWindow);
		
		Set<String> handles3 = driver.getWindowHandles();

		for (String newWindow : handles3) {
			Thread.sleep(1500);
			driver.switchTo().window(newWindow);
			Thread.sleep(1500);

		}
		Thread.sleep(1500);
		driver.close();
		driver.switchTo().window(oldWindow);
		Thread.sleep(1500);
		driver.quit();
	}
}