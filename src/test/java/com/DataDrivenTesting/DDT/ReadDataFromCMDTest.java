package com.DataDrivenTesting.DDT;

import org.testng.annotations.Test;

public class ReadDataFromCMDTest {

	@Test
	public void readDataFromCMDTest()
	{
	
		String Browser=System.getProperty("browser");	
		String Url=System.getProperty("url");	
		String Username=System.getProperty("username");	
		String Password=System.getProperty("password");	
	
		System.out.println(Browser);
		System.out.println(Url);
		System.out.println(Username);
		System.out.println(Password);
	
	
	
	}
}
