package com.synechron.training.accessdemo.pack1;

public class AccessDemo1 {

	private int a = 0;
	int b = 1;
	protected int c = 2;
	public int d = 3;

	private void privateMethod() {
		System.out.println("****************************************");
		System.out.println("Value of private Variable " + a);
		System.out.println("Value of default Variable " + b);
		System.out.println("Value of protected Variable " + c);
		System.out.println("Value of public Variable " + d);
	}

	void defaultMethod() {
		System.out.println("****************************************");
		System.out.println("Value of private Variable " + a);
		System.out.println("Value of default Variable " + b);
		System.out.println("Value of protected Variable " + c);
		System.out.println("Value of public Variable " + d);
	}

	protected void protectedMethod() {
		System.out.println("****************************************");
		System.out.println("Value of private Variable " + a);
		System.out.println("Value of default Variable " + b);
		System.out.println("Value of protected Variable " + c);
		System.out.println("Value of public Variable " + d);
	}

	public void publicMethod() {
		System.out.println("****************************************");
		System.out.println("Value of private Variable " + a);
		System.out.println("Value of default Variable " + b);
		System.out.println("Value of protected Variable " + c);
		System.out.println("Value of public Variable " + d);
	}

	public static void main(String[] args) {
		AccessDemo1 ad1 = new AccessDemo1();
		// ad1.a=100;
		ad1.privateMethod();
		ad1.defaultMethod();
		ad1.protectedMethod();
		ad1.publicMethod();

	}

}
