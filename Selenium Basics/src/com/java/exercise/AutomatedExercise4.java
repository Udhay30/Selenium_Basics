package com.java.exercise;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.java.browsercommands.Utility;

public class AutomatedExercise4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.click();
		searchBox.sendKeys("techlisti");
		Thread.sleep(1500);

		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbct")));

		List<WebElement> alllist = driver.findElements(By.xpath("//li[@class='sbct']"));
		int s = alllist.size();
		System.out.println(s);

		Iterator<WebElement> itr = alllist.iterator();

		while (itr.hasNext()) {
			WebElement ele = (WebElement) itr.next();

			if (ele.getText().trim().equals("techlistic")) {
				System.out.println(ele.getText());
				ele.click();

				break;
			}
		}
		WebElement exceptedLink = driver.findElement(By.xpath("//div[@class='g']//div//div//div[@class='rc']//h3[@class='LC20lb DKV0Md'][contains(text(),'Techlistic')]"));
		String str = driver.getTitle();
		System.out.println(str);
			exceptedLink.click();

		
	}
}