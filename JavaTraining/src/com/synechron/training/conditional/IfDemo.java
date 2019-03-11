package com.synechron.training.conditional;

import java.util.Scanner;

public class IfDemo {

	/**
	 * program to find greater number
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("First number is greater..");
		}
		else if(num2>num1)
		{
			System.out.println("Second number is greater..");
		}
		else
		{
			System.out.println("Both are same ..");
		}
		
		System.out.println("Main ended...");
	}
}
















