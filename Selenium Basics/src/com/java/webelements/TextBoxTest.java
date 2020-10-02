package com.java.webelements;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class TextBoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http:\\www.google.com");

		WebElement searchbox = driver.findElement(By.name("q"));
		//searchbox.clear();
		// driver.navigate().refresh();
		searchbox.sendKeys("todays news");
		Thread.sleep(1500);
		//searchbox.sendKeys("testing"+Keys.chord(Keys.CONTROL+"a"));
		Thread.sleep(1500);
		searchbox.clear();
		searchbox.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(1500);
		searchbox.sendKeys("corona news"+Keys.ENTER);
		//searchbox.sendKeys("testing");
		//String str=driver.findElement(By.name("q")).getAttribute("value");
		//searchbox.sendKeys(Keys.ENTER);


	//	WebElement searchbox1 = driver.findElement(By.name("q"));
		
	//	searchbox1.sendKeys("chennai");
		//String str=searchbox.getAttribute("value");
		//System.out.println(str);
		//driver.navigate().refresh();
		//searchbox.sendKeys(Keys.ENTER);
	
		// driver.findElement(By.name("a")).sendKeys("news");
		// driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
