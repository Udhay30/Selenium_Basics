package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class XpathExamoples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://demo.guru99.com/v1/");
		WebElement x_path = driver.findElement(By.xpath("//input[@name='uid']")); // \\"input[@name=\"uid\"]"
		/*
		 * contains=//label[contains(@id,'message')] , //*[contains(text(),'blank')]
		 *
		 * text=//*[text()='User-ID must not be blank']
		 * 
		 * OR=//input[@type='submit' or @name='btnReset']
		 * 
		 * and=//input[@type='password' and @name='password']
		 * 
		 * starts-with = //label[starts-with(@id,'message')]
		 * 
		 * following=//input[@name='uid']//following::input ,
		 * //input[@name='uid']//following::input[2]
		 * 
		 * ancestor=//input[@name='password']//ancestor::tr
		 * 
		 * Child=//input[@name='password']//ancestor::tr/td[1]/font ,
		 * //input[@name='password']//ancestor::tr/td//child::font
		 * 
		 * preceding= //input[@type='submit']//preceding::input
		 * 
		 * sibling=//input[@type='submit']//following-sibling::input ,
		 * //input[@type='reset']//preceding-sibling::input
		 * 
		 * parent=//input[@type='submit']//parent::td
		 * 
		 * 
		 */
	}

}
