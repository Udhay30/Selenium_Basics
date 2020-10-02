package testNG;

import org.testng.annotations.Test;

public class GroupingExamples {
	@Test(groups= {"APPLE"})
	public void apple1() {
		System.out.println("apple mobile");
	}
	@Test(groups= {"APPLE"})
	public void apple2() {
		System.out.println("apple mobile");
	}
	@Test(groups= {"LENOVO"})
	public void lenovo1() {
		System.out.println("lenovo mobile");
	}
	@Test(groups= {"LENOVO"})
	public void lenovo2() {
		System.out.println("lenovo mobile");
	}
	@Test(groups= {"VIVO"})
	public void vivo1() {
		System.out.println("vivo mobile");
	}
	@Test(groups= {"VIVO"})
	public void vivo2() {
		System.out.println("vivo mobile");
	}
	@Test(groups= {"MOTO"})
	public void moto1() {
		System.out.println("moto mobile");
	}
	@Test(groups= {"MOTO"})
	public void moto2() {
		System.out.println("moto mobile");
	}
}
