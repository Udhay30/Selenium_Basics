package com.java.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement toolTip_xpath = driver.findElement(By.linkText("Tooltips"));
		String str = toolTip_xpath.getAttribute("title");
		System.out.println(str);
		//toolTip_xpath.click();
		 Actions tool=new Actions(driver);
		 tool.moveToElement(toolTip_xpath).build().perform();
		

	}

}
