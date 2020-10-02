package com.java.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;


public class AutomatedExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get(" https://www.techlistic.com/");
		driver.manage().window().maximize();
		WebElement Java_Click = driver
				.findElement(By.xpath("//div[@class='overflowable-contents']//a[contains(text(),'Java')]"));

		Java_Click.click();
		String javaTitle = driver.getTitle();
		System.out.println(javaTitle);
		if (javaTitle.equals("Java Tutorials Series - Java For Selenium")) {
			System.out.println("passed java title");
		} else {
			System.out.println("failed java title");
		}
		driver.navigate().back();
		WebElement selenium_click = driver.findElement(
				By.xpath("//ul[@class='tabs']//li[@class='overflowable-item']//a[contains(text(),'Selenium')]"));
		selenium_click.click();
		driver.navigate().back();
		driver.navigate().forward();

		WebElement seleniumBlog_click = driver.findElement(By.xpath("//a[contains(text(),'Selenium Blogs')]"));
		seleniumBlog_click.click();
		String seleniumBlogTitle = driver.getTitle();
		if (seleniumBlogTitle.equals("Top Selenium Blogs")) {
			System.out.println("passed selenium blog title");
		} else {
			System.out.println("failed selenium blog title");
		}
		driver.navigate().to(" https://www.techlistic.com/");

		WebElement testNG_click = driver
				.findElement(By.xpath("//div[@class='clearboth section']//a[contains(text(),'TestNG')]"));
		testNG_click.click();

		String testNG_tilte = driver.getTitle();
		System.out.println(testNG_tilte);
		if (testNG_tilte.equals("Selenium with TestNG Integration - Tutorial Series")) {
			System.out.println("testNG title passed");
		} else {
			System.out.println("testNG title failed");
		}
		driver.close();

	}

}
