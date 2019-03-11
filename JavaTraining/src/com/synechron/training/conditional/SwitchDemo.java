package com.synechron.training.conditional;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("enter the month in Numeric");
		Scanner sc =  new Scanner(System.in);
		int key  = sc.nextInt();
		switch (key) {
		case 1:
			System.out.println("Entered month is Jan");
			break;
		case 2:
			System.out.println("Entered month is Feb");
			break;
		case 3:
			System.out.println("Entered month is Mar");
			break;
		case 4:
			System.out.println("Entered month is Apr");
			break;
		case 5:
			System.out.println("Entered month is May");
			break;
		case 6:
			System.out.println("Entered month is Jun");
			break;
		case 7:
			System.out.println("Entered month is July");
			break;
		case 8:
			System.out.println("Entered month is aug");
			break;
		case 9:
			System.out.println("Entered month is Sep");
			break;
		case 10:
			System.out.println("Entered month is Oct");
			break;
		case 11:
			System.out.println("Entered month is Nov");
			break;
		case 12:
			System.out.println("Entered month is Dec");
			break;

		default:
			System.out.println("Please enter the number from 1-12");
			break;
		}
	}
}
