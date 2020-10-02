 package com.java.webelements;

import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.SeleniumServer;

import com.java.browsercommands.Utility;

public class HeadLessChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		//backround running without opening browser
				
		opt.setHeadless(true);
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);

		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);

		WebElement auto_id = driver.findElement(By.id("tags"));
		auto_id.click();
		auto_id.sendKeys("j");
		Thread.sleep(1500);

		List<WebElement> li = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		System.out.println("size:" + li.size());
		Iterator<WebElement> itr = li.iterator();
		while (itr.hasNext()) {
			WebElement ele = (WebElement) itr.next();
			if (ele.getText().trim().equalsIgnoreCase("Java")) {
				ele.click();

			}
		}
	}

}
