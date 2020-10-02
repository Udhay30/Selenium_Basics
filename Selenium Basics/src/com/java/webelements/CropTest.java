package com.java.webelements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.java.browsercommands.Utility;

public class CropTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.google.com");

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\Downloads\\google1.png"));
		System.out.println(System.currentTimeMillis());
		WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google']"));
		BufferedImage bf = ImageIO.read(src);

		Dimension d = googleLogo.getSize();
		int h = d.height;
		int w = d.width;
		
		Point p = googleLogo.getLocation();
		int xaxis = p.x;
		int yaxis = p.y;
		BufferedImage bf1 = bf.getSubimage(xaxis, yaxis, w, h);
		// bf.getSubimage(xaxis, yaxis, w, h);
		ImageIO.write(bf1, "png", src); // "png"-->logo format      jpeg jpg
		FileHandler.copy(src, new File("D:\\Downloads\\google_" + System.currentTimeMillis() + ".png"));
		
		

	}

}
