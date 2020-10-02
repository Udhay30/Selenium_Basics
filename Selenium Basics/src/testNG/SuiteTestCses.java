package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.java.browsercommands.Utility;

public class SuiteTestCses {

	@Test
	public void OpenGoogle() {
		long startTime = System.currentTimeMillis();
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.google.com");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("calculated time is:"+totalTime);
	}

	@Test
	public void OpenBing() {
		long startTime = System.currentTimeMillis();
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.bing.com");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("calculated time is:"+totalTime);

	}

	@Test
	public void OpenYahoo() {
		long startTime = System.currentTimeMillis();
		WebDriver driver = Utility.initBrowser();
		driver.get("http://www.yahoo.com");
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("calculated time is:"+totalTime);

	}

}
