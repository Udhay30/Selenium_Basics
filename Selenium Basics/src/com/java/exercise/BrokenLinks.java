package com.java.exercise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("https://www.techlistic.com/");
		//driver.get("http://www.leafground.com/pages/Link.html");
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for (WebElement element : link) {
			System.out.println(element.getAttribute("href"));
			String url = element.getAttribute("href");
			verifyLinkActive(url);
		}
	}

	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}
	}

}
