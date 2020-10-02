package com.java.exercise;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.browsercommands.Utility;

public class AutomatedExercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Utility.initBrowser();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		signIn.click();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,300)");

		WebElement createAccount = driver.findElement(By.xpath("//input[@id='email_create']"));
		createAccount.click();
		createAccount.sendKeys("udhay@gmail.com");
		createAccount.sendKeys(Keys.ENTER);

		WebElement title = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		title.click();

		WebElement firstName = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
		firstName.click();
		firstName.sendKeys("udhay");

		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		lastName.click();
		lastName.sendKeys("kumar");

		WebElement password = driver.findElement(By.id("passwd"));
		password.click();
		password.sendKeys("@udhay904830");

		WebElement dateOfBirth = driver.findElement(By.xpath("//select[@id='days']//option[11]"));
		dateOfBirth.click();

		WebElement months = driver.findElement(By.xpath("//select[@id='months']//option[12]"));
		months.click();

		WebElement year = driver.findElement(By.xpath("//select[@id='years']//option[5]"));
		year.click();

		WebElement signUpForNewsletter = driver.findElement(By.xpath("//div[@id='uniform-newsletter']"));
		signUpForNewsletter.click();

		js.executeScript("window.scrollBy(0,600)");

		WebElement firstNameDetails = driver.findElement(By.id("firstname"));
		firstNameDetails.click();
		firstNameDetails.clear();
		firstNameDetails.sendKeys("udhay");

		WebElement secondNameDetails = driver.findElement(By.id("lastname"));
		secondNameDetails.click();
		secondNameDetails.clear();
		secondNameDetails.sendKeys("kumar");

		WebElement company = driver.findElement(By.id("company"));
		company.click();
		company.sendKeys("vmetry tech");

		WebElement address1 = driver.findElement(By.id("address1"));
		address1.click();
		address1.sendKeys("guindy");

		WebElement address2 = driver.findElement(By.id("address2"));
		address2.click();
		address2.sendKeys("near railway station");

		WebElement city = driver.findElement(By.id("city"));
		city.click();
		city.sendKeys("chennai");

		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']/option[5]"));
		state.click();

		WebElement postalCode = driver.findElement(By.id("postcode"));
		postalCode.click();
		postalCode.sendKeys("00000");

		WebElement country = driver.findElement(By.xpath("//select[@id='id_country']/option[2]"));
		country.click();

		WebElement homePhone = driver.findElement(By.id("phone"));
		homePhone.click();
		homePhone.sendKeys("9442671759");

		WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
		mobilePhone.click();
		mobilePhone.sendKeys("0123456789");

		WebElement assignAddress = driver.findElement(By.id("alias"));
		assignAddress.click();
		assignAddress.clear();
		assignAddress.sendKeys("same as my address");

		WebElement register = driver.findElement(By.xpath("//button[@id='submitAccount']"));
		register.click();

		String str = driver.findElement(By.xpath("//a[@title='View my customer account']")).getText();
		if (str.contains("udhay")) {
			System.out.println("user created");
		} else {
			System.out.println("not created");
		}
	}

}
