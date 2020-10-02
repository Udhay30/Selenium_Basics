package com.java.exercise;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.java.browsercommands.Utility;

public class CropExercise {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.spicinemas.in");
		driver.manage().window().maximize();

		WebElement selectCity_xpath = driver.findElement(By.xpath("//b[@class='dropdown-arrow']"));
		selectCity_xpath.click();
		
		//Select sel=new Select(selectCity_xpath);
		//sel.selectByVisibleText("Chennai");

		WebElement citySel_xpath = driver.findElement(By.xpath("//li[@data-index='1']"));
		citySel_xpath.click();

		WebElement remember_xpath = driver.findElement(By.xpath("//input[@name='remember']"));
		remember_xpath.click();

		WebElement selectOk_xpath = driver.findElement(By.xpath("//a[@id='selectCity']"));
		selectOk_xpath.click();
		
		
		WebElement moviesClick_xpath = driver.findElement(By.xpath("//a[@href='/chennai/now-showing']"));
		moviesClick_xpath.click();
/*
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\MoviesFirstClick.png"));

		
		  WebElement crop_1917 =
		  driver.findElement(By.xpath("//img[@title='1917 ENGLISH']")); 
		  BufferedImage bf = ImageIO.read(src);
		  Dimension d = crop_1917.getSize(); 
		  int h = d.height;
		  int w = d.width; 
		  Point p = crop_1917.getLocation(); 
		  int xaxis = p.x; 
		  int yaxis = p.y;
		  BufferedImage bf1 = bf.getSubimage(xaxis, yaxis, 150, 207);
		  ImageIO.write(bf1, "png", src); 
		  FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\1917.png"));
		 
		  WebElement crop_AK = driver.findElement(By.
		  xpath("//img[@title='AK AYYAPPANUM KOSHIYUM MALAYALAM']")); 
		  BufferedImage bf2= ImageIO.read(src);
		  Dimension d1 = crop_AK.getSize(); 
		  int h1 = d1.height;
		  int w1 = d1.width; 
		  Point p1 = crop_AK.getLocation(); 
		  int x_axis = p1.x; 
		  int y_axis = p1.y;
		  BufferedImage bf3 = bf2.getSubimage(x_axis, y_axis, 150, 207);
		  ImageIO.write(bf3, "png", src); 
		  FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\AK.png"));
		  
		  WebElement crop_AlaVaikuntha =
		  driver.findElement(By.xpath("//img[@title='ALA VAIKUNTHAPURRAMULOO TELUGU']") );
		  BufferedImage bf4 = ImageIO.read(src); 
		  Dimension d2 =crop_AlaVaikuntha.getSize(); 
		  int h2 = d2.height; 
		  int w2 = d2.width; 
		  Point p2= crop_AlaVaikuntha.getLocation(); 
		  int x_axis1 = p2.x; 
		  int y_axis1 = p2.y;
		  BufferedImage bf5 = bf4.getSubimage(x_axis1, y_axis1, 150, 207);
		  ImageIO.write(bf5, "png", src); 
		  FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\AlaVaikunthapurramuloo.png"));
		  
		  WebElement crop_Anjaam =
		  driver.findElement(By.xpath("//img[@title='ANJAAM PATHIRAA MALAYALAM']"));
		  BufferedImage bf6 = ImageIO.read(src); 
		  Dimension d3 = crop_Anjaam.getSize();
		  int h3 = d3.height;
		  int w3 = d3.width; 
		  Point p3 = crop_Anjaam.getLocation();
		  int x_axis2 = p3.x; 
		  int y_axis2 = p3.y; 
		  BufferedImage bf7 = bf6.getSubimage(x_axis2, y_axis2, 150, 207);
		  ImageIO.write(bf7, "png", src);
		  FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\AnjaamPathiraa.png"));
		  
		  WebElement crop_Baaram =
		  driver.findElement(By.xpath("//img[@title='BAARAM TAMIL']")); 
		  BufferedImage bf8 = ImageIO.read(src); 
		  Dimension d4 = crop_Baaram.getSize(); 
		  int h4 = d4.height; 
		  int w4 = d4.width; 
		  Point p4 = crop_Baaram.getLocation(); 
		  int x_axis3 = p4.x;  
		  int y_axis3 = p4.y; 
		  BufferedImage bf9 = bf8.getSubimage(x_axis3, y_axis3, 150, 207); 
		  ImageIO.write(bf9, "png", src);
		  FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\Baaram.png"));
		 
		WebElement crop_BadBoys = driver.findElement(By.xpath("//img[@title='BAD BOYS FOR LIFE ENGLISH']"));
		BufferedImage bf10 = ImageIO.read(src);
		Dimension d5 = crop_BadBoys.getSize();
		int h5 = d5.height;
		int w5 = d5.width;
		Point p5 = crop_BadBoys.getLocation();
		int x_axis4 = p5.x;
		int y_axis4 = p5.y;
		BufferedImage bf11 = bf10.getSubimage(x_axis4, y_axis4, 150, 207);
		ImageIO.write(bf11, "png", src);
		FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\BadBoys.png"));
*/
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,500)");
		//js.executeScript("arguments[0].scrollIntoView()", Privacy);
		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		// js.executeScript("window.scrollBy(0,600)");
		
	//	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//	FileHandler.copy(src, new File("D:\\Downloads\\selenium images\\MoviesScrollSecondClick.png"));
		Robot robot=new Robot();
		java.awt.Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screensize);
		BufferedImage source=robot.createScreenCapture(rectangle);
		File destinationFile=new File("D:\\Downloads\\robot1.png");
		ImageIO.write(source, "png", destinationFile);
		
		WebElement crop_Bheeshma = driver.findElement(By.xpath("//li[7]//div[1]//a[1]//img[1]"));
		BufferedImage bf12 = ImageIO.read(destinationFile);
		Dimension d6 = crop_Bheeshma.getSize();
		System.out.println(crop_Bheeshma.getSize());
		int h6 = d6.height;
		int w6 = d6.width;
		Point p6 = crop_Bheeshma.getLocation();
		int x_axis5 = p6.x;
		int y_axis5 = p6.y;
		BufferedImage bf13 = bf12.getSubimage(x_axis5, y_axis5, 150, 207);
		ImageIO.write(bf13, "png", destinationFile);
		FileHandler.copy(destinationFile, new File("D:\\Downloads\\robotclick.png"));
		
		
		
	}

}
