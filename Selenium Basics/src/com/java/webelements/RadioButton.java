package com.java.webelements;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Gender:");
		String str = scan.nextLine();

		List<WebElement> radioButton_xpath = driver.findElements(By.xpath("//input[@type='radio']"));
		for (WebElement element : radioButton_xpath) {
			if (element.getText().trim().equalsIgnoreCase(str))
				;

			element.click();
			break;

		}
	}

}
