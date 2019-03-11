package com.synechron.training.exceptions;

public class BalanceInSufficientException extends Exception
{

	public BalanceInSufficientException() 
	{
		System.out.println("FROM CONSTRUCTOR - balance is not sufficient");
	
	}
	
	public BalanceInSufficientException(int balance)
	{
		System.out.println("FROM CONSTRUCTOR - you have only " + balance + " try with in the balance");
	}
	
	@Override
	public String getMessage() 
	{
		// TODO Auto-generated method stub
		return "Your account Balance is LOWWWWWWWW";
	}
	
}
