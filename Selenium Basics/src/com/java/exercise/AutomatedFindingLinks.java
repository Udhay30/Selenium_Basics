package com.java.exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class AutomatedFindingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.techlistic.com/");
		List<WebElement> link=driver.findElements(By.tagName("a"));
		for (WebElement element : link) {
			System.out.println(element.getAttribute("href"));
			
			
		}
		for(int i=0;i<link.size();i++) {
			if(!link.isEmpty()) {
			String data=	link.get(i).getAttribute("href");
			link.get(i).click();
				
			}
		}
	}

}
