package com.synechron.training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserts
{

	@Test
	public void sum()
	{
		SoftAssert sa  = new SoftAssert();
		System.out.println("adding 3 and 5");
		sa.assertEquals(3+5, 7);
		
		System.out.println("sum completed");
		sa.assertAll();
	}
}
