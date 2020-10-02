package com.java.advancedselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/selectable.html");
		// remove/li-->size is only one
		List<WebElement> selectable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));

		int size = selectable.size(); // find element's is used for select more than one
		System.out.println(size);

		Actions a = new Actions(driver);
		/*a.keyDown(Keys.CONTROL);
		a.click(selectable.get(0));
		a.click(selectable.get(1));
		a.click(selectable.get(2));
*/
		//a.build().perform();

		// another method
		a.clickAndHold(selectable.get(3));
		a.build().perform();

	}

}
