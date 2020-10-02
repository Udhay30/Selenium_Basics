package com.java.webelements;

import org.openqa.selenium.WebDriver;

import com.java.browsercommands.Utility;

public class AuthendicationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http:\\the-internet.herokuapp.com/basic_auth");
		//driver.get("http:admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
