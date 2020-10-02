package com.java.exercise;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Screenshot screenshot = new AShot().takeScreenshot(driver);
		Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1500)).takeScreenshot(driver);

		ImageIO.write(src.getImage(), "png", new File("D:\\Downloads\\selenium\\picture.png"));

	}

}
