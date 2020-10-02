package com.java.advancedselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.java.browsercommands.Utility;

public class UploadingFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.leafground.com/pages/upload.html");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		WebElement uploadbutton = driver.findElement(By.name("filename"));

		Actions click = new Actions(driver);

		click.moveToElement(uploadbutton).click().build().perform();

		StringSelection selection = new StringSelection("D:\\Downloads\\testleaf.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
