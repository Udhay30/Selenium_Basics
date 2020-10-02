package com.java.webelements;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class DynamicWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Gender:");
		String str = scan.nextLine();

		WebElement xpath_dynamic = driver.findElement(By.xpath("//*[text()='" + str + "']//parent::span/input"));
		xpath_dynamic.click();

		// WebElement
		// xpath_dynamic=driver.findElement(By.xpath("//*[text()='"+str+"']//parent::span/input"));
		// xpath_dynamic.click();
		// System.out.println("//*[text()='"+str+"']//parent::span/input");
	}

}
