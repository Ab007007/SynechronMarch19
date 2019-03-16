package com.synechron.training.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest
{

	@Test
	public void launch()
	{
		Reporter.log("LAUNCH FUNCTION IS CALLED");
	}
	
	@Test(dependsOnMethods="launch")
	public void login()
	{
		Reporter.log("LOGIN FUNCTION IS CALLED");
	}
	
	@Test(dependsOnMethods= {"launch","login"})
	public void createCustomer()
	{
		Reporter.log("CREATE CUSTOMER IS CALLED");
	}
	
	@Test(dependsOnMethods="createCustomer")
	public void logout()
	{
		Reporter.log("LOGOUT IS CALLLED");
		
	}
	
	
}
