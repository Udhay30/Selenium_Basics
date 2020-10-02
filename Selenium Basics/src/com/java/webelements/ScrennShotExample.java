package com.java.webelements;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.java.browsercommands.Utility;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScrennShotExample {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		driver = Utility.initBrowser();
		driver.get("https://www.amazon.in");
		// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileHandler.copy(src,new File("D:\\Downloads\\google.jpg"));

		//Screenshot screenshot = new AShot().takeScreenshot(driver);
		Screenshot screens = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000))
				.takeScreenshot(driver);

		ImageIO.write(screens.getImage(), "jpg", new File("D:\\Downloads\\selenium\\pic.jpg"));

	}

}
