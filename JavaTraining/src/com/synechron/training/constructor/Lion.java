package com.synechron.training.constructor;

public class Lion 
{
	String color;
	int legs;
	int eyes;
	int ears;

	Lion(String color,int legs,int eyes,int ears)
	{
		System.out.println("Para const is called");
		this.color = color;
		this.legs = legs;
		this.eyes = eyes;
		this.ears = ears;
	}
	
	protected Lion()
	{
//		super();
		System.out.println("Default constuctor is called");
	}
	
	public static void main(String[] args) {
		Lion l1 = new Lion();
		Lion l2 = new Lion("brown", 4, 2,2);
		System.out.println(l1.color);
		System.out.println(l2.color);
	}
	
	
	
}
