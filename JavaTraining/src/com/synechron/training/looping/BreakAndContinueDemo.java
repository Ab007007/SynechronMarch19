package com.synechron.training.looping;

public class BreakAndContinueDemo {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) 
		{
			if(i==10)
			{
				break;
				//continue;
			}
			System.out.println(i);
		}
		System.out.println("main Ended..");
	}
}
