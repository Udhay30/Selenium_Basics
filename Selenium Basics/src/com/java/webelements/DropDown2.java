package com.java.webelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class DropDown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.spicinemas.in/");
		WebElement drop_down2 = driver.findElement(By.xpath("//div[@class='selectric']"));
		drop_down2.click();
		List<WebElement> cities = driver.findElements(By.xpath("//div[@class='selectric-scroll']/ul/li"));
		Iterator<WebElement> itr = cities.iterator();
		while (itr.hasNext()) {
			WebElement city = (WebElement) itr.next();
			System.out.println(city.getText());
			if (city.getText().trim().equalsIgnoreCase("Chennai")) {
				city.click();
				break;
			}

		}
	}

}
