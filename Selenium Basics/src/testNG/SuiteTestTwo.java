package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;

public class SuiteTestTwo {
	WebDriver driver = Utility.initBrowser();

	long startTime;
	long endTime;

	@BeforeSuite()
	public void OpenBrowser() {
		long startTime = System.currentTimeMillis();
		WebDriver driver = Utility.initBrowser();
		
	}

	@Test(priority = 0)
	public void OpenGoogle() {
		// WebDriver driver = Utility.initBrowser();

		driver.get("http://www.google.com");

	}

	@Test(priority = 1)
	public void OpenBing()  {
		// WebDriver driver = Utility.initBrowser();
       
		driver.get("http://www.bing.com");
 
	}

	@Test(priority = 2)
	public void OpenYahoo() {
		// WebDriver driver = Utility.initBrowser();
	
		driver.get("http://www.yahoo.com");
	}

	@AfterSuite
	public void CloseBrowser() {
		//WebDriver driver = Utility.initBrowser();

		//driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("calculate total time is:" + totalTime);

	}
}
