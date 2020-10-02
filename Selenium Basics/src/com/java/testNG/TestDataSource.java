package com.java.testNG;

import org.testng.annotations.DataProvider;

public class TestDataSource {
@DataProvider(name="DataInput")
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		data[0][0]="j";
		data[0][1]="java";
		data[1][0]="b";
		data[1][1]="cobol";
		data[2][0]="s";
		data[2][1]="scala";
		return data;
	}
}

