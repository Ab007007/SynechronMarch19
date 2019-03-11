package com.synechron.training.poly;

public class AdditionDemo {

	
	
	public static void sum(int a , int b)
	{ 
		System.out.println("Sum of two numbers is " + (a + b));
	}
	
	public static void sum(double d1, double d2)
	{
		System.out.println("Sum of two numbers is " + (d1 + d2));
	}
	public static void sum(String d1, String d2)
	{
		System.out.println("Sum of two numbers is " + (d1 + d2));
	}
	public static void main(String[] args) {
		sum(2,3);
		sum(2.5,3.5);
		sum("A" ,"B");
	}
	
}
