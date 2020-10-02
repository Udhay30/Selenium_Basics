package com.java.webelements;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.java.browsercommands.Utility;

public class CookiesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=Utility.initBrowser();
		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		Set<Cookie> c=driver.manage().getCookies();
		Iterator<Cookie> itr=c.iterator();
		while (itr.hasNext()) {
			Cookie cook = (Cookie) itr.next();
			
			System.out.println(cook.getDomain());
			System.out.println(cook.getName());
			System.out.println(cook.getPath());
			System.out.println(cook.getValue());
			System.out.println(cook.getExpiry());
			System.out.println("===========");
		}
	}

}
