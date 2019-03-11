package com.synechron.training.scanner;

import java.util.Scanner;

public class AdditionUsingInput {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 integer numbers");
		int a = sc.nextInt();
		int b =  sc.nextInt();
		int c = sumoftwoNumbers(a, b);
		int d = c *100;
		System.out.println("Multiplication value " + d);
		
	}
	/**
	 * function to add 2 numbers and returning sum to the called place
	 * @param a
	 * @param b
	 * @return -int
	 * @author ahb
	 */
	
	static int sumoftwoNumbers(int a , int b)
	{
		int c = a +b;
		System.out.println("Sum of two numbers  " + c);
		return c;
	}
}












