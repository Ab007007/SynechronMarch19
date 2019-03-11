package com.synechron.training.exceptions;

import java.util.Scanner;
public class AmountWithdraw 
{
	static int balance =5000;
	public static void main(String[] args) {
		System.out.println("Welcome to Amount Withdraw");
		Scanner sc = new Scanner(System.in);
		int tempBalance;
		String choice=null;
	do {
		System.out.println("Enter the amount to withdraw");
		int amount = sc.nextInt();
		tempBalance = balance - amount;
		if(tempBalance<=0)
		{
			try {
				throw new BalanceInSufficientException(balance);
			} catch (BalanceInSufficientException e) {
				System.out.println("Your Balance is too low , please try with in " + balance);
				System.out.println(e.getMessage());
			}
		}
		else
		{
			balance=tempBalance;
			System.out.println("Your Current Balance is " + balance);
		}
		
		System.out.println("Do you want to continue..?Yes/No");
		choice = sc.next();
	}while(choice.equals("yes"));
		
	System.out.println("main ended...");
	}
	

}
