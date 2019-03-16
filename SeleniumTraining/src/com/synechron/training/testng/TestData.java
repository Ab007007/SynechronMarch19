package com.synechron.training.testng;

import org.testng.annotations.DataProvider;

public class TestData
{

		@DataProvider
	  public Object[][] customerdata() {
	    return new Object[][] {
	    	  new Object[] { "TestNG-Cust-Mar-1", "TestNG-Cust-MarDesc-1" },
	          new Object[] { "TestNG-Cust-Mar-2", "TestNG-Cust-MarDesc-2" },
	          new Object[] { "TestNG-Cust-Mar-3", "TestNG-Cust-MarDesc-3" },
	          new Object[] { "TestNG-Cust-Mar-4", "TestNG-Cust-MarDesc-4" },
	        };
	  }
		
		@DataProvider
		  public Object[][] projectdata() {
		    return new Object[][] {
		    	  new Object[] { "Customer1","TestNG-Cust-Mar-1", "TestNG-Cust-MarDesc-1" },
		          new Object[] { "Customer1","TestNG-Cust-Mar-2", "TestNG-Cust-MarDesc-2" },
		          new Object[] { "Customer1","TestNG-Cust-Mar-3", "TestNG-Cust-MarDesc-3" },
		          new Object[] { "Customer1","TestNG-Cust-Mar-4", "TestNG-Cust-MarDesc-4" },
		        };
		  }
}
