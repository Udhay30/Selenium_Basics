package com.java.advancedselenium;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Utility.initBrowser();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		WebElement dateClick=driver.findElement(By.id("datepicker"));
		dateClick.click();
		//dateClick.sendKeys("02/22/2020"+Keys.ENTER+Keys.END);
		
		WebElement nextClick=driver.findElement(By.xpath("//a[@title='Next']"));
		nextClick.click();
		
		WebElement datePick=driver.findElement(By.xpath("//a[contains (text(),'10')]"));
		datePick.click();
	}

}
