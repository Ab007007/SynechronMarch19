package com.synechron.training.variables;

public class Monkey implements Animal 
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Banana");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Only jump from tree to tree");
	}

	
	public static void main(String[] args) {
		Monkey m = new Monkey();
		//m.breath = "dasl;kjfa;sjdf";
		System.out.println(m.breath);
		m.walk();
		m.eat();
				
	}
}
