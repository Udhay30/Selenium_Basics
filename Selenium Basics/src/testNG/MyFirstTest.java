package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

@Test
public class MyFirstTest {
	@Test(priority = 0)
	public void displayzero() {
		System.out.println("display 0");
	}

	@Test(priority = 1)
	public void displayone() {
		System.out.println("display 1");
	}

// priority is used to print the order wise and enabled is false to skip the test case
	@Test(priority = 2, enabled = true)
	public void displayTwo() {
		System.out.println("display 2");
	}
}
