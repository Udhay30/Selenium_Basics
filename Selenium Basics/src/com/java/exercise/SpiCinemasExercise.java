package com.java.exercise;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class SpiCinemasExercise {

	public static void main(String[] args) {

		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.spicinemas.in");
		driver.manage().window();

		WebElement selectCity_xpath = driver.findElement(By.xpath("//b[@class='dropdown-arrow']"));
		selectCity_xpath.click();

		WebElement citySel_xpath = driver.findElement(By.xpath("//li[@data-index='1']"));
		citySel_xpath.click();

		WebElement remember_xpath = driver.findElement(By.xpath("//input[@name='remember']"));
		remember_xpath.click();

		WebElement selectOk_xpath = driver.findElement(By.xpath("//a[@id='selectCity']"));
		selectOk_xpath.click();

		WebElement moviesClick_xpath = driver.findElement(By.xpath("//a[@href='/chennai/now-showing']"));
		moviesClick_xpath.click();

		List<WebElement> allList = driver.findElements(By.xpath("//section[@class='movie__listing now-showing']"));
		System.out.println(allList.size());

		Iterator<WebElement> itr = allList.iterator();
		while (itr.hasNext()) {
			WebElement element = (WebElement) itr.next();
			System.out.println(" " + element.getText());

		}

	}

}
