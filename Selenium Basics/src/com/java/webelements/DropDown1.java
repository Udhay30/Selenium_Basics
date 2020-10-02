package com.java.webelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.java.browsercommands.Utility;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
		WebElement drop_down = driver.findElement(By.name("state"));
		Select sel = new Select(drop_down);

		Thread.sleep(1500);
		sel.selectByVisibleText("Hawaii");
		List<WebElement> opt = sel.getOptions();
		
		String text = sel.getOptions().get(1).getText();
		int size = opt.size();
		System.out.println(text);
		System.out.println("----------------------------");
		System.out.println(size);

		List<WebElement> li = driver.findElements(By.name("state"));
		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement element = (WebElement) itr.next();
			//System.out.println(element.getSize());
			//System.out.println(element.getText());

		}
		// sel.selectByIndex(1);
	}

}
