package com.java.exercise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import com.java.browsercommands.Utility;

public class AutomatedExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.customBrowser("firefox");
		driver.get(" https://www.techlistic.com/");
		driver.manage().window().maximize();
		String s = driver.getTitle();
		// System.out.println(s);
		if (s.equals("Techlistic")) {
			System.out.println("passed title");
		} else {
			System.out.println("failed title");
		}
		String url = driver.getCurrentUrl();
		// System.out.println(url);
		if (url.equals("https://www.techlistic.com/")) {
			System.out.println("passed url");
		} else {
			System.out.println("failed url");
		}
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		driver.manage().window().fullscreen();
		driver.manage().window().setPosition(new Point(0, -1000));
		//driver.manage().window().setSize(new Dimension(300, 600));
		//driver.close();
	}

}
