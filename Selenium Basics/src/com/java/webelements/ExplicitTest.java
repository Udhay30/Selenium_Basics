package com.java.webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.java.browsercommands.Utility;

public class ExplicitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");

		WebElement clickMe_xpath = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		clickMe_xpath.click();
		driver.switchTo().alert();

		Alert a = driver.switchTo().alert();
		a.accept();

		WebElement clickMeJava_xpath = driver
				.findElement(By.xpath("//*[text()='Java Script Confirm Box']//parent::div//button"));
		clickMeJava_xpath.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert a2 = driver.switchTo().alert();
		a2.dismiss();

		WebElement clickMeJavaScript_xpath = driver
				.findElement(By.xpath("//button[@class='btn btn-default btn-lg']/following::button"));
		clickMeJavaScript_xpath.click();
	//	Thread.sleep(1500);
		Alert a3 = driver.switchTo().alert();
		//clickMeJavaScript_xpath.sendKeys(Keys.CLEAR);
		a3.sendKeys("ud");
		a3.accept();
		a3.getText();
		System.out.println(a3.getText());
		a3.dismiss();
	}

}
