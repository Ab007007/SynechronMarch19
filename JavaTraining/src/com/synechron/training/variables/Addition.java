package com.synechron.training.variables;

import java.util.Scanner;

public class Addition {
	static int c;

	public static void main(String[] args) {
		System.out.println("Main Started");
		Addition ad = new Addition();
		ad.sum(3, 4);
		ad.sum(30, 40);
		System.out.println("Main Ended");
	}

	void printValues(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	void sum(int a, int b) {
		int sumOfTwoNumbers;
		sumOfTwoNumbers = a + b;
		System.out.println(sumOfTwoNumbers);
	}

}
