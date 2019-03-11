package com.synechron.training.exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("-- Main Started --");
		String str = "abc";
		try
		{
			System.out.println(str.charAt(10));
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			int a[] = new int[0];
			System.out.println(a[1]);
		}
		finally
		{
			System.out.println("Executing Finally...");
		}
		System.out.println("-- Main Ended --");
	}
	
}
