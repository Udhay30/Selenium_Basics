package com.java.webelements;

import org.testng.annotations.Test;

public class TimeoutExceptionTestNG {

	@Test(timeOut = 2000)
	public void display() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("duck");
	}

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)

	public void runner() {
		int a[] = { 12345 };
		System.out.println(a[6]);
	}

}
