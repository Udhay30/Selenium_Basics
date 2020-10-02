package com.java.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

	@BeforeSuite
	public void method1() {
		System.out.println("before suite");
	}

	@BeforeGroups
	public void method2() {
		System.out.println("before groups");
	}

	@BeforeClass
	public void method3() {
		System.out.println("before class");
	}

	@BeforeTest
	public void method4() {
		System.out.println("before test");
	}

	@BeforeMethod
	public void method5() {
		System.out.println("before method");
	}

	@AfterClass
	public void method6() {
		System.out.println("after class");
	}

	@AfterGroups
	public void method7() {
		System.out.println("after groups");
	}

	@AfterMethod
	public void method8() {
		System.out.println("after method");
	}

	@AfterSuite
	public void method9() {
		System.out.println("after suite");
	}

	@AfterTest
	public void method10() {
		System.out.println("after test");
	}

	@Test
	public void google() {
		System.out.println("calling google");

	}

	@Test
	public void bing() {
		System.out.println("calling bing");

	}
}