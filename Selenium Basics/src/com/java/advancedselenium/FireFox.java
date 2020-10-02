package com.java.advancedselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.internal.WrapsDriver;

import com.java.browsercommands.Utility;

public class FireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(false);
		// WebDriver driver=Utility.customBrowser("firefox");
		System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
	
	}
			
}
