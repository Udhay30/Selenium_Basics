package com.java.advancedselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class DragAndDroppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile profile=new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(false);

		WebDriver driver=Utility.customBrowser("firefox");
	
				driver.get("http://www.leafground.com/pages/drop.html");
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath(" //div[@id='droppable']"));
		
		Actions a=new Actions(driver);
		//a.dragAndDrop(drag, drop);
		//a.clickAndHold(drag).release(drop).build().perform();
		a.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
	}

}
