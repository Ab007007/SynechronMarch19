package com.synechron.training.testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class CreateCustomer {
	
	@Parameters({"username","password"})
	@Test
	public void login(String un , String pwd)
	{
		Reporter.log(un + "--" + pwd);
	}
	
	
	
  @Test(dataProvider = "customerdata",dataProviderClass=TestData.class)
  public void createCustomerTest(String n, String s) {
	  
	  Reporter.log(n + " --- " + s);
	  
  }

  
}
