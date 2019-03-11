package com.synechron.training.accessdemo.pack1;

public class AccessDemo2 {

	public static void main(String[] args) {
		AccessDemo1 ad1 = new AccessDemo1();
//		ad1.a=100;
		ad1.b=200;
		ad1.c=300;
		ad1.d=400;
		
//		ad1.privateMethod();
		ad1.defaultMethod();
		ad1.protectedMethod();
		ad1.publicMethod();

	}
}
