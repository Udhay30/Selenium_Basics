package testNG;

import org.testng.annotations.Test;

public class DependsOn {
	@Test(enabled = false)
	public void School() {
		System.out.println("Completed School");
	}

	@Test(dependsOnMethods = "School")
	public void College() {
		System.out.println("Complete College");
	}

	@Test(dependsOnMethods = "College")
	public void Interview() {
		System.out.println("After Getting A Job");
	}

}
