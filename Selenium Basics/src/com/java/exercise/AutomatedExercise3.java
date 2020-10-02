package com.java.exercise;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.java.browsercommands.Utility;


public class AutomatedExercise3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,900)");

		WebElement firstName_click = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName_click.click();
		firstName_click.sendKeys("Udhay");
		firstName_click.sendKeys(Keys.ENTER);

		WebElement lastName_click = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName_click.click();
		lastName_click.sendKeys("kumar");
		lastName_click.sendKeys(Keys.ENTER);

		WebElement MaleSelect = driver.findElement(By.xpath("//input[@id='sex-0']"));
		MaleSelect.click();

		WebElement experience = driver.findElement(By.xpath("//input[@id='exp-2']"));
		experience.click();

		WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datePicker.click();
		datePicker.sendKeys("03/06/2020" + Keys.ENTER);

		WebElement profession = driver.findElement(By.xpath("//input[@id='profession-1']"));
		profession.click();

		List<WebElement> automationTools = driver.findElements(By.xpath("//input[@name='tool']"));
		automationTools.get(0).click();
		automationTools.get(1).click();
		automationTools.get(2).click();

		js.executeScript("window.scrollBy(0,1200)");

		List<WebElement> continents = driver.findElements(By.xpath("//select[@id='continents']//option"));
		continents.get(2).click();
		int size = continents.size();
		System.out.println(size);
		Iterator<WebElement> itr = continents.iterator();
		while (itr.hasNext()) {
			WebElement allList = (WebElement) itr.next();
			System.out.println(allList.getText());

		}

		js.executeScript("window.scrollBy(1366,654)");
		List<WebElement> seleniumCommands = driver.findElements(By.xpath("//select[@id='selenium_commands']//option"));

		Actions a = new Actions(driver);

		a.keyDown(Keys.CONTROL);
		a.click(seleniumCommands.get(0));
		a.click(seleniumCommands.get(1));
		a.click(seleniumCommands.get(2));
		a.click(seleniumCommands.get(3));
		a.click(seleniumCommands.get(4));
		a.build().perform();
		int sizeOfSelenium = seleniumCommands.size();
		System.out.println(sizeOfSelenium);

		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement uploadImage = driver.findElement(By.xpath("//input[@id='photo']"));
		// uploadImage.click();
		Actions click = new Actions(driver);

		click.moveToElement(uploadImage).click().build().perform();

		StringSelection selection = new StringSelection("D:\\Downloads\\google.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		click.sendKeys(Keys.ENTER);

		WebElement buttonSubmit = driver.findElement(By.id("submit"));
		buttonSubmit.click();

	}

}
