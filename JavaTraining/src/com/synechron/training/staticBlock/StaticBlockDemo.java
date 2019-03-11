package com.synechron.training.staticBlock;

public class StaticBlockDemo {

	static int counter=1;
	
	{
		System.out.println("i'm called only on obj creation-->  " + counter++);
	}
	
	static
	{
		System.out.println("I'm the first one to load");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		StaticBlockDemo sb1 = new StaticBlockDemo();
		StaticBlockDemo sb2 = new StaticBlockDemo();
		StaticBlockDemo sb3 = new StaticBlockDemo();
	}
	
}
