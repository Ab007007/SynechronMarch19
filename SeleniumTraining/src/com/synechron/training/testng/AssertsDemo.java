package com.synechron.training.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo
{

	@Test
	public void sum()
	{
		System.out.println("adding 3 and 5");
		Assert.assertEquals(3+5, 7);
		
		System.out.println("sum completed");
	}
}
