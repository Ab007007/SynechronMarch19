package com.synechron.training.looping;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String[] args) {
		System.out.println("Main Started...");
		System.out.println("Enter the number for which you want to create a table");
		int num = new Scanner(System.in).nextInt();
		System.out.println("Table for " + num);
//		for (int i = 1; i <= 10; i++) 
//		{
//			System.out.println(num + " * " + i + " = " + num*i);
//			
//		}
		int i=1;
		while(i<=10)
		{
			System.out.println(num + " * " + i + " = " + num*i);
			i++;
		}
		
		
		
		
	}
}
