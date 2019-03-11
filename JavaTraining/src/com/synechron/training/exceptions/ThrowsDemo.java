package com.synechron.training.exceptions;

public class ThrowsDemo {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try
		{
			sleepyToday();
		}
		catch(Exception ex)
		{
			System.out.println("Exception from other method");
		}
		
		
		System.out.println("Main Ended");
	}
	
	
	public static void sleepyToday() throws InterruptedException 
	{
		System.out.println("sleepy Called");
		Thread.sleep(2000);
		System.out.println("sleepy Ended");
	}
	
}
