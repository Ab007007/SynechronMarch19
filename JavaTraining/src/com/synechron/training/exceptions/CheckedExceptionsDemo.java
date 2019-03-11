package com.synechron.training.exceptions;

public class CheckedExceptionsDemo {

	public static void main(String[] args) {
		System.out.println("-- Main Started --");
		try 
		{
			Thread.sleep(5000);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-- Main Ended --");
	}
	
	public static void test()
	{
		
	}
}
