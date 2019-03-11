package com.synechron.training.looping;

import java.util.Scanner;

public class DoWhieDemo {

	public static void main(String[] args) {
		System.out.println("Main Started...");
		String choice;
		do {
			System.out.println("Enter the number for which you want to create a table");
			int num = new Scanner(System.in).nextInt();
			System.out.println("Table for " + num);
			for (int i = 1; i <= 10; i++) 
			{
				System.out.println(num + " * " + i + " = " + num*i);
				
			}
			System.out.println("Do you want to continue..?yes or no..?");
			choice = new Scanner(System.in).next();
		}while(choice.equals("yes"));
		
		System.out.println("Main Ended");		
	}
}
